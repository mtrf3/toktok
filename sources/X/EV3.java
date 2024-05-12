package X;

import android.webkit.WebView;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class EV3 extends EV2 {
    public static Object LIZIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "1199793957359954313"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public EV3(Object obj) {
        super(obj);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        WebView webView;
        if ("createWebView".equals(method.getName())) {
            Object LIZIZ = LIZIZ(this.LIZ, method, objArr);
            Object obj2 = objArr[0];
            if (obj2 instanceof WebView) {
                webView = (WebView) obj2;
            } else {
                webView = null;
            }
            return new C39587FgF(webView, LIZIZ).LIZ();
        }
        return LIZIZ(this.LIZ, method, objArr);
    }
}
