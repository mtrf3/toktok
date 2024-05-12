package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEMonitorParamBuilder {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_NLEMonitorParamBuilder(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMonitorParamBuilder() {
        long new_NLEMonitorParamBuilder = NLEEditorJniJNI.new_NLEMonitorParamBuilder();
        this.LIZIZ = true;
        this.LIZ = new_NLEMonitorParamBuilder;
    }
}
