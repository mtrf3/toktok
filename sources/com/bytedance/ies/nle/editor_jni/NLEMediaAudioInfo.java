package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEMediaAudioInfo {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEMediaAudioInfo(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMediaAudioInfo() {
        long new_NLEMediaAudioInfo = NLEMediaJniJNI.new_NLEMediaAudioInfo();
        this.LIZIZ = true;
        this.LIZ = new_NLEMediaAudioInfo;
    }
}
