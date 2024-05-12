package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.NgJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59975NgJ {
    public static final void LIZ(Context context, String originUrl, java.util.Map<String, String> map) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        String LIZIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(originUrl, "originUrl");
        HashMap hashMap = (HashMap) map;
        String str2 = (String) hashMap.get("anchor_type");
        String str3 = (String) hashMap.get("shoot_way");
        String str4 = (String) hashMap.get("creation_id");
        StringBuilder sb = new StringBuilder(originUrl);
        if (str2 == null) {
            String str5 = (String) hashMap.get("title");
            String str6 = (String) hashMap.get("close");
            if (str6 == null || str6.length() == 0 || ujb.o.LJJJJIZL(str6, "true", true)) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str7 = (String) hashMap.get("hide_nav_bar");
            if (str7 == null || str7.length() == 0 || ujb.o.LJJJJIZL(str7, "true", true)) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean LJJJJIZL = ujb.o.LJJJJIZL((String) hashMap.get("back"), "true", true);
            boolean LJJJJIZL2 = ujb.o.LJJJJIZL((String) hashMap.get("addButton"), "true", true);
            if (UriProtector.parse(originUrl).getQuery() != null) {
                LIZIZ = C42398GkU.LIZIZ(originUrl, '&');
            } else {
                LIZIZ = C42398GkU.LIZIZ(originUrl, '?');
            }
            sb = new StringBuilder(LIZIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addButton=");
            LIZ.append(LJJJJIZL2);
            sb.append(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("&back=");
            LIZ2.append(LJJJJIZL);
            sb.append(X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("&close=");
            LIZ3.append(z2);
            sb.append(X1D.LIZIZ(LIZ3));
            if (str5 != null && str5.length() != 0) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("&title=");
                LIZ4.append(str5);
                sb.append(X1D.LIZIZ(LIZ4));
            }
            if (str3 != null && str3.length() != 0) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("&shoot_way=");
                LIZ5.append(str3);
                sb.append(X1D.LIZIZ(LIZ5));
            }
            if (str4 != null && str4.length() != 0) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("&creation_id=");
                LIZ6.append(str4);
                sb.append(X1D.LIZIZ(LIZ6));
            }
            if (z3) {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("&hide_nav_bar=1&status_bar_height=");
                LIZ7.append(KL2.LJIILL(context, C63081OpJ.LJJJJLI(context)));
                sb.append(X1D.LIZIZ(LIZ7));
            } else {
                sb.append("&hide_nav_bar=0&status_bar_height=0");
            }
            str2 = "Wiki";
        }
        boolean LJJJJIZL3 = ujb.o.LJJJJIZL((String) hashMap.get("show_keyboard"), "true", true);
        String str8 = (String) hashMap.get("host_filter");
        if (str8 == null || !ujb.o.LJJJJIZL(str8, "true", true) || (str = UriProtector.parse(originUrl).getHost()) == null) {
            str = "";
        }
        CharSequence charSequence = (CharSequence) hashMap.get("disable_app_link");
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = true;
            if (!ujb.o.LJJJJIZL((String) hashMap.get("disable_app_link"), "true", true)) {
                z = false;
            }
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//wiki");
        buildRoute.withParam("url", sb.toString());
        buildRoute.withParam("shoot_way", str3);
        buildRoute.withParam("creation_id", str4);
        buildRoute.withParam("show_keyboard", LJJJJIZL3);
        buildRoute.withParam("anchor_type", str2);
        buildRoute.withParam("author_id", (String) hashMap.get("author_id"));
        buildRoute.withParam("group_id", (String) hashMap.get("group_id"));
        buildRoute.withParam("enter_from", (String) hashMap.get("enter_from"));
        buildRoute.withParam("language", (String) hashMap.get("language"));
        buildRoute.withParam("wiki_entry", (String) hashMap.get("wiki_entry"));
        buildRoute.withParam("anchor_entry", (String) hashMap.get("anchor_entry"));
        C0NY.LIZJ(buildRoute, "host_filter", str, "disable_app_link", z);
    }
}
