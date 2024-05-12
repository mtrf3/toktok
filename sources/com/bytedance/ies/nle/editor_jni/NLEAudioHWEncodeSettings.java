package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEAudioHWEncodeSettings {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEAudioHWEncodeSettings(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEAudioHWEncodeSettings() {
        long new_NLEAudioHWEncodeSettings = NLEMediaJniJNI.new_NLEAudioHWEncodeSettings();
        this.LIZIZ = true;
        this.LIZ = new_NLEAudioHWEncodeSettings;
    }
}
