package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C2U8;
import X.C50146JmA;
import X.C50345JpN;
import X.F3T;
import X.InterfaceC37146Ehy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SearchRefreshMonitorMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public final C50345JpN LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRefreshMonitorMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "searchRefreshMonitor";
        this.LJLILLLLZI = new C50345JpN(contextProviderFactory, "searchRefreshMonitor");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLILLLLZI.LIZ(params, iReturn)) {
            return;
        }
        try {
            C2U8.LIZ(new C50146JmA(params.optLong("networkStart"), params.optLong("networkEnd"), params.optInt("itemCount"), params.optLong("viewDrawEnd"), params.optInt("status")));
            iReturn.onSuccess(new JSONArray());
        } catch (Exception e) {
            iReturn.LIZ(0, e.getMessage());
        }
    }
}
