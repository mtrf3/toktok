package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C2U8;
import X.C37087Eh1;
import X.C58582Rq;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AdLynxSuperLikeStatusMethod extends BaseBridgeMethod {
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
    public AdLynxSuperLikeStatusMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "adLynxSuperLikeStatus";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (!params.has("status")) {
            iReturn.LIZ(-1, "status is empty");
            return;
        }
        int optInt = params.optInt("status");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("status = ");
        LIZ.append(optInt);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ), "AdLynxSuperLikeStatusMethod");
        C2U8.LIZ(new C37087Eh1(optInt));
        iReturn.onSuccess(null);
    }
}
