package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C27739Aud;
import X.C62712d9;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class EcomAddressInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        return o.LJ(str, "ec");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0178  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r39, com.bytedance.router.RouteIntent r40) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.router.EcomAddressInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    public static void LIZ(int i, int i2, Object obj, List list) {
        Object jSONArray;
        String str;
        String obj2;
        JSONObject jSONObject = new JSONObject();
        String str2 = "";
        if (list == null) {
            jSONArray = "";
        } else {
            jSONArray = new JSONArray(C27739Aud.LJI(list));
        }
        JSONObject put = jSONObject.put("districts", jSONArray).put("status", i);
        if (obj != null && (obj2 = obj.toString()) != null) {
            str2 = obj2;
        }
        JSONObject put2 = put.put("enter_method", str2);
        if (i2 == 2) {
            str = "ec_district_panel_changed_v2";
        } else {
            str = "ec_district_panel_changed";
        }
        IEventCenter LJ = EventCenter.LJ();
        String jSONObject2 = put2.toString();
        o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
        LJ.LIZ(str, jSONObject2);
    }
}
