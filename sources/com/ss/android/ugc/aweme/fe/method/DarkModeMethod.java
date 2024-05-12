package com.ss.android.ugc.aweme.fe.method;

import X.C38049EwX;
import X.C76800UCe;
import X.InterfaceC36488ETs;
import X.JF3;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class DarkModeMethod extends BaseCommonJavaMethod {
    public DarkModeMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public DarkModeMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String str = null;
        if (jSONObject != null) {
            str = jSONObject.optString("enable");
        }
        try {
            WeakReference<Context> weakReference = this.mContextRef;
            if (weakReference != null) {
                Context context = weakReference.get();
                o.LJII(context, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) context;
                JF3.LIZIZ(activity, activity.getWindow(), TextUtils.equals(str, "true"));
                if (interfaceC36488ETs != null) {
                    interfaceC36488ETs.onSuccess(new JSONObject());
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(-1, "context is null");
            }
        } catch (Exception e) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, e.getMessage());
            }
        }
    }
}
