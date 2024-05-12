package X;

import android.os.SystemClock;
import android.webkit.WebBackForwardList;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.internal.l;
import com.google.gson.m;
import com.ss.android.ugc.aweme.experiment.MusicThirdPartyPerformanceConfigModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.E9w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35972E9w {
    public static long LIZ = -1;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZ(String str, android.net.Uri uri, WebBackForwardList list) {
        o.LJIIIZ(list, "list");
        if (str == null || str.length() == 0) {
            return;
        }
        C188727au c188727au = new C188727au();
        if (LIZ > 0) {
            MusicThirdPartyPerformanceConfigModel musicThirdPartyPerformanceConfigModel = (MusicThirdPartyPerformanceConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("music_third_party_performance_config", MusicThirdPartyPerformanceConfigModel.class, C35973E9x.LIZ);
            if (musicThirdPartyPerformanceConfigModel == null) {
                musicThirdPartyPerformanceConfigModel = new MusicThirdPartyPerformanceConfigModel();
            }
            boolean z = false;
            for (String str2 : musicThirdPartyPerformanceConfigModel.host) {
                String host = uri.getHost();
                if (host != null && s.LJJJLZIJ(host, str2, false)) {
                    z = true;
                }
            }
            if (z) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - LIZ;
                if (elapsedRealtime > 0) {
                    c188727au.LJ(elapsedRealtime, "click_to_page_show");
                }
                LIZ = 0L;
            }
        }
        Object fromJson = GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), str, (Class<Object>) m.class);
        o.LJIIIIZZ(fromJson, "get().getService(GsonPro…, JsonObject::class.java)");
        for (Map.Entry<String, Object> entry : C05600Jw.LIZLLL((m) fromJson).entrySet()) {
            if (o.LJ(entry.getKey(), "url") || o.LJ(entry.getKey(), "eventName")) {
                c188727au.LJI(entry.getKey(), String.valueOf(entry.getValue()));
            } else {
                String key = entry.getKey();
                Object value = entry.getValue();
                o.LJII(value, "null cannot be cast to non-null type com.google.gson.internal.LazilyParsedNumber");
                c188727au.LJ(((l) value).longValue(), key);
            }
        }
        c188727au.LIZLLL(list.getCurrentIndex() + 1, "pageDepth");
        FMX.LJIIL("music_third_party_performance", c188727au.LIZ);
    }
}
