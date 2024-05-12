package com.ss.ugc.android.editor.base.network;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class BaseResponse<T> implements Serializable {
    public Integer code = 0;
    public T data;
    public String message;

    public final boolean isSuccess() {
        Integer num = this.code;
        if (num == null || num.intValue() != 0 || this.data == null) {
            return false;
        }
        return true;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setCode(Integer num) {
        this.code = num;
    }

    public final void setData(T t) {
        this.data = t;
    }

    public final void setMessage(String str) {
        this.message = str;
    }
}
