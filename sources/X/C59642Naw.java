package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Naw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59642Naw implements K1E {
    public static final C59642Naw LIZ = new C59642Naw();
    public static final C66906QNq LIZIZ = C78841Uwv.LIZ(SystemClock.uptimeMillis());
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(OFS.LJLIL);

    @Override // X.K1E
    public final void LIZ(String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        C2YJ c2yj = C2YJ.LIZIZ;
        IESSettingsProxy iESSettingsProxy = c2yj.LIZ;
        o.LJIIIIZZ(iESSettingsProxy, "get()");
        int hybridMonitorSampleRate = iESSettingsProxy.getAdLandingPageConfig().getHybridMonitorSampleRate();
        if (hybridMonitorSampleRate <= 0 || LIZIZ.nextInt(hybridMonitorSampleRate) != 0 || str == null || str.length() == 0 || (optJSONObject = jSONObject.optJSONObject("extra")) == null) {
            return;
        }
        JSONObject optJSONObject4 = optJSONObject.optJSONObject("nativeInfo");
        JSONObject optJSONObject5 = optJSONObject.optJSONObject("jsInfo");
        if (((optJSONObject5 == null || (optString = optJSONObject5.optString("ev_type")) == null) && (optJSONObject4 == null || (optString = optJSONObject4.optString("event_type")) == null)) || o.LJ(optString, "custom")) {
            return;
        }
        if (o.LJ(optString, "resource_performance")) {
            IESSettingsProxy iESSettingsProxy2 = c2yj.LIZ;
            o.LJIIIIZZ(iESSettingsProxy2, "get()");
            if (!iESSettingsProxy2.getAdLandingPageConfig().isHybridMonitorResPerfEnable()) {
                return;
            }
        }
        String str2 = (String) ((C0MA) LIZJ.getValue()).getOrDefault(optString, null);
        if (str2 == null || str2.length() == 0 || (optJSONObject2 = optJSONObject.optJSONObject("nativeBase")) == null || (optJSONObject3 = optJSONObject2.optJSONObject("context")) == null) {
            return;
        }
        String optString2 = optJSONObject3.optString("creative_id");
        String optString3 = optJSONObject3.optString("log_extra");
        if (optString2 == null || optString2.length() == 0) {
            return;
        }
        String channelName = optJSONObject3.optString("channel_name");
        int optInt = optJSONObject3.optInt("preload_status", 0);
        long optLong = optJSONObject3.optLong("preload_webview_time", -1L);
        o.LJIIIIZZ(channelName, "channelName");
        C58655N0h LJ = C58704N2e.LJ("ad_wap_stat", str2, optString2, optString3, null);
        LJ.LIZIZ(String.valueOf(optJSONObject), "hybrid_data");
        LJ.LIZIZ(channelName, "channel_name");
        LJ.LIZIZ(Integer.valueOf(optInt), "preload_status");
        LJ.LIZIZ(Long.valueOf(optLong), "preload_webview_time");
        LJ.LJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.InterfaceC59585Na1 r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r5 = 1
            r4 = 0
            if (r8 == 0) goto La
            int r0 = r8.length()
            if (r0 != 0) goto Lb
        La:
            return
        Lb:
            java.lang.String r0 = "creative_id"
            r7.LJIIL(r0, r8)
            java.lang.String r0 = "log_extra"
            r7.LJIIL(r0, r9)
            java.lang.String r0 = "channel_name"
            r7.LJIIL(r0, r10)
            com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService r0 = com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.LJJI()
            if (r0 == 0) goto L7d
            X.NH3 r0 = X.C58909NAb.LIZ
            r0.getClass()
            X.NUm r0 = X.NH3.LIZ()
            if (r0 == 0) goto L7d
            java.lang.String r0 = "feed"
            java.lang.String r3 = X.NTF.LJII(r10, r0)
            if (r3 == 0) goto L39
            int r0 = r3.length()
            if (r0 != 0) goto L7b
        L39:
            r1 = -1
            if (r5 != 0) goto L43
            boolean r0 = X.C1B6.LIZIZ(r3)
            if (r0 != 0) goto L56
        L43:
            java.lang.String r3 = "preload_status"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r7.LJIIL(r3, r0)
            java.lang.String r3 = "preload_webview_time"
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r7.LJIIL(r3, r0)
            return
        L56:
            r5 = 0
            if (r11 == 0) goto L79
            com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService r4 = com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.LJJI()
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r8)
            if (r0 == 0) goto L76
            long r2 = r0.longValue()
        L68:
            long r0 = java.lang.System.currentTimeMillis()
            long r1 = r4.LJIILIIL(r2, r0)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L79
            r4 = 3
            goto L43
        L76:
            r2 = 0
            goto L68
        L79:
            r4 = 2
            goto L43
        L7b:
            r5 = 0
            goto L39
        L7d:
            r3 = 0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59642Naw.LIZIZ(X.Na1, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
