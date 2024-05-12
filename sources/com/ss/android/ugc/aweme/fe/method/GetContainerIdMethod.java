package com.ss.android.ugc.aweme.fe.method;

import X.AbstractC59640Nau;
import X.C38049EwX;
import X.C59866NeY;
import X.F0E;
import X.InterfaceC36488ETs;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class GetContainerIdMethod extends BaseCommonJavaMethod {
    public GetContainerIdMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public GetContainerIdMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String str;
        F0E f0e;
        AbstractC59640Nau abstractC59640Nau;
        if (interfaceC36488ETs != null) {
            JSONObject jSONObject2 = new JSONObject();
            WeakReference<F0E> weakReference = this.LJLIL;
            if (weakReference != null && (f0e = weakReference.get()) != null && (abstractC59640Nau = (AbstractC59640Nau) f0e.LIZ(C59866NeY.class)) != null) {
                str = abstractC59640Nau.LJJIJ();
            } else {
                str = "";
            }
            jSONObject2.put("container_id", str);
            interfaceC36488ETs.onSuccess(jSONObject2);
        }
    }
}
