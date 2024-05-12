package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C188727au;
import X.C45804HyK;
import X.F3T;
import X.FMX;
import X.InterfaceC37146Ehy;
import X.OZ1;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class OpenScanMethod extends BaseBridgeMethod {
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
    public OpenScanMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "scan";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Context context;
        Activity LJIJJ;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "h5");
        FMX.LJIIL("qr_code_scan_enter", c188727au.LIZ);
        JSONObject jSONObject = null;
        if (params.has("args")) {
            jSONObject = JSONObjectProtectorUtils.getJSONObject(params, "args");
        }
        Context context2 = getContext();
        if (context2 != null) {
            OZ1.LIZIZ.LJ(context2);
        }
        if (jSONObject != null && jSONObject.has("should_close_self") && JSONObjectProtectorUtils.getBoolean(jSONObject, "should_close_self") && (context = getContext()) != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            LJIJJ.finish();
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        iReturn.LIZIZ(jSONObject2);
    }
}
