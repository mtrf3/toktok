package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEVidResourceProtocol extends NLEResourceProtocol {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public final synchronized void LIZ() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLEVidResourceProtocol(j);
            }
            this.LIZJ = 0L;
        }
        super.LIZ();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public final void finalize() {
        LIZ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NLEVidResourceProtocol(java.lang.String r5) {
        /*
            r4 = this;
            long r2 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.new_NLEVidResourceProtocol(r5)
            long r0 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLEVidResourceProtocol_SWIGSmartPtrUpcast(r2)
            r4.<init>(r0)
            r0 = 1
            r4.LIZLLL = r0
            r4.LIZJ = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.nle.editor_jni.NLEVidResourceProtocol.<init>(java.lang.String):void");
    }
}
