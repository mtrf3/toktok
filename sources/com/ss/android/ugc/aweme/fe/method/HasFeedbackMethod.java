package com.ss.android.ugc.aweme.fe.method;

import X.C38049EwX;
import X.C40278FrO;
import X.InterfaceC36488ETs;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class HasFeedbackMethod extends BaseCommonJavaMethod {
    public HasFeedbackMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public HasFeedbackMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        if (C40278FrO.LIZ == null) {
            C40278FrO.LIZ = Keva.getRepo("HasFeedbackKeva");
        }
        Keva keva = C40278FrO.LIZ;
        if (keva != null) {
            keva.storeBoolean("has", true);
        }
    }
}
