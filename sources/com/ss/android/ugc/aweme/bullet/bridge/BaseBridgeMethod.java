package com.ss.android.ugc.aweme.bullet.bridge;

import X.AbstractC60239NkZ;
import X.C37119EhX;
import X.C38048EwW;
import X.C38049EwX;
import X.F0M;
import X.F0N;
import X.F0S;
import X.F3T;
import X.InterfaceC37120EhY;
import X.InterfaceC37146Ehy;
import X.InterfaceC40516FvE;
import X.InterfaceC60187Njj;
import X.InterfaceC60196Njs;
import X.InterfaceC60205Nk1;
import X.InterfaceC60276NlA;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class BaseBridgeMethod extends F0M implements GenericLifecycleObserver {
    public void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final C38049EwX getJsBridge() {
        return (C38049EwX) this.contextProviderFactory.LIZJ(C38049EwX.class);
    }

    public final InterfaceC40516FvE getKitContainerApi() {
        return (InterfaceC40516FvE) this.contextProviderFactory.LIZJ(InterfaceC40516FvE.class);
    }

    public final InterfaceC60276NlA getMonitorService() {
        return (InterfaceC60276NlA) this.contextProviderFactory.LIZJ(InterfaceC60276NlA.class);
    }

    public final F0S getHybridType() {
        F0S LLLIZZ;
        InterfaceC40516FvE kitContainerApi = getKitContainerApi();
        if (kitContainerApi == null || (LLLIZZ = kitContainerApi.LLLIZZ()) == null) {
            return F0S.WEB;
        }
        return LLLIZZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBridgeMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
    }

    public final Activity getActivityById(String str) {
        InterfaceC60205Nk1 interfaceC60205Nk1;
        InterfaceC40516FvE a0;
        AbstractC60239NkZ abstractC60239NkZ;
        InterfaceC60187Njj LJIJ;
        if (str == null || (interfaceC60205Nk1 = (InterfaceC60205Nk1) this.contextProviderFactory.LIZJ(InterfaceC60196Njs.class)) == null || (a0 = interfaceC60205Nk1.a0(str)) == null || !(a0 instanceof AbstractC60239NkZ) || (abstractC60239NkZ = (AbstractC60239NkZ) a0) == null || (LJIJ = abstractC60239NkZ.LJIJ()) == null) {
            return null;
        }
        return LJIJ.getActivity();
    }

    public final C38048EwW getWebJsMsg(JSONObject params) {
        o.LJIIIZ(params, "params");
        C38048EwW c38048EwW = new C38048EwW();
        c38048EwW.LIZLLL = params;
        JSONObject optJSONObject = params.optJSONObject("jsMsg");
        if (optJSONObject != null) {
            c38048EwW.LIZ = optJSONObject.optString("type");
            c38048EwW.LIZJ = optJSONObject.optString("func");
            c38048EwW.LIZIZ = optJSONObject.optString("callback_id");
            c38048EwW.LJ = optJSONObject.optInt("version");
            c38048EwW.LJIIJ = optJSONObject.optBoolean("needCallback");
            c38048EwW.LJII = Boolean.valueOf(optJSONObject.optBoolean("fromBDXBridge", false));
            c38048EwW.LJIIIZ = optJSONObject.optString("permissionGroup");
        }
        return c38048EwW;
    }

    @Override // X.InterfaceC38186Eyk
    public void handle(JSONObject params, InterfaceC37120EhY callback) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        handle(params, new C37119EhX(callback));
    }

    public final void sendEvent(String name, JSONObject params) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(params, "params");
        InterfaceC40516FvE kitContainerApi = getKitContainerApi();
        if (kitContainerApi != null) {
            kitContainerApi.onEvent(new F0N(name, params));
        }
    }
}
