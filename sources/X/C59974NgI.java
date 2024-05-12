package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* renamed from: X.NgI */
/* loaded from: classes11.dex */
public final class C59974NgI {
    public static /* synthetic */ void LIZIZ(Context context, String str, java.util.Map map) {
        LIZ(context, str, map, C113554cx.LJJJLIIL());
    }

    public static void LIZ(Context context, String originUrl, java.util.Map params, java.util.Map mobParams) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        String LIZIZ;
        String LIZIZ2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(originUrl, "originUrl");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(mobParams, "mobParams");
        String str2 = (String) params.get("anchor_type");
        String str3 = (String) params.get("anchor_subtype");
        String str4 = (String) params.get("shoot_way");
        String str5 = (String) params.get("creation_id");
        String str6 = (String) params.get("title");
        StringBuilder sb = new StringBuilder(originUrl);
        if (o.LJ(str2, "News")) {
            if (UriProtector.parse(originUrl).getQuery() != null) {
                LIZIZ2 = C42398GkU.LIZIZ(originUrl, '&');
            } else {
                LIZIZ2 = C42398GkU.LIZIZ(originUrl, '?');
            }
            sb = new StringBuilder(LIZIZ2);
            if (o.LJ(params.get("noRedirect"), "true")) {
                sb.append("&noRedirect=true");
            }
            sb.append("&close=false");
        }
        if (str2 == null) {
            String str7 = (String) params.get("close");
            if (str7 == null || str7.length() == 0 || ujb.o.LJJJJIZL(str7, "true", true)) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str8 = (String) params.get("hide_nav_bar");
            if (str8 == null || str8.length() == 0 || ujb.o.LJJJJIZL(str8, "true", true)) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean LJJJJIZL = ujb.o.LJJJJIZL((String) params.get("back"), "true", true);
            boolean LJJJJIZL2 = ujb.o.LJJJJIZL((String) params.get("addButton"), "true", true);
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
            if (str6 != null && str6.length() != 0) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("&title=");
                LIZ4.append(str6);
                sb.append(X1D.LIZIZ(LIZ4));
            }
            if (str4 != null && str4.length() != 0) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("&shoot_way=");
                LIZ5.append(str4);
                sb.append(X1D.LIZIZ(LIZ5));
            }
            if (str5 != null && str5.length() != 0) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("&creation_id=");
                LIZ6.append(str5);
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
        boolean LJJJJIZL3 = ujb.o.LJJJJIZL((String) params.get("show_keyboard"), "true", true);
        String str9 = (String) params.get("host_filter");
        if (str9 == null || !ujb.o.LJJJJIZL(str9, "true", true) || (str = UriProtector.parse(originUrl).getHost()) == null) {
            str = "";
        }
        CharSequence charSequence = (CharSequence) params.get("disable_app_link");
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = true;
            if (!ujb.o.LJJJJIZL((String) params.get("disable_app_link"), "true", true)) {
                z = false;
            }
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//wiki");
        buildRoute.withParam("url", sb.toString());
        buildRoute.withParam("shoot_way", str4);
        buildRoute.withParam("creation_id", str5);
        buildRoute.withParam("show_keyboard", LJJJJIZL3);
        buildRoute.withParam("anchor_type", str2);
        buildRoute.withParam("anchor_subtype", str3);
        buildRoute.withParam("title", str6);
        buildRoute.withParam("author_id", (String) params.get("author_id"));
        buildRoute.withParam("group_id", (String) params.get("group_id"));
        buildRoute.withParam("enter_from", (String) params.get("enter_from"));
        buildRoute.withParam("language", (String) params.get("language"));
        buildRoute.withParam("wiki_entry", (String) params.get("wiki_entry"));
        buildRoute.withParam("anchor_entry", (String) params.get("anchor_entry"));
        buildRoute.withParam("host_filter", str);
        buildRoute.withParam("disable_app_link", z);
        buildRoute.withParam("content_source", (String) params.get("content_source"));
        buildRoute.withParam("content_type", (String) params.get("content_type"));
        buildRoute.withParam("placeholder_enter_from", (String) params.get("placeholder_enter_from"));
        buildRoute.withParam("mob_extra", C27739Aud.LJI(mobParams));
        buildRoute.withParam("anchor_id", (String) params.get("anchor_id"));
        buildRoute.open();
    }
}
