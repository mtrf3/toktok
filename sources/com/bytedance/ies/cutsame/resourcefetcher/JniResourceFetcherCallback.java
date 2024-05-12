package com.bytedance.ies.cutsame.resourcefetcher;

/* loaded from: classes3.dex */
public class JniResourceFetcherCallback implements ResourceFetcherCallBack {
    public String input;
    public long nativeCallback;

    public static native void nativeError(long j, String str, int i, String str2);

    public static native void nativeRelease(long j);

    public static native void nativeSuccess(long j, String str, String str2);

    private void release() {
        long j = this.nativeCallback;
        if (j != 0) {
            nativeRelease(j);
            this.nativeCallback = 0L;
        }
    }

    public void finalize() {
        try {
            release();
        } finally {
            super.finalize();
        }
    }

    @Override // com.bytedance.ies.cutsame.resourcefetcher.ResourceFetcherCallBack
    public void notifySuccess(String str) {
        long j = this.nativeCallback;
        if (j != 0) {
            nativeSuccess(j, this.input, str);
            release();
            return;
        }
        throw new RuntimeException("callback already release");
    }

    public JniResourceFetcherCallback(long j, String str) {
        this.nativeCallback = j;
        this.input = str;
    }

    @Override // com.bytedance.ies.cutsame.resourcefetcher.ResourceFetcherCallBack
    public void notifyError(int i, String str) {
        long j = this.nativeCallback;
        if (j != 0) {
            nativeError(j, this.input, i, str);
            release();
            return;
        }
        throw new RuntimeException("callback already release");
    }
}
