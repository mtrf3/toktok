package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ad.network.CommonApi;
import com.ss.android.ugc.aweme.autofill.AdAutofillConfigSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.NGu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC59084NGu implements Runnable {
    public static final RunnableC59084NGu LJLIL = new RunnableC59084NGu();

    public static void LIZ() {
        String str;
        CommonApi commonApi;
        InterfaceC37276Ek4<String> doGet;
        C64797Pbt<String> execute;
        String str2;
        if (!NAW.LIZJ(true) || NAW.LJII) {
            return;
        }
        String str3 = AdAutofillConfigSettings.LIZ().javascriptCDN;
        String str4 = "";
        if (C78857UxB.LJJJIL(Keva.getRepo("autofill_info").getString("autofill_js", "")) && o.LJ(str3, Keva.getRepo("autofill_info").getString("autofill_js_url", ""))) {
            NAW.LJII = true;
            return;
        }
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        if (LIZLLL != null) {
            C58909NAb.LIZ.getClass();
            if (NH3.LIZ() != null) {
                str = NTF.LJI();
            } else {
                str = null;
            }
            o.LJI(str);
            C65087PgZ LIZ = LIZLLL.LIZ(str);
            if (LIZ != null && (commonApi = (CommonApi) LIZ.LJFF().LIZ.LIZ(CommonApi.class)) != null && (doGet = commonApi.doGet(str3)) != null && (execute = doGet.execute()) != null && (str2 = execute.LIZIZ) != null) {
                str4 = str2;
            }
        }
        Keva.getRepo("autofill_info").storeString("autofill_js", str4);
        Keva.getRepo("autofill_info").storeString("autofill_js_url", str3);
        NAW.LJII = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
