package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEMVInfoBean {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEMVInfoBean(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMVInfoBean() {
        long new_NLEMVInfoBean = NLEMediaJniJNI.new_NLEMVInfoBean();
        this.LIZIZ = true;
        this.LIZ = new_NLEMVInfoBean;
    }
}
