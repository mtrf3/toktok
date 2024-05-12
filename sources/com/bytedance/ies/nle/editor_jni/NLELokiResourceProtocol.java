package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLELokiResourceProtocol extends NLEResourceProtocol {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public final synchronized void LIZ() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLELokiResourceProtocol(j);
            }
            this.LIZJ = 0L;
        }
        super.LIZ();
    }

    public final String LIZJ() {
        return NLEEditorJniJNI.NLELokiResourceProtocol_effectId_get(this.LIZJ, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public final void finalize() {
        LIZ();
    }

    public NLELokiResourceProtocol(long j) {
        super(NLEEditorJniJNI.NLELokiResourceProtocol_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    public static NLELokiResourceProtocol LIZIZ(String str) {
        long NLELokiResourceProtocol_NLELokiResourceProtocolWithURS = NLEEditorJniJNI.NLELokiResourceProtocol_NLELokiResourceProtocolWithURS(str);
        if (NLELokiResourceProtocol_NLELokiResourceProtocolWithURS == 0) {
            return null;
        }
        return new NLELokiResourceProtocol(NLELokiResourceProtocol_NLELokiResourceProtocolWithURS);
    }

    public NLELokiResourceProtocol(String str) {
        this(NLEEditorJniJNI.new_NLELokiResourceProtocol__SWIG_0(str));
    }
}
