package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import X.C76800UCe;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.O5Y;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class OpenWhatsAppChatMethod extends BaseBridgeMethod {
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
    public OpenWhatsAppChatMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "routeToWhatsapp";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        String phone = params.optString("phone");
        String optString = params.optString("text");
        Context context = getContext();
        if (context != null) {
            o.LJIIIIZZ(phone, "phone");
            if (O5Y.LJJIIZI(context, phone, optString)) {
                iReturn.onSuccess(null);
            } else {
                iReturn.LIZ(0, null);
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        iReturn.LIZ(0, null);
    }
}
