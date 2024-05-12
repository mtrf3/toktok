package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* renamed from: X.KMi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51584KMi {
    public View LIZ;
    public boolean LIZIZ;
    public final C51586KMk LIZJ;
    public final Context LIZLLL;
    public final ViewGroup LJ;

    public static void LIZIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-8308576554110260395")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public final void LIZJ() {
        ViewGroup viewGroup;
        Activity LIZLLL;
        Window window;
        if (!this.LIZIZ) {
            return;
        }
        this.LIZIZ = false;
        Context context = this.LIZLLL;
        LJ(context, true);
        Activity LIZLLL2 = LIZLLL(context);
        if (LIZLLL2 != null && (window = LIZLLL2.getWindow()) != null) {
            window.clearFlags(1024);
            View decorView = window.getDecorView();
            if (decorView != null) {
                decorView.setSystemUiVisibility(1792);
            }
        }
        if (LIZ(this.LIZLLL) && (LIZLLL = LIZLLL(this.LIZLLL)) != null) {
            LIZLLL.setRequestedOrientation(-1);
        }
        Activity LIZLLL3 = LIZLLL(this.LIZLLL);
        if (LIZLLL3 != null && (viewGroup = (ViewGroup) LIZLLL3.findViewById(R.id.content)) != null) {
            C16880lQ.LJLLL(this.LIZJ, viewGroup);
        }
        this.LIZJ.removeAllViews();
        this.LJ.addView(this.LIZ, new ViewGroup.LayoutParams(-1, -1));
        this.LJ.requestLayout();
    }

    public static boolean LIZ(Context context) {
        PackageManager packageManager;
        Activity LIZLLL = LIZLLL(context);
        if (LIZLLL == null) {
            return false;
        }
        try {
            packageManager = LIZLLL.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager == null) {
            return false;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(LIZLLL.getComponentName(), 128);
        o.LJIIIIZZ(activityInfo, "pkmg.getActivityInfo(ac.…ageManager.GET_META_DATA)");
        if ((activityInfo.configChanges & 128) == 0) {
            return false;
        }
        return true;
    }

    public static Activity LIZLLL(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZLLL(((ContextWrapper) context).getBaseContext());
    }

    public C51584KMi(Context context, ViewGroup container) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(container, "container");
        C51586KMk c51586KMk = new C51586KMk(context);
        this.LIZJ = c51586KMk;
        c51586KMk.setOnKeyListener(new ViewOnKeyListenerC51585KMj(this));
        this.LIZLLL = context;
        this.LJ = container;
    }

    public static void LJ(Context context, boolean z) {
        Method method;
        String str;
        try {
            Activity LIZLLL = LIZLLL(context);
            if (LIZLLL != null && (method = LIZLLL.getClass().getMethod("getSupportActionBar", new Class[0])) != null) {
                method.setAccessible(true);
                Object invoke = method.invoke(LIZLLL, new Object[0]);
                if (invoke != null) {
                    Method method2 = invoke.getClass().getMethod("setShowHideAnimationEnabled", Boolean.TYPE);
                    method2.setAccessible(true);
                    method2.invoke(invoke, Boolean.FALSE);
                    Class<?> cls = invoke.getClass();
                    if (z) {
                        str = "show";
                    } else {
                        str = "hide";
                    }
                    Method method3 = cls.getMethod(str, new Class[0]);
                    method3.setAccessible(true);
                    LIZIZ(invoke, method3, new Object[0]);
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
