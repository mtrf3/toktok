package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEStyStickerAnim extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEStyStickerAnim(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    public final NLEResourceNode LIZ() {
        long NLEStyStickerAnim_getInAnim = NLEEditorJniJNI.NLEStyStickerAnim_getInAnim(this.LIZ, this);
        if (NLEStyStickerAnim_getInAnim == 0) {
            return null;
        }
        return new NLEResourceNode(NLEStyStickerAnim_getInAnim);
    }

    public final int LIZIZ() {
        return NLEEditorJniJNI.NLEStyStickerAnim_getInDuration(this.LIZ, this);
    }

    public final boolean LIZJ() {
        return NLEEditorJniJNI.NLEStyStickerAnim_getLoop(this.LIZ, this);
    }

    public final NLEResourceNode LIZLLL() {
        long NLEStyStickerAnim_getOutAnim = NLEEditorJniJNI.NLEStyStickerAnim_getOutAnim(this.LIZ, this);
        if (NLEStyStickerAnim_getOutAnim == 0) {
            return null;
        }
        return new NLEResourceNode(NLEStyStickerAnim_getOutAnim);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEStyStickerAnim_clone = NLEEditorJniJNI.NLEStyStickerAnim_clone(this.LIZ, this);
        if (NLEStyStickerAnim_clone == 0) {
            return null;
        }
        return new NLENode(NLEStyStickerAnim_clone, true);
    }

    public NLEStyStickerAnim() {
        this(NLEEditorJniJNI.new_NLEStyStickerAnim());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLEStyStickerAnim(long j) {
        super(NLEEditorJniJNI.NLEStyStickerAnim_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
