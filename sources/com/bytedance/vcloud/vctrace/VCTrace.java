package com.bytedance.vcloud.vctrace;

import android.content.Context;

/* loaded from: classes9.dex */
public class VCTrace {
    public boolean mLoaded;

    private native void _setIOManager(long j, long j2);

    private native void _setStringValue(int i, String str);

    public boolean isLoadLibrarySucceed() {
        return this.mLoaded;
    }

    public void create(Context context, boolean z) {
        if (!isLoadLibrarySucceed() && z) {
            JNILoader.loadLibrary(context);
            if (!JNILoader.isLibraryLoaded) {
                return;
            }
            this.mLoaded = true;
        }
    }

    public void setIOManager(long j, long j2) {
        _setIOManager(j, j2);
    }

    public void setStringValue(int i, String str) {
        if (!this.mLoaded) {
            return;
        }
        try {
            _setStringValue(i, str);
        } catch (Throwable unused) {
        }
    }
}
