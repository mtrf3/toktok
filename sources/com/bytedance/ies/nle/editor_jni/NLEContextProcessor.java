package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public final class NLEContextProcessor {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLETemplateJNI.delete_NLEContextProcessor(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEContextProcessor() {
        long new_NLEContextProcessor = NLETemplateJNI.new_NLEContextProcessor();
        this.LIZIZ = true;
        this.LIZ = new_NLEContextProcessor;
    }
}
