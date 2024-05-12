package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public class INLETemplateMattingService {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public synchronized void LIZIZ() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLETemplateJNI.delete_INLETemplateMattingService(j);
            }
            this.LIZ = 0L;
        }
    }

    public boolean LIZ() {
        return NLETemplateJNI.INLETemplateMattingService_cancel(this.LIZ, this);
    }

    public boolean LIZJ() {
        return NLETemplateJNI.INLETemplateMattingService_start(this.LIZ, this);
    }

    public INLETemplateMattingService() {
        long new_INLETemplateMattingService = NLETemplateJNI.new_INLETemplateMattingService();
        this.LIZIZ = true;
        this.LIZ = new_INLETemplateMattingService;
        NLETemplateJNI.INLETemplateMattingService_director_connect(this, new_INLETemplateMattingService, true, true);
    }

    public void finalize() {
        LIZIZ();
    }
}
