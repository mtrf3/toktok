package com.ss.android.ugc.aweme.fe.method;

import X.C2U8;
import X.C38049EwX;
import X.C40292Frc;
import X.InterfaceC36488ETs;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class GetWebViewInfo extends BaseCommonJavaMethod {
    public GetWebViewInfo() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public GetWebViewInfo(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        int i;
        WebView webView;
        C38049EwX c38049EwX = this.LJLILLLLZI;
        if (c38049EwX != null && (webView = c38049EwX.LIZ) != null) {
            i = webView.hashCode();
        } else {
            i = 0;
        }
        C2U8.LIZ(new C40292Frc(i, interfaceC36488ETs));
    }
}
