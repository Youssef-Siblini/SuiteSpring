package com.netledger.suitespring.exception;

/**
 * Created by dbrook on 01/07/2015.
 */
public class BeanReferenceCycleException extends Exception {
    public BeanReferenceCycleException(String message) {
        super(message);
    }
}
