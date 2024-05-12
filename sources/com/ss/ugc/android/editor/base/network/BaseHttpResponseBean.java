package com.ss.ugc.android.editor.base.network;

import X.C76800UCe;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;

/* loaded from: classes7.dex */
public abstract class BaseHttpResponseBean<T> {
    public String code;
    public InterfaceC88471Ynr<? super String, ? super String, C76800UCe> fail;
    public String message;
    public InterfaceC88473Ynt<? super String, ? super String, ? super T, C76800UCe> success;

    public abstract T getData();

    public abstract String getHttpCode();

    public abstract String getHttpMessage();

    public final String getCode() {
        return this.code;
    }

    public final InterfaceC88471Ynr<String, String, C76800UCe> getFail() {
        return this.fail;
    }

    public final String getMessage() {
        return this.message;
    }

    public final InterfaceC88473Ynt<String, String, T, C76800UCe> getSuccess() {
        return this.success;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setFail(InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.fail = interfaceC88471Ynr;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setSuccess(InterfaceC88473Ynt<? super String, ? super String, ? super T, C76800UCe> interfaceC88473Ynt) {
        this.success = interfaceC88473Ynt;
    }
}
