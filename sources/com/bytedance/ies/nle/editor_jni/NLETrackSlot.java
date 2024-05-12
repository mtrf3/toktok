package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLETrackSlot extends NLETimeSpaceNode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLETrackSlot(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    public final NLEFilter LIZIZ() {
        long NLETrackSlot_getAudioFilter = NLEEditorJniJNI.NLETrackSlot_getAudioFilter(this.LIZ, this);
        if (NLETrackSlot_getAudioFilter == 0) {
            return null;
        }
        return new NLEFilter(NLETrackSlot_getAudioFilter);
    }

    public final NLESegmentTransition LIZLLL() {
        long NLETrackSlot_getEndTransition = NLEEditorJniJNI.NLETrackSlot_getEndTransition(this.LIZ, this);
        if (NLETrackSlot_getEndTransition == 0) {
            return null;
        }
        return new NLESegmentTransition(NLETrackSlot_getEndTransition);
    }

    public final VecNLEFilterSPtr LJ() {
        return new VecNLEFilterSPtr(NLEEditorJniJNI.NLETrackSlot_getFilters(this.LIZ, this));
    }

    public final VecNLETrackSlotSPtr LJFF() {
        return new VecNLETrackSlotSPtr(NLEEditorJniJNI.NLETrackSlot_getKeyframes(this.LIZ, this));
    }

    public final NLESegment LJI() {
        long NLETrackSlot_getMainSegment = NLEEditorJniJNI.NLETrackSlot_getMainSegment(this.LIZ, this);
        if (NLETrackSlot_getMainSegment == 0) {
            return null;
        }
        return new NLESegment(NLETrackSlot_getMainSegment);
    }

    public final NLEResourceNode LJII() {
        long NLETrackSlot_getPinAlgorithmFile = NLEEditorJniJNI.NLETrackSlot_getPinAlgorithmFile(this.LIZ, this);
        if (NLETrackSlot_getPinAlgorithmFile == 0) {
            return null;
        }
        return new NLEResourceNode(NLETrackSlot_getPinAlgorithmFile);
    }

    public final NLETrackSlot LJIIIIZZ() {
        long NLETrackSlot_getRenderProxy = NLEEditorJniJNI.NLETrackSlot_getRenderProxy(this.LIZ, this);
        if (NLETrackSlot_getRenderProxy == 0) {
            return null;
        }
        return new NLETrackSlot(NLETrackSlot_getRenderProxy);
    }

    public final VecNLEVideoAnimationSPtr LJIIIZ() {
        return new VecNLEVideoAnimationSPtr(NLEEditorJniJNI.NLETrackSlot_getVideoAnims(this.LIZ, this));
    }

    public final VecNLEVideoEffectSPtr LJIIJ() {
        return new VecNLEVideoEffectSPtr(NLEEditorJniJNI.NLETrackSlot_getVideoEffects(this.LIZ, this));
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLETrackSlot_clone = NLEEditorJniJNI.NLETrackSlot_clone(this.LIZ, this);
        if (NLETrackSlot_clone == 0) {
            return null;
        }
        return new NLENode(NLETrackSlot_clone, true);
    }

    public NLETrackSlot() {
        this(NLEEditorJniJNI.new_NLETrackSlot());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLETrackSlot(long j) {
        super(NLEEditorJniJNI.NLETrackSlot_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static NLETrackSlot LIZ(NLENode nLENode) {
        long NLETrackSlot_dynamicCast = NLEEditorJniJNI.NLETrackSlot_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLETrackSlot_dynamicCast == 0) {
            return null;
        }
        return new NLETrackSlot(NLETrackSlot_dynamicCast);
    }

    public static long LIZJ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null) {
            return 0L;
        }
        return nLETrackSlot.LIZ;
    }

    public final void LJIIJJI(NLESegmentTransition nLESegmentTransition) {
        long j;
        long j2 = this.LIZ;
        if (nLESegmentTransition == null) {
            j = 0;
        } else {
            j = nLESegmentTransition.LIZJ;
        }
        NLEEditorJniJNI.NLETrackSlot_setEndTransition(j2, this, j, nLESegmentTransition);
    }

    public final void LJIIL(NLESegment nLESegment) {
        NLEEditorJniJNI.NLETrackSlot_setMainSegment(this.LIZ, this, NLESegment.LIZ(nLESegment), nLESegment);
    }

    public final void LJIILIIL(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLETrackSlot_setPinAlgorithmFile(this.LIZ, this, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
    }

    public final void LJIILJJIL(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrackSlot_setRenderProxy(this.LIZ, this, LIZJ(nLETrackSlot), nLETrackSlot);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
