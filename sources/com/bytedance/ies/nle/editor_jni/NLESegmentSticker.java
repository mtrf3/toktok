package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public class NLESegmentSticker extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentSticker(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    public final NLEStyStickerAnim LJ() {
        long NLESegmentSticker_getAnimation = NLEEditorJniJNI.NLESegmentSticker_getAnimation(this.LIZJ, this);
        if (NLESegmentSticker_getAnimation == 0) {
            return null;
        }
        return new NLEStyStickerAnim(NLESegmentSticker_getAnimation);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public NLENode mo70clone() {
        long NLESegmentSticker_clone = NLEEditorJniJNI.NLESegmentSticker_clone(this.LIZJ, this);
        if (NLESegmentSticker_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentSticker_clone, true);
    }

    public NLESegmentSticker() {
        this(NLEEditorJniJNI.new_NLESegmentSticker());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    public NLESegmentSticker(long j) {
        super(NLEEditorJniJNI.NLESegmentSticker_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    public static NLESegmentSticker LIZLLL(NLENode nLENode) {
        long NLESegmentSticker_dynamicCast = NLEEditorJniJNI.NLESegmentSticker_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLESegmentSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentSticker(NLESegmentSticker_dynamicCast);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
