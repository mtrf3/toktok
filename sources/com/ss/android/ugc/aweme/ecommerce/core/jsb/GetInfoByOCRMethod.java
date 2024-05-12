package com.ss.android.ugc.aweme.ecommerce.core.jsb;

import X.C38049EwX;
import X.C78983UzD;
import X.C82954Wh4;
import X.InterfaceC36488ETs;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class GetInfoByOCRMethod extends BaseCommonJavaMethod {
    public static final C82954Wh4 LJLJI = new C82954Wh4();

    public GetInfoByOCRMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public GetInfoByOCRMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        try {
            LJLJI.getClass();
            C82954Wh4.LIZ(null, interfaceC36488ETs, jSONObject);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(-1, e.toString());
            }
        }
    }
}
