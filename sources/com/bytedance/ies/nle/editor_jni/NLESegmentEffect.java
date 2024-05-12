package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentEffect extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentEffect(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentEffect_getResource = NLEEditorJniJNI.NLESegmentEffect_getResource(this.LIZJ, this);
        if (NLESegmentEffect_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentEffect_getResource);
    }

    public final NLEResourceNode LJ() {
        long NLESegmentEffect_getEffectSDKEffect = NLEEditorJniJNI.NLESegmentEffect_getEffectSDKEffect(this.LIZJ, this);
        if (NLESegmentEffect_getEffectSDKEffect == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentEffect_getEffectSDKEffect);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentEffect_clone = NLEEditorJniJNI.NLESegmentEffect_clone(this.LIZJ, this);
        if (NLESegmentEffect_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentEffect_clone, true);
    }

    public NLESegmentEffect() {
        this(NLEEditorJniJNI.new_NLESegmentEffect());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLESegmentEffect(long j) {
        super(NLEEditorJniJNI.NLESegmentEffect_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    public static NLESegmentEffect LIZLLL(NLENode nLENode) {
        long NLESegmentEffect_dynamicCast = NLEEditorJniJNI.NLESegmentEffect_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLESegmentEffect_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentEffect(NLESegmentEffect_dynamicCast);
    }

    public final void LJFF(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentEffect_setEffectSDKEffect(this.LIZJ, this, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
