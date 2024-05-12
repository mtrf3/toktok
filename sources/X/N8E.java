package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillAdInfo;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillModel;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillPopupModel;
import com.ss.android.ugc.aweme.cct.AdACTEventLoger;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N8E implements InterfaceC60850NuQ {
    @Override // X.InterfaceC60850NuQ
    public final void LJJIIZI() {
    }

    @Override // X.InterfaceC60850NuQ
    public final Context attachPreBaseContext(Context context) {
        return context;
    }

    @Override // X.InterfaceC60850NuQ
    public final void finish() {
    }

    @Override // X.InterfaceC60850NuQ
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.M2J
    public final void release() {
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJFF(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJII(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60850NuQ
    public final void LJIIJ(SparkActivity activity) {
        int i;
        String str;
        AdAutofillAdInfo adAutofillAdInfo;
        AdAutofillAdInfo adAutofillAdInfo2;
        AdAutofillModel adAutofillModel;
        o.LJIIIZ(activity, "activity");
        if (N8D.LJFF) {
            N8D n8d = NAW.LJIIJ;
            if (n8d != null) {
                C68322mC c68322mC = new C68322mC();
                String str2 = "[]";
                c68322mC.element = "[]";
                String str3 = null;
                try {
                    AdAutofillPopupModel adAutofillPopupModel = n8d.LIZLLL;
                    if (adAutofillPopupModel != null) {
                        adAutofillModel = adAutofillPopupModel.autofillInfo;
                    } else {
                        adAutofillModel = null;
                    }
                    JSONObject LJ = NAW.LJ(new JSONObject(C75792yF.LIZJ(adAutofillModel)));
                    T t = str2;
                    if (LJ != null) {
                        JSONArray names = LJ.names();
                        t = str2;
                        if (names != null) {
                            String jSONArray = names.toString();
                            t = jSONArray == null ? str2 : jSONArray;
                        }
                    }
                    c68322mC.element = t;
                } catch (Exception e) {
                    C78983UzD.LJIIZILJ(e);
                }
                if (NAW.LJIIIIZZ() == null) {
                    AdAutofillPopupModel adAutofillPopupModel2 = n8d.LIZLLL;
                    if (adAutofillPopupModel2 != null) {
                        adAutofillPopupModel2.autofillInfo = null;
                    }
                    n8d.LJ();
                    ASQ.LIZLLL(n8d.LIZJ, ASX.LIZ);
                    i = R.string.efy;
                } else {
                    try {
                        AdAutofillPopupModel adAutofillPopupModel3 = n8d.LIZLLL;
                        if (adAutofillPopupModel3 != null) {
                            adAutofillPopupModel3.autofillInfo = (AdAutofillModel) C75792yF.LIZ(NAW.LJI(), AdAutofillModel.class);
                        }
                    } catch (Exception e2) {
                        C78983UzD.LJIIZILJ(e2);
                    }
                    n8d.LJ();
                    i = R.string.q8k;
                }
                C26045AKb c26045AKb = new C26045AKb(n8d.LIZJ);
                c26045AKb.LJIIIIZZ(i);
                c26045AKb.LIZ(true);
                c26045AKb.LJIIJ();
                IAdWebEventLogger LJJIJ = AdACTEventLoger.LJJIJ();
                C58685N1l.LIZ.getClass();
                C58653N0f c58653N0f = C58685N1l.LJJIJIL;
                AdAutofillPopupModel adAutofillPopupModel4 = n8d.LIZLLL;
                if (adAutofillPopupModel4 == null || (adAutofillAdInfo2 = adAutofillPopupModel4.adInfo) == null || (str = adAutofillAdInfo2.cid) == null) {
                    str = "";
                }
                if (adAutofillPopupModel4 != null && (adAutofillAdInfo = adAutofillPopupModel4.adInfo) != null) {
                    str3 = adAutofillAdInfo.logExtra;
                }
                LJJIJ.LIZJ(c58653N0f, str, str3, null, new AqS141S0200000_10(n8d, (N8D) c68322mC, (C68322mC<String>) 47));
            }
            N8D.LJFF = false;
        }
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIL(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIILL(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJI(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIFFI(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIJ(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final boolean LJJIJ(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
        return false;
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJL(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJLIJ(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIZ(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIJ(savedInstanceState, "savedInstanceState");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIIIZZ(SparkActivity sparkActivity, Configuration configuration) {
        C40088FoK.LIZJ(sparkActivity, configuration);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIIZ(SparkActivity activity, boolean z) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIILLIIL(SparkActivity activity, Bundle bundle) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIJZLJL(SparkActivity activity, Bundle bundle) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIZ(SparkActivity sparkActivity, Bundle bundle) {
        C40088FoK.LIZIZ(sparkActivity, bundle);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJIIJIL(SparkActivity sparkActivity, Bundle bundle) {
        C40088FoK.LIZ(sparkActivity, bundle);
    }

    @Override // X.InterfaceC60850NuQ
    public final void attachBaseContext(Context context, Activity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJIL(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
        C40088FoK.LIZLLL(sparkActivity, strArr, iArr);
    }
}
