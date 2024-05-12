package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public final class NLETemplateConvertCallback {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLETemplateJNI.delete_NLETemplateConvertCallback(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLETemplateConvertCallback() {
        long new_NLETemplateConvertCallback = NLETemplateJNI.new_NLETemplateConvertCallback();
        this.LIZIZ = true;
        this.LIZ = new_NLETemplateConvertCallback;
        NLETemplateJNI.NLETemplateConvertCallback_director_connect(this, new_NLETemplateConvertCallback, true, true);
    }
}
