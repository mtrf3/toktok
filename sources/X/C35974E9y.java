package X;

import android.webkit.ValueCallback;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.internal.l;
import com.google.gson.m;
import com.google.gson.s;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.E9y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35974E9y<T> implements ValueCallback {
    public final /* synthetic */ WebKitView LIZ;

    public C35974E9y(WebKitView webKitView) {
        this.LIZ = webKitView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        boolean z;
        String str = (String) obj;
        o.LJIIIIZZ(str, "str");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C15280iq.LIZIZ("SearchLandingPage", "return empty");
            return;
        }
        C60792NtU c60792NtU = C60792NtU.LIZ;
        WebKitView webKitView = this.LIZ;
        c60792NtU.getClass();
        int LIZ = C60792NtU.LIZ(webKitView);
        C188727au c188727au = new C188727au();
        try {
            m techMobData = (m) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), str, m.class);
            o.LJIIIIZZ(techMobData, "techMobData");
            for (Map.Entry<String, Object> entry : C05600Jw.LIZLLL(techMobData).entrySet()) {
                if (o.LJ(entry.getKey(), "url") || o.LJ(entry.getKey(), "eventName")) {
                    c188727au.LJI(entry.getKey(), String.valueOf(entry.getValue()));
                } else {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    o.LJII(value, "null cannot be cast to non-null type com.google.gson.internal.LazilyParsedNumber");
                    c188727au.LJ(((l) value).longValue(), key);
                }
            }
            if (LIZ == 1 && !C35975E9z.LIZLLL) {
                c188727au.LJ(System.currentTimeMillis() - C35975E9z.LIZ, "p2p");
                C35975E9z.LIZLLL = true;
            }
            c188727au.LIZLLL(C35975E9z.LJ ? 1 : 0, "is_refresh");
            c188727au.LIZLLL(LIZ, "pageDepth");
            FMX.LJIIL("search_third_party_perf", c188727au.LIZ);
            C35975E9z.LJ = false;
        } catch (s e) {
            C15280iq.LIZJ("SearchLandingPage", String.valueOf(e));
        }
    }
}
