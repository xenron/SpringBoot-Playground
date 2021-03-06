package com.example.web.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * xxx
 */
@Data
public class ModifyCronDTO {
    @NotNull(message = "the job id cannot be null")
    private Integer id;

    @NotEmpty(message = "the cron cannot be empty")
    private String cron;
}
