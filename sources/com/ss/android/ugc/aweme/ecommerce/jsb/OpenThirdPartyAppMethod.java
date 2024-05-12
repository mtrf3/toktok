package com.ss.android.ugc.aweme.ecommerce.jsb;

import X.AnonymousClass004;
import X.C38049EwX;
import X.C45804HyK;
import X.C78857UxB;
import X.EF7;
import X.InterfaceC36488ETs;
import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OpenThirdPartyAppMethod extends BaseCommonJavaMethod {
    public final C38049EwX LJLJI;

    public OpenThirdPartyAppMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenThirdPartyAppMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = c38049EwX;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        WebView webView;
        Context context;
        Activity LJIJJ;
        String str;
        C38049EwX c38049EwX = this.LJLJI;
        if (c38049EwX != null && (webView = c38049EwX.LIZ) != null && (context = webView.getContext()) != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            String str2 = null;
            if (jSONObject != null) {
                str = jSONObject.optString("url");
                str2 = jSONObject.optString("packageName");
            } else {
                str = null;
            }
            if (C78857UxB.LJJIZ(EF7.LIZIZ(), str2)) {
                try {
                    AnonymousClass004 anonymousClass004 = new AnonymousClass004();
                    anonymousClass004.LIZ().LIZ.setPackage(str2);
                    anonymousClass004.LIZ().LIZ(LJIJJ, UriProtector.parse(str));
                    if (interfaceC36488ETs != null) {
                        interfaceC36488ETs.onSuccess(new JSONObject());
                        return;
                    }
                    return;
                } catch (Exception e) {
                    if (interfaceC36488ETs != null) {
                        interfaceC36488ETs.LIZ(-1, e.toString());
                        return;
                    }
                    return;
                }
            }
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(-1, "app not installed");
            }
        }
    }
}
