package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentTransition extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentTransition(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentTransition_getResource = NLEEditorJniJNI.NLESegmentTransition_getResource(this.LIZJ, this);
        if (NLESegmentTransition_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentTransition_getResource);
    }

    public final NLEResourceNode LIZLLL() {
        long NLESegmentTransition_getEffectSDKTransition = NLEEditorJniJNI.NLESegmentTransition_getEffectSDKTransition(this.LIZJ, this);
        if (NLESegmentTransition_getEffectSDKTransition == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentTransition_getEffectSDKTransition);
    }

    public final boolean LJ() {
        return NLEEditorJniJNI.NLESegmentTransition_getOverlap(this.LIZJ, this);
    }

    public final long LJFF() {
        return NLEEditorJniJNI.NLESegmentTransition_getTransitionDuration(this.LIZJ, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentTransition_clone = NLEEditorJniJNI.NLESegmentTransition_clone(this.LIZJ, this);
        if (NLESegmentTransition_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentTransition_clone, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final long getDuration() {
        return NLEEditorJniJNI.NLESegmentTransition_getDuration(this.LIZJ, this);
    }

    public NLESegmentTransition() {
        this(NLEEditorJniJNI.new_NLESegmentTransition());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLESegmentTransition(long j) {
        super(NLEEditorJniJNI.NLESegmentTransition_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
