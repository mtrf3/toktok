package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEVideoFrameModel extends NLETimeSpaceNode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEVideoFrameModel(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEVideoFrameModel_clone = NLEEditorJniJNI.NLEVideoFrameModel_clone(this.LIZ, this);
        if (NLEVideoFrameModel_clone == 0) {
            return null;
        }
        return new NLENode(NLEVideoFrameModel_clone, true);
    }

    public final VecNLETrackSPtr getTracks() {
        return new VecNLETrackSPtr(NLEEditorJniJNI.NLEVideoFrameModel_getTracks(this.LIZ, this));
    }

    public NLEVideoFrameModel() {
        this(NLEEditorJniJNI.new_NLEVideoFrameModel());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLEVideoFrameModel(long j) {
        super(NLEEditorJniJNI.NLEVideoFrameModel_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
