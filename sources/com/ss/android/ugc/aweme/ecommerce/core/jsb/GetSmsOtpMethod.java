package com.ss.android.ugc.aweme.ecommerce.core.jsb;

import X.C29S;
import X.C38049EwX;
import X.C45804HyK;
import X.C62060OXg;
import X.InterfaceC36488ETs;
import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class GetSmsOtpMethod extends BaseCommonJavaMethod {
    public static final /* synthetic */ int LJLJJI = 0;
    public final C38049EwX LJLJI;

    public GetSmsOtpMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public GetSmsOtpMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = c38049EwX;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        Activity activity;
        C29S c29s;
        WebView webView;
        Context context;
        C38049EwX c38049EwX = this.LJLJI;
        if (c38049EwX != null && (webView = c38049EwX.LIZ) != null && (context = webView.getContext()) != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        if (activity instanceof C29S) {
            c29s = (C29S) activity;
        } else {
            c29s = null;
        }
        C62060OXg.LIZ(interfaceC36488ETs, null, c29s);
    }
}
