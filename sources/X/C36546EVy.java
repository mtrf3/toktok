package X;

import Y.ARunnableS13S0000000_6;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: X.EVy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36546EVy implements InvocationHandler {
    public static Object LIZIZ;
    public static Choreographer.FrameCallback LIZJ;
    public static boolean LIZLLL;
    public static final EW0 LJ;
    public static EW1 LJFF;
    public static Runnable LJI;
    public static Method LJII;
    public static final ARunnableS13S0000000_6 LJIIIIZZ;
    public final ChoreographerFrameCallbackC36547EVz LIZ = new ChoreographerFrameCallbackC36547EVz(this);

    static {
        EW0 ew0 = new EW0();
        LJ = ew0;
        LJFF = ew0;
        LJIIIIZZ = new ARunnableS13S0000000_6(42);
    }

    public static void LIZ() {
        try {
            C78983UzD.LJLILLLLZI = SystemClock.elapsedRealtime();
            LIZLLL = true;
            if (Build.VERSION.SDK_INT >= 24) {
                LIZIZ(LJFF);
            } else if (LJI == null && LJII == null) {
                Object[] objArr = new Object[0];
                Method LIZIZ2 = C36545EVx.LIZIZ(Class.forName("android.animation.ValueAnimator"), "getOrCreateAnimationHandler", C36545EVx.LIZLLL(objArr));
                Object[] LJ2 = C36545EVx.LJ(objArr);
                Object obj = null;
                Object invoke = LIZIZ2.invoke(null, LJ2);
                try {
                    try {
                        obj = C36545EVx.LIZJ(invoke, "mAnimate");
                    } catch (NoSuchFieldException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                } catch (IllegalAccessException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                LJI = (Runnable) obj;
                C36545EVx.LJFF(invoke);
                Method declaredMethod = Class.forName("android.view.Choreographer").getDeclaredMethod("postCallbackDelayedInternal", Integer.TYPE, Object.class, Object.class, Long.TYPE);
                LJII = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (C78983UzD.LJLILLLLZI != 0) {
                SystemClock.elapsedRealtime();
                C78983UzD.LJLILLLLZI = 0L;
                return;
            }
            throw new RuntimeException("must call setStartMs first!!!");
        } catch (Exception unused) {
        }
    }

    public static void LIZIZ(EW1 ew1) {
        if (ew1 == null) {
            ew1 = LJ;
        }
        LJFF = ew1;
        if (LIZJ == null && LIZIZ == null) {
            Object[] objArr = new Object[0];
            Object obj = null;
            Object invoke = C36545EVx.LIZIZ(Class.forName("android.animation.AnimationHandler"), "getInstance", C36545EVx.LIZLLL(objArr)).invoke(null, C36545EVx.LJ(objArr));
            Object[] objArr2 = new Object[0];
            Object invoke2 = C36545EVx.LIZIZ(invoke.getClass(), "getProvider", C36545EVx.LIZLLL(objArr2)).invoke(invoke, C36545EVx.LJ(objArr2));
            try {
                obj = C36545EVx.LIZJ(invoke, Choreographer.FrameCallback.class.getName());
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
            } catch (NoSuchFieldException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            LIZJ = (Choreographer.FrameCallback) obj;
            Object[] objArr3 = {Proxy.newProxyInstance(invoke2.getClass().getClassLoader(), invoke2.getClass().getInterfaces(), new C36546EVy())};
            try {
                C36545EVx.LIZIZ(invoke.getClass(), "setProvider", C36545EVx.LIZLLL(objArr3)).invoke(invoke, C36545EVx.LJ(objArr3));
            } catch (Exception unused) {
            }
            LIZIZ = invoke2;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getName().contains("postFrameCallback")) {
            if (LIZLLL) {
                LJFF.LIZ(LIZIZ, method, this.LIZ);
                return null;
            }
            if (objArr == null || objArr.length <= 0) {
                LJFF.onError();
                method.invoke(LIZIZ, objArr);
                return null;
            }
            LJFF.LIZ(LIZIZ, method, (Choreographer.FrameCallback) objArr[0]);
            return null;
        }
        return method.invoke(LIZIZ, objArr);
    }
}
