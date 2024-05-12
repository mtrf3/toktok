package com.ss.android.ugc.aweme.settingsrequest;

import X.C16880lQ;
import X.C19N;
import X.C76800UCe;
import X.EUE;
import X.InterfaceC88472Yns;
import com.google.gson.m;
import com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ConfigCenterCenterBridgeImpl implements IConfigCenterBridgeApi {
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi
    public final boolean LIZJ() {
        return C19N.LJ("use_new_get_abtest_method", false);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi
    public final Map<String, Object> getSettings(List<String> keys) {
        o.LJIIIZ(keys, "keys");
        try {
            if (keys.isEmpty()) {
                return EUE.LIZJ();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : keys) {
                linkedHashMap.put(str, EUE.LIZ(str));
            }
            return linkedHashMap;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return new LinkedHashMap();
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi
    public final void LIZIZ(m mVar, String key) {
        o.LJIIIZ(key, "key");
        EUE.LIZLLL(mVar, key, EUE.LIZ(key));
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi
    public final void LIZ(JSONObject jSONObject, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Exception, C76800UCe> interfaceC88472Yns2) {
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("ab_test_names");
                if (optJSONArray != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String key = optJSONArray.optString(i);
                        o.LJIIIIZZ(key, "key");
                        jSONObject2.put(key, EUE.LIZ(key));
                    }
                    String jSONObject3 = jSONObject2.toString();
                    o.LJIIIIZZ(jSONObject3, "resultJson.toString()");
                    interfaceC88472Yns.invoke(jSONObject3);
                    return;
                }
            } catch (Exception e) {
                interfaceC88472Yns2.invoke(e);
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        interfaceC88472Yns.invoke(EUE.LIZIZ());
    }
}
