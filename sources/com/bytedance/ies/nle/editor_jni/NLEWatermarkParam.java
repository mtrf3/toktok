package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEWatermarkParam {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEWatermarkParam(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEWatermarkParam() {
        long new_NLEWatermarkParam = NLEMediaJniJNI.new_NLEWatermarkParam();
        this.LIZIZ = true;
        this.LIZ = new_NLEWatermarkParam;
    }
}
