package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEWatermarkEntity {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEWatermarkEntity(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEWatermarkEntity() {
        this(NLEMediaJniJNI.new_NLEWatermarkEntity());
    }

    public NLEWatermarkEntity(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
