package com.example.ShoppingMall.global.common.exception;

import com.example.ShoppingMall.global.common.code.BaseErrorCode;
import com.example.ShoppingMall.global.common.code.ErrorReasonDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() { return this.code.getReason();}

    public ErrorReasonDTO getErrorReasonHttpStatus(){ return this.code.getReasonHttpStatus();}

}
