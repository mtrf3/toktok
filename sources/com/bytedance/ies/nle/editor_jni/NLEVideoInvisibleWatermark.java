package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEVideoInvisibleWatermark {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEVideoInvisibleWatermark(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEVideoInvisibleWatermark() {
        long new_NLEVideoInvisibleWatermark = NLEMediaJniJNI.new_NLEVideoInvisibleWatermark();
        this.LIZIZ = true;
        this.LIZ = new_NLEVideoInvisibleWatermark;
    }
}
