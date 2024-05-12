package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C16880lQ;
import X.C8HX;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.X1D;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class MonitorLogMethod extends BaseBridgeMethod {
    public final String LJLIL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonitorLogMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "monitorLog";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (params.length() == 0) {
            iReturn.LIZ(0, "params is empty");
            return;
        }
        String optString = params.optString("log_type");
        if (TextUtils.isEmpty(optString)) {
            iReturn.LIZ(0, "log_type is empty");
            return;
        }
        String optString2 = params.optString("service");
        if (TextUtils.equals(optString, "service_monitor") && TextUtils.isEmpty(optString2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("service is required while log_type=");
            LIZ.append(optString);
            iReturn.LIZ(0, X1D.LIZIZ(LIZ));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Object opt = params.opt("status");
            if (opt != null) {
                jSONObject.put("status", opt);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            Object opt2 = params.opt("value");
            if (opt2 != null) {
                jSONObject.put("value", opt2);
            }
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        C8HX.LIZIZ(optString, optString2, jSONObject);
        iReturn.onSuccess(null);
    }
}
