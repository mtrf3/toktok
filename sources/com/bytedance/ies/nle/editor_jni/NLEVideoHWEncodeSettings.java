package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEVideoHWEncodeSettings {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEVideoHWEncodeSettings(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEVideoHWEncodeSettings() {
        long new_NLEVideoHWEncodeSettings = NLEMediaJniJNI.new_NLEVideoHWEncodeSettings();
        this.LIZIZ = true;
        this.LIZ = new_NLEVideoHWEncodeSettings;
    }
}
