/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.16).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "login", description = "the login API")
public interface LoginApi {

    @ApiOperation(value = "authenticate the user", nickname = "loginGet", notes = "By passing the loginId and password, user can login into the application", tags={ "admin","employee","customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Wii redirect to the dashboar page"),
        @ApiResponse(code = 600, message = "will throw wxception as \"invalid user name or password\"") })
    @RequestMapping(value = "/login",
        method = RequestMethod.GET)
    ResponseEntity<Void> loginGet();

}
