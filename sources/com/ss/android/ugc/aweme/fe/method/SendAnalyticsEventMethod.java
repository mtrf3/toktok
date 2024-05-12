package com.ss.android.ugc.aweme.fe.method;

import X.C46104I7o;
import X.C47261Igj;
import X.C65087PgZ;
import X.EJ6;
import X.InterfaceC36488ETs;
import Y.IDdS378S0100000_6;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.ttnet.INetworkApi;
import com.google.gson.Gson;
import com.google.gson.m;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class SendAnalyticsEventMethod extends BaseCommonJavaMethod {
    public final String LJLJI;
    public final List<String> LJLJJI;

    public SendAnalyticsEventMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|2|3|(7:5|6|7|8|(1:10)|11|12)|16|6|7|8|(0)|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SendAnalyticsEventMethod(X.C38049EwX r5) {
        /*
            r4 = this;
            java.lang.String r3 = "send_analytics_event_data"
            r4.<init>(r5)
            r2 = 0
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L17
            java.lang.Class<com.ss.android.ugc.aweme.settings.SendAnalyticsEventData> r0 = com.ss.android.ugc.aweme.settings.SendAnalyticsEventData.class
            java.lang.Object r0 = r1.LJIIIIZZ(r3, r0, r2)     // Catch: java.lang.Throwable -> L17
            com.ss.android.ugc.aweme.settings.SendAnalyticsEventData r0 = (com.ss.android.ugc.aweme.settings.SendAnalyticsEventData) r0     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.baseUrl
            goto L18
        L17:
            r0 = r2
        L18:
            r4.LJLJI = r0
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<com.ss.android.ugc.aweme.settings.SendAnalyticsEventData> r0 = com.ss.android.ugc.aweme.settings.SendAnalyticsEventData.class
            java.lang.Object r0 = r1.LJIIIIZZ(r3, r0, r2)     // Catch: java.lang.Throwable -> L2a
            com.ss.android.ugc.aweme.settings.SendAnalyticsEventData r0 = (com.ss.android.ugc.aweme.settings.SendAnalyticsEventData) r0     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2a
            java.util.List<java.lang.String> r2 = r0.whiteList
        L2a:
            r4.LJLJJI = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.SendAnalyticsEventMethod.<init>(X.EwX):void");
    }

    public static List LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        o.LJIIIIZZ(keys, "keys");
        while (keys.hasNext()) {
            String next = keys.next();
            arrayList.add(new EJ6(next, JSONObjectProtectorUtils.getString(jSONObject, next)));
        }
        return arrayList;
    }

    public static Map LIZJ(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o.LJIIIIZZ(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            o.LJIIIIZZ(key, "key");
            linkedHashMap.put(key, jSONObject.get(key).toString());
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String str;
        if (jSONObject == null) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "no params!");
                return;
            }
            return;
        }
        String path = jSONObject.optString("path");
        o.LJIIIIZZ(path, "path");
        List<String> list = this.LJLJJI;
        if (list == null || !list.contains(path)) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "path doesn't match!");
                return;
            }
            return;
        }
        String optString = jSONObject.optString("method");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        Gson gson = new Gson();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        if (optJSONObject2 != null) {
            str = optJSONObject2.toString();
        } else {
            str = null;
        }
        m mVar = (m) GsonProtectorUtils.fromJson(gson, str, m.class);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("header");
        if (TextUtils.equals(optString, "GET")) {
            List LIZIZ = LIZIZ(optJSONObject3);
            String str2 = this.LJLJI;
            if (str2 == null || ujb.o.LJJJJJL(str2)) {
                if (interfaceC36488ETs != null) {
                    interfaceC36488ETs.LIZ(0, "base url is empty!");
                    return;
                }
                return;
            }
            Map<String, String> LIZJ = LIZJ(optJSONObject);
            try {
                List<EJ6> LJJIJIL = C47261Igj.LJJIJIL(new EJ6("X-SS-No-Cookie", "true"));
                if (LIZIZ != null && !((ArrayList) LIZIZ).isEmpty()) {
                    LJJIJIL.addAll(LIZIZ);
                }
                C65087PgZ c65087PgZ = (C65087PgZ) C46104I7o.LJIILLIIL(this.LJLJI);
                c65087PgZ.LIZJ = true;
                ((INetworkApi) c65087PgZ.LJFF().LIZ.LIZ(INetworkApi.class)).doGet(false, -1, path, LIZJ, LJJIJIL, null).enqueue(new IDdS378S0100000_6(interfaceC36488ETs, 5));
                return;
            } catch (Exception e) {
                if (interfaceC36488ETs == null) {
                    return;
                }
                interfaceC36488ETs.LIZ(1, e.getMessage());
                return;
            }
        }
        if (TextUtils.equals(optString, "POST")) {
            List LIZIZ2 = LIZIZ(optJSONObject3);
            String str3 = this.LJLJI;
            if (str3 == null || ujb.o.LJJJJJL(str3)) {
                if (interfaceC36488ETs == null) {
                    return;
                }
                interfaceC36488ETs.LIZ(0, "base url is empty!");
                return;
            }
            try {
                List<EJ6> LJJIJIL2 = C47261Igj.LJJIJIL(new EJ6("X-SS-No-Cookie", "true"));
                if (LIZIZ2 != null && !((ArrayList) LIZIZ2).isEmpty()) {
                    LJJIJIL2.addAll(LIZIZ2);
                }
                C65087PgZ c65087PgZ2 = (C65087PgZ) C46104I7o.LJIILLIIL(this.LJLJI);
                c65087PgZ2.LIZJ = true;
                ((SendAnalyticsEventApi) c65087PgZ2.LJFF().LIZ.LIZ(SendAnalyticsEventApi.class)).doPost(false, -1, path, LIZJ(optJSONObject), mVar, LJJIJIL2, null).enqueue(new IDdS378S0100000_6(interfaceC36488ETs, 6));
                return;
            } catch (Exception e2) {
                if (interfaceC36488ETs == null) {
                    return;
                }
                interfaceC36488ETs.LIZ(1, e2.getMessage());
                return;
            }
        }
        if (interfaceC36488ETs == null) {
            return;
        }
        interfaceC36488ETs.LIZ(0, "method is neither GET nor POST");
    }
}
