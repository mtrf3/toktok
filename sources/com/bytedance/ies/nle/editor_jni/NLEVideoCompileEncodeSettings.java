package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEVideoCompileEncodeSettings {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEVideoCompileEncodeSettings(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEVideoCompileEncodeSettings() {
        long new_NLEVideoCompileEncodeSettings = NLEMediaJniJNI.new_NLEVideoCompileEncodeSettings();
        this.LIZIZ = true;
        this.LIZ = new_NLEVideoCompileEncodeSettings;
    }
}
