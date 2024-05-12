package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class SpeedConfig {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaPublicJniJNI.delete_SpeedConfig(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public SpeedConfig() {
        long new_SpeedConfig = NLEMediaPublicJniJNI.new_SpeedConfig();
        this.LIZIZ = true;
        this.LIZ = new_SpeedConfig;
    }
}
