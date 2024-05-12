package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEResourceComposite extends NLEResourceNode {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLEResourceComposite(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEResourceComposite_clone = NLEEditorJniJNI.NLEResourceComposite_clone(this.LIZJ, this);
        if (NLEResourceComposite_clone == 0) {
            return null;
        }
        return new NLENode(NLEResourceComposite_clone, true);
    }

    public NLEResourceComposite() {
        this(NLEEditorJniJNI.new_NLEResourceComposite());
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

    public NLEResourceComposite(long j) {
        super(NLEEditorJniJNI.NLEResourceComposite_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
