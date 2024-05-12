package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEMediaConfig {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEMediaConfig(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public final NLEMediaABConfig LIZ() {
        long NLEMediaConfig_nleMediaAbConfig_get = NLEMediaJniJNI.NLEMediaConfig_nleMediaAbConfig_get(this.LIZ, this);
        if (NLEMediaConfig_nleMediaAbConfig_get == 0) {
            return null;
        }
        return new NLEMediaABConfig(NLEMediaConfig_nleMediaAbConfig_get);
    }

    public NLEMediaConfig() {
        this(NLEMediaJniJNI.new_NLEMediaConfig());
    }

    public NLEMediaConfig(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
