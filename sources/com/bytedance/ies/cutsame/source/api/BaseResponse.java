package com.bytedance.ies.cutsame.source.api;

import com.google.gson.m;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public class BaseResponse {
    public m extra;
    public String message;
    public int status_code;
    public Throwable throwable;

    public BaseResponse() {
    }

    public final m getExtra() {
        return this.extra;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final void setExtra(m mVar) {
        this.extra = mVar;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setThrowable(Throwable th) {
        this.throwable = th;
    }

    public BaseResponse(int i, String str, Throwable th) {
        this();
        this.status_code = i;
        this.message = str;
        this.throwable = th;
    }

    public /* synthetic */ BaseResponse(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : th);
    }
}
