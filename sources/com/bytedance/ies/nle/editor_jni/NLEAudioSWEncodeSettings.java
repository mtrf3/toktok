package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEAudioSWEncodeSettings {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEAudioSWEncodeSettings(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEAudioSWEncodeSettings() {
        long new_NLEAudioSWEncodeSettings = NLEMediaJniJNI.new_NLEAudioSWEncodeSettings();
        this.LIZIZ = true;
        this.LIZ = new_NLEAudioSWEncodeSettings;
    }
}
