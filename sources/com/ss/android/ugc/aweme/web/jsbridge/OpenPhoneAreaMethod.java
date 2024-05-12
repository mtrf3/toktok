package com.ss.android.ugc.aweme.web.jsbridge;

import X.C38049EwX;
import X.C40303Frn;
import X.C45804HyK;
import X.HG3;
import X.InterfaceC36488ETs;
import X.InterfaceC65895Ptb;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class OpenPhoneAreaMethod extends BaseCommonJavaMethod {
    public OpenPhoneAreaMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenPhoneAreaMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        Activity activity;
        C40303Frn c40303Frn = new C40303Frn(interfaceC36488ETs);
        if (this.mContextRef.get() != null) {
            InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
            Context context = this.mContextRef.get();
            if (context != null) {
                activity = C45804HyK.LJIJJ(context);
            } else {
                activity = null;
            }
            LJIIIIZZ.openCountryListActivity(activity, c40303Frn);
        }
    }
}
