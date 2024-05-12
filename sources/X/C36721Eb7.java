package X;

import android.os.IBinder;
import java.lang.reflect.Method;

/* renamed from: X.Eb7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36721Eb7 extends AbstractC36715Eb1 {
    public static Object LIZLLL(Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "3426052473799286743"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(null, objArr);
    }

    static {
        AbstractC36715Eb1.LIZJ("getNetworkCapabilities", new C36723Eb9(0));
        AbstractC36715Eb1.LIZJ("getAllNetworks", new C36723Eb9(0));
        AbstractC36715Eb1.LIZJ("getLinkProperties", new C36723Eb9(0));
        AbstractC36715Eb1.LIZJ("getActiveNetworkInfo", new C36723Eb9(0));
    }

    public final void LJ() {
        try {
            C36720Eb6 c36720Eb6 = new C36720Eb6(this);
            c36720Eb6.LIZLLL();
            Object LIZLLL = LIZLLL(EWC.LIZ(Class.forName("android.net.IConnectivityManager$Stub"), "asInterface", IBinder.class), new Object[]{c36720Eb6.LIZIZ});
            this.LIZLLL = true;
            this.LIZIZ = LIZLLL;
            F8X.LIZ();
        } catch (Exception e) {
            F8X.LIZ();
            C16880lQ.LLLLIIL(e);
        }
    }
}
