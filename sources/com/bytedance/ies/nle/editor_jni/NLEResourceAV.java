package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEResourceAV extends NLEResourceNode {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLEResourceAV(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    public final String LJIILLIIL() {
        return NLEEditorJniJNI.NLEResourceAV_getFileInfo(this.LIZJ, this);
    }

    public final boolean LJIIZILJ() {
        return NLEEditorJniJNI.NLEResourceAV_getHasAudio(this.LIZJ, this);
    }

    public final String LJIJ() {
        return NLEEditorJniJNI.NLEResourceAV_getReverseResourceFile(this.LIZJ, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEResourceAV_clone = NLEEditorJniJNI.NLEResourceAV_clone(this.LIZJ, this);
        if (NLEResourceAV_clone == 0) {
            return null;
        }
        return new NLENode(NLEResourceAV_clone, true);
    }

    public NLEResourceAV() {
        this(NLEEditorJniJNI.new_NLEResourceAV());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLEResourceAV(long j) {
        super(NLEEditorJniJNI.NLEResourceAV_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    public static NLEResourceAV LJIILL(NLENode nLENode) {
        long NLEResourceAV_dynamicCast = NLEEditorJniJNI.NLEResourceAV_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLEResourceAV_dynamicCast == 0) {
            return null;
        }
        return new NLEResourceAV(NLEResourceAV_dynamicCast);
    }

    public final void LJIJI(boolean z) {
        NLEEditorJniJNI.NLEResourceAV_setHasAudio(this.LIZJ, this, z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
