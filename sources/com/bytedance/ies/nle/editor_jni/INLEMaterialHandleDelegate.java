package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public final class INLEMaterialHandleDelegate {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLETemplateJNI.delete_INLEMaterialHandleDelegate(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public INLEMaterialHandleDelegate() {
        long new_INLEMaterialHandleDelegate = NLETemplateJNI.new_INLEMaterialHandleDelegate();
        this.LIZIZ = true;
        this.LIZ = new_INLEMaterialHandleDelegate;
        NLETemplateJNI.INLEMaterialHandleDelegate_director_connect(this, new_INLEMaterialHandleDelegate, true, true);
    }
}
