package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentChromaChannel extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentChromaChannel(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentChromaChannel_getResource = NLEEditorJniJNI.NLESegmentChromaChannel_getResource(this.LIZJ, this);
        if (NLESegmentChromaChannel_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentChromaChannel_getResource);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentChromaChannel_clone = NLEEditorJniJNI.NLESegmentChromaChannel_clone(this.LIZJ, this);
        if (NLESegmentChromaChannel_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentChromaChannel_clone, true);
    }

    public NLESegmentChromaChannel() {
        this(NLEEditorJniJNI.new_NLESegmentChromaChannel());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLESegmentChromaChannel(long j) {
        super(NLEEditorJniJNI.NLESegmentChromaChannel_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
