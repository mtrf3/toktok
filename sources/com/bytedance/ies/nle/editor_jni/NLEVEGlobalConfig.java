package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEVEGlobalConfig {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEVEGlobalConfig(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEVEGlobalConfig() {
        this(NLEMediaJniJNI.new_NLEVEGlobalConfig());
    }

    public NLEVEGlobalConfig(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
