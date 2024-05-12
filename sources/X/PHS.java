package X;

import Y.ARunnableS12S1100000_11;
import Y.ARunnableS47S0100000_11;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PHS extends AbstractBinderC64186PHa {
    @Override // X.PHW
    public final void LJJIZ(String str) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initCustomMetricBizTrafficStats ");
            LIZ.append(str);
            C64028PAy.LIZLLL("APM-Traffic-Detail", X1D.LIZIZ(LIZ));
        }
        EGD.LIZ.LJJIZ(str);
    }

    @Override // X.PHW
    public final void LJJJJJ(String str) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopMetric ");
            LIZ.append(str);
            C64028PAy.LIZLLL("APM-Traffic-Detail", X1D.LIZIZ(LIZ));
        }
        EGB.LIZ.LJJJJJ(str);
    }

    @Override // X.PHW
    public final void LJJLL(String str) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("httpImageApiTrafficStats ");
            LIZ.append(str);
            C64028PAy.LIZLLL("APM-Traffic-Detail", X1D.LIZIZ(LIZ));
        }
        try {
            F9U.LIZ.LIZJ(new ARunnableS47S0100000_11(new JSONObject(str), 15));
        } catch (JSONException unused) {
        }
    }

    @Override // X.PHW
    public final void LJJJLIIL(String str, boolean z) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startMetric ");
            LIZ.append(str);
            LIZ.append(", ");
            LIZ.append(z);
            C64028PAy.LIZLLL("APM-Traffic-Detail", X1D.LIZIZ(LIZ));
        }
        EGB.LIZ.LJJJLIIL(str, z);
    }

    @Override // X.PHW
    public final void LLJILJILJ(String str, String str2) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("httpApiTrafficStats ");
            LIZ.append(str);
            LIZ.append(", ");
            LIZ.append(str2);
            C64028PAy.LIZLLL("APM-Traffic-Detail", X1D.LIZIZ(LIZ));
        }
        try {
            F9U.LIZ.LIZJ(new ARunnableS12S1100000_11(new JSONObject(str2), str, 0));
        } catch (JSONException unused) {
        }
    }

    @Override // X.PHW
    public final void LLJJLIIIJLLLLLLLZ(long j, String str, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("trafficStats ");
            LIZ.append(j);
            LIZ.append(", ");
            LIZ.append(str);
            YE1.LIZLLL(LIZ, ", ", str2, ", ", str3);
            YE1.LIZLLL(LIZ, ", ", str4, ", ", str5);
            C64028PAy.LIZLLL("APM-Traffic-Detail", X1D.LIZIZ(LIZ));
        }
        try {
            jSONObject = new JSONObject(str4);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        try {
            jSONObject2 = new JSONObject(str5);
        } catch (JSONException unused2) {
            jSONObject2 = null;
            EGD.LIZ.LJIIIIZZ(j, str, str2, str3, jSONObject, jSONObject2);
        }
        EGD.LIZ.LJIIIIZZ(j, str, str2, str3, jSONObject, jSONObject2);
    }
}
