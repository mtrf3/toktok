package com.bytedance.mt.protector.net_protector;

import X.E8A;
import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class ErrorInfo extends F9E {
    public static final E8A Companion = new E8A();
    public final int errorCode;
    public final String errorMsg;

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorInfo() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ErrorInfo copy$default(ErrorInfo errorInfo, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = errorInfo.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = errorInfo.errorMsg;
        }
        return errorInfo.copy(i, str);
    }

    public final ErrorInfo copy(int i, String str) {
        return new ErrorInfo(i, str);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.errorCode), this.errorMsg};
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public ErrorInfo(int i, String str) {
        this.errorCode = i;
        this.errorMsg = str;
    }

    public /* synthetic */ ErrorInfo(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "success" : str);
    }
}
