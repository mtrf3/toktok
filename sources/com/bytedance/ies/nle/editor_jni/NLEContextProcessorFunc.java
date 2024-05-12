package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public final class NLEContextProcessorFunc {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLETemplateJNI.delete_NLEContextProcessorFunc(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEContextProcessorFunc() {
        long new_NLEContextProcessorFunc = NLETemplateJNI.new_NLEContextProcessorFunc();
        this.LIZIZ = true;
        this.LIZ = new_NLEContextProcessorFunc;
        NLETemplateJNI.NLEContextProcessorFunc_director_connect(this, new_NLEContextProcessorFunc, true, true);
    }
}
