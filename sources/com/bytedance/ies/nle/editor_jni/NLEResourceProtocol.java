package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public class NLEResourceProtocol {
    public transient long LIZ;
    public transient boolean LIZIZ = true;

    public synchronized void LIZ() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEResourceProtocol(j);
            }
            this.LIZ = 0L;
        }
    }

    public void finalize() {
        LIZ();
    }

    public NLEResourceProtocol(long j) {
        this.LIZ = j;
    }
}
