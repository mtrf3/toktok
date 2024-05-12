package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C37019Efv;
import X.C37026Eg2;
import X.C37093Eh7;
import X.C79605VMb;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.VMI;
import X.VNS;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class GetAbTestMethod extends BaseBridgeMethod {
    public final String LJLIL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAbTestMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "getABTestParams";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (params.optJSONArray("ab_test_names") == null) {
            KeyEvent.Callback callback = (View) this.contextProviderFactory.LIZJ(View.class);
            if (callback == null && (callback = (WebView) this.contextProviderFactory.LIZJ(WebView.class)) == null) {
                callback = (View) this.contextProviderFactory.LIZJ(VNS.class);
            }
            if (callback instanceof VNS) {
                LynxViewMonitor.Companion.getClass();
                LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
                VNS vns = (VNS) callback;
                String str = this.LJLIL;
                C79605VMb c79605VMb = new C79605VMb(str);
                c79605VMb.LIZIZ = str;
                c79605VMb.LIZ = vns.getTemplateUrl();
                c79605VMb.LIZLLL = new JSONObject().put("from", "bullet").put("url", vns.getTemplateUrl()).put("business", C37093Eh7.LIZLLL(vns.getTemplateUrl())).put("container", "lynx");
                c79605VMb.LIZIZ(0);
                lynxViewMonitor.reportCustom(vns, c79605VMb.LIZ());
            } else if (callback instanceof WebView) {
                VMI vmi = VMI.LJ;
                WebView webView = (WebView) callback;
                String str2 = this.LJLIL;
                C79605VMb c79605VMb2 = new C79605VMb(str2);
                c79605VMb2.LIZIZ = str2;
                c79605VMb2.LIZ = webView.getUrl();
                c79605VMb2.LIZLLL = new JSONObject().put("from", "bullet").put("url", webView.getUrl()).put("business", C37093Eh7.LIZLLL(webView.getUrl())).put("container", "web");
                c79605VMb2.LIZIZ(0);
                vmi.LJIILL(webView, c79605VMb2.LIZ());
            }
        }
        C37019Efv c37019Efv = C37019Efv.LIZIZ;
        if (c37019Efv.LIZJ()) {
            c37019Efv.LIZ.LIZ(params, new AqS172S0100000_6(iReturn, 8), new AqS137S0200000_6(params, iReturn, 12));
        } else {
            C37026Eg2.LIZ.LIZJ(params, new AqS172S0100000_6(iReturn, 9), new AqS172S0100000_6(iReturn, 10));
        }
    }
}
