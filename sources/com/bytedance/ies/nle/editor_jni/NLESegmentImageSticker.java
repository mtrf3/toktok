package com.bytedance.ies.nle.editor_jni;

import X.EnumC123874tb;

/* loaded from: classes3.dex */
public final class NLESegmentImageSticker extends NLESegmentSticker {
    public transient long LJ;
    public transient boolean LJFF;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LJ;
        if (j != 0) {
            if (this.LJFF) {
                this.LJFF = false;
                NLEEditorJniJNI.delete_NLESegmentImageSticker(j);
            }
            this.LJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentImageSticker_getResource = NLEEditorJniJNI.NLESegmentImageSticker_getResource(this.LJ, this);
        if (NLESegmentImageSticker_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentImageSticker_getResource);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final EnumC123874tb LIZJ() {
        return EnumC123874tb.swigToEnum(NLEEditorJniJNI.NLESegmentImageSticker_getType(this.LJ, this));
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentImageSticker_clone = NLEEditorJniJNI.NLESegmentImageSticker_clone(this.LJ, this);
        if (NLESegmentImageSticker_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentImageSticker_clone, true);
    }

    public NLESegmentImageSticker() {
        this(NLEEditorJniJNI.new_NLESegmentImageSticker());
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

    public NLESegmentImageSticker(long j) {
        super(NLEEditorJniJNI.NLESegmentImageSticker_SWIGSmartPtrUpcast(j));
        this.LJFF = true;
        this.LJ = j;
    }

    public static NLESegmentImageSticker LJFF(NLENode nLENode) {
        long NLESegmentImageSticker_dynamicCast = NLEEditorJniJNI.NLESegmentImageSticker_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLESegmentImageSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentImageSticker(NLESegmentImageSticker_dynamicCast);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LJFF = z;
        super.swigSetCMemOwn(z);
    }
}
