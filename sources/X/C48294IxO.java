package X;

import Y.ARunnableS44S0100000_8;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.IxO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48294IxO {
    public static Field LJII = null;
    public static Field LJIIIIZZ = null;
    public static Field LJIIIZ = null;
    public static Field LJIIJ = null;
    public static Method LJIIJJI = null;
    public static Method LJIIL = null;
    public static int LJIILIIL = -1;
    public static int LJIILJJIL = -1;
    public static final boolean LJIILL;
    public boolean LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC48298IxS LIZLLL;
    public final View LJ;
    public final ARunnableS44S0100000_8 LJFF = new ARunnableS44S0100000_8(this, 14);
    public C48296IxQ LJI = null;

    static {
        boolean z = false;
        try {
            Field LIZIZ = C36498EUc.LIZIZ(View.class, "mParent");
            LJII = LIZIZ;
            LIZIZ.setAccessible(true);
            Field LIZIZ2 = C36498EUc.LIZIZ(View.class, "mPrivateFlags");
            LJIIJ = LIZIZ2;
            LIZIZ2.setAccessible(true);
            C36498EUc.LIZIZ(View.class, "mPrivateFlags3").setAccessible(true);
            Field LIZIZ3 = C36498EUc.LIZIZ(View.class, "mOldWidthMeasureSpec");
            LJIIIIZZ = LIZIZ3;
            LIZIZ3.setAccessible(true);
            Field LIZIZ4 = C36498EUc.LIZIZ(View.class, "mOldHeightMeasureSpec");
            LJIIIZ = LIZIZ4;
            LIZIZ4.setAccessible(true);
            C36498EUc.LIZIZ(View.class, "mAttachInfo").setAccessible(true);
            C36498EUc.LIZIZ(Class.forName("android.view.View$AttachInfo"), "mViewRequestingLayout").setAccessible(true);
            Class cls = Integer.TYPE;
            Method LIZJ = C36498EUc.LIZJ(View.class, "onMeasure", cls, cls);
            LJIIJJI = LIZJ;
            LIZJ.setAccessible(true);
            Method LIZJ2 = C36498EUc.LIZJ(View.class, "onLayout", Boolean.TYPE, cls, cls, cls, cls);
            LJIIL = LIZJ2;
            LIZJ2.setAccessible(true);
            Field LIZIZ5 = C36498EUc.LIZIZ(View.class, "PFLAG_FORCE_LAYOUT");
            Field LIZIZ6 = C36498EUc.LIZIZ(View.class, "PFLAG_LAYOUT_REQUIRED");
            Field LIZIZ7 = C36498EUc.LIZIZ(View.class, "PFLAG3_IS_LAID_OUT");
            LIZIZ5.setAccessible(true);
            LIZIZ6.setAccessible(true);
            LIZIZ7.setAccessible(true);
            LJIILIIL = LIZIZ5.getInt(View.class);
            LJIILJJIL = LIZIZ6.getInt(View.class);
            int i = LIZIZ7.getInt(View.class);
            if (LJIILIIL == 4096) {
                if (LJIILJJIL == 8192 && i == 4) {
                    z = true;
                }
            }
        } catch (NoSuchFieldException e) {
            C16880lQ.LLLLIIL(e);
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        LJIILL = z;
    }

    public final void LIZ() {
        try {
            LJIIJ.setInt(this.LIZLLL, LJIIJ.getInt(this.LIZLLL) & (~LJIILJJIL) & (~LJIILIIL));
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C48294IxO(InterfaceC48298IxS interfaceC48298IxS) {
        new ARunnableS44S0100000_8(this, 15);
        if (!(interfaceC48298IxS instanceof View)) {
            return;
        }
        this.LIZLLL = interfaceC48298IxS;
        this.LJ = (View) interfaceC48298IxS;
        this.LIZJ = LJIILL;
    }
}
