package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C40293Frd;
import X.C45804HyK;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.InterfaceC60187Njj;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class BdturingMethod extends BaseBridgeMethod {
    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return "popTuringVerifyView";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BdturingMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Activity activity;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        InterfaceC60187Njj activityWrapper = getActivityWrapper();
        if (activityWrapper == null || (activity = activityWrapper.getActivity()) == null) {
            Context context = getContext();
            if (context != null) {
                activity = C45804HyK.LJIJJ(context);
            } else {
                activity = null;
            }
        }
        String optString = params.optString("decision");
        if (optString == null) {
            optString = "";
        }
        if (activity == null || TextUtils.isEmpty(optString)) {
            iReturn.onSuccess(1);
        } else {
            SecApiImpl.LIZ().popCaptchaV2(activity, optString, new C40293Frd(iReturn));
        }
    }
}
