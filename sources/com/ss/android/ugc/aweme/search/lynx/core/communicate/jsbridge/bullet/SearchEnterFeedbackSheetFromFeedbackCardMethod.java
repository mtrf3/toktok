package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C162476Zf;
import X.C50343JpL;
import X.C50345JpN;
import X.C50656JuO;
import X.C78983UzD;
import X.F3T;
import X.InterfaceC37120EhY;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SearchEnterFeedbackSheetFromFeedbackCardMethod extends BaseBridgeMethod {
    public final C50345JpN LJLIL;

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return "SearchEnterFeedbackSheetFromFeedbackCard";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchEnterFeedbackSheetFromFeedbackCardMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = new C50345JpN(contextProviderFactory, "SearchEnterFeedbackSheetFromFeedbackCard");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, X.InterfaceC38186Eyk
    public final void handle(JSONObject params, InterfaceC37120EhY callback) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        C50345JpN c50345JpN = this.LJLIL;
        c50345JpN.getClass();
        int i = C50343JpL.LIZ[c50345JpN.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c50345JpN.LIZIZ(c50345JpN.LIZJ);
                    if (C50345JpN.LJ && C50345JpN.LIZLLL && c50345JpN.LIZJ) {
                        callback.onError(0, "deprecated jsb methods cannot be added in spark plugin");
                        return;
                    }
                } else {
                    throw new C162476Zf();
                }
            }
        } else {
            boolean z = c50345JpN.LIZJ;
            HashMap hashMap = new HashMap();
            hashMap.put("bridgeName", c50345JpN.LIZ);
            hashMap.put("newContainer", String.valueOf(z));
            C78983UzD.LJIILLIIL("search_jsb_use_experimental", hashMap);
        }
        C50656JuO.LIZJ = true;
    }
}
