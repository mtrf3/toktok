package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEVideoSWEncodeSettings {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEVideoSWEncodeSettings(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEVideoSWEncodeSettings() {
        long new_NLEVideoSWEncodeSettings = NLEMediaJniJNI.new_NLEVideoSWEncodeSettings();
        this.LIZIZ = true;
        this.LIZ = new_NLEVideoSWEncodeSettings;
    }
}