package X;

import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModelExportListenerWrapper;
import com.bytedance.ies.nle.editor_jni.NLEModelExporterListenerParamBody;
import kotlin.jvm.internal.AqS173S0100000_7;

/* renamed from: X.Gk2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42370Gk2 extends NLEModelExportListenerWrapper {
    public final /* synthetic */ InterfaceC88472Yns<AbstractC42369Gk1, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<Float, C76800UCe> LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLEModelExportListenerWrapper
    public final void onCompileDone(NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody) {
        String NLEModelExporterListenerParamBody_strParam_get;
        super.onCompileDone(nLEModelExporterListenerParamBody);
        if (nLEModelExporterListenerParamBody != null && (NLEModelExporterListenerParamBody_strParam_get = NLEMediaJniJNI.NLEModelExporterListenerParamBody_strParam_get(nLEModelExporterListenerParamBody.LIZ, nLEModelExporterListenerParamBody)) != null && NLEModelExporterListenerParamBody_strParam_get.length() > 0) {
            this.LIZ.invoke(new C42368Gk0(NLEModelExporterListenerParamBody_strParam_get));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LIZ.invoke(new C42366Gjy(0, 15));
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEModelExportListenerWrapper
    public final void onCompileProgress(float f) {
        super.onCompileProgress(f);
        this.LIZIZ.invoke(Float.valueOf(f / 100.0f));
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEModelExportListenerWrapper
    public final void onCompileStart(NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody) {
        super.onCompileStart(nLEModelExporterListenerParamBody);
    }

    public C42370Gk2(AqS173S0100000_7 aqS173S0100000_7, AqS173S0100000_7 aqS173S0100000_72) {
        this.LIZ = aqS173S0100000_7;
        this.LIZIZ = aqS173S0100000_72;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEModelExportListenerWrapper
    public final void onCompileError(int i, int i2, float f, String str) {
        super.onCompileError(i, i2, f, str);
        this.LIZ.invoke(new C42366Gjy(i, i2, f, str));
    }
}
