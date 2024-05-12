package com.bytedance.globalpayment.iap.model;

/* loaded from: classes14.dex */
public class AckStrategy {
    public long mAutoAckAfterUploadTokenInMs;
    public boolean mNeedAckAfterSuccessQuery;

    public long getAutoAckAfterUploadTokenInMs() {
        return this.mAutoAckAfterUploadTokenInMs;
    }

    public boolean isNeedAckAfterSuccessQuery() {
        return this.mNeedAckAfterSuccessQuery;
    }

    public AckStrategy setAutoAckAfterUploadTokenInMs(long j) {
        this.mAutoAckAfterUploadTokenInMs = j;
        return this;
    }

    public AckStrategy setNeedAckAfterSuccessQuery(boolean z) {
        this.mNeedAckAfterSuccessQuery = z;
        return this;
    }

    public AckStrategy(boolean z, long j) {
        this.mNeedAckAfterSuccessQuery = z;
        this.mAutoAckAfterUploadTokenInMs = j;
    }
}
