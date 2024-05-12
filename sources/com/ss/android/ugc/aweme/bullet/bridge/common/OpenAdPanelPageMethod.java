package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.EF7;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.NNC;
import X.NNR;
import X.NNS;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OpenAdPanelPageMethod extends BaseBridgeMethod {
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
    public OpenAdPanelPageMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "openAdPanelPage";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        String url = params.optString("url");
        boolean z = false;
        int optInt = params.optInt("landingStyle", 0);
        try {
            Context context = getContext();
            if (context == null) {
                context = EF7.LIZIZ();
            }
            o.LJIIIIZZ(url, "url");
            NNS nns = new NNS();
            nns.LJIIIIZZ(url);
            nns.LJIIL(url);
            NNR nnr = nns.LIZ;
            nnr.LIZIZ.LJIJ = optInt;
            z = NNC.LIZ(context, nnr).LIZ();
        } catch (Throwable unused) {
        }
        if (z) {
            iReturn.LIZJ(1, null, null);
        } else {
            iReturn.LIZ(-1, "Can not handle url");
        }
    }
}
