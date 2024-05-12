package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import X.C36922EeM;
import X.C76800UCe;
import X.C78857UxB;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.OHT;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CopyTextToPasteBoardMethod extends BaseBridgeMethod {
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
    public CopyTextToPasteBoardMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "copyTextToPasteBoard";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        String copiedText = params.optString("copied_text");
        Context context = getContext();
        if (context != null) {
            o.LJIIIIZZ(copiedText, "copiedText");
            try {
                OHT.LIZ("label", copiedText, context, C78857UxB.LJJIIJ(1476399128, "bpea-224"));
            } catch (Exception e) {
                C36922EeM.LIZ(e);
            }
            iReturn.onSuccess(null);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        iReturn.LIZ(0, null);
    }
}
