package com.ss.android.ugc.effectmanager.common.exception;

/* loaded from: classes13.dex */
public class StatusCodeException extends Exception {
    public int mStatusCode;

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public void setStatusCode(int i) {
        this.mStatusCode = i;
    }

    public StatusCodeException(int i, String str) {
        super(str);
        this.mStatusCode = i;
    }
}
