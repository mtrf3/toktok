package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public final class NLELabRecommendSlotsInfo {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLETemplateJNI.delete_NLELabRecommendSlotsInfo(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLELabRecommendSlotsInfo() {
        long new_NLELabRecommendSlotsInfo = NLETemplateJNI.new_NLELabRecommendSlotsInfo();
        this.LIZIZ = true;
        this.LIZ = new_NLELabRecommendSlotsInfo;
    }
}
