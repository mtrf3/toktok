package X;

import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* renamed from: X.FgF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39587FgF extends EV2 {
    public C59862NeU LIZIZ;
    public C59860NeS LIZJ;
    public C39586FgE LIZLLL;
    public final WebView LJ;

    public static Object LIZIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "1199793957359954313"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public C39587FgF(WebView webView, Object obj) {
        super(obj);
        this.LJ = webView;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if ("setWebViewClient".equals(name)) {
            C59862NeU c59862NeU = this.LIZIZ;
            WebViewClient webViewClient = (WebViewClient) objArr[0];
            if (webViewClient == null) {
                c59862NeU.LJLJI = C59862NeU.LJLJL;
            } else {
                c59862NeU.LJLJI = webViewClient;
            }
            return null;
        }
        if ("getWebViewClient".equals(name)) {
            WebViewClient webViewClient2 = this.LIZIZ.LJLJI;
            if (webViewClient2 == C59862NeU.LJLJL) {
                return null;
            }
            return webViewClient2;
        }
        if ("setWebChromeClient".equals(name)) {
            C59860NeS c59860NeS = this.LIZJ;
            WebChromeClient webChromeClient = (WebChromeClient) objArr[0];
            if (webChromeClient == null) {
                c59860NeS.LJLJI = C59860NeS.LJLJL;
            } else {
                c59860NeS.LJLJI = webChromeClient;
            }
            return null;
        }
        if ("getWebChromeClient".equals(name)) {
            WebChromeClient webChromeClient2 = this.LIZJ.LJLJI;
            if (webChromeClient2 == C59860NeS.LJLJL) {
                return null;
            }
            return webChromeClient2;
        }
        if ("init".equals(name)) {
            EnumC39588FgG.INIT.LIZJ(method);
            C39586FgE c39586FgE = new C39586FgE();
            this.LIZLLL = c39586FgE;
            c39586FgE.LJLJI = this.LIZ;
            c39586FgE.LJLJJI = this.LJ;
            c39586FgE.LJIIIZ((java.util.Map) objArr[0], ((Boolean) objArr[1]).booleanValue());
            this.LIZIZ = new C59862NeU();
            this.LIZJ = new C59860NeS();
            LIZIZ(this.LIZ, EXK.LJ, new Object[]{this.LIZIZ});
            LIZIZ(this.LIZ, EXK.LJFF, new Object[]{this.LIZJ});
            EXK.LJII.put(this.LJ, new WeakReference<>(this.LIZIZ));
            EXK.LJIIIIZZ.put(this.LJ, new WeakReference<>(this.LIZJ));
            return null;
        }
        if ("loadUrl".equals(name)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                EnumC39588FgG.LOAD_URL_1.LIZJ(method);
                this.LIZLLL.LJIIJ((String) objArr[0]);
                return null;
            }
            if (parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == java.util.Map.class) {
                EnumC39588FgG.LOAD_URL_2.LIZJ(method);
                this.LIZLLL.LJIIJJI((String) objArr[0], (java.util.Map) objArr[1]);
                return null;
            }
        } else {
            if ("addJavascriptInterface".equals(name)) {
                EnumC39588FgG.ADD_JAVASCRIPT_INTERFACE.LIZJ(method);
                this.LIZLLL.LIZ(objArr[0], (String) objArr[1]);
                return null;
            }
            if ("destroy".equals(name)) {
                EnumC39588FgG.DESTROY.LIZJ(method);
                this.LIZLLL.LIZLLL();
                return null;
            }
            if ("reload".equals(name)) {
                EnumC39588FgG.RELOAD.LIZJ(method);
                this.LIZLLL.LJIIL();
                return null;
            }
            if ("goBack".equals(name)) {
                EnumC39588FgG.GO_BACK.LIZJ(method);
                this.LIZLLL.LJII();
                return null;
            }
            if ("canGoBack".equals(name)) {
                EnumC39588FgG.CAN_GO_BACK.LIZJ(method);
                return Boolean.valueOf(this.LIZLLL.LIZIZ());
            }
            if ("goForward".equals(name)) {
                EnumC39588FgG.GO_FORWARD.LIZJ(method);
                this.LIZLLL.LJIIIIZZ();
                return null;
            }
            if ("canGoForward".equals(name)) {
                EnumC39588FgG.CAN_GO_FORWARD.LIZJ(method);
                return Boolean.valueOf(this.LIZLLL.LIZJ());
            }
            if ("evaluateJavaScript".equals(name)) {
                EnumC39588FgG.EVALUATE_JAVASCRIPT.LIZJ(method);
                this.LIZLLL.LJ((ValueCallback) objArr[1], (String) objArr[0]);
                return null;
            }
            if (!"loadData".equals(name) && "loadDataWithBaseURL".equals(name)) {
            }
        }
        return LIZIZ(this.LIZ, method, objArr);
    }
}
