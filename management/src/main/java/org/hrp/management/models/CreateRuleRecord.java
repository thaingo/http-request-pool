package org.hrp.management.models;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateRuleRecord {
    @NotNull
    String path;
    @NotNull
    String method;
    String condition;
    @NotNull
    Integer returnHttpCode;
    String returnJson;
    @NotNull
    Boolean isEnabled;
}
