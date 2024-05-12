package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import X.C38049EwX;
import X.C76800UCe;
import X.InterfaceC36488ETs;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import defpackage.g0;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class SendEmailMethodCrossPlatform extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SendEmailMethodCrossPlatform(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject params, InterfaceC36488ETs iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        String email = params.optString("email");
        String subject = params.optString("subject");
        String content = params.optString("content");
        Context actContext = getActContext();
        if (actContext != null) {
            o.LJIIIIZZ(email, "email");
            o.LJIIIIZZ(subject, "subject");
            o.LJIIIIZZ(content, "content");
            g0.LJJIJLIJ(actContext, subject, content, new String[]{email});
            iReturn.onSuccess(null);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        iReturn.LIZ(0, null);
    }
}
