package X;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

/* renamed from: X.VAh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79299VAh {
    public static Method LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static Method LJFF;
    public static Method LJI;
    public static Method LJII;
    public static Method LJIIIIZZ;
    public static Method LJIIIZ;
    public static Method LJIIJ;
    public static Method LJIIJJI;
    public static Method LJIIL;
    public static Method LJIILIIL;
    public static boolean LJIILJJIL;
    public final Object LIZ;
    public final VBH LIZIZ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "468252543877658920"));
        return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(obj, objArr);
    }

    static {
        try {
            Class<?> cls = Class.forName("com.ss.videoarch.live.ttquic.PreloadManager");
            LIZJ = cls.getMethod("getInstance", new Class[0]);
            LIZLLL = cls.getMethod("init", Context.class, String.class);
            cls.getMethod("destroy", new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            LJ = cls.getMethod("attachPlayer", cls2);
            LJFF = cls.getMethod("detachPlayer", cls2);
            cls.getMethod("getActivePlayer", new Class[0]);
            LJI = cls.getMethod("addListener", cls2, Object.class);
            LJII = cls.getMethod("removeListener", cls2);
            LJIIIIZZ = cls.getMethod("recordResource", String.class);
            LJIIIZ = cls.getMethod("preload", cls2, String.class, String.class, Bundle.class);
            LJIIJ = cls.getMethod("cancel", cls2, String.class);
            LJIIJJI = cls.getMethod("cancelAll", new Class[0]);
            LJIIL = cls.getMethod("getCurrentTaskState", new Class[0]);
            LJIILIIL = cls.getMethod("getPreloadInfo", String.class, cls2);
            LJIILJJIL = true;
        } catch (Exception unused) {
        }
    }

    public C79299VAh(VBH vbh) {
        if (LJIILJJIL) {
            try {
                LIZJ.setAccessible(true);
                this.LIZ = LIZ(null, LIZJ, new Object[0]);
                this.LIZIZ = vbh;
            } catch (Exception unused) {
            }
        }
    }

    public final int LIZIZ(int i, String str, String str2, Bundle bundle) {
        try {
            if (this.LIZ != null) {
                LJIIIZ.setAccessible(true);
                Object LIZ = LIZ(this.LIZ, LJIIIZ, new Object[]{Integer.valueOf(i), str, str2, bundle});
                if (LIZ != null) {
                    return ((Integer) LIZ).intValue();
                }
            }
        } catch (Exception unused) {
        }
        return -5;
    }
}
