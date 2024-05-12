package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentComposerFilter extends NLESegmentFilter {
    public transient long LJ;
    public transient boolean LJFF;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LJ;
        if (j != 0) {
            if (this.LJFF) {
                this.LJFF = false;
                NLEEditorJniJNI.delete_NLESegmentComposerFilter(j);
            }
            this.LJ = 0L;
        }
        super.delete();
    }

    public final VecNLEStringFloatPairSPtr LJIIIZ() {
        return new VecNLEStringFloatPairSPtr(NLEEditorJniJNI.NLESegmentComposerFilter_getEffectNodeKeyValuePairs(this.LJ, this));
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentComposerFilter_clone = NLEEditorJniJNI.NLESegmentComposerFilter_clone(this.LJ, this);
        if (NLESegmentComposerFilter_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentComposerFilter_clone, true);
    }

    public NLESegmentComposerFilter() {
        this(NLEEditorJniJNI.new_NLESegmentComposerFilter());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLESegmentComposerFilter(long j) {
        super(NLEEditorJniJNI.NLESegmentComposerFilter_SWIGSmartPtrUpcast(j));
        this.LJFF = true;
        this.LJ = j;
    }

    public static NLESegmentComposerFilter LJIIIIZZ(NLENode nLENode) {
        long NLESegmentComposerFilter_dynamicCast = NLEEditorJniJNI.NLESegmentComposerFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLESegmentComposerFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentComposerFilter(NLESegmentComposerFilter_dynamicCast);
    }

    public final void LJIIJ(VecString vecString) {
        NLEEditorJniJNI.NLESegmentComposerFilter_setEffectTags(this.LJ, this, VecString.LIZJ(vecString), vecString);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LJFF = z;
        super.swigSetCMemOwn(z);
    }
}
