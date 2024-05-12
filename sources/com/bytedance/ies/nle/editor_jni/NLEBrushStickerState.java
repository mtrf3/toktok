package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEBrushStickerState {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEBrushStickerState(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEBrushStickerState() {
        long new_NLEBrushStickerState = NLEMediaJniJNI.new_NLEBrushStickerState();
        this.LIZIZ = true;
        this.LIZ = new_NLEBrushStickerState;
    }
}
