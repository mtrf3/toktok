package com.ttnet.org.chromium.net.impl;

import X.AbstractC66676QEu;

/* loaded from: classes12.dex */
public final class o0 extends AbstractC66676QEu {
    public final int LJLIL;
    public final NetworkExceptionImpl LJLILLLLZI;

    @Override // X.AbstractC66670QEo
    public int getCronetInternalErrorCode() {
        return this.LJLILLLLZI.getCronetInternalErrorCode();
    }

    @Override // X.AbstractC66670QEo
    public int getErrorCode() {
        return this.LJLILLLLZI.getErrorCode();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LJLILLLLZI.getMessage() + ", QuicDetailedErrorCode=" + this.LJLIL;
    }

    @Override // X.AbstractC66670QEo
    public boolean immediatelyRetryable() {
        return this.LJLILLLLZI.immediatelyRetryable();
    }

    @Override // X.AbstractC66676QEu
    public int getQuicDetailedErrorCode() {
        return this.LJLIL;
    }

    public o0(String str, int i, int i2, int i3) {
        super(str);
        this.LJLILLLLZI = new NetworkExceptionImpl(str, i, i2);
        this.LJLIL = i3;
    }
}
