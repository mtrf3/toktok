package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEMediaSession {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final synchronized void LIZ() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEMediaPublicJniJNI.delete_NLEMediaSession(j);
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
                    NLEMediaPublicJniJNI.delete_NLEMediaSession(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMediaSession(NLEMediaConfig nLEMediaConfig) {
        long j;
        if (nLEMediaConfig == null) {
            j = 0;
        } else {
            j = nLEMediaConfig.LIZ;
        }
        long new_NLEMediaSession = NLEMediaPublicJniJNI.new_NLEMediaSession(j, nLEMediaConfig);
        this.LIZIZ = true;
        this.LIZ = new_NLEMediaSession;
    }
}
