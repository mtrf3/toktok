package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.F21;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.InterfaceC40516FvE;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class GetContainerIdMethod extends BaseBridgeMethod {
    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return "getContainerId";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetContainerIdMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        String str;
        F21 LLLLLLJ;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        super.handle(params, iReturn);
        JSONObject jSONObject = new JSONObject();
        InterfaceC40516FvE kitContainerApi = getKitContainerApi();
        if (kitContainerApi != null && (LLLLLLJ = kitContainerApi.LLLLLLJ()) != null) {
            str = LLLLLLJ.LJLIL;
        } else {
            str = null;
        }
        jSONObject.put("container_id", str);
        iReturn.onSuccess(jSONObject);
    }
}
