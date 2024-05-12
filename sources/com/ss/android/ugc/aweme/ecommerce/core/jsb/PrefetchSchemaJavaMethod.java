package com.ss.android.ugc.aweme.ecommerce.core.jsb;

import X.C38049EwX;
import X.InterfaceC36488ETs;
import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class PrefetchSchemaJavaMethod extends BaseCommonJavaMethod {
    public final C38049EwX LJLJI;

    public PrefetchSchemaJavaMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public PrefetchSchemaJavaMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = c38049EwX;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        Context context;
        WebView webView;
        if (interfaceC36488ETs != null) {
            C38049EwX c38049EwX = this.LJLJI;
            String str = null;
            if (c38049EwX != null && (webView = c38049EwX.LIZ) != null) {
                context = webView.getContext();
            } else {
                context = null;
            }
            if (jSONObject != null) {
                str = jSONObject.optString("schema");
            }
            IECommerceService createIECommerceServicebyMonsterPlugin = ECommerceService.createIECommerceServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createIECommerceServicebyMonsterPlugin, "get().getService(IECommerceService::class.java)");
            createIECommerceServicebyMonsterPlugin.prefetchSchema(str, context);
            interfaceC36488ETs.onSuccess(new JSONObject());
        }
    }
}
