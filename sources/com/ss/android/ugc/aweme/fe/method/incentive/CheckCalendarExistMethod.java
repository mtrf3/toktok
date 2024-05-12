package com.ss.android.ugc.aweme.fe.method.incentive;

import X.C38049EwX;
import X.C84763XOl;
import X.InterfaceC36488ETs;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CheckCalendarExistMethod extends BaseCommonJavaMethod {
    public CheckCalendarExistMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public CheckCalendarExistMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String optString;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            return;
        }
        if (jSONObject == null) {
            optString = "";
        } else {
            optString = jSONObject.optString("identifier");
            o.LJIIIIZZ(optString, "params.optString(\"identifier\")");
        }
        int i = 1;
        if (optString.length() == 0) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(-1, "Parameter invalid");
            }
        } else {
            if (!SpecActServiceImpl.LJJJIL().LJJ(LJIIIIZZ, optString)) {
                i = 2;
            }
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZJ(i, "", "");
            }
        }
    }
}
