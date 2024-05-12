package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEPoint extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEPoint(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEPoint_clone = NLEEditorJniJNI.NLEPoint_clone(this.LIZ, this);
        if (NLEPoint_clone == 0) {
            return null;
        }
        return new NLENode(NLEPoint_clone, true);
    }

    public NLEPoint() {
        this(NLEEditorJniJNI.new_NLEPoint());
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

    public NLEPoint(long j) {
        super(NLEEditorJniJNI.NLEPoint_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static long LIZ(NLEPoint nLEPoint) {
        if (nLEPoint == null) {
            return 0L;
        }
        return nLEPoint.LIZ;
    }

    public final void LIZIZ(float f) {
        NLEEditorJniJNI.NLEPoint_setX(this.LIZ, this, f);
    }

    public final void LIZJ(float f) {
        NLEEditorJniJNI.NLEPoint_setY(this.LIZ, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
