package X;

import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMetricsRuntimeController;
import kotlin.jvm.internal.o;

/* renamed from: X.5NF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5NF extends C5N3 {
    public final String LJFF() {
        String NLEMetricsRuntimeController_getAudioGlitchCount;
        NLEMetricsRuntimeController LIZIZ = this.LIZLLL.LIZIZ();
        if (LIZIZ != null && (NLEMetricsRuntimeController_getAudioGlitchCount = NLEMediaPublicJniJNI.NLEMetricsRuntimeController_getAudioGlitchCount(LIZIZ.LIZ, LIZIZ)) != null) {
            return NLEMetricsRuntimeController_getAudioGlitchCount;
        }
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5NF(C5N2 session) {
        super(session);
        o.LJIIIZ(session, "session");
    }

    public final int LJ(boolean z) {
        NLEMetricsRuntimeController LIZIZ = this.LIZLLL.LIZIZ();
        if (LIZIZ != null) {
            return NLEMediaPublicJniJNI.NLEMetricsRuntimeController_enableAudioGlitchMetrics(LIZIZ.LIZ, LIZIZ, z);
        }
        return -1;
    }
}
