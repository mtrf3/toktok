package com.ss.android.ugc.aweme.fe.method;

import X.C16880lQ;
import X.C38049EwX;
import X.InterfaceC36488ETs;
import Y.ARunnableS7S1100000_6;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ShowToastMethod extends BaseCommonJavaMethod {
    public ShowToastMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public ShowToastMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String optString;
        if (jSONObject == null || (optString = jSONObject.optString("message")) == null) {
            return;
        }
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS7S1100000_6(this.mContextRef.get(), optString, 5));
    }
}
