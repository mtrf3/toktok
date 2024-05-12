package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C16880lQ;
import X.C173066qk;
import X.F3T;
import X.InterfaceC37146Ehy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class BroadcastMethod extends BaseBridgeMethod {
    public static final /* synthetic */ int LJLILLLLZI = 0;
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
    public BroadcastMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "broadcast";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        try {
            sendEvent("notification", params);
            com.ss.android.ugc.aweme.fe.method.BroadcastMethod.LIZIZ(getContext(), params, null, getKitContainerApi());
            C173066qk.LIZ(params);
            iReturn.onSuccess("");
        } catch (JSONException e) {
            iReturn.LIZ(-1, "");
            C16880lQ.LLLLIIL(e);
        }
    }
}
