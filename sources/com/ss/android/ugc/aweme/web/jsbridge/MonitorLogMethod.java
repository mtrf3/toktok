package com.ss.android.ugc.aweme.web.jsbridge;

import X.C8HX;
import X.InterfaceC36488ETs;
import X.X1D;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class MonitorLogMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        if (jSONObject == null || jSONObject.length() == 0) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "params is empty");
                return;
            }
            return;
        }
        String optString = jSONObject.optString("log_type");
        if (TextUtils.isEmpty(optString)) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "log_type is empty");
                return;
            }
            return;
        }
        String optString2 = jSONObject.optString("service");
        if (TextUtils.equals(optString, "service_monitor") && TextUtils.isEmpty(optString2)) {
            if (interfaceC36488ETs != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("service is required while log_type=");
                LIZ.append(optString);
                interfaceC36488ETs.LIZ(0, X1D.LIZIZ(LIZ));
                return;
            }
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        Object opt = jSONObject.opt("status");
        if (opt != null) {
            jSONObject2.put("status", opt);
        }
        Object opt2 = jSONObject.opt("value");
        if (opt2 != null) {
            jSONObject2.put("value", opt2);
        }
        C8HX.LIZIZ(optString, optString2, jSONObject2);
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.onSuccess(null);
        }
    }
}
