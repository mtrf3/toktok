package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEMediaVideoInfo {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEMediaVideoInfo(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMediaVideoInfo() {
        long new_NLEMediaVideoInfo = NLEMediaJniJNI.new_NLEMediaVideoInfo();
        this.LIZIZ = true;
        this.LIZ = new_NLEMediaVideoInfo;
    }
}
