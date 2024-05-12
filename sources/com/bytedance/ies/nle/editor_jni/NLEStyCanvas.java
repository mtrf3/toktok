package com.bytedance.ies.nle.editor_jni;

import X.EnumC123894td;

/* loaded from: classes3.dex */
public final class NLEStyCanvas extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEStyCanvas(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEStyCanvas_clone = NLEEditorJniJNI.NLEStyCanvas_clone(this.LIZ, this);
        if (NLEStyCanvas_clone == 0) {
            return null;
        }
        return new NLENode(NLEStyCanvas_clone, true);
    }

    public NLEStyCanvas() {
        this(NLEEditorJniJNI.new_NLEStyCanvas());
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

    public NLEStyCanvas(long j) {
        super(NLEEditorJniJNI.NLEStyCanvas_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public final void LIZ(EnumC123894td enumC123894td) {
        NLEEditorJniJNI.NLEStyCanvas_setType(this.LIZ, this, enumC123894td.swigValue());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
