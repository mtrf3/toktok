package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEWatermarkMask {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEWatermarkMask(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEWatermarkMask() {
        long new_NLEWatermarkMask = NLEMediaJniJNI.new_NLEWatermarkMask();
        this.LIZIZ = true;
        this.LIZ = new_NLEWatermarkMask;
    }
}
