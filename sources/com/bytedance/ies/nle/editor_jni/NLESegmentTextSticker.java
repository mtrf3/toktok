package com.bytedance.ies.nle.editor_jni;

import X.EnumC123874tb;

/* loaded from: classes3.dex */
public final class NLESegmentTextSticker extends NLESegmentSticker {
    public transient long LJ;
    public transient boolean LJFF;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LJ;
        if (j != 0) {
            if (this.LJFF) {
                this.LJFF = false;
                NLEEditorJniJNI.delete_NLESegmentTextSticker(j);
            }
            this.LJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final EnumC123874tb LIZJ() {
        return EnumC123874tb.swigToEnum(NLEEditorJniJNI.NLESegmentTextSticker_getType(this.LJ, this));
    }

    public final String LJI() {
        return NLEEditorJniJNI.NLESegmentTextSticker_getContent(this.LJ, this);
    }

    public final NLEStyText LJII() {
        long NLESegmentTextSticker_getStyle = NLEEditorJniJNI.NLESegmentTextSticker_getStyle(this.LJ, this);
        if (NLESegmentTextSticker_getStyle == 0) {
            return null;
        }
        return new NLEStyText(NLESegmentTextSticker_getStyle);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentTextSticker_clone = NLEEditorJniJNI.NLESegmentTextSticker_clone(this.LJ, this);
        if (NLESegmentTextSticker_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentTextSticker_clone, true);
    }

    public NLESegmentTextSticker() {
        this(NLEEditorJniJNI.new_NLESegmentTextSticker__SWIG_0());
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

    public NLESegmentTextSticker(long j) {
        super(NLEEditorJniJNI.NLESegmentTextSticker_SWIGSmartPtrUpcast(j));
        this.LJFF = true;
        this.LJ = j;
    }

    public static NLESegmentTextSticker LJFF(NLENode nLENode) {
        long NLESegmentTextSticker_dynamicCast = NLEEditorJniJNI.NLESegmentTextSticker_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLESegmentTextSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentTextSticker(NLESegmentTextSticker_dynamicCast);
    }

    public final void LJIIIIZZ(String str) {
        NLEEditorJniJNI.NLESegmentTextSticker_setContent(this.LJ, this, str);
    }

    public final void LJIIIZ(NLEStyText nLEStyText) {
        NLEEditorJniJNI.NLESegmentTextSticker_setStyle(this.LJ, this, nLEStyText.LIZ, nLEStyText);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LJFF = z;
        super.swigSetCMemOwn(z);
    }
}
