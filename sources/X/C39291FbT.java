package X;

import android.os.SystemClock;
import com.appsflyer.AppsFlyerConversionListener;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: X.FbT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39291FbT implements AppsFlyerConversionListener {
    public final /* synthetic */ InterfaceC39301Fbd LIZ;

    public C39291FbT(InterfaceC39301Fbd interfaceC39301Fbd) {
        this.LIZ = interfaceC39301Fbd;
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAppOpenAttribution(java.util.Map<String, String> map) {
        String str;
        if (this.LIZ == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        if (map != null) {
            str = map.toString();
        } else {
            str = "";
        }
        c188727au.LJIIIZ("attribution_data", str);
        FMX.LJIIL("app_open_attribution", c188727au.LIZ);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAttributionFailure(String str) {
        if (this.LIZ == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("attribution_fail_message", str);
        FMX.LJIIL("af_attribution_fail", c188727au.LIZ);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataFail(String str) {
        if (this.LIZ == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("conversion_fail_message", str);
        FMX.LJIIL("af_conversion_fail", c188727au.LIZ);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataSuccess(java.util.Map<String, Object> map) {
        String obj;
        String str;
        String str2;
        InterfaceC39301Fbd interfaceC39301Fbd = this.LIZ;
        if (interfaceC39301Fbd == null) {
            return;
        }
        C39295FbX c39295FbX = (C39295FbX) interfaceC39301Fbd;
        try {
            C35605DyD.LIZ = map;
            map.get("is_first_launch").toString();
            if (!Keva.getRepo("appsflyer_repo").getBoolean("is_appsflyer_first_launch", true)) {
                return;
            }
            try {
                Object obj2 = map.get("af_status");
                Objects.requireNonNull(obj2);
                if ("Non-organic".equalsIgnoreCase(obj2.toString())) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    long j = uptimeMillis - FKB.LJ;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - FKB.LIZ;
                    long j2 = uptimeMillis - c39295FbX.LIZJ.LJLJJLL;
                    long j3 = uptimeMillis - FLO.LJII;
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("conversion_data", map.toString());
                    c188727au.LJ(j, "cost_time_from_boot_v1");
                    c188727au.LJ(elapsedRealtime, "cost_time_from_boot_v2");
                    c188727au.LJ(j2, "cost_time_from_init");
                    c188727au.LJ(j3, "cost_time_from_start");
                    FMX.LJIIL("af_conversion_success", c188727au.LIZ);
                }
            } catch (NullPointerException unused) {
            }
            Keva.getRepo("appsflyer_repo").storeBoolean("is_appsflyer_first_launch", false);
            UgCommonServiceImpl.LJIJ().LJII();
            C39284FbM.LJ(map);
            String str3 = "";
            if (map.get("af_dp") == null) {
                obj = "";
            } else {
                obj = map.get("af_dp").toString();
            }
            if (map.get("media_source") == null) {
                str = "";
            } else {
                str = map.get("media_source").toString();
            }
            if (map.get("campaign") == null) {
                str2 = "";
            } else {
                str2 = map.get("campaign").toString();
            }
            if (map.get("match_type") != null) {
                str3 = map.get("match_type").toString();
            }
            if (c39295FbX.LIZJ.LJLJJL != null) {
                C39297FbZ.LIZ(c39295FbX.LIZ, EF7.LJIILIIL, c39295FbX.LIZJ.LJLJJI, str, str2, str3);
            }
            C38281F0r c38281F0r = new C38281F0r(obj);
            c38281F0r.LIZLLL("media_source", str);
            String LJ = c38281F0r.LJ();
            C26408AYa.LJFF(LJ, str, true);
            C26408AYa.LJI("inc_activity_start", LJ, new HashMap());
            InitAppsFlyer.LIZLLL(c39295FbX.LIZIZ, LJ);
        } catch (Exception unused2) {
        }
    }
}
