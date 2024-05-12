package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEAudioBeatTracking {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaPublicJniJNI.delete_NLEAudioBeatTracking(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEAudioBeatTracking() {
        this(NLEMediaPublicJniJNI.new_NLEAudioBeatTracking());
    }

    public NLEAudioBeatTracking(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
