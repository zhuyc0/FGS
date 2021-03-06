package web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import system.DTO.LoginUser;
import system.VO.ResultVO;
import system.utils.ResultVOUtil;

import java.util.UUID;

/**
 * @author <a href="zhuyichen@cqyyt.com">Zhu Yichen</a>
 * @version 1.0
 * @date 2018年12月17日 16:29
 * @desc InitUserInfoController
 */
@RestController
public class InitUserInfoController {
    @ApiOperation(value = "获取用户信息",notes = "根据token来获取用户信息")
    @GetMapping("/get_user_info")
    public ResultVO getUserInfo(@AuthenticationPrincipal LoginUser user){
        return ResultVOUtil.success(user);
    }
}
