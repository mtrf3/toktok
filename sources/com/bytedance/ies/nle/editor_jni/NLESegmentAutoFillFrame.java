package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentAutoFillFrame extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentAutoFillFrame(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentAutoFillFrame_getResource = NLEEditorJniJNI.NLESegmentAutoFillFrame_getResource(this.LIZJ, this);
        if (NLESegmentAutoFillFrame_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentAutoFillFrame_getResource);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentAutoFillFrame_clone = NLEEditorJniJNI.NLESegmentAutoFillFrame_clone(this.LIZJ, this);
        if (NLESegmentAutoFillFrame_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentAutoFillFrame_clone, true);
    }

    public NLESegmentAutoFillFrame() {
        this(NLEEditorJniJNI.new_NLESegmentAutoFillFrame());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLESegmentAutoFillFrame(long j) {
        super(NLEEditorJniJNI.NLESegmentAutoFillFrame_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
