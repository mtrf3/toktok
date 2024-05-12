package com.ss.android.ugc.aweme.fe.method;

import X.C16880lQ;
import X.C38049EwX;
import X.C9X3;
import X.InterfaceC36488ETs;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class SetNativeItemMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SetNativeItemMethod() {
    }

    public SetNativeItemMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "key");
            if (C9X3.LIZ.LIZJ(JSONObjectProtectorUtils.getString(jSONObject, "value"), string)) {
                interfaceC36488ETs.onSuccess(null);
            } else {
                interfaceC36488ETs.LIZ(-1, "");
            }
        } catch (Exception e) {
            interfaceC36488ETs.LIZ(-1, "");
            C16880lQ.LLLLIIL(e);
        }
    }
}
