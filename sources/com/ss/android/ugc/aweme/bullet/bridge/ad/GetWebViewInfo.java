package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C2U8;
import X.C38049EwX;
import X.C40307Frr;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class GetWebViewInfo extends BaseBridgeMethod {
    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return "getWebViewInfo";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWebViewInfo(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        int i;
        WebView webView;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        C38049EwX c38049EwX = (C38049EwX) this.contextProviderFactory.LIZJ(C38049EwX.class);
        if (c38049EwX != null && (webView = c38049EwX.LIZ) != null) {
            i = webView.hashCode();
        } else {
            i = 0;
        }
        C2U8.LIZ(new C40307Frr(i, iReturn));
    }
}
