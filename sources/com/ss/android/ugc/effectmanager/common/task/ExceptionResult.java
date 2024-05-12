package com.ss.android.ugc.effectmanager.common.task;

import X.C77800Ug8;
import X.Q89;
import X.X1D;
import android.accounts.NetworkErrorException;
import com.ss.android.ugc.effectmanager.common.ErrorConstants;
import com.ss.android.ugc.effectmanager.common.exception.MD5Exception;
import com.ss.android.ugc.effectmanager.common.exception.NetException;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.exception.UnzipException;
import com.ss.android.ugc.effectmanager.common.exception.UrlNotExistException;
import java.io.IOException;
import org.json.JSONException;

/* loaded from: classes16.dex */
public class ExceptionResult {
    public int errorCode;
    public Exception exception;
    public String msg;
    public String remoteIp;
    public String requestUrl;
    public String selectedHost;

    public String toString() {
        if (this.exception != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ExceptionResult{errorCode=");
            LIZ.append(this.errorCode);
            LIZ.append(", msg='");
            Q89.LIZIZ(LIZ, this.msg, '\'', ", requestUrl='");
            Q89.LIZIZ(LIZ, this.requestUrl, '\'', ", selectedHost='");
            Q89.LIZIZ(LIZ, this.selectedHost, '\'', ", remoteIp='");
            Q89.LIZIZ(LIZ, this.remoteIp, '\'', ", exception=");
            LIZ.append(this.exception.getMessage());
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ExceptionResult{errorCode=");
        LIZ2.append(this.errorCode);
        LIZ2.append(", msg='");
        LIZ2.append(this.msg);
        LIZ2.append(", requestUrl='");
        Q89.LIZIZ(LIZ2, this.requestUrl, '\'', ", selectedHost='");
        Q89.LIZIZ(LIZ2, this.selectedHost, '\'', ", remoteIp='");
        return C77800Ug8.LIZJ(LIZ2, this.remoteIp, '\'', '}', LIZ2);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public Exception getException() {
        return this.exception;
    }

    public String getMsg() {
        return this.msg;
    }

    public ExceptionResult(int i) {
        this.errorCode = i;
        this.msg = ErrorConstants.APIErrorHandle(i);
        this.exception = null;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setException(Exception exc) {
        this.exception = exc;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public ExceptionResult(Exception exc) {
        this(exc, null, null, null);
    }

    public ExceptionResult(int i, Exception exc) {
        this.errorCode = i;
        this.msg = ErrorConstants.APIErrorHandle(i);
        this.exception = exc;
    }

    public void setTrackParams(String str, String str2, String str3) {
        this.requestUrl = str;
        this.selectedHost = str2;
        this.remoteIp = str3;
    }

    public ExceptionResult(Exception exc, String str, String str2, String str3) {
        this.errorCode = -1;
        this.requestUrl = str;
        this.selectedHost = str2;
        this.remoteIp = str3;
        this.exception = exc;
        if (exc instanceof NetException) {
            this.errorCode = ((NetException) exc).getStatus_code();
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof StatusCodeException) {
            this.errorCode = ((StatusCodeException) exc).getStatusCode();
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof JSONException) {
            this.errorCode = 10008;
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof NetworkErrorException) {
            this.errorCode = 10002;
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof UrlNotExistException) {
            this.errorCode = 10015;
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof UnzipException) {
            this.errorCode = 10013;
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof MD5Exception) {
            this.errorCode = 10010;
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof IOException) {
            this.errorCode = 10012;
            this.msg = exc.getMessage();
        } else {
            if (exc != null) {
                if ("network unavailable".equals(exc.getMessage())) {
                    this.errorCode = 10011;
                } else {
                    this.errorCode = 10005;
                }
                this.msg = exc.getMessage();
                return;
            }
            this.errorCode = 1;
            this.msg = ErrorConstants.APIErrorHandle(1);
        }
    }
}
