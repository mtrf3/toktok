package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes8.dex */
public final class NLEModelDownloaderParams {
    public transient long LIZ;
    public transient boolean LIZIZ = true;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEResourcesDAVJNI.delete_NLEModelDownloaderParams(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEModelDownloaderParams(long j) {
        this.LIZ = j;
    }
}
