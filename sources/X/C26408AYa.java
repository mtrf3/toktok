package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.AYa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26408AYa {
    public static String LIZIZ;
    public static long LIZJ;
    public static int LIZLLL;
    public static String LJ;
    public static InterfaceC26409AYb LJFF;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("tiktok_now_share", "now_feature_share");
    public static final List<String> LJIIIZ = new ArrayList();
    public static final List<Long> LJIIJ = new ArrayList();

    public static java.util.Map LIZJ() {
        String str = LIZIZ;
        if (str == null || str.length() == 0 || !LIZIZ(null)) {
            return new LinkedHashMap();
        }
        ((ArrayList) LJIIIZ).add("touch_point_show");
        long elapsedRealtime = SystemClock.elapsedRealtime() - LIZJ;
        ((ArrayList) LJIIJ).add(Long.valueOf(elapsedRealtime));
        return C113554cx.LJJLIIIIJ(new OSZ("inc_id", LIZIZ), new OSZ("inc_duration", String.valueOf(elapsedRealtime)), new OSZ("inc_region", LJ), new OSZ("inc_is_first_launch", String.valueOf(LIZLLL)), new OSZ("inc_url", null), new OSZ("inc_pid", LJII), new OSZ("inc_path", LJIIIIZZ));
    }

    public static void LJ() {
        InterfaceC26409AYb interfaceC26409AYb = LJFF;
        if (interfaceC26409AYb != null) {
            interfaceC26409AYb.LIZIZ("onelink_flow", C113554cx.LJJLIIIIJ(new OSZ("inc_id", LIZIZ), new OSZ("event_flow", LJIIIZ.toString()), new OSZ("events_time_interval", LJIIJ.toString()), new OSZ("inc_is_first_launch", String.valueOf(LIZLLL))));
        }
        ((ArrayList) LJIIIZ).clear();
        ((ArrayList) LJIIJ).clear();
    }

    public static boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (s.LJJJLZIJ(str, "referral", false) || LIZ.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(String str) {
        if (str == null) {
            return true;
        }
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "media_source");
        if (str.length() > 0 && LIZ(queryParameter)) {
            return true;
        }
        return false;
    }

    public static String LIZLLL(String str) {
        String queryParameter;
        android.net.Uri uri = UriProtector.parse(str);
        o.LJIIIIZZ(uri, "uri");
        String host = uri.getHost();
        if (host != null && s.LJJJLZIJ(host, "webview", false) && (queryParameter = UriProtector.getQueryParameter(uri, "url")) != null) {
            android.net.Uri parse = UriProtector.parse(URLDecoder.decode(queryParameter, "utf-8"));
            o.LJIIIIZZ(parse, "Uri.parse(URLDecoder.decode(it, \"utf-8\"))");
            String path = parse.getPath();
            if (path != null) {
                return path;
            }
        }
        return "";
    }

    public static void LJFF(String deeplink, String mediaSource, boolean z) {
        int i;
        o.LJIIIZ(deeplink, "deeplink");
        o.LJIIIZ(mediaSource, "mediaSource");
        if (LIZ(mediaSource)) {
            if (LJI != null) {
                LJ();
            }
            LIZIZ = UUID.randomUUID().toString();
            LIZJ = SystemClock.elapsedRealtime();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            LIZLLL = i;
            LJI = deeplink;
            LJII = mediaSource;
            LJIIIIZZ = LIZLLL(deeplink);
        }
    }

    public static void LJI(String event, String str, java.util.Map params) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(params, "params");
        String str2 = LIZIZ;
        if (str2 == null || str2.length() == 0 || !LIZIZ(str)) {
            return;
        }
        ((ArrayList) LJIIIZ).add(event);
        ((ArrayList) LJIIJ).add(Long.valueOf(SystemClock.elapsedRealtime() - LIZJ));
        params.putAll(C113554cx.LJJLIIIIJ(new OSZ("inc_id", LIZIZ), new OSZ("inc_duration", String.valueOf(SystemClock.elapsedRealtime() - LIZJ)), new OSZ("inc_region", LJ), new OSZ("inc_is_first_launch", String.valueOf(LIZLLL)), new OSZ("inc_url", str), new OSZ("inc_pid", LJII), new OSZ("inc_path", LJIIIIZZ)));
        InterfaceC26409AYb interfaceC26409AYb = LJFF;
        if (interfaceC26409AYb == null) {
            return;
        }
        interfaceC26409AYb.LIZIZ(event, params);
    }

    public static /* synthetic */ void LJII(String str, java.util.Map map, int i) {
        if ((i & 2) != 0) {
            map = new LinkedHashMap();
        }
        LJI(str, null, map);
    }

    public static void LJIIIIZZ(String str, String str2, java.util.Map map) {
        if (!LIZIZ(str2)) {
            return;
        }
        map.putAll(C113554cx.LJJLIIIIJ(new OSZ("inc_region", LJ), new OSZ("inc_url", str2), new OSZ("inc_pid", UriProtector.getQueryParameter(UriProtector.parse(str2), "media_source")), new OSZ("inc_path", LIZLLL(str2))));
        InterfaceC26409AYb interfaceC26409AYb = LJFF;
        if (interfaceC26409AYb != null) {
            interfaceC26409AYb.LIZIZ(str, map);
        }
    }
}
