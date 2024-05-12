package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public final class NLEMaterialHandleCallback {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLETemplateJNI.delete_NLEMaterialHandleCallback(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMaterialHandleCallback() {
        this(NLETemplateJNI.new_NLEMaterialHandleCallback());
        NLETemplateJNI.NLEMaterialHandleCallback_director_connect(this, this.LIZ, true, true);
    }

    public NLEMaterialHandleCallback(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
