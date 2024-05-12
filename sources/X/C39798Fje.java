package X;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Fje, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39798Fje extends M56 {
    public final int LIZ = 3;
    public final long LIZIZ = -1;
    public boolean LIZJ;

    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "live";
    }

    public final boolean LJII() {
        C86393XvR c86393XvR;
        C86393XvR LJJIJIL;
        java.util.Map<String, Object> G1;
        int i;
        ILiveOuterService LJJJLL;
        C86393XvR LJJIJIL2;
        LiveOuterService.LJJJLL().LJJIJLIJ();
        if (!C78475Ur1.LIZ()) {
            return false;
        }
        ILiveOuterService LJJJLL2 = LiveOuterService.LJJJLL();
        String str = null;
        if (LJJJLL2 != null) {
            c86393XvR = LJJJLL2.LJJIJIL();
        } else {
            c86393XvR = null;
        }
        if (c86393XvR == null) {
            if (this.LIZJ) {
                return false;
            }
            this.LIZJ = true;
            return true;
        }
        ILiveOuterService LJJJLL3 = LiveOuterService.LJJJLL();
        if (LJJJLL3 == null || (LJJIJIL = LJJJLL3.LJJIJIL()) == null || (G1 = LJJIJIL.G1(this.LIZIZ)) == null) {
            return false;
        }
        if (G1.get("feed_url") instanceof String) {
            Object obj = G1.get("feed_url");
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            str = (String) obj;
        }
        if (G1.get("feed_style") instanceof Integer) {
            Object obj2 = G1.get("feed_style");
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.Int");
            i = ((Integer) obj2).intValue();
        } else {
            i = 0;
        }
        if (C38354F3m.LJ(str) || i != this.LIZ || (LJJJLL = LiveOuterService.LJJJLL()) == null || (LJJIJIL2 = LJJJLL.LJJIJIL()) == null || LJJIJIL2.LJJJJL() == null) {
            return false;
        }
        return true;
    }

    public static void LJIIIIZZ(HashMap hashMap) {
        C86393XvR LJJIJIL;
        C86393XvR LJJIJIL2;
        InterfaceC28682BNm LJJJJL;
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && LJJIJIL.LJJJJL() != null) {
            HashMap LIZJ = C03660Ck.LIZJ("intercept", "new_style");
            Object obj = hashMap.get("gd_label");
            if (obj != null) {
                LIZJ.put("gd_label", obj);
            }
            Object obj2 = hashMap.get("enter_from_merge");
            if (obj2 != null) {
                LIZJ.put("enter_from_merge", obj2);
            }
            Object obj3 = hashMap.get("enter_method");
            if (obj3 != null) {
                LIZJ.put("enter_method", obj3);
            }
            ILiveOuterService LJJJLL2 = LiveOuterService.LJJJLL();
            if (LJJJLL2 != null && (LJJIJIL2 = LJJJLL2.LJJIJIL()) != null && (LJJJJL = LJJIJIL2.LJJJJL()) != null) {
                ((C28679BNj) LJJJJL).LIZ(LIZJ);
            }
        }
    }

    public static void LJIIIZ(HashMap hashMap) {
        Object obj = hashMap.get("gd_label");
        Object obj2 = hashMap.get("enter_from_merge");
        HashMap LIZJ = C03660Ck.LIZJ("_param_live_platform", "live");
        if (obj != null) {
            LIZJ.put("gd_label", obj);
            LIZJ.put("enter_from_merge", "inner_ad");
        } else {
            if (obj2 == null) {
                obj2 = "";
            }
            LIZJ.put("enter_from_merge", obj2);
        }
        FMX.LJIIL("livesdk_enter_live_merge", LIZJ);
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        if (SC5.LIZIZ(str, "host", str2, "path", str, "sign") || o.LJ(str, "webcast_room") || o.LJ(str, "webcast_profile") || o.LJ(str, "webcast_feed") || o.LJ(str, "webcast_feed_activity") || o.LJ(str, "webcast_webview") || o.LJ(str, "webcast_lynxview")) {
            return true;
        }
        return false;
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        String uri2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        if (o.LJ(uri.getHost(), "webcast_feed") || o.LJ(uri.getHost(), "webcast_feed_activity")) {
            HashMap hashMap = new HashMap();
            java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            if (queryParameterNames != null) {
                for (String str : queryParameterNames) {
                    String queryParameter = UriProtector.getQueryParameter(uri, str);
                    if (queryParameter != null) {
                        hashMap.put(str, queryParameter);
                    }
                }
            }
            try {
                if (LJII()) {
                    LJIIIZ(hashMap);
                    LJIIIIZZ(hashMap);
                    return;
                }
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        C86393XvR c86393XvR = null;
        if (o.LJ(uri.getHost(), "webcast_webview") || o.LJ(uri.getHost(), "webcast_lynxview")) {
            Boolean bool = (Boolean) LiveOuterService.LJJJLL().LJJIJIL().LJIIIZ(Boolean.FALSE, "deeplink_webcast_webview_enable");
            String[] deeplinkWebcastWebviewList = (String[]) LiveOuterService.LJJJLL().LJJIJIL().LJIIIZ(new String[0], "deeplink_webcast_webview_allowed_list");
            if (!bool.booleanValue()) {
                return;
            }
            String queryParameter2 = UriProtector.getQueryParameter(uri, "url");
            if (C38354F3m.LJ(queryParameter2) || (uri2 = UriProtector.parse(queryParameter2).toString()) == null) {
                uri2 = "";
            }
            if (TextUtils.isEmpty(uri2)) {
                return;
            }
            android.net.Uri parse = UriProtector.parse(uri2);
            o.LJIIIIZZ(parse, "parse(url)");
            o.LJIIIIZZ(deeplinkWebcastWebviewList, "deeplinkWebcastWebviewList");
            for (String str2 : deeplinkWebcastWebviewList) {
                if (!o.LJ("https", parse.getScheme()) || parse.getUserInfo() != null || !o.LJ(str2, parse.getHost())) {
                }
            }
            return;
        }
        try {
            Uri.Builder appendQueryParameter = UriProtector.parse(uri.toString()).buildUpon().appendQueryParameter("is_from_push", String.valueOf(z));
            if (!z) {
                appendQueryParameter.appendQueryParameter("sec_link_scene", "deeplink");
            }
            android.net.Uri build = appendQueryParameter.build();
            o.LJIIIIZZ(build, "buildUpon.build()");
            uri = build;
        } catch (Throwable th) {
            PEH.LIZJ(th);
        }
        try {
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null) {
                c86393XvR = LJJJLL.LJJIJIL();
            }
            o.LJI(c86393XvR);
            c86393XvR.LJJJIL(activity, uri);
        } catch (Throwable th2) {
            PEH.LIZJ(th2);
        }
    }
}
