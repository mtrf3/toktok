package com.ss.android.ugc.aweme.fe.method.commerce;

import X.InterfaceC36488ETs;
import X.InterfaceC40275FrL;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class RefreshNavTitleMethod extends BaseCommonJavaMethod {
    public final InterfaceC40275FrL LJLJI;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public RefreshNavTitleMethod(InterfaceC40275FrL eventObserver) {
        o.LJIIIZ(eventObserver, "eventObserver");
        this.LJLJI = eventObserver;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String optString;
        if (jSONObject != null && (optString = jSONObject.optString("title")) != null) {
            this.LJLJI.LIZ(optString);
        }
    }
}
