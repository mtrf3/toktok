package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLECurveActionBeam extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLECurveActionBeam(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLECurveActionBeam_clone = NLEEditorJniJNI.NLECurveActionBeam_clone(this.LIZ, this);
        if (NLECurveActionBeam_clone == 0) {
            return null;
        }
        return new NLENode(NLECurveActionBeam_clone, true);
    }

    public NLECurveActionBeam() {
        this(NLEEditorJniJNI.new_NLECurveActionBeam());
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

    public NLECurveActionBeam(long j) {
        super(NLEEditorJniJNI.NLECurveActionBeam_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
