package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentAIMatting extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentAIMatting(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentAIMatting_getResource = NLEEditorJniJNI.NLESegmentAIMatting_getResource(this.LIZJ, this);
        if (NLESegmentAIMatting_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentAIMatting_getResource);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentAIMatting_clone = NLEEditorJniJNI.NLESegmentAIMatting_clone(this.LIZJ, this);
        if (NLESegmentAIMatting_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentAIMatting_clone, true);
    }

    public NLESegmentAIMatting() {
        this(NLEEditorJniJNI.new_NLESegmentAIMatting());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLESegmentAIMatting(long j) {
        super(NLEEditorJniJNI.NLESegmentAIMatting_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
