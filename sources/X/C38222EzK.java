package X;

import android.os.Handler;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.EzK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38222EzK {
    public static final C38222EzK LJFF;
    public static final C38222EzK LJI;
    public static final java.util.Map<String, String> LJII = new HashMap();
    public final java.util.Map<String, C38226EzO> LIZ = new HashMap();
    public final java.util.Map<String, C38226EzO> LIZIZ = new HashMap();
    public final java.util.Set<String> LIZJ = new HashSet();
    public final boolean LIZLLL;
    public boolean LJ;

    static {
        C38222EzK c38222EzK = new C38222EzK();
        LJFF = c38222EzK;
        LJI = c38222EzK;
    }

    public final boolean LJ() {
        boolean z;
        if (this.LIZLLL) {
            C38225EzN c38225EzN = (C38225EzN) HybridMonitor.getInstance().getSettingManager();
            if (c38225EzN.LIZ == null) {
                c38225EzN.LIZ = new G1O();
            }
            c38225EzN.LIZ.getClass();
            z = true;
        } else {
            z = false;
        }
        if (this.LJ != z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("monitor enabled: ");
            LIZ.append(z);
            C82519Wa3.LIZLLL("TTLiveWebViewMonitorHelper", X1D.LIZIZ(LIZ));
            this.LJ = z;
        }
        return z;
    }

    public C38222EzK() {
        new ViewOnAttachStateChangeListenerC38224EzM();
        this.LIZLLL = true;
        new Handler(C16880lQ.LLJJJJ());
        this.LJ = false;
        C120924oq.LIZ.put("web", this);
        try {
            Class<?> cls = Class.forName("com.bytedance.lynx.webview.TTWebSdk");
            Class<?> cls2 = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewDelegate");
            Class<?> cls3 = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewClientDelegate");
            Class<?> cls4 = Class.forName("com.bytedance.lynx.webview.monitors.IWebChromeClientDelegate");
            Method declaredMethod = cls.getDeclaredMethod("registerGlobalWebViewDelegate", cls2);
            C38223EzL c38223EzL = new C38223EzL();
            c38223EzL.LIZ = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewDelegate");
            c38223EzL.LIZIZ = Class.forName("com.bytedance.lynx.webview.monitors.WebViewDelegate").newInstance();
            declaredMethod.invoke(null, Proxy.newProxyInstance(c38223EzL.LIZ.getClassLoader(), new Class[]{c38223EzL.LIZ}, c38223EzL));
            Method declaredMethod2 = cls.getDeclaredMethod("registerGlobalWebViewClientDelegate", cls3);
            C38221EzJ c38221EzJ = new C38221EzJ();
            c38221EzJ.LIZ = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewClientDelegate");
            c38221EzJ.LIZIZ = Class.forName("com.bytedance.lynx.webview.monitors.WebViewClientDelegate").newInstance();
            declaredMethod2.invoke(null, Proxy.newProxyInstance(c38221EzJ.LIZ.getClassLoader(), new Class[]{c38221EzJ.LIZ}, c38221EzJ));
            Method declaredMethod3 = cls.getDeclaredMethod("registerGlobalWebChromeClientDelegate", cls4);
            C38220EzI c38220EzI = new C38220EzI();
            c38220EzI.LIZ = Class.forName("com.bytedance.lynx.webview.monitors.IWebChromeClientDelegate");
            c38220EzI.LIZIZ = Class.forName("com.bytedance.lynx.webview.monitors.WebChromeClientDelegate").newInstance();
            declaredMethod3.invoke(null, Proxy.newProxyInstance(c38220EzI.LIZ.getClassLoader(), new Class[]{c38220EzI.LIZ}, c38220EzI));
        } catch (Exception unused) {
            C70657RoD.LJIILL();
        }
    }

    public static String LIZ(WebView webView) {
        if (webView == null) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(webView.hashCode());
        LIZ.append("");
        return X1D.LIZIZ(LIZ);
    }

    public final C38226EzO LIZIZ(WebView webView) {
        Class<?> cls;
        Class<?> cls2;
        C38226EzO c38226EzO;
        if (webView == null) {
            return null;
        }
        C38226EzO c38226EzO2 = (C38226EzO) ((HashMap) this.LIZIZ).get(LIZ(webView));
        if (c38226EzO2 != null) {
            return c38226EzO2;
        }
        String name = webView.getClass().getName();
        C38226EzO c38226EzO3 = (C38226EzO) ((HashMap) this.LIZ).get(name);
        if (c38226EzO3 != null) {
            return c38226EzO3;
        }
        if (((HashSet) this.LIZJ).contains(name)) {
            return null;
        }
        Iterator it = new HashSet(((HashMap) this.LIZ).keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                cls = Class.forName(name);
            } catch (Throwable unused) {
                C70657RoD.LJIILL();
                cls = null;
            }
            try {
                cls2 = Class.forName(str);
            } catch (Throwable unused2) {
                C70657RoD.LJIILL();
                cls2 = null;
            }
            if (cls != null && cls2 != null && cls2.isAssignableFrom(cls) && (c38226EzO = (C38226EzO) ((HashMap) this.LIZ).get(str)) != null) {
                ((HashMap) this.LIZ).put(name, c38226EzO);
                return c38226EzO;
            }
        }
        ((HashSet) this.LIZJ).add(name);
        return null;
    }

    public final void LIZJ(WebView webView) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleJSBError: ");
        LIZ.append(webView.getClass().toString());
        C82519Wa3.LIZLLL("TTLiveWebViewMonitorHelper", X1D.LIZIZ(LIZ));
        try {
            if (!LJ()) {
                return;
            }
            LJFF(webView);
        } catch (Exception unused) {
            C70657RoD.LJIILL();
        }
    }

    public final void LIZLLL(WebView webView) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleJSBInfo: ");
        LIZ.append(webView.getClass().toString());
        C82519Wa3.LIZLLL("TTLiveWebViewMonitorHelper", X1D.LIZIZ(LIZ));
        try {
            if (!LJ()) {
                return;
            }
            LJFF(webView);
        } catch (Exception unused) {
            C70657RoD.LJIILL();
        }
    }

    public final void LJFF(WebView webView) {
        try {
            LIZIZ(webView);
        } catch (Exception unused) {
            C70657RoD.LJIILL();
        }
        if (this.LJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isNeedMonitor: ");
            LIZ.append(false);
            C82519Wa3.LIZLLL("TTLiveWebViewMonitorHelper", X1D.LIZIZ(LIZ));
            this.LJ = false;
        }
    }
}
