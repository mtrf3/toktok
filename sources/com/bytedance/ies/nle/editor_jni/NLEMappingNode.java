package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public final class NLEMappingNode extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLETemplateJNI.delete_NLEMappingNode(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEMappingNode_clone = NLETemplateJNI.NLEMappingNode_clone(this.LIZ, this);
        if (NLEMappingNode_clone == 0) {
            return null;
        }
        return new NLENode(NLEMappingNode_clone, true);
    }

    public NLEMappingNode() {
        this(NLETemplateJNI.new_NLEMappingNode());
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

    public NLEMappingNode(long j) {
        super(NLETemplateJNI.NLEMappingNode_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
