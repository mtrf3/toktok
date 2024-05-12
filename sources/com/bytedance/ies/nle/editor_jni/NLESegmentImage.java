package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentImage extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentImage(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentImage_getResource = NLEEditorJniJNI.NLESegmentImage_getResource(this.LIZJ, this);
        if (NLESegmentImage_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentImage_getResource);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentImage_clone = NLEEditorJniJNI.NLESegmentImage_clone(this.LIZJ, this);
        if (NLESegmentImage_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentImage_clone, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void copyValueNotMappedToStage() {
        NLEEditorJniJNI.NLESegmentImage_copyValueNotMappedToStage(this.LIZJ, this);
    }

    public NLESegmentImage() {
        this(NLEEditorJniJNI.new_NLESegmentImage());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLESegmentImage(long j) {
        super(NLEEditorJniJNI.NLESegmentImage_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
