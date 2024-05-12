package com.ss.android.ugc.aweme.web.jsbridge;

import X.C16880lQ;
import X.C38049EwX;
import X.C45804HyK;
import X.C61971OTv;
import X.HG3;
import X.InterfaceC36488ETs;
import X.OGC;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.MutableContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OpenThirdLoginVerifyMethod extends BaseCommonJavaMethod {
    public final C38049EwX LJLJI;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenThirdLoginVerifyMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = c38049EwX;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String str;
        Activity LJIJJ;
        if (this.mContextRef == null || this.LJLJI == null) {
            return;
        }
        if (jSONObject != null) {
            str = JSONObjectProtectorUtils.getString(jSONObject, "platform");
        } else {
            str = null;
        }
        Context context = this.mContextRef.get();
        while (context instanceof MutableContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!OGC.LIZ(context, new C61971OTv(interfaceC36488ETs, str))) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "");
            }
        } else {
            if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null) {
                return;
            }
            Intent authorizeActivityStartIntent = HG3.LJFF().getAuthorizeActivityStartIntent(LJIJJ);
            authorizeActivityStartIntent.putExtra("platform", str);
            authorizeActivityStartIntent.putExtra("is_login", false);
            authorizeActivityStartIntent.putExtra("is_only_fetch_token", true);
            C16880lQ.LJFF(LJIJJ, 10000, authorizeActivityStartIntent);
        }
    }
}
