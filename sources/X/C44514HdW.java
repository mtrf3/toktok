package X;

import android.os.Bundle;
import com.ss.android.ugc.gamora.editorpro.dynamic.EditorProStrategyApi;
import com.ss.android.ugc.gamora.editorpro.dynamic.PipLimit;
import kotlin.jvm.internal.o;

/* renamed from: X.HdW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44514HdW {
    public static InterfaceC09240Xw LIZ() {
        Float f;
        InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(1233);
        C05060Hu DEVICE_OVERALL_SCORE = C05060Hu.LIZJ;
        o.LJIIIIZZ(DEVICE_OVERALL_SCORE, "DEVICE_OVERALL_SCORE");
        Bundle bundle = new Bundle();
        LIZIZ.LJIILIIL(new C05060Hu[]{DEVICE_OVERALL_SCORE}, bundle);
        Object LLJJIII = C16880lQ.LLJJIII(bundle, DEVICE_OVERALL_SCORE.LIZ);
        if ((LLJJIII instanceof Float) && (f = (Float) LLJJIII) != null) {
            float floatValue = f.floatValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("deviceOverallScore = ");
            LIZ.append(floatValue);
            H7C.LJI(3, "pip", null, X1D.LIZIZ(LIZ));
        }
        return LIZIZ;
    }

    public static PipLimit LIZIZ() {
        EditorProStrategyApi editorProStrategyApi = (EditorProStrategyApi) LIZ().LJIILJJIL(EditorProStrategyApi.class);
        if (editorProStrategyApi != null && editorProStrategyApi.pipTrackLimit() != null) {
            PipLimit pipTrackLimit = editorProStrategyApi.pipTrackLimit();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pipTrackLimitCount = ");
            LIZ.append(pipTrackLimit.countLimit);
            H7C.LJI(3, "pip", null, X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("widthLimit = ");
            LIZ2.append(pipTrackLimit.widthLimit);
            H7C.LJI(3, "pip", null, X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("heightLimit = ");
            LIZ3.append(pipTrackLimit.heightLimit);
            H7C.LJI(3, "pip", null, X1D.LIZIZ(LIZ3));
            return pipTrackLimit;
        }
        return new PipLimit(0, 0, 0, 7, null);
    }
}
