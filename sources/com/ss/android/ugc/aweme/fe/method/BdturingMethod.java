package com.ss.android.ugc.aweme.fe.method;

import X.C38049EwX;
import X.C40297Frh;
import X.InterfaceC36488ETs;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class BdturingMethod extends BaseCommonJavaMethod {
    public BdturingMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public BdturingMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String str;
        Activity activity;
        Context context = null;
        if (jSONObject == null || (str = jSONObject.optString("decision")) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.onSuccess(1);
                return;
            }
            return;
        }
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null) {
            context = weakReference.get();
        }
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            SecApiImpl.LIZ().popCaptchaV2(activity, str, new C40297Frh(interfaceC36488ETs));
        }
    }
}
