package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentInfoSticker extends NLESegmentSticker {
    public transient long LJ;
    public transient boolean LJFF;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LJ;
        if (j != 0) {
            if (this.LJFF) {
                this.LJFF = false;
                NLEEditorJniJNI.delete_NLESegmentInfoSticker(j);
            }
            this.LJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentInfoSticker_getResource = NLEEditorJniJNI.NLESegmentInfoSticker_getResource(this.LJ, this);
        if (NLESegmentInfoSticker_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentInfoSticker_getResource);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentInfoSticker_clone = NLEEditorJniJNI.NLESegmentInfoSticker_clone(this.LJ, this);
        if (NLESegmentInfoSticker_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentInfoSticker_clone, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void copyValueNotMappedToStage() {
        NLEEditorJniJNI.NLESegmentInfoSticker_copyValueNotMappedToStage(this.LJ, this);
    }

    public NLESegmentInfoSticker() {
        this(NLEEditorJniJNI.new_NLESegmentInfoSticker());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLESegmentInfoSticker(long j) {
        super(NLEEditorJniJNI.NLESegmentInfoSticker_SWIGSmartPtrUpcast(j));
        this.LJFF = true;
        this.LJ = j;
    }

    public static NLESegmentInfoSticker LJFF(NLENode nLENode) {
        long NLESegmentInfoSticker_dynamicCast = NLEEditorJniJNI.NLESegmentInfoSticker_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLESegmentInfoSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentInfoSticker(NLESegmentInfoSticker_dynamicCast);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LJFF = z;
        super.swigSetCMemOwn(z);
    }
}
