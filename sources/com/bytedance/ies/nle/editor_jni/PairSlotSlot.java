package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class PairSlotSlot {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_PairSlotSlot(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public final NLETrackSlot LIZ() {
        long PairSlotSlot_first_get = NLEEditorJniJNI.PairSlotSlot_first_get(this.LIZ, this);
        if (PairSlotSlot_first_get == 0) {
            return null;
        }
        return new NLETrackSlot(PairSlotSlot_first_get);
    }

    public final NLETrackSlot LIZIZ() {
        long PairSlotSlot_second_get = NLEEditorJniJNI.PairSlotSlot_second_get(this.LIZ, this);
        if (PairSlotSlot_second_get == 0) {
            return null;
        }
        return new NLETrackSlot(PairSlotSlot_second_get);
    }

    public PairSlotSlot() {
        this(NLEEditorJniJNI.new_PairSlotSlot__SWIG_0());
    }

    public PairSlotSlot(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
