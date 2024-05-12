package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEVideoEncodeSettings {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEVideoEncodeSettings(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEVideoEncodeSettings() {
        long new_NLEVideoEncodeSettings = NLEMediaJniJNI.new_NLEVideoEncodeSettings();
        this.LIZIZ = true;
        this.LIZ = new_NLEVideoEncodeSettings;
    }
}
