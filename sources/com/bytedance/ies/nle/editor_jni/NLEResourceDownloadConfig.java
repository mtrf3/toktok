package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEResourceDownloadConfig extends INLEResourceDownloadConfig {
    public transient long LIZJ;

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadConfig
    public final synchronized void LIZ() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEMediaPublicJniJNI.delete_NLEResourceDownloadConfig(j);
            }
            this.LIZJ = 0L;
        }
        super.LIZ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NLEResourceDownloadConfig() {
        /*
            r4 = this;
            long r2 = com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI.new_NLEResourceDownloadConfig()
            long r0 = com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI.NLEResourceDownloadConfig_SWIGUpcast(r2)
            r4.<init>(r0)
            r4.LIZJ = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.nle.editor_jni.NLEResourceDownloadConfig.<init>():void");
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadConfig
    public final void finalize() {
        LIZ();
    }
}
