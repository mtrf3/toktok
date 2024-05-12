package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEMediaABConfig {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEMediaABConfig(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMediaABConfig() {
        this(NLEMediaJniJNI.new_NLEMediaABConfig());
    }

    public NLEMediaABConfig(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
