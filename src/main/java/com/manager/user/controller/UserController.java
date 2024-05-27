import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
        try {
            User createdUser = userService.createUser(user);
            return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(createdUser);
        } catch (IllegalArgumentException e) {
            return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(Collections.singletonMap("mensaje ", e.getMessage()));
        }
    }
}
