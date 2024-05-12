package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.Efa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36998Efa {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(android.net.Uri uri) {
        JSONObject jSONObject;
        String api;
        EnumC36999Efb method;
        boolean z;
        boolean z2;
        Iterator<String> keys;
        Iterator<String> keys2;
        String LIZLLL = ED3.LIZLLL(uri);
        if (o.LJJJJJL(LIZLLL)) {
            return;
        }
        String LJ = ED3.LJ(uri, "prefetch_config");
        if (o.LJJJJJL(LJ)) {
            return;
        }
        try {
            String path = UriProtector.parse(LIZLLL).getPath();
            if (path != null && !o.LJJJJJL(path) && (api = (jSONObject = new JSONObject(LJ)).optString("url", "https://oec-api.tiktokv.com/api/v1/mall/new_user_exclusive_deal/get")) != null && !o.LJJJJJL(api)) {
                kotlin.jvm.internal.o.LJIIIIZZ(api, "api");
                C36997EfZ c36997EfZ = new C36997EfZ(path, api);
                if (jSONObject.optInt("method", 1) == 1) {
                    method = EnumC36999Efb.POST;
                } else {
                    method = EnumC36999Efb.GET;
                }
                kotlin.jvm.internal.o.LJIIJ(method, "method");
                c36997EfZ.LIZJ = method;
                if (jSONObject.optInt("need_common_params", 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                c36997EfZ.LIZ = z;
                long optLong = jSONObject.optLong("expire", 30L);
                if (optLong < 3) {
                    optLong = 3;
                }
                c36997EfZ.LIZIZ = optLong;
                JSONObject optJSONObject = jSONObject.optJSONObject("query_params");
                if (optJSONObject != null && (keys2 = optJSONObject.keys()) != null) {
                    while (keys2.hasNext()) {
                        String key = keys2.next();
                        kotlin.jvm.internal.o.LJIIIIZZ(key, "key");
                        String optString = optJSONObject.optString(key);
                        if (optString == null || o.LJJJJJL(optString)) {
                            optString = null;
                        }
                        c36997EfZ.LIZLLL.add(new OSZ<>(key, optString));
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("static_params");
                if (optJSONObject2 != null && (keys = optJSONObject2.keys()) != null) {
                    while (keys.hasNext()) {
                        String key2 = keys.next();
                        kotlin.jvm.internal.o.LJIIIIZZ(key2, "key");
                        String optString2 = optJSONObject2.optString(key2);
                        kotlin.jvm.internal.o.LJIIIIZZ(optString2, "staticParams.optString(key)");
                        c36997EfZ.LIZ(key2, optString2);
                    }
                }
                if (optJSONObject2 == null || !optJSONObject2.has("cursor")) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    c36997EfZ.LIZ("cursor", CardStruct.IStatusCode.DEFAULT);
                }
                if (optJSONObject2 == null || !optJSONObject2.has("mode")) {
                    c36997EfZ.LIZ("mode", "1");
                }
                if (optJSONObject2 == null || !optJSONObject2.has("size")) {
                    c36997EfZ.LIZ("size", "10");
                }
                if (optJSONObject2 == null || !optJSONObject2.has("request_type")) {
                    c36997EfZ.LIZ("request_type", CardStruct.IStatusCode.DEFAULT);
                }
                C36982EfK.LJ = new C37000Efc(c36997EfZ);
            }
        } catch (Throwable unused) {
        }
    }
}
