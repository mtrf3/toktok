package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEStyRecognizedWord extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEStyRecognizedWord(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEStyRecognizedWord_clone = NLEEditorJniJNI.NLEStyRecognizedWord_clone(this.LIZ, this);
        if (NLEStyRecognizedWord_clone == 0) {
            return null;
        }
        return new NLENode(NLEStyRecognizedWord_clone, true);
    }

    public NLEStyRecognizedWord() {
        this(NLEEditorJniJNI.new_NLEStyRecognizedWord());
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

    public NLEStyRecognizedWord(long j) {
        super(NLEEditorJniJNI.NLEStyRecognizedWord_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
