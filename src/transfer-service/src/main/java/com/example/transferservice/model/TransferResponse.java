package com.example.transferservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Builder
@Getter
@Setter
@Jacksonized
public class TransferResponse {
    private String message;
    private String status;
    private String transferId;


}
