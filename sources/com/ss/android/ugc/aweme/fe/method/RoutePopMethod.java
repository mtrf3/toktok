package com.ss.android.ugc.aweme.fe.method;

import X.C38049EwX;
import X.C78983UzD;
import X.F0E;
import X.InterfaceC36488ETs;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class RoutePopMethod extends BaseCommonJavaMethod {
    public RoutePopMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public RoutePopMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        F0E f0e;
        AbsActivityContainer absActivityContainer;
        WeakReference<F0E> weakReference = this.LJLIL;
        if (weakReference != null && (f0e = weakReference.get()) != null && (absActivityContainer = (AbsActivityContainer) f0e.LIZ(AbsActivityContainer.class)) != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject2, jSONObject);
            }
            Intent intent = new Intent();
            intent.putExtra("serialized_data", jSONObject2.toString());
            absActivityContainer.LJIJ(LiveExchangeConfirmThreshold.DEFAULT, intent);
            absActivityContainer.LJIIL();
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZJ(1, "pop succeed", new JSONObject());
                return;
            }
            return;
        }
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZ(-1, "params not valid");
        }
    }
}
