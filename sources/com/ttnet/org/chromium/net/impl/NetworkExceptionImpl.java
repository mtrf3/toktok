package com.ttnet.org.chromium.net.impl;

import X.AbstractC66670QEo;

/* loaded from: classes12.dex */
public class NetworkExceptionImpl extends AbstractC66670QEo {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public final int mCronetInternalErrorCode;
    public final int mErrorCode;

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(super.getMessage());
        sb.append(", ErrorCode=");
        sb.append(this.mErrorCode);
        if (this.mCronetInternalErrorCode != 0) {
            sb.append(", InternalErrorCode=");
            sb.append(this.mCronetInternalErrorCode);
        }
        sb.append(", Retryable=");
        sb.append(immediatelyRetryable());
        return sb.toString();
    }

    @Override // X.AbstractC66670QEo
    public boolean immediatelyRetryable() {
        int i = this.mErrorCode;
        if (i != 3 && i != 4 && i != 5 && i != 6 && i != 8) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC66670QEo
    public int getCronetInternalErrorCode() {
        return this.mCronetInternalErrorCode;
    }

    @Override // X.AbstractC66670QEo
    public int getErrorCode() {
        return this.mErrorCode;
    }

    public NetworkExceptionImpl(String str, int i, int i2) {
        super(str, null);
        this.mErrorCode = i;
        this.mCronetInternalErrorCode = i2;
    }
}
