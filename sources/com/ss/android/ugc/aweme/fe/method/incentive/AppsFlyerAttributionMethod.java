package com.ss.android.ugc.aweme.fe.method.incentive;

import X.C38049EwX;
import X.FLJ;
import X.InterfaceC36488ETs;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AppsFlyerAttributionMethod extends BaseCommonJavaMethod {
    public AppsFlyerAttributionMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public AppsFlyerAttributionMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        JSONObject optJSONObject;
        Iterator<String> keys;
        String str = null;
        if (jSONObject != null) {
            str = jSONObject.optString("event_name", "");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject != null && jSONObject.has("params") && (optJSONObject = jSONObject.optJSONObject("params")) != null && (keys = optJSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String key = keys.next();
                Object value = optJSONObject.opt(key);
                o.LJIIIIZZ(key, "key");
                o.LJIIIIZZ(value, "value");
                linkedHashMap.put(key, value);
            }
        }
        UgCommonServiceImpl.LJIJ().LJIILIIL();
        FLJ.LIZLLL(str, linkedHashMap);
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.onSuccess("");
        }
    }
}
