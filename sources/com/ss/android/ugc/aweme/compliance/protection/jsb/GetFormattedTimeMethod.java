package com.ss.android.ugc.aweme.compliance.protection.jsb;

import X.C86036Xpg;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class GetFormattedTimeMethod extends BaseBridgeMethod {
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
    public GetFormattedTimeMethod(F3T factory) {
        super(factory);
        o.LJIIIZ(factory, "factory");
        this.LJLIL = "getFormattedTime";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        try {
            JSONObject jSONObject = new JSONObject();
            long optLong = params.optLong("time_stamp");
            String pattern = params.optString("formate_str");
            o.LJIIIIZZ(pattern, "pattern");
            LIZJ(pattern, optLong, jSONObject);
            iReturn.onSuccess(jSONObject);
        } catch (Exception e) {
            iReturn.LIZ(-1, e.getMessage());
        }
    }

    public static void LIZJ(String str, long j, JSONObject jSONObject) {
        jSONObject.put("time_string", C86036Xpg.LIZ(j, str));
        jSONObject.put("is_hour_24_format", TextUtils.equals(C86036Xpg.LIZ(j, "LT"), C86036Xpg.LIZ(j, "lt")));
    }
}
