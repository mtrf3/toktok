package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VMI implements InterfaceC60279NlD {
    public static final VMI LJ = new VMI();
    public boolean LIZ;
    public final boolean LIZIZ = true;
    public final VMJ LIZJ = new VMJ();
    public final VN2 LIZLLL = new VN2();

    @Override // X.InterfaceC60279NlD
    public final void LJFF() {
    }

    @Override // X.OFM
    public final void handleCollectEvent(View view, String str, Object obj) {
    }

    public final boolean LJIL() {
        boolean z;
        if (this.LIZIZ && VMS.monitor.isEnabled() && VMS.webMonitor.isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (this.LIZ != z) {
            C07670Rv.LIZLLL("monitor enabled: ", z);
            this.LIZ = z;
        }
        return z;
    }

    public final void LJJI() {
        this.LIZLLL.getClass();
    }

    public VMI() {
        OFH.LIZLLL.getClass();
        OFH.LIZIZ.put("web", this);
        try {
            C36745EbV.LIZ(InterfaceC78286Uny.class, "com.bytedance.android.monitorV2.webview.blank.WebBlankDetectorDefault");
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
        C36745EbV.LIZ.toString();
    }

    public static boolean LJJ(WebResourceRequest webResourceRequest) {
        android.net.Uri url;
        String path;
        if (webResourceRequest != null && !webResourceRequest.isForMainFrame() && (url = webResourceRequest.getUrl()) != null && (path = url.getPath()) != null) {
            return path.endsWith("favicon.ico");
        }
        return false;
    }

    @Override // X.InterfaceC59622Nac
    public final void LJ(WebView webView) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("goBack: ");
        LIZ.append(C76927UHb.LIZ(webView));
        X1D.LIZIZ(LIZ);
        LJJI();
        try {
            if (LJIL() && this.LIZJ.LJFF(webView)) {
                VMJ vmj = this.LIZJ;
                vmj.getClass();
                o.LJIIJ(webView, "webView");
                VMK LIZJ = vmj.LIZJ(webView);
                LIZJ.LJ();
                LIZJ.LJII(false);
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    @Override // X.InterfaceC59622Nac
    public final void LJI(WebView webView) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(webView.getClass()));
        LIZ.append(" attachToWindow, container: ");
        LIZ.append(webView.getContext().getClass().getName());
        LIZ.append(", isTTWebEnable: ");
        this.LIZLLL.getClass();
        if (this.LIZLLL.LIZ && VMS.webTTWebDelegate.isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        LJJI();
        try {
            if (LJIL() && this.LIZJ.LJFF(webView)) {
                VMJ vmj = this.LIZJ;
                vmj.getClass();
                VMK LIZJ = vmj.LIZJ(webView);
                if (LIZJ.LJI == null) {
                    LIZJ.LJIIIIZZ();
                    LIZJ.LJI(EnumC79613VMj.ATTACHED);
                }
                WebView LIZLLL = LIZJ.LIZLLL();
                if (LIZLLL != null) {
                    OFI.LJIIJJI(LIZLLL, new C79620VMq(LIZJ));
                }
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    @Override // X.InterfaceC59622Nac
    public final void LJIIL(WebView webView) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroy: ");
        LIZ.append(C76927UHb.LIZ(webView));
        X1D.LIZIZ(LIZ);
        LJJI();
        try {
            if (LJIL()) {
                try {
                    this.LIZJ.LJIIJ(webView);
                } catch (Throwable th) {
                    C77117UOj.LJIIZILJ(th);
                }
            }
        } catch (Throwable th2) {
            C77117UOj.LJIIZILJ(th2);
        }
    }

    @Override // X.InterfaceC59622Nac
    public final void LJIILIIL(WebView webView) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reload: ");
        LIZ.append(C76927UHb.LIZ(webView));
        X1D.LIZIZ(LIZ);
        LJJI();
    }

    public final void LJIILJJIL(C60601NqP c60601NqP) {
        VMJ vmj = this.LIZJ;
        vmj.getClass();
        if (c60601NqP != null) {
            try {
                C60601NqP LIZ = VMJ.LIZ(c60601NqP);
                String[] strArr = LIZ.LIZIZ;
                if (strArr != null && strArr.length != 0) {
                    for (String objKey : strArr) {
                        HashMap<String, C60601NqP> hashMap = vmj.LIZIZ;
                        o.LJFF(objKey, "objKey");
                        hashMap.put(objKey, LIZ);
                    }
                }
                String[] strArr2 = LIZ.LIZ;
                if (strArr2 != null && strArr2.length != 0) {
                    for (String str : strArr2) {
                        vmj.LIZ.put(str, LIZ);
                    }
                }
                vmj.LIZJ.clear();
            } catch (Exception e) {
                C77117UOj.LJIIZILJ(e);
            }
        }
    }

    public final void LJIJJLI(WebView webView) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleViewCreate: ");
        LIZ.append(C76927UHb.LIZ(webView));
        X1D.LIZIZ(LIZ);
        LJJI();
        try {
            if (!LJIL() || webView == null) {
                return;
            }
            this.LIZJ.LJIIIZ(webView);
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    @Override // X.OFM
    public final String getMonitorBid(View view) {
        VMJ vmj = this.LIZJ;
        vmj.getClass();
        if (view instanceof WebView) {
            return vmj.LIZJ((WebView) view).LIZJ();
        }
        return "";
    }

    @Override // X.InterfaceC59622Nac
    public final void LIZ(WebView webView, String str) {
        C1JX.LJIIIIZZ("onPageFinished: ", str);
        LJJI();
        try {
            if (this.LIZJ.LJFF(webView)) {
                LJIJ(webView, str);
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    @Override // X.InterfaceC59622Nac
    public final void LIZIZ(WebView webView, String str) {
        C1JX.LJIIIIZZ("onPageStarted:", str);
        LJJI();
        VM4 vm4 = new VM4("navigationStart");
        try {
            vm4.LIZIZ();
            if (webView != null) {
                if (!this.LIZJ.LJFF(webView)) {
                    vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
                } else {
                    vm4.LJ.LJLIL = str;
                    try {
                        this.LIZJ.LJII(webView, vm4);
                    } catch (Throwable th) {
                        C77117UOj.LJIIZILJ(th);
                    }
                }
            }
        } catch (Throwable th2) {
            vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th2);
        }
    }

    @Override // X.InterfaceC59622Nac
    public final void LIZJ(WebView webView, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onProgressChanged: ");
        LIZ.append(C76927UHb.LIZ(webView));
        LIZ.append(", newProgress: ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        LJJI();
        try {
            if (LJIL() && webView != null) {
                try {
                    if (this.LIZJ.LJFF(webView)) {
                        this.LIZJ.LJIIIIZZ(webView, i);
                    }
                } catch (Throwable th) {
                    C77117UOj.LJIIZILJ(th);
                }
            }
        } catch (Throwable th2) {
            C77117UOj.LJIIZILJ(th2);
        }
    }

    @Override // X.InterfaceC59622Nac
    public final void LIZLLL(WebView webView, String str) {
        C1JX.LJIIIIZZ("onLoadUrl: ", str);
        LJJI();
        try {
            if (LJIL() && this.LIZJ.LJFF(webView) && !str.contains("javascript:")) {
                this.LIZJ.LJI(webView, str);
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    public final void LJIILL(WebView webView, C79604VMa c79604VMa) {
        VM5 LIZ = VM8.LIZ(c79604VMa);
        if (!LJIL()) {
            LIZ.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            return;
        }
        if (webView == null) {
            HybridMultiMonitor.getInstance().customReportInner(LIZ);
            return;
        }
        if (!this.LIZJ.LJFF(webView)) {
            LIZ.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            return;
        }
        VMJ vmj = this.LIZJ;
        vmj.getClass();
        VML vml = vmj.LIZJ(webView).LJII;
        if (vml != null) {
            vml.LJIIZILJ.LIZ(LIZ);
        } else {
            LIZ.onEventTerminated(EnumC65355Pkt.INVALID_CASE);
        }
    }

    public final void LJIJ(WebView webView, String url) {
        try {
            VMJ vmj = this.LIZJ;
            vmj.getClass();
            o.LJIIJ(webView, "webView");
            o.LJIIJ(url, "url");
            VML vml = vmj.LIZJ(webView).LJII;
            if (vml != null) {
                vml.LIZIZ().LJIIJJI = 3;
                C79578VLa LIZIZ = vml.LIZIZ();
                if (LIZIZ.LJFF == 0) {
                    LIZIZ.LJFF = System.currentTimeMillis();
                }
                vml.LJIIIIZZ();
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    public final void LJIJJ(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleRenderProcessGone: ");
        LIZ.append(C76927UHb.LIZ(webView));
        LIZ.append(", detail: ");
        LIZ.append(renderProcessGoneDetail);
        X1D.LIZIZ(LIZ);
        LJJI();
        VM4 vm4 = new VM4("nativeError");
        vm4.LIZIZ();
        try {
            if (!LJIL()) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
                return;
            }
            if (webView == null || renderProcessGoneDetail == null || TextUtils.isEmpty(webView.getUrl())) {
                vm4.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
                return;
            }
            if (!this.LIZJ.LJFF(webView)) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
                return;
            }
            this.LIZJ.LJ(webView, renderProcessGoneDetail);
            String str = "";
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("");
                LIZ2.append("cause by ");
                String LIZIZ = X1D.LIZIZ(LIZ2);
                if (renderProcessGoneDetail.didCrash()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(LIZIZ);
                    LIZ3.append("crash");
                    str = X1D.LIZIZ(LIZ3);
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(LIZIZ);
                    LIZ4.append("system");
                    str = X1D.LIZIZ(LIZ4);
                }
            }
            this.LIZJ.LIZLLL(webView, vm4, C38163EyN.LIZJ(webView.getUrl(), str, -10000, null, null));
        } catch (Throwable th) {
            vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th);
        }
    }

    @Override // X.OFM
    public final void customReport(View view, C79604VMa c79604VMa) {
        if (view instanceof WebView) {
            LJIILL((WebView) view, c79604VMa);
        }
    }

    @Override // X.InterfaceC59622Nac
    public final void LJII(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleRequestError: ");
        LIZ.append(C76927UHb.LIZ(webView));
        LIZ.append(", error: ");
        LIZ.append(webResourceError);
        X1D.LIZIZ(LIZ);
        LJJI();
        VM4 vm4 = new VM4("nativeError");
        vm4.LIZIZ();
        try {
            if (!LJIL()) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            } else if (webView == null || webResourceRequest == null || webResourceError == null || Build.VERSION.SDK_INT < 23) {
                vm4.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
            } else if (LJJ(webResourceRequest)) {
                vm4.onEventTerminated(EnumC65355Pkt.INVALID_CASE);
            } else if (!this.LIZJ.LJFF(webView)) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            } else {
                String uri = webResourceRequest.getUrl().toString();
                Boolean valueOf = Boolean.valueOf(webResourceRequest.isForMainFrame());
                this.LIZJ.LIZLLL(webView, vm4, C38163EyN.LIZJ(uri, webResourceError.getDescription().toString(), Integer.valueOf(webResourceError.getErrorCode()), 0, valueOf));
            }
        } catch (Throwable th) {
            vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th);
        }
    }

    @Override // X.InterfaceC60278NlC
    public final void LJIIIIZZ(C59614NaU c59614NaU, Object obj, String key) {
        String valueOf = String.valueOf(obj);
        if (!LJIL() || !this.LIZJ.LJFF(c59614NaU)) {
            return;
        }
        VMJ vmj = this.LIZJ;
        vmj.getClass();
        o.LJIIJ(key, "key");
        VML vml = vmj.LIZJ(c59614NaU).LJII;
        if (vml == null) {
            return;
        }
        vml.LJ.LLLLZ(valueOf, key);
    }

    @Override // X.InterfaceC59622Nac
    public final void LJIIIZ(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleRequestHttpError: ");
        LIZ.append(C76927UHb.LIZ(webView));
        LIZ.append(", request: ");
        LIZ.append(webResourceRequest);
        X1D.LIZIZ(LIZ);
        LJJI();
        VM4 vm4 = new VM4("nativeError");
        vm4.LIZIZ();
        try {
            if (!LJIL()) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            } else if (webView != null && webResourceRequest != null && webResourceResponse != null) {
                if (LJJ(webResourceRequest)) {
                    vm4.onEventTerminated(EnumC65355Pkt.INVALID_CASE);
                } else if (!this.LIZJ.LJFF(webView)) {
                    vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
                } else {
                    this.LIZJ.LIZLLL(webView, vm4, C38163EyN.LIZJ(webResourceRequest.getUrl().toString(), webResourceResponse.getReasonPhrase(), 0, Integer.valueOf(webResourceResponse.getStatusCode()), Boolean.valueOf(webResourceRequest.isForMainFrame())));
                }
            } else {
                vm4.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
            }
        } catch (Throwable th) {
            vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th);
        }
    }

    public final void LJIIZILJ(WebView webView, String str, JSONObject jSONObject) {
        C1JX.LJIIIIZZ("handleNativeInfo: eventTYpe: ", str);
        VM4 vm4 = new VM4(str);
        vm4.LIZIZ();
        try {
            if (!LJIL()) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
                return;
            }
            if (webView == null) {
                vm4.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
            } else if (!this.LIZJ.LJFF(webView)) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            } else {
                this.LIZJ.LIZLLL(webView, vm4, jSONObject);
            }
        } catch (Throwable th) {
            vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th);
        }
    }

    @Override // X.OFM
    public final void handleNativeInfo(View view, String str, JSONObject jSONObject) {
        if (view instanceof WebView) {
            LJIIZILJ((WebView) view, str, jSONObject);
        }
    }

    @Override // X.InterfaceC59622Nac
    public final void LJIIJ(WebView webView, int i, String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleRequestError: ");
        LIZ.append(C76927UHb.LIZ(webView));
        LIZ.append(", errorCode: ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        LJJI();
        VM4 vm4 = new VM4("nativeError");
        vm4.LIZIZ();
        try {
            if (!LJIL()) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            } else if (webView == null || str == null || str2 == null || Build.VERSION.SDK_INT >= 23) {
                vm4.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
            } else if (!this.LIZJ.LJFF(webView)) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            } else {
                this.LIZJ.LIZLLL(webView, vm4, C38163EyN.LIZJ(str2, str, Integer.valueOf(i), 0, Boolean.TRUE));
            }
        } catch (Throwable th) {
            vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th);
        }
    }

    public final void LJIJI(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pia_");
            LIZ.append(str);
            C79605VMb c79605VMb = new C79605VMb(X1D.LIZIZ(LIZ));
            c79605VMb.LIZLLL = jSONObject;
            c79605VMb.LJ = jSONObject2;
            c79605VMb.LJFF = null;
            c79605VMb.LJII = null;
            boolean z = false;
            c79605VMb.LIZIZ(0);
            c79605VMb.LJIIJJI = EnumC40073Fo5.Tea;
            C79604VMa LIZ2 = c79605VMb.LIZ();
            VM5 vm5 = new VM5();
            vm5.LJIIL = LIZ2;
            vm5.LIZIZ();
            if (!LJIL() || !this.LIZJ.LJFF(webView)) {
                z = true;
            }
            vm5.LJFF(z, EnumC65355Pkt.SWITCH_OFF);
            if (z) {
                return;
            }
            if (webView == null) {
                VMW.LIZLLL(vm5);
                return;
            }
            VMJ vmj = this.LIZJ;
            vmj.getClass();
            VML vml = vmj.LIZJ(webView).LJII;
            if (vml != null) {
                vml.LJIIZILJ.LIZ(vm5);
            } else {
                vm5.onEventTerminated(EnumC65355Pkt.INVALID_CASE);
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    @Override // X.OFM
    public final void handleContainerError(View view, String str, C35894E6w c35894E6w, C61659OHv c61659OHv) {
        VM4 vm4 = new VM4("containerError");
        vm4.LIZIZ();
        try {
            if (!LJIL()) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
                return;
            }
            if (view != null) {
                if (view instanceof WebView) {
                    vm4.LJIILIIL = c61659OHv.L();
                    this.LIZJ.LIZLLL((WebView) view, vm4, null);
                    return;
                }
                return;
            }
            vm4.LJI = c35894E6w;
            vm4.LJIILIIL = c61659OHv.L();
            VMT vmt = new VMT();
            vmt.LJLJJLL = c61659OHv.LJLJI;
            vmt.LJLJI = "web";
            C79616VMm.LIZ(str, null, vmt);
            vm4.LJ = vmt;
            vm4.LJIIL = new C79617VMn();
            VMW.LIZJ.LIZ(new OSZ<>(vm4, null));
        } catch (Throwable th) {
            vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th);
        }
    }

    @Override // X.InterfaceC61047Nxb
    public final void LJIIJJI(WebView webView, String str, String str2, String str3, String str4, String str5) {
        LJIILLIIL(webView, str, str2, C77123UOp.LJJJLL(str3), C77123UOp.LJJJLL(str4), C77123UOp.LJJJLL(str5), null);
    }

    public final void LJIILLIIL(WebView webView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("custom final: bid: ", "", ", url: ", str, ", eventName: ");
        LIZLLL.append(str2);
        X1D.LIZIZ(LIZLLL);
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        C79605VMb c79605VMb = new C79605VMb(str2);
        c79605VMb.LIZIZ = "";
        c79605VMb.LIZ = str;
        c79605VMb.LIZLLL = jSONObject;
        c79605VMb.LJ = jSONObject2;
        c79605VMb.LJFF = jSONObject3;
        c79605VMb.LJII = jSONObject4;
        c79605VMb.LIZIZ(0);
        LJIILL(webView, c79605VMb.LIZ());
    }
}
