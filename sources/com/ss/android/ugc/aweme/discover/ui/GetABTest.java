package com.ss.android.ugc.aweme.discover.ui;

import X.C37019Efv;
import X.C37026Eg2;
import X.C37093Eh7;
import X.C38049EwX;
import X.C79605VMb;
import X.InterfaceC36488ETs;
import X.VMI;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class GetABTest extends BaseCommonJavaMethod {
    public final WeakReference<WebView> LJLJI;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public GetABTest() {
    }

    public GetABTest(WebView webView, C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = new WeakReference<>(webView);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        WeakReference<WebView> weakReference;
        WebView webView;
        if ((jSONObject == null || jSONObject.optJSONArray("ab_test_names") == null) && (weakReference = this.LJLJI) != null && (webView = weakReference.get()) != null) {
            VMI vmi = VMI.LJ;
            C79605VMb c79605VMb = new C79605VMb("getABTestParams");
            c79605VMb.LIZIZ = "getABTestParams";
            c79605VMb.LIZLLL = new JSONObject().put("from", "crossPlatform").put("url", webView.getUrl()).put("business", C37093Eh7.LIZLLL(webView.getUrl())).put("container", "web");
            c79605VMb.LIZ = webView.getUrl();
            c79605VMb.LIZIZ(0);
            vmi.LJIILL(webView, c79605VMb.LIZ());
        }
        C37019Efv c37019Efv = C37019Efv.LIZIZ;
        if (c37019Efv.LIZJ()) {
            c37019Efv.LIZ.LIZ(jSONObject, new AqS172S0100000_6(interfaceC36488ETs, 13), new AqS137S0200000_6(jSONObject, interfaceC36488ETs, 13));
        } else {
            C37026Eg2.LIZ.LIZJ(jSONObject, new AqS172S0100000_6(interfaceC36488ETs, 14), new AqS172S0100000_6(interfaceC36488ETs, 15));
        }
    }
}
