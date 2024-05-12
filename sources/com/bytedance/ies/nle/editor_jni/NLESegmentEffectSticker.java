package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentEffectSticker extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentEffectSticker(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentEffectSticker_getResource = NLEEditorJniJNI.NLESegmentEffectSticker_getResource(this.LIZJ, this);
        if (NLESegmentEffectSticker_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentEffectSticker_getResource);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentEffectSticker_clone = NLEEditorJniJNI.NLESegmentEffectSticker_clone(this.LIZJ, this);
        if (NLESegmentEffectSticker_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentEffectSticker_clone, true);
    }

    public NLESegmentEffectSticker() {
        this(NLEEditorJniJNI.new_NLESegmentEffectSticker());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLESegmentEffectSticker(long j) {
        super(NLEEditorJniJNI.NLESegmentEffectSticker_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    public static long LIZLLL(NLESegmentEffectSticker nLESegmentEffectSticker) {
        if (nLESegmentEffectSticker == null) {
            return 0L;
        }
        return nLESegmentEffectSticker.LIZJ;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
