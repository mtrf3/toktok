package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEStyText extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEStyText(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    public final long LIZ() {
        return NLEEditorJniJNI.NLEStyText_getBackgroundColor(this.LIZ, this);
    }

    public final NLEResourceNode LIZIZ() {
        long NLEStyText_getFont = NLEEditorJniJNI.NLEStyText_getFont(this.LIZ, this);
        if (NLEStyText_getFont == 0) {
            return null;
        }
        return new NLEResourceNode(NLEStyText_getFont);
    }

    public final long LIZJ() {
        return NLEEditorJniJNI.NLEStyText_getTextColor(this.LIZ, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEStyText_clone = NLEEditorJniJNI.NLEStyText_clone(this.LIZ, this);
        if (NLEStyText_clone == 0) {
            return null;
        }
        return new NLENode(NLEStyText_clone, true);
    }

    public NLEStyText() {
        this(NLEEditorJniJNI.new_NLEStyText__SWIG_0());
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

    public NLEStyText(long j) {
        super(NLEEditorJniJNI.NLEStyText_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }

    public NLEStyText(String str) {
        this(NLEEditorJniJNI.new_NLEStyText__SWIG_1(str));
    }
}
