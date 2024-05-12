package X;

import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VMJ {
    public final HashMap<String, C60601NqP> LIZ = new HashMap<>();
    public final HashMap<String, C60601NqP> LIZIZ = new HashMap<>();
    public final HashSet<String> LIZJ = new HashSet<>();
    public volatile WeakHashMap<View, VMK> LIZLLL;
    public boolean LJ;

    public VMJ() {
        new Handler(C16880lQ.LLJJJJ());
        this.LIZLLL = new WeakHashMap<>();
    }

    public static C60601NqP LIZ(C60601NqP c60601NqP) {
        String str;
        String str2;
        String[] strArr;
        JSONArray LJJJJIZL;
        boolean optBoolean;
        String LJ;
        C60601NqP c60601NqP2 = new C60601NqP();
        c60601NqP.LJFF = c60601NqP.LJFF;
        c60601NqP2.LJI = c60601NqP.LJI;
        if (!TextUtils.isEmpty(c60601NqP.LJIIJJI)) {
            str = c60601NqP.LJIIJJI;
        } else {
            str = null;
        }
        c60601NqP2.LJIIJJI = str;
        c60601NqP2.LJ = c60601NqP.LJ;
        c60601NqP2.LIZJ = c60601NqP.LIZJ;
        c60601NqP2.LIZIZ = c60601NqP.LIZIZ;
        c60601NqP2.LIZ = c60601NqP.LIZ;
        c60601NqP2.LJFF = c60601NqP.LJFF;
        c60601NqP2.LJII = c60601NqP.LJII;
        if (TextUtils.isEmpty(c60601NqP.LJIIJ)) {
            str2 = "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});";
        } else {
            str2 = c60601NqP.LJIIJ;
        }
        c60601NqP2.LJIIJ = str2;
        c60601NqP2.LJIIIIZZ = c60601NqP.LJIIIIZZ;
        c60601NqP2.LJIIIZ = c60601NqP.LJIIIZ;
        if (!TextUtils.isEmpty(c60601NqP.LIZLLL)) {
            JSONObject LJJJLL = C77123UOp.LJJJLL(c60601NqP.LIZLLL);
            if (C77123UOp.LJJJJJL("webview_classes", LJJJLL) == null) {
                strArr = c60601NqP2.LIZ;
            } else {
                String str3 = c60601NqP.LIZLLL;
                o.LJFF(str3, "config.mSettingConfig");
                strArr = new String[0];
                if (!TextUtils.isEmpty(str3) && (LJJJJIZL = C77123UOp.LJJJJIZL("webview_classes", C77123UOp.LJJJLL(str3))) != null) {
                    strArr = new String[LJJJJIZL.length()];
                    int length = LJJJJIZL.length();
                    for (int i = 0; i < length; i++) {
                        try {
                            strArr[i] = JSONArrayProtectorUtils.getString(LJJJJIZL, i);
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
            c60601NqP2.LIZ = strArr;
            if (C77123UOp.LJJJJJL("webview_is_need_monitor", LJJJLL) == null) {
                optBoolean = c60601NqP2.LJ;
            } else {
                String str4 = c60601NqP.LIZLLL;
                o.LJFF(str4, "config.mSettingConfig");
                optBoolean = C77123UOp.LJJJLL(str4).optBoolean("webview_is_need_monitor", false);
            }
            c60601NqP2.LJ = optBoolean;
            if (TextUtils.isEmpty(c60601NqP.LIZLLL)) {
                LJ = c60601NqP2.LJIIJ;
            } else {
                C79610VMg c79610VMg = new C79610VMg(c60601NqP.LIZLLL);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                C77123UOp.LJJJLIIL(jSONObject, "monitors", jSONObject2);
                C77123UOp.LJJJLIIL(jSONObject, "sendCommonParams", c79610VMg.LJ);
                C79610VMg.LIZ(jSONObject2, c79610VMg.LIZ);
                C79610VMg.LIZ(jSONObject2, c79610VMg.LIZIZ);
                C79610VMg.LIZ(jSONObject2, c79610VMg.LIZJ);
                C79610VMg.LIZ(jSONObject2, c79610VMg.LIZLLL);
                LJ = a1.LJ("SlardarHybrid('config', ", jSONObject.toString(), ")");
            }
            c60601NqP2.LJIIJ = LJ;
        }
        return c60601NqP2;
    }

    public final C58715N2p LIZIZ(WebView webView) {
        Class<?> cls;
        Class<?> cls2;
        C60601NqP c60601NqP;
        if (webView == null) {
            return new C58715N2p("view is null", null);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(String.valueOf(webView.hashCode()));
        LIZ.append("");
        String LIZIZ = X1D.LIZIZ(LIZ);
        String name = webView.getClass().getName();
        C60601NqP c60601NqP2 = this.LIZIZ.get(LIZIZ);
        if (c60601NqP2 != null) {
            return new C58715N2p(C0ON.LIZJ("mWebViewObjs:", LIZIZ, " viewClass:", name), c60601NqP2);
        }
        C60601NqP c60601NqP3 = this.LIZ.get(name);
        if (c60601NqP3 != null) {
            return new C58715N2p(i0.LJFF("mWebViewClasses:", name), c60601NqP3);
        }
        if (this.LIZJ.contains(name)) {
            return new C58715N2p("webViewClazz in mWebViewMissClasses", null);
        }
        Iterator it = new HashSet(this.LIZ.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                cls = Class.forName(name);
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
                cls = null;
            }
            try {
                cls2 = Class.forName(str);
            } catch (Throwable th2) {
                C77117UOj.LJIIZILJ(th2);
                cls2 = null;
            }
            if (cls != null && cls2 != null && cls2.isAssignableFrom(cls) && (c60601NqP = this.LIZ.get(str)) != null) {
                this.LIZ.put(name, c60601NqP);
                return new C58715N2p(a1.LJ(name, " isAssignedFrom:", str), c60601NqP);
            }
        }
        this.LIZJ.add(name);
        return new C58715N2p("objects classes superclass all miss", null);
    }

    public final VMK LIZJ(WebView webView) {
        VMK vmk = this.LIZLLL.get(webView);
        if (vmk == null) {
            VMK vmk2 = new VMK(new WeakReference(webView), this);
            this.LIZLLL.put(webView, vmk2);
            return vmk2;
        }
        return vmk;
    }

    public final boolean LJFF(WebView webView) {
        boolean z;
        try {
            C60601NqP c60601NqP = LIZIZ(webView).LIZIZ;
            if (c60601NqP != null) {
                z = c60601NqP.LJ;
            } else {
                z = true;
            }
        } catch (Exception e) {
            C77117UOj.LJIIZILJ(e);
            z = false;
        }
        if (this.LJ != z) {
            C07670Rv.LIZLLL("isNeedMonitor: ", z);
            this.LJ = z;
        }
        return z;
    }

    public final void LJIIIZ(WebView webView) {
        o.LJIIJ(webView, "webView");
        VMK LIZJ = LIZJ(webView);
        LIZJ.LJII = new VML(LIZJ);
        LIZJ.LJI(EnumC79613VMj.CREATED);
        WebView LIZLLL = LIZJ.LIZLLL();
        if (LIZLLL != null) {
            if (LIZJ.LJI == null) {
                LIZJ.LJI = new ViewOnAttachStateChangeListenerC79609VMf(LIZJ);
            }
            ViewOnAttachStateChangeListenerC79609VMf viewOnAttachStateChangeListenerC79609VMf = LIZJ.LJI;
            if (viewOnAttachStateChangeListenerC79609VMf != null) {
                LIZLLL.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC79609VMf);
                LIZLLL.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC79609VMf);
            }
        }
        LIZJ.LJIIIIZZ();
    }

    public final void LJIIJ(WebView webView) {
        ViewOnAttachStateChangeListenerC79609VMf viewOnAttachStateChangeListenerC79609VMf;
        o.LJIIJ(webView, "webView");
        VMK LIZJ = LIZJ(webView);
        LIZJ.LIZIZ();
        LIZJ.LJI(EnumC79613VMj.DESTROYED);
        WebView LIZLLL = LIZJ.LIZLLL();
        if (LIZLLL != null && (viewOnAttachStateChangeListenerC79609VMf = LIZJ.LJI) != null) {
            LIZLLL.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC79609VMf);
        }
        VMR vmr = LIZJ.LJIILIIL;
        if (vmr != null) {
            vmr.LJ = false;
            vmr.LJIIIIZZ = null;
            LIZJ.LJIILIIL = null;
        }
        OFI.LIZ(LIZJ.LJIILJJIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(String.valueOf(webView.hashCode()));
        LIZ.append("");
        this.LIZIZ.remove(X1D.LIZIZ(LIZ));
        VMI vmi = VMI.LJ;
        o.LJFF(vmi, "WebViewMonitorHelper.getInstance()");
        vmi.LIZLLL.getClass();
    }

    public final void LJ(WebView webView, RenderProcessGoneDetail detail) {
        o.LJIIJ(webView, "webView");
        o.LJIIJ(detail, "detail");
        VMK LIZJ = LIZJ(webView);
        WebView LIZLLL = LIZJ.LIZLLL();
        if (LIZLLL != null) {
            String url = LIZLLL.getUrl();
            if (!TextUtils.isEmpty(url) && LIZJ.LJII == null) {
                o.LJFF(url, "url");
                LIZJ.LJII = new VML(LIZJ, url);
            }
        }
        VMI vmi = VMI.LJ;
        o.LJFF(vmi, "WebViewMonitorHelper.getInstance()");
        vmi.LIZLLL.getClass();
    }

    public final void LJI(WebView webView, String url) {
        String str;
        o.LJIIJ(webView, "webView");
        o.LJIIJ(url, "url");
        VMK LIZJ = LIZJ(webView);
        LIZJ.LJ++;
        LIZJ.LJFF.put(url, Long.valueOf(System.currentTimeMillis()));
        if (TextUtils.isEmpty(url) || o.LJ("about:blank", url)) {
            VML vml = LIZJ.LJII;
            if (vml != null) {
                str = vml.LIZ;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && (!o.LJ(str, "about:blank"))) {
                LIZJ.LJII(false);
                LIZJ.LJ();
            }
        }
        LinkedHashMap LIZIZ = JF1.LIZIZ("engine_type", "web", "url", url);
        WebView webView2 = LIZJ.LJIL.get();
        if (webView2 != null) {
            List LIZLLL = OFI.LIZLLL(webView2);
            if (!LIZLLL.isEmpty()) {
                String containerId = (String) ListProtector.get(LIZLLL, 0);
                o.LJIIJ(containerId, "containerId");
                Object obj = OFI.LIZIZ(containerId).get("container_name");
                if (obj != null) {
                    LIZIZ.put("container_name", obj);
                }
            }
        }
        if (C77318UWc.LJLILLLLZI || !C40062Fnu.LIZ(url)) {
            OFP ofp = OFP.UnresponsiveDetection;
            if (!ofp.not()) {
                VMR vmr = LIZJ.LJIILIIL;
                if (vmr != null) {
                    vmr.LJ = false;
                    vmr.LJIIIIZZ = null;
                    LIZJ.LJIILIIL = null;
                }
                VMR vmr2 = new VMR(LIZJ.LJIL, ofp.getLongOption("detect_interval", 1000L), ofp.getIntOption("latency_threshold", 5), new VM7(LIZJ));
                LIZJ.LJIILIIL = vmr2;
                WebView webView3 = vmr2.LJFF.get();
                if (webView3 != null && (ujb.o.LJJJLIIL(url, "http://", false) || ujb.o.LJJJLIIL(url, "https://", false))) {
                    vmr2.LIZ = new AtomicInteger(0);
                    webView3.evaluateJavascript(vmr2.LIZLLL, new ValueCallback<String>() { // from class: X.95b
                        @Override // android.webkit.ValueCallback
                        public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                    vmr2.LIZ(new AtomicInteger(0));
                }
                WebView webView4 = vmr2.LJFF.get();
                if (webView4 != null && Build.VERSION.SDK_INT >= 29) {
                    webView4.setWebViewRenderProcessClient(new C79618VMo(vmr2, webView4.getWebViewRenderProcessClient()));
                }
            }
        }
        C40048Fng.LIZJ(null, "url_load", LIZIZ, null, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (r4.LJFF.remove(r8) != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(android.webkit.WebView r14, X.VM4 r15) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VMJ.LJII(android.webkit.WebView, X.VM4):void");
    }

    public final void LJIIIIZZ(WebView webView, int i) {
        String str;
        String str2;
        o.LJIIJ(webView, "webView");
        VMK LIZJ = LIZJ(webView);
        WebView LIZLLL = LIZJ.LIZLLL();
        if (LIZLLL != null) {
            WebSettings settings = LIZLLL.getSettings();
            o.LJFF(settings, "it.settings");
            if (!settings.getJavaScriptEnabled()) {
                WebSettings settings2 = LIZLLL.getSettings();
                o.LJFF(settings2, "it.settings");
                settings2.setJavaScriptEnabled(true);
            }
        }
        VML vml = LIZJ.LJII;
        if (vml != null) {
            WebView LIZLLL2 = vml.LJIJ.LIZLLL();
            if (LIZLLL2 != null && i >= vml.LJIILLIIL) {
                WebSettings settings3 = LIZLLL2.getSettings();
                o.LJFF(settings3, "view.settings");
                if (!settings3.getJavaScriptEnabled()) {
                    WebSettings settings4 = LIZLLL2.getSettings();
                    o.LJFF(settings4, "view.settings");
                    settings4.setJavaScriptEnabled(true);
                }
                try {
                    String mCurrentInjectJsUrl = LIZLLL2.getUrl();
                    if ((mCurrentInjectJsUrl == null || !o.LJ(mCurrentInjectJsUrl, "about:blank")) && !vml.LJIIL) {
                        VMS vms = VMS.webInject;
                        if (vms.isEnabled() && VMS.webDomainWhiteList.isEnabled() && !C77318UWc.LJLILLLLZI) {
                            o.LJFF(mCurrentInjectJsUrl, "mCurrentInjectJsUrl");
                            if (!vml.LJ(mCurrentInjectJsUrl)) {
                            }
                        }
                        String url = LIZLLL2.getUrl();
                        o.LJFF(url, "view.url");
                        if (!C40062Fnu.LIZ(url) && !TextUtils.isEmpty(mCurrentInjectJsUrl) && !vml.LJIIL) {
                            C60601NqP c60601NqP = vml.LJIJ.LIZIZ;
                            if (c60601NqP == null) {
                                str = "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});";
                                str2 = "";
                            } else {
                                str = c60601NqP.LJIIJ;
                                str2 = c60601NqP.LJIIJJI;
                            }
                            LIZLLL2.evaluateJavascript(C173216qz.LIZ(LIZLLL2.getContext(), str2, str, vms.isEnabled()), null);
                            long currentTimeMillis = System.currentTimeMillis();
                            vml.LJIIL = true;
                            vml.LIZIZ().LJII = currentTimeMillis;
                            vml.LJIIIIZZ();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("injectJsScript : ");
                            LIZ.append(mCurrentInjectJsUrl);
                            X1D.LIZIZ(LIZ);
                            C40048Fng.LIZJ(vml.LJ.LJLILLLLZI, "jssdk_load", null, null, 12);
                        }
                    }
                } catch (Exception e) {
                    C77117UOj.LJIIZILJ(e);
                }
            }
            C79578VLa LIZIZ = vml.LIZIZ();
            if (i == 100 && LIZIZ.LJI == 0) {
                LIZIZ.LJI = System.currentTimeMillis();
            }
        }
    }

    public final void LIZLLL(WebView webView, VM4 vm4, JSONObject jSONObject) {
        o.LJIIJ(webView, "webView");
        VML vml = LIZJ(webView).LJII;
        if (vml != null) {
            vml.LJI(vm4, jSONObject);
        } else {
            vm4.onEventTerminated(EnumC65355Pkt.INVALID_CASE);
        }
    }
}
