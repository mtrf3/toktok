package X;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: X.1Id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30631Id extends C0PD {
    public static Field LIZLLL;
    public static boolean LJ;
    public static Constructor<WindowInsets> LJFF;
    public static boolean LJI;
    public WindowInsets LIZIZ;
    public C06920Oy LIZJ;

    public C30631Id() {
        WindowInsets windowInsets;
        if (!LJ) {
            try {
                LIZLLL = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            LJ = true;
        }
        Field field = LIZLLL;
        WindowInsets windowInsets2 = null;
        if (field != null) {
            try {
                windowInsets = (WindowInsets) field.get(null);
            } catch (ReflectiveOperationException unused2) {
            }
            if (windowInsets != null) {
                windowInsets2 = new WindowInsets(windowInsets);
                this.LIZIZ = windowInsets2;
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
                windowInsets2 = constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        this.LIZIZ = windowInsets2;
    }

    @Override // X.C0PD
    public final C0PI LIZIZ() {
        LIZ();
        C0PI LIZJ = C0PI.LIZJ(null, this.LIZIZ);
        LIZJ.LIZ.LJIILJJIL(this.LIZ);
        LIZJ.LIZ.LJIILLIIL(this.LIZJ);
        return LIZJ;
    }

    public C30631Id(C0PI c0pi) {
        this.LIZIZ = c0pi.LIZIZ();
    }

    @Override // X.C0PD
    public final void LJ(C06920Oy c06920Oy) {
        this.LIZJ = c06920Oy;
    }

    @Override // X.C0PD
    public final void LJI(C06920Oy c06920Oy) {
        WindowInsets windowInsets = this.LIZIZ;
        if (windowInsets != null) {
            this.LIZIZ = windowInsets.replaceSystemWindowInsets(c06920Oy.LIZ, c06920Oy.LIZIZ, c06920Oy.LIZJ, c06920Oy.LIZLLL);
        }
    }
}
