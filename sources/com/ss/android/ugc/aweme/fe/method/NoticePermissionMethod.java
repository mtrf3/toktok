package com.ss.android.ugc.aweme.fe.method;

import X.C16880lQ;
import X.C38049EwX;
import X.C40322Fs6;
import X.C45804HyK;
import X.InterfaceC36488ETs;
import X.V1B;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class NoticePermissionMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public NoticePermissionMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        Activity LJIJJ;
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = null;
        if (weakReference != null) {
            context = weakReference.get();
        }
        if (!(context instanceof Activity) || (LJIJJ = C45804HyK.LJIJJ(context)) == null || !V1B.LJJZZI(LJIJJ, true)) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("toOpen"));
        boolean LIZJ = C40322Fs6.LIZJ(context);
        if (!LIZJ && valueOf.booleanValue()) {
            try {
                C40322Fs6.LIZLLL(context);
            } catch (Exception unused) {
                C16880lQ.LIZJ(context, new Intent("android.settings.SETTINGS"));
            }
        }
        if (LIZJ) {
            interfaceC36488ETs.onSuccess("");
        } else {
            interfaceC36488ETs.LIZ(0, "");
        }
    }
}
