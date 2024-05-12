package X;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class EXK {
    public static Class LIZ;
    public static Class LIZIZ;
    public static Field LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static Method LJFF;
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static final WeakHashMap<WebView, WeakReference<WebViewClient>> LJII = new WeakHashMap<>();
    public static final WeakHashMap<WebView, WeakReference<WebChromeClient>> LJIIIIZZ = new WeakHashMap<>();
    public static final HashSet<String> LJIIIZ;

    static {
        HashSet<String> hashSet = new HashSet<>();
        LJIIIZ = hashSet;
        C19U.LJ(hashSet, "com.zhiliaoapp.musically", "com.ss.android.ugc.trill", "com.app2021.video", "com.moonvideo.android.resso");
        hashSet.add("com.tiktok.android.music");
    }

    public static void LIZ() {
        Object invoke;
        Method method = LIZLLL;
        Object[] objArr = new Object[0];
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "1199793957359954313"));
        if (LIZJ2.LIZ) {
            invoke = LIZJ2.LIZIZ;
        } else {
            invoke = method.invoke(null, objArr);
        }
        LIZJ.set(null, new EV3(invoke).LIZ());
    }

    public static void LIZIZ() {
        try {
            LIZ = Class.forName("android.webkit.WebViewProvider");
            LIZIZ = Class.forName("android.webkit.WebViewFactory");
            Method method = LIZ.getMethod("setWebViewClient", WebViewClient.class);
            LJ = method;
            method.setAccessible(true);
            Method method2 = LIZ.getMethod("setWebChromeClient", WebChromeClient.class);
            LJFF = method2;
            method2.setAccessible(true);
            Field declaredField = LIZIZ.getDeclaredField("sProviderInstance");
            LIZJ = declaredField;
            declaredField.setAccessible(true);
            Method declaredMethod = LIZIZ.getDeclaredMethod("getProvider", new Class[0]);
            LIZLLL = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZJ(C59862NeU c59862NeU) {
        int i = c59862NeU.LJLIL;
        if (i < 0) {
            return;
        }
        List<C59862NeU>[] listArr = C59862NeU.LJLJJL;
        List<C59862NeU> list = listArr[i];
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(c59862NeU);
        listArr[c59862NeU.LJLIL] = list;
    }

    public static void LIZLLL(C39586FgE c39586FgE) {
        int i = c39586FgE.LJLIL;
        if (i < 0) {
            return;
        }
        List<C39586FgE>[] listArr = C39586FgE.LJLJJLL;
        List<C39586FgE> list = listArr[i];
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(c39586FgE);
        listArr[c39586FgE.LJLIL] = list;
    }
}
