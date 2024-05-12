package com.bytedance.mt.protector.net_protector;

import X.F9E;

/* loaded from: classes2.dex */
public final class NetErrorInfo extends F9E {
    public final int errorCode;
    public final String errorMsg;

    public static /* synthetic */ NetErrorInfo copy$default(NetErrorInfo netErrorInfo, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = netErrorInfo.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = netErrorInfo.errorMsg;
        }
        return netErrorInfo.copy(i, str);
    }

    public final NetErrorInfo copy(int i, String str) {
        return new NetErrorInfo(i, str);
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

    public NetErrorInfo(int i, String str) {
        this.errorCode = i;
        this.errorMsg = str;
    }
}
