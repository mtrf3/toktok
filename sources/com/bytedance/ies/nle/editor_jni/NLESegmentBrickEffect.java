package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentBrickEffect extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentBrickEffect(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentBrickEffect_getResource = NLEEditorJniJNI.NLESegmentBrickEffect_getResource(this.LIZJ, this);
        if (NLESegmentBrickEffect_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentBrickEffect_getResource);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentBrickEffect_clone = NLEEditorJniJNI.NLESegmentBrickEffect_clone(this.LIZJ, this);
        if (NLESegmentBrickEffect_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentBrickEffect_clone, true);
    }

    public NLESegmentBrickEffect() {
        this(NLEEditorJniJNI.new_NLESegmentBrickEffect());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLESegmentBrickEffect(long j) {
        super(NLEEditorJniJNI.NLESegmentBrickEffect_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
