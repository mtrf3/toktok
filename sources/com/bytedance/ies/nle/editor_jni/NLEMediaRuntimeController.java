package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEMediaRuntimeController {
    public transient long LIZ;
    public transient boolean LIZIZ = true;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaPublicJniJNI.delete_NLEMediaRuntimeController(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMediaRuntimeController(long j) {
        this.LIZ = j;
    }

    public final String LIZ(String str) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_findVEParentIdByNLESlotUUID(this.LIZ, this, str);
    }
}
