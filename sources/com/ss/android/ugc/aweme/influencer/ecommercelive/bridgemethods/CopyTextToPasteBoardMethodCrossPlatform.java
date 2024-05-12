package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import X.C36922EeM;
import X.C38049EwX;
import X.C76800UCe;
import X.C78857UxB;
import X.InterfaceC36488ETs;
import X.OHT;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CopyTextToPasteBoardMethodCrossPlatform extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public CopyTextToPasteBoardMethodCrossPlatform(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject params, InterfaceC36488ETs iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        String copiedText = params.optString("copied_text");
        Context actContext = getActContext();
        if (actContext != null) {
            o.LJIIIIZZ(copiedText, "copiedText");
            try {
                OHT.LIZ("label", copiedText, actContext, C78857UxB.LJJIIJ(1476399128, "bpea-225"));
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
