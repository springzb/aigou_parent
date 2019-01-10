package cn.mesmile.aigou.controller;

import cn.mesmile.aigou.domain.Employee;
import cn.mesmile.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created with IDEA
 * @author: Super Zheng
 * @Description: java类作用描述
 * @Date:2019/1/9
 * @Time:16:24
 */
@RestController
public class LoginController {

    /**
     * 这里我们模拟从数据中拿到数据
     * @param employee
     * @return
     */
    @RequestMapping("/login")
    public AjaxResult login(@RequestBody Employee employee){

        if(employee == null){
            return AjaxResult.success().setSuccess(false).setMessage("网络发送故障，请联系管理员！");
        }
        // 匹配用户名和密码
        if("admin".equals(employee.getUsername()) && "admin".equals(employee.getPassword())){
            return AjaxResult.success().setMessage("登陆成功");
        }
        return AjaxResult.success().setSuccess(false).setMessage("用户名或者密码错误！");
    }
}
