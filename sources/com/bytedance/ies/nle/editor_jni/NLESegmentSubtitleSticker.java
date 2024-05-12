package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentSubtitleSticker extends NLESegmentSticker {
    public transient long LJ;
    public transient boolean LJFF;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LJ;
        if (j != 0) {
            if (this.LJFF) {
                this.LJFF = false;
                NLEEditorJniJNI.delete_NLESegmentSubtitleSticker(j);
            }
            this.LJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentSubtitleSticker_getResource = NLEEditorJniJNI.NLESegmentSubtitleSticker_getResource(this.LJ, this);
        if (NLESegmentSubtitleSticker_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentSubtitleSticker_getResource);
    }

    public final NLEResourceNode LJI() {
        long NLESegmentSubtitleSticker_getEffectSDKFile = NLEEditorJniJNI.NLESegmentSubtitleSticker_getEffectSDKFile(this.LJ, this);
        if (NLESegmentSubtitleSticker_getEffectSDKFile == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentSubtitleSticker_getEffectSDKFile);
    }

    public final NLEResourceNode LJII() {
        long NLESegmentSubtitleSticker_getSRTFile = NLEEditorJniJNI.NLESegmentSubtitleSticker_getSRTFile(this.LJ, this);
        if (NLESegmentSubtitleSticker_getSRTFile == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentSubtitleSticker_getSRTFile);
    }

    public final NLEStyText LJIIIIZZ() {
        long NLESegmentSubtitleSticker_getStyle = NLEEditorJniJNI.NLESegmentSubtitleSticker_getStyle(this.LJ, this);
        if (NLESegmentSubtitleSticker_getStyle == 0) {
            return null;
        }
        return new NLEStyText(NLESegmentSubtitleSticker_getStyle);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentSubtitleSticker_clone = NLEEditorJniJNI.NLESegmentSubtitleSticker_clone(this.LJ, this);
        if (NLESegmentSubtitleSticker_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentSubtitleSticker_clone, true);
    }

    public NLESegmentSubtitleSticker() {
        this(NLEEditorJniJNI.new_NLESegmentSubtitleSticker());
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

    public NLESegmentSubtitleSticker(long j) {
        super(NLEEditorJniJNI.NLESegmentSubtitleSticker_SWIGSmartPtrUpcast(j));
        this.LJFF = true;
        this.LJ = j;
    }

    public static NLESegmentSubtitleSticker LJFF(NLESegment nLESegment) {
        long NLESegmentSubtitleSticker_dynamicCast = NLEEditorJniJNI.NLESegmentSubtitleSticker_dynamicCast(NLENode.getCPtr(nLESegment), nLESegment);
        if (NLESegmentSubtitleSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentSubtitleSticker(NLESegmentSubtitleSticker_dynamicCast);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LJFF = z;
        super.swigSetCMemOwn(z);
    }
}
