package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.AjaxResult;
import cn.itsource.aigou.domain.Employee;
import org.springframework.web.bind.annotation.*;

@RestController  //和controller的区别

public class LoginController {

    // RequestBody:接收请求的body中的参数
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        //select * from t_employee where username ="xxx" and password ="xxxooo"
        //组null的判断
        if("xxx".equals(employee.getUsername())&&"xxxooo".equals(employee.getPassword())){
            return  AjaxResult.me().setObject(null);
        }else{
            return  AjaxResult.me().setSuccess(false).setMsg("登录失败").setObject(null);
        }
    }

    @RequestMapping(value = "/lget",method = RequestMethod.GET)
    public AjaxResult tttt(){
        //select * from t_employee where username ="xxx" and password ="xxxooo"
        //组null的判断

        return AjaxResult.me();
    }

}



