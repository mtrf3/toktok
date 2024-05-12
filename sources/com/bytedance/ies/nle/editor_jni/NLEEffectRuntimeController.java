package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEEffectRuntimeController {
    public transient long LIZ;
    public transient boolean LIZIZ = true;

    public final synchronized void LIZ() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEMediaPublicJniJNI.delete_NLEEffectRuntimeController(j);
            }
            this.LIZ = 0L;
        }
    }

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaPublicJniJNI.delete_NLEEffectRuntimeController(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEEffectRuntimeController(long j) {
        this.LIZ = j;
    }
}
