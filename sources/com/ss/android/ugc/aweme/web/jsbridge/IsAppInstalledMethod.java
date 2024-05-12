package com.ss.android.ugc.aweme.web.jsbridge;

import X.C38049EwX;
import X.C78857UxB;
import X.EF7;
import X.InterfaceC36488ETs;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class IsAppInstalledMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public IsAppInstalledMethod() {
    }

    public IsAppInstalledMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String string = JSONObjectProtectorUtils.getString(jSONObject, "packageName");
        if (C78857UxB.LJJIZ(EF7.LIZIZ(), string)) {
            interfaceC36488ETs.onSuccess(new JSONObject());
        } else {
            interfaceC36488ETs.LIZ(-1, string);
        }
    }
}
