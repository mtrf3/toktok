package com.ss.android.ugc.aweme.fe.method;

import X.C38049EwX;
import X.C38836FMa;
import X.InterfaceC36488ETs;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class SendLogV3Method extends BaseCommonJavaMethod {
    public SendLogV3Method() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SendLogV3Method(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        if (jSONObject == null) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "");
                return;
            }
            return;
        }
        String optString = jSONObject.optString("eventName");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (TextUtils.isEmpty(optString) || optJSONObject == null) {
            if (interfaceC36488ETs == null) {
                return;
            }
            interfaceC36488ETs.LIZ(0, "");
            return;
        }
        Iterator<String> keys = optJSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String key = keys.next();
            String value = optJSONObject.optString(key);
            keys.remove();
            o.LJIIIIZZ(key, "key");
            o.LJIIIIZZ(value, "value");
            hashMap.put(key, value);
        }
        C38836FMa.LIZLLL(optString, hashMap);
        if (interfaceC36488ETs == null) {
            return;
        }
        interfaceC36488ETs.onSuccess(new JSONObject());
    }
}
