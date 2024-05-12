package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLETemplateConverter {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLETemplateJNI.delete_NLETemplateConverter(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLETemplateConverter(NLEModel nLEModel, String str) {
        long new_NLETemplateConverter = NLETemplateJNI.new_NLETemplateConverter(NLEModel.getCPtr(nLEModel), nLEModel, str, "");
        this.LIZIZ = true;
        this.LIZ = new_NLETemplateConverter;
    }
}
