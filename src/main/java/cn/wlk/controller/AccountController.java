package cn.wlk.controller;

import cn.wlk.domain.Account;
import cn.wlk.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层findAll");
        //调用service
        List<Account> all = accountService.findAll();
        model.addAttribute("all",all);
        for (Account account : all) {
            System.out.println(account);
        }
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层save");
        //调用service
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }
}
