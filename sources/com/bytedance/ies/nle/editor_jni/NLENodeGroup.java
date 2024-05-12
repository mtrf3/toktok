package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLENodeGroup extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLENodeGroup(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLENodeGroup_clone = NLEEditorJniJNI.NLENodeGroup_clone(this.LIZ, this);
        if (NLENodeGroup_clone == 0) {
            return null;
        }
        return new NLENode(NLENodeGroup_clone, true);
    }

    public NLENodeGroup() {
        this(NLEEditorJniJNI.new_NLENodeGroup());
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

    public NLENodeGroup(long j) {
        super(NLEEditorJniJNI.NLENodeGroup_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final boolean addToWorking(NLENode nLENode) {
        return NLEEditorJniJNI.NLENodeGroup_addToWorking(this.LIZ, this, NLENode.getCPtr(nLENode), nLENode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
