package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLERenderProxySegment extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLERenderProxySegment(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLERenderProxySegment_getResource = NLEEditorJniJNI.NLERenderProxySegment_getResource(this.LIZJ, this);
        if (NLERenderProxySegment_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLERenderProxySegment_getResource);
    }

    public final NLEResourceAV LJ() {
        long NLERenderProxySegment_getAVFile = NLEEditorJniJNI.NLERenderProxySegment_getAVFile(this.LIZJ, this);
        if (NLERenderProxySegment_getAVFile == 0) {
            return null;
        }
        return new NLEResourceAV(NLERenderProxySegment_getAVFile);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLERenderProxySegment_clone = NLEEditorJniJNI.NLERenderProxySegment_clone(this.LIZJ, this);
        if (NLERenderProxySegment_clone == 0) {
            return null;
        }
        return new NLENode(NLERenderProxySegment_clone, true);
    }

    public NLERenderProxySegment() {
        this(NLEEditorJniJNI.new_NLERenderProxySegment());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLERenderProxySegment(long j) {
        super(NLEEditorJniJNI.NLERenderProxySegment_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    public static NLERenderProxySegment LIZLLL(NLESegment nLESegment) {
        long NLERenderProxySegment_dynamicCast = NLEEditorJniJNI.NLERenderProxySegment_dynamicCast(NLENode.getCPtr(nLESegment), nLESegment);
        if (NLERenderProxySegment_dynamicCast == 0) {
            return null;
        }
        return new NLERenderProxySegment(NLERenderProxySegment_dynamicCast);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
