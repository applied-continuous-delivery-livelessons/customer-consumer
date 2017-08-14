package com.example.customerclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="mailto:josh@joshlong.com">Josh Long</a>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String firstName, lastName, email;
    private Long id;
}
