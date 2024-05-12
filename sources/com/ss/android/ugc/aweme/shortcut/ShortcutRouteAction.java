package com.ss.android.ugc.aweme.shortcut;

import X.C141335gf;
import X.C3C4;
import X.C3C5;
import X.C40373Fsv;
import X.C40522FvK;
import X.C76800UCe;
import X.InterfaceC40521FvJ;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import ujb.s;

/* loaded from: classes7.dex */
public final class ShortcutRouteAction implements InterfaceC40521FvJ {
    public static final C40522FvK Companion = new C40522FvK();

    private final SmartRoute routeH5(Context context, String str, String str2) {
        SmartRoute smartRoute = new SmartRoute(context);
        smartRoute.withParam("url", str);
        smartRoute.withParam("SHORTCUT_ID", str2);
        smartRoute.withUrl("aweme://webview/");
        o.LJIIIIZZ(smartRoute, "SmartRoute(context)\n    …withUrl(Constants.URL_H5)");
        return smartRoute;
    }

    private final SmartRoute routeUrlOrAction(Context context, String str, String str2) {
        SmartRoute smartRoute = new SmartRoute(context);
        smartRoute.withUrl(str);
        smartRoute.withParam("SHORTCUT_ID", str2);
        o.LJIIIIZZ(smartRoute, "SmartRoute(context)\n    …(SHORTCUT_ID, shortcutId)");
        return smartRoute;
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        if (context != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            String string = bundle.getString("SHORTCUT_ID");
            if (string == null) {
                string = "";
            }
            return onShortcutAction(context, string, str, bundle);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC40521FvJ
    public Object onShortcutAction(Context context, String shortcutId, String str, Bundle extra) {
        Object LIZ;
        C3C4 c3c4;
        Object LIZ2;
        String scheme;
        SmartRoute routeUrlOrAction;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(shortcutId, "shortcutId");
        o.LJIIIZ(extra, "extra");
        try {
            String string = extra.getString("SHORTCUT_ID");
            String str2 = "";
            if (string == null) {
                string = "";
            }
            C40373Fsv.LIZ(string);
            String decode = Uri.decode(extra.getString("shortcutRouteUrl"));
            extra.getString("SHORTCUT_NEED_LOGIN");
            try {
                JSONArray jSONArray = new JSONArray(decode);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string2 = JSONArrayProtectorUtils.getString(jSONArray, i);
                    o.LJIIIIZZ(string2, "jsonArray.getString(index)");
                    arrayList.add(string2);
                }
                C3C5.m7constructorimpl(arrayList);
                c3c4 = arrayList;
            } catch (Throwable th) {
                C3C4 LIZ3 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ3);
                c3c4 = LIZ3;
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(c3c4);
            Object obj = c3c4;
            if (m10exceptionOrNullimpl != null) {
                obj = new ArrayList();
            }
            List list = (List) obj;
            String string3 = extra.getString("SHORTCUT_ROUTE_ACTION");
            if (string3 != null) {
                str2 = string3;
            }
            list.add(str2);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((String) obj2).length() != 0) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                try {
                    scheme = UriProtector.parse(str3).getScheme();
                } catch (Throwable th2) {
                    LIZ2 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (scheme == null || (!scheme.equals("https") && !scheme.equals("http"))) {
                    if (s.LJJJLZIJ(str3, "//webview", false)) {
                        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str3), "url");
                        if (queryParameter == null || ujb.o.LJJJJJL(queryParameter)) {
                            routeUrlOrAction = routeUrlOrAction(context, str3, string);
                        } else {
                            routeUrlOrAction = routeH5(context, queryParameter, string);
                        }
                    } else {
                        routeUrlOrAction = routeUrlOrAction(context, str3, string);
                    }
                    routeUrlOrAction.open();
                    LIZ2 = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ2);
                    C3C5.m10exceptionOrNullimpl(LIZ2);
                }
                routeUrlOrAction = routeH5(context, str3, string);
                routeUrlOrAction.open();
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
                C3C5.m10exceptionOrNullimpl(LIZ2);
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th3) {
            LIZ = C141335gf.LIZ(th3);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        return null;
    }
}
