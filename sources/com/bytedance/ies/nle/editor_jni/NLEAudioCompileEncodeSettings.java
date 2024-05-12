package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEAudioCompileEncodeSettings {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEAudioCompileEncodeSettings(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEAudioCompileEncodeSettings() {
        long new_NLEAudioCompileEncodeSettings = NLEMediaJniJNI.new_NLEAudioCompileEncodeSettings();
        this.LIZIZ = true;
        this.LIZ = new_NLEAudioCompileEncodeSettings;
    }
}
