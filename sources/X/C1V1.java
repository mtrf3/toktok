package X;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: X.1V1, reason: invalid class name */
/* loaded from: classes.dex */
public class C1V1 extends C16760lE {
    public static Field LIZLLL;
    public static boolean LJ;
    public static Constructor<WindowInsets> LJFF;
    public static boolean LJI;
    public WindowInsets LIZIZ;
    public C07310Ql LIZJ;

    public static WindowInsets LJII() {
        if (!LJ) {
            try {
                LIZLLL = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            LJ = true;
        }
        Field field = LIZLLL;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!LJI) {
            try {
                LJFF = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            LJI = true;
        }
        Constructor<WindowInsets> constructor = LJFF;
        if (constructor != null) {
            try {
                return constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    public C1V1() {
        this.LIZIZ = LJII();
    }

    @Override // X.C16760lE
    public C16800lI LIZIZ() {
        C16760lE.LIZ();
        C16800lI LJIIJ = C16800lI.LJIIJ(null, this.LIZIZ);
        LJIIJ.LIZ.LJIILLIIL(null);
        LJIIJ.LIZ.LJIJI(this.LIZJ);
        return LJIIJ;
    }

    public C1V1(C16800lI c16800lI) {
        super(c16800lI);
        this.LIZIZ = c16800lI.LJIIIZ();
    }

    @Override // X.C16760lE
    public void LIZLLL(C07310Ql c07310Ql) {
        this.LIZJ = c07310Ql;
    }

    @Override // X.C16760lE
    public void LJFF(C07310Ql c07310Ql) {
        WindowInsets windowInsets = this.LIZIZ;
        if (windowInsets != null) {
            this.LIZIZ = windowInsets.replaceSystemWindowInsets(c07310Ql.LIZ, c07310Ql.LIZIZ, c07310Ql.LIZJ, c07310Ql.LIZLLL);
        }
    }
}
