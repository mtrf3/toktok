package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public final class INLETemplatePreHandler {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLETemplateJNI.delete_INLETemplatePreHandler(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public INLETemplatePreHandler() {
        long new_INLETemplatePreHandler = NLETemplateJNI.new_INLETemplatePreHandler();
        this.LIZIZ = true;
        this.LIZ = new_INLETemplatePreHandler;
        NLETemplateJNI.INLETemplatePreHandler_director_connect(this, new_INLETemplatePreHandler, true, true);
    }
}
