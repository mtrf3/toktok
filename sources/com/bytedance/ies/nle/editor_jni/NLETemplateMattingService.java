package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public final class NLETemplateMattingService extends INLETemplateMattingService {
    @Override // com.bytedance.ies.nle.editor_jni.INLETemplateMattingService
    public final synchronized void LIZIZ() {
        super.LIZIZ();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLETemplateMattingService
    public final boolean LIZ() {
        return NLETemplateJNI.NLETemplateMattingService_cancel(0L, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLETemplateMattingService
    public final boolean LIZJ() {
        return NLETemplateJNI.NLETemplateMattingService_start(0L, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLETemplateMattingService
    public final void finalize() {
        LIZIZ();
    }
}
