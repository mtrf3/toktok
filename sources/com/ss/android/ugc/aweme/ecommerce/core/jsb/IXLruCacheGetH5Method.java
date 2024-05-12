package com.ss.android.ugc.aweme.ecommerce.core.jsb;

import X.C38049EwX;
import X.C73762uy;
import X.InterfaceC36488ETs;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class IXLruCacheGetH5Method extends BaseCommonJavaMethod {
    public final C38049EwX LJLJI;

    public IXLruCacheGetH5Method() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public IXLruCacheGetH5Method(C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = c38049EwX;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        WebView webView;
        if (interfaceC36488ETs != null) {
            C38049EwX c38049EwX = this.LJLJI;
            if (c38049EwX != null && (webView = c38049EwX.LIZ) != null) {
                webView.getContext();
            }
            interfaceC36488ETs.onSuccess(C73762uy.LIZ(jSONObject));
        }
    }
}
