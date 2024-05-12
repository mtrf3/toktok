package com.byted.cast.common;

import X.X1D;

/* loaded from: classes29.dex */
public class CommandExecuteStatus {
    public String description;
    public String exception;
    public String localAddrHost;
    public int playErrorCode;

    public CommandExecuteStatus() {
        setDescription("");
        setException("");
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommandExecuteStatus{playErrorCode='");
        LIZ.append(this.playErrorCode);
        LIZ.append('\'');
        LIZ.append(", description='");
        LIZ.append(this.description);
        LIZ.append('\'');
        LIZ.append(", exception='");
        LIZ.append(this.exception);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getDescription() {
        return this.description;
    }

    public String getException() {
        return this.exception;
    }

    public String getLocalAddrHost() {
        return this.localAddrHost;
    }

    public int getPlayErrorCode() {
        return this.playErrorCode;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setException(String str) {
        this.exception = str;
    }

    public void setLocalAddrHost(String str) {
        this.localAddrHost = str;
    }

    public void setPlayErrorCode(int i) {
        this.playErrorCode = i;
    }

    public CommandExecuteStatus(int i, String str, String str2) {
        setPlayErrorCode(i);
        setDescription(str);
        setException(str2);
    }
}
