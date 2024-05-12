package com.ss.android.ugc.aweme.fe.method;

import X.InterfaceC36488ETs;
import X.QJY;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ApiParamMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        HashMap hashMap = new HashMap();
        QJY.LJI(hashMap, true);
        interfaceC36488ETs.onSuccess(new JSONObject(hashMap));
    }
}
