package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLERenderImageResizeInfo extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLERenderImageResizeInfo(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLERenderImageResizeInfo_clone = NLEEditorJniJNI.NLERenderImageResizeInfo_clone(this.LIZ, this);
        if (NLERenderImageResizeInfo_clone == 0) {
            return null;
        }
        return new NLENode(NLERenderImageResizeInfo_clone, true);
    }

    public NLERenderImageResizeInfo() {
        this(NLEEditorJniJNI.new_NLERenderImageResizeInfo());
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

    public NLERenderImageResizeInfo(long j) {
        super(NLEEditorJniJNI.NLERenderImageResizeInfo_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
