package com.ss.android.ugc.aweme.ecommerce.core.jsb;

import X.C38049EwX;
import X.InterfaceC36488ETs;
import X.QDL;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class PhoneCountryCodeTranslateMethod extends BaseCommonJavaMethod {
    public PhoneCountryCodeTranslateMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public PhoneCountryCodeTranslateMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.onSuccess(QDL.LIZ(jSONObject));
        }
    }
}
