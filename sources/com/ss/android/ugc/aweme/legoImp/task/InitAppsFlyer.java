package com.ss.android.ugc.aweme.legoImp.task;

import X.C09900aA;
import X.C0RN;
import X.C16880lQ;
import X.C188727au;
import X.C1GE;
import X.C2U8;
import X.C38986FRu;
import X.C38995FSd;
import X.C39276FbE;
import X.C39280FbI;
import X.C39281FbJ;
import X.C39297FbZ;
import X.C39316Fbs;
import X.C56662Kg;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FLO;
import X.FMX;
import X.FRI;
import X.InterfaceC39301Fbd;
import X.LV0;
import X.M66;
import Y.ARunnableS13S0000000_6;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS26S0010000_11;
import kotlin.jvm.internal.AqS66S1200000_11;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes7.dex */
public class InitAppsFlyer implements EE1 {
    public static final String LJLJL = "XY8Lpakui8g4kBcposRgxA";
    public final String[] LJLIL = {"huawei_store", "samsung_store", "silution_int", "amazon_int", "apkpure", "aptoide_int", "oppo_int", "oppostore_int", "trassion_int"};
    public final String[] LJLILLLLZI = {"tt_eu_ss22", "tt_mena_ss22", "tt_sea_ss22", "tt_lata_ss22", "tt_ssa_ss22", "tt_ss_ww23"};
    public final String[] LJLJI = {"tiktok-preinstall_", "tiktokpreinstall_", "tiktok-preinstall", "tiktokpreinstall"};
    public C39316Fbs LJLJJI;
    public C39297FbZ LJLJJL;
    public long LJLJJLL;

    @Override // X.EEY
    public final String key() {
        return "InitAppsFlyer";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EE1
    public final EFK type() {
        if (((Boolean) FRI.LJ.getValue()).booleanValue() && !Keva.getRepo("appsflyer_repo").getBoolean("is_appsflyer_first_launch", true)) {
            return EFK.BACKGROUND;
        }
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        if (r1 == false) goto L15;
     */
    @Override // X.EEY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r18) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer.run(android.content.Context):void");
    }

    public static void LIZLLL(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = UriProtector.parse(str).getScheme().toLowerCase();
            if (TextUtils.isEmpty(lowerCase) || LV0.LJII.LIZ(str)) {
                return;
            }
            if ("sslocal".equals(lowerCase) || "localsdk".equals(lowerCase)) {
                str = M66.LIZIZ.LJIILJJIL(str);
            }
            Uri parse = UriProtector.parse(str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("channel", "appsflyer");
                jSONObject.put("target", str);
                jSONObject.put("total_time", SystemClock.uptimeMillis() - C56662Kg.LIZ().LJIIJ);
                jSONObject.put("fetch_time", SystemClock.uptimeMillis() - j);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C09900aA.LJ("deep_link", jSONObject);
            C39280FbI c39280FbI = C39276FbE.LIZ;
            c39280FbI.LIZIZ = parse;
            c39280FbI.LIZJ = lowerCase;
            c39280FbI.LIZLLL = true;
            if (!C38986FRu.LIZ().LIZ) {
                C39281FbJ c39281FbJ = new C39281FbJ();
                c39281FbJ.LJLIL = c39280FbI.LIZ();
                C2U8.LIZ(c39281FbJ);
                return;
            }
            Uri uri = c39280FbI.LIZIZ;
            if (uri != null) {
                boolean equals = "normal".equals(UriProtector.getQueryParameter(uri, "awedp_require_login"));
                c39280FbI.LIZ = equals;
                if (equals) {
                    EventBus.LIZJ().LJIILJJIL(c39280FbI);
                    return;
                }
            }
            c39280FbI.LIZIZ();
        }
    }

    public static void LJII(String str, Map map) {
        if (!map.isEmpty()) {
            C188727au c188727au = new C188727au();
            for (String str2 : map.keySet()) {
                c188727au.LJI(str2, (String) map.get(str2));
            }
            if (!map.containsKey("apk_last_update_time")) {
                c188727au.LJ(FLO.LIZJ(), "apk_last_update_time");
            }
            FMX.LJIIL(str, c188727au.LIZ);
        }
    }

    public final void LJ(Context context, InterfaceC39301Fbd interfaceC39301Fbd) {
        this.LJLJJLL = SystemClock.uptimeMillis();
        String devKey = LJLJL;
        TokenCert cert = TokenCert.with("bpea-appsflyer_androidsdk_1960");
        o.LJIIIZ(devKey, "devKey");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cert, "cert");
        C1GE.LJIJJ(cert, "AppsFlyer", "init", new AqS66S1200000_11(devKey, context, interfaceC39301Fbd, 2));
        if (FMX.LIZJ("af_start_init")) {
            if (((Boolean) FRI.LIZJ.getValue()).booleanValue()) {
                C38995FSd.LIZJ().execute(new ARunnableS13S0000000_6(17));
            } else {
                FMX.onEventV3("af_start_init");
            }
        }
        try {
            TokenCert cert2 = TokenCert.with("bpea-appsflyer_androidsdk_1973");
            o.LJIIIZ(cert2, "cert");
            C1GE.LJIJJ(cert2, "AppsFlyer", "setCollectIMEI", new AqS26S0010000_11(1));
            TokenCert cert3 = TokenCert.with("bpea-appsflyer_androidsdk_1975");
            o.LJIIIZ(cert3, "cert");
            C1GE.LJIJJ(cert3, "AppsFlyer", "setCollectOaid", new AqS26S0010000_11(3));
            if (a.LJFF().LJIIIIZZ()) {
                AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
            }
            FLO.LIZIZ = true;
            FLO.LJFF(TokenCert.Companion.with("bpea-appsflyer_androidsdk_1963"));
            FLO.LJ();
        } catch (Exception unused) {
        }
    }
}
