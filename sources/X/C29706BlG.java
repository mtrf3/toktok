package X;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSparkOptimizeLandscapeParametersSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.BlG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29706BlG {
    public static boolean LIZ;

    public static final String LIZ(android.net.Uri uri) {
        Activity activity;
        boolean z;
        int LJIIJJI;
        String str = null;
        if (uri == null) {
            return null;
        }
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null) {
            activity = iHostAction.getTopActivity();
        } else {
            activity = null;
        }
        if (activity != null && activity.getRequestedOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        if (!LiveSparkOptimizeLandscapeParametersSetting.INSTANCE.getValue() && z) {
            if (UriProtector.getQueryParameter(uri, "landscape_width") == null) {
                if (activity == null) {
                    LJIIJJI = C15380j0.LJIIIZ(activity);
                } else {
                    LJIIJJI = C15380j0.LJIIJJI();
                }
                clearQuery.appendQueryParameter("landscape_width", String.valueOf((int) C15380j0.LJIJ(LJIIJJI)));
            }
            if (UriProtector.getQueryParameter(uri, "landscape_gravity") == null) {
                clearQuery.appendQueryParameter("landscape_gravity", "right");
            }
        }
        if ((o.LJ(uri.getHost(), "webcast_lynxview") || o.LJ(uri.getHost(), "webcast_webview")) && o.LJ(UriProtector.getQueryParameter(uri, "type"), "popup")) {
            if (UriProtector.getQueryParameter(uri, "gravity") == null) {
                clearQuery.appendQueryParameter("gravity", "center");
            }
            if (UriProtector.getQueryParameter(uri, "popup_enter_type") == null) {
                if (UriProtector.getQueryParameter(uri, "transition_animation") == null) {
                    clearQuery.appendQueryParameter("transition_animation", "bottom");
                }
                if (UriProtector.getQueryParameter(uri, "landscape_transition_animation") == null) {
                    clearQuery.appendQueryParameter("landscape_transition_animation", "right");
                }
            }
        }
        Iterator LIZ2 = C47117IeP.LIZ(uri, "originUri.queryParameterNames");
        while (LIZ2.hasNext()) {
            String str2 = (String) LIZ2.next();
            java.util.Map<String, AbstractC29708BlI> map = C29710BlK.LIZ;
            if (map.get(str2) != null) {
                AbstractC29708BlI abstractC29708BlI = map.get(str2);
                o.LJI(abstractC29708BlI);
                AbstractC29708BlI abstractC29708BlI2 = abstractC29708BlI;
                String LIZ3 = abstractC29708BlI2.LIZ();
                if (!TextUtils.isEmpty(LIZ3)) {
                    String queryParameter = UriProtector.getQueryParameter(uri, str2);
                    o.LJI(queryParameter);
                    clearQuery.appendQueryParameter(LIZ3, abstractC29708BlI2.LIZIZ(queryParameter));
                }
            } else {
                clearQuery.appendQueryParameter(str2, UriProtector.getQueryParameter(uri, str2));
            }
        }
        o.LJIIIIZZ(clearQuery, "originUri.buildUpon().cl…}\n            }\n        }");
        Uri.Builder appendQueryParameter = clearQuery.appendQueryParameter("__live_platform__", "webcast").appendQueryParameter("target_handler", "webcast");
        if (o.LJ(UriProtector.getQueryParameter(uri, "type"), "popup")) {
            String authority = uri.getAuthority();
            if (authority == null) {
                authority = "";
            }
            if (!ujb.o.LJJJJ(authority, "_popup", false)) {
                StringBuilder LIZ4 = X1D.LIZ();
                String authority2 = uri.getAuthority();
                if (authority2 != null) {
                    str = s.LJJLL("webcast_", authority2);
                }
                LIZ4.append(str);
                LIZ4.append("_popup");
                appendQueryParameter.authority(X1D.LIZIZ(LIZ4));
                return appendQueryParameter.build().toString();
            }
        }
        String authority3 = uri.getAuthority();
        if (authority3 != null) {
            str = s.LJJLL("webcast_", authority3);
        }
        appendQueryParameter.authority(str);
        return appendQueryParameter.build().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:3:0x0005, B:5:0x0013, B:6:0x001f, B:9:0x0033, B:11:0x003f, B:17:0x0052, B:21:0x0056, B:23:0x005c), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(java.lang.String r5) {
        /*
            java.lang.String r0 = "schema"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostHybrid> r0 = com.bytedance.android.livesdkapi.host.IHostHybrid.class
            X.0Mx r0 = X.CN1.LIZ(r0)     // Catch: java.lang.Exception -> L62
            com.bytedance.android.livesdkapi.host.IHostHybrid r0 = (com.bytedance.android.livesdkapi.host.IHostHybrid) r0     // Catch: java.lang.Exception -> L62
            boolean r0 = r0.fa(r5)     // Catch: java.lang.Exception -> L62
            if (r0 == 0) goto L2d
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostHybrid> r0 = com.bytedance.android.livesdkapi.host.IHostHybrid.class
            X.0Mx r0 = X.CN1.LIZ(r0)     // Catch: java.lang.Exception -> L62
            com.bytedance.android.livesdkapi.host.IHostHybrid r0 = (com.bytedance.android.livesdkapi.host.IHostHybrid) r0     // Catch: java.lang.Exception -> L62
            java.lang.String r4 = r0.k7(r5)     // Catch: java.lang.Exception -> L62
        L1f:
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)     // Catch: java.lang.Exception -> L62
            boolean r0 = LIZJ(r3)     // Catch: java.lang.Exception -> L62
            goto L2f
        L2d:
            r4 = r5
            goto L1f
        L2f:
            java.lang.String r2 = "finalSchema"
            if (r0 != 0) goto L56
            java.lang.String r1 = r3.getHost()     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = "webcast_lynxview_card"
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.Exception -> L62
            if (r0 != 0) goto L4e
            java.lang.String r1 = r3.getHost()     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = "webcast_webview_card"
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.Exception -> L62
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r0 = 0
            goto L4f
        L4e:
            r0 = 1
        L4f:
            if (r0 == 0) goto L52
            goto L56
        L52:
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r2)     // Catch: java.lang.Exception -> L62
            return r4
        L56:
            java.lang.String r0 = LIZ(r3)     // Catch: java.lang.Exception -> L62
            if (r0 != 0) goto L60
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r2)     // Catch: java.lang.Exception -> L62
            goto L61
        L60:
            r4 = r0
        L61:
            return r4
        L62:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29706BlG.LIZIZ(java.lang.String):java.lang.String");
    }

    public static final boolean LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        if (TextUtils.equals(uri.getHost(), "webcast_lynxview") || TextUtils.equals(uri.getHost(), "webcast_webview") || TextUtils.equals(uri.getHost(), "webcast_lynxview_popup") || TextUtils.equals(uri.getHost(), "webcast_webview_popup")) {
            return true;
        }
        return false;
    }
}
