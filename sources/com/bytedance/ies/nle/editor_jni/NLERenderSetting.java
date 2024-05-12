package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLERenderSetting extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLERenderSetting(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLERenderSetting_clone = NLEEditorJniJNI.NLERenderSetting_clone(this.LIZ, this);
        if (NLERenderSetting_clone == 0) {
            return null;
        }
        return new NLENode(NLERenderSetting_clone, true);
    }

    public NLERenderSetting() {
        this(NLEEditorJniJNI.new_NLERenderSetting());
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

    public NLERenderSetting(long j) {
        super(NLEEditorJniJNI.NLERenderSetting_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
