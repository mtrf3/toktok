package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLETextTemplateClip extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLETextTemplateClip(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLETextTemplateClip_clone = NLEEditorJniJNI.NLETextTemplateClip_clone(this.LIZ, this);
        if (NLETextTemplateClip_clone == 0) {
            return null;
        }
        return new NLENode(NLETextTemplateClip_clone, true);
    }

    public NLETextTemplateClip() {
        this(NLEEditorJniJNI.new_NLETextTemplateClip());
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

    public NLETextTemplateClip(long j) {
        super(NLEEditorJniJNI.NLETextTemplateClip_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static long LIZ(NLETextTemplateClip nLETextTemplateClip) {
        if (nLETextTemplateClip == null) {
            return 0L;
        }
        return nLETextTemplateClip.LIZ;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
