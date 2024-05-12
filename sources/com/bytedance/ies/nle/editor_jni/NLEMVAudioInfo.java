package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEMVAudioInfo {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEMVAudioInfo(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMVAudioInfo() {
        this(NLEMediaJniJNI.new_NLEMVAudioInfo());
    }

    public NLEMVAudioInfo(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
