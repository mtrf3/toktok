package X;

import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: X.1If, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30651If extends C0PE {
    public static boolean LJIIIIZZ;
    public static Method LJIIIZ;
    public static Class<?> LJIIJ;
    public static Class<?> LJIIJJI;
    public static Field LJIIL;
    public static Field LJIILIIL;
    public final WindowInsets LIZLLL;
    public C06920Oy[] LJ;
    public C06920Oy LJFF;
    public C0PI LJI;
    public C06920Oy LJII;

    public static Object LJIIZILJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "878972810249165279"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.C0PE
    public boolean LJIILIIL() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((i & 8) != 0) {
                if (i != 1 && i != 2) {
                    if (i == 4) {
                        return false;
                    }
                    if (i != 8 && i != 128) {
                    }
                }
                if (!(!LJIJ(i).equals(C06920Oy.LJ))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.C0PE
    public final C06920Oy LJIIIZ() {
        if (this.LJFF == null) {
            this.LJFF = C06920Oy.LIZIZ(this.LIZLLL.getSystemWindowInsetLeft(), this.LIZLLL.getSystemWindowInsetTop(), this.LIZLLL.getSystemWindowInsetRight(), this.LIZLLL.getSystemWindowInsetBottom());
        }
        return this.LJFF;
    }

    @Override // X.C0PE
    public final boolean LJIIL() {
        return this.LIZLLL.isRound();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r2 != null) goto L16;
     */
    @Override // X.C0PE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZLLL(android.view.View r6) {
        /*
            r5 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 >= r0) goto L78
            boolean r0 = X.C30651If.LJIIIIZZ
            r3 = 0
            if (r0 != 0) goto L46
            r2 = 1
            java.lang.Class<android.view.View> r4 = android.view.View.class
            java.lang.String r1 = "getViewRootImpl"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r1, r0)     // Catch: java.lang.ReflectiveOperationException -> L44
            X.C30651If.LJIIIZ = r0     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.String r0 = "android.view.ViewRootImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L44
            X.C30651If.LJIIJ = r0     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.String r0 = "android.view.View$AttachInfo"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L44
            X.C30651If.LJIIJJI = r1     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.String r0 = "mVisibleInsets"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.ReflectiveOperationException -> L44
            X.C30651If.LJIIL = r0     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.Class<?> r1 = X.C30651If.LJIIJ     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.String r0 = "mAttachInfo"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.ReflectiveOperationException -> L44
            X.C30651If.LJIILIIL = r0     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.reflect.Field r0 = X.C30651If.LJIIL     // Catch: java.lang.ReflectiveOperationException -> L44
            r0.setAccessible(r2)     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.reflect.Field r0 = X.C30651If.LJIILIIL     // Catch: java.lang.ReflectiveOperationException -> L44
            r0.setAccessible(r2)     // Catch: java.lang.ReflectiveOperationException -> L44
        L44:
            X.C30651If.LJIIIIZZ = r2
        L46:
            java.lang.reflect.Method r1 = X.C30651If.LJIIIZ
            r2 = 0
            if (r1 == 0) goto L53
            java.lang.Class<?> r0 = X.C30651If.LJIIJJI
            if (r0 == 0) goto L53
            java.lang.reflect.Field r0 = X.C30651If.LJIIL
            if (r0 != 0) goto L58
        L53:
            X.0Oy r2 = X.C06920Oy.LJ
        L55:
            r5.LJII = r2
            return
        L58:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Object r1 = LJIIZILJ(r6, r1, r0)     // Catch: java.lang.ReflectiveOperationException -> L75
            if (r1 != 0) goto L61
            goto L53
        L61:
            java.lang.reflect.Field r0 = X.C30651If.LJIILIIL     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.reflect.Field r0 = X.C30651If.LJIIL     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.ReflectiveOperationException -> L75
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch: java.lang.ReflectiveOperationException -> L75
            if (r0 == 0) goto L53
            X.0Oy r2 = X.C06920Oy.LIZJ(r0)     // Catch: java.lang.ReflectiveOperationException -> L75
        L75:
            if (r2 != 0) goto L55
            goto L53
        L78:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30651If.LIZLLL(android.view.View):void");
    }

    @Override // X.C0PE
    public C06920Oy LJFF(int i) {
        C06920Oy c06920Oy = C06920Oy.LJ;
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                c06920Oy = C06920Oy.LIZ(c06920Oy, LJIJ(i2));
            }
            i2 <<= 1;
        } while (i2 <= 256);
        return c06920Oy;
    }

    @Override // X.C0PE
    public final void LJIILJJIL(C06920Oy[] c06920OyArr) {
        this.LJ = c06920OyArr;
    }

    @Override // X.C0PE
    public final void LJIILL(C0PI c0pi) {
        this.LJI = c0pi;
    }

    public final C06920Oy LJIJ(int i) {
        C06920Oy c06920Oy;
        int i2;
        C06920Oy c06920Oy2;
        C06910Ox LJ;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (i != 1) {
            C06920Oy c06920Oy3 = null;
            if (i != 2) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i != 128) {
                                    return C06920Oy.LJ;
                                }
                                C0PI c0pi = this.LJI;
                                if (c0pi != null) {
                                    LJ = c0pi.LIZ.LJ();
                                } else {
                                    LJ = LJ();
                                }
                                if (LJ != null) {
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        i3 = ((DisplayCutout) LJ.LIZ).getSafeInsetLeft();
                                        i4 = ((DisplayCutout) LJ.LIZ).getSafeInsetTop();
                                        i5 = ((DisplayCutout) LJ.LIZ).getSafeInsetRight();
                                        i6 = ((DisplayCutout) LJ.LIZ).getSafeInsetBottom();
                                    } else {
                                        i3 = 0;
                                        i4 = 0;
                                        i5 = 0;
                                    }
                                    return C06920Oy.LIZIZ(i3, i4, i5, i6);
                                }
                                return C06920Oy.LJ;
                            }
                            return LJIIJ();
                        }
                        return LJI();
                    }
                    return LJIIIIZZ();
                }
                C06920Oy[] c06920OyArr = this.LJ;
                if (c06920OyArr != null && (c06920Oy2 = c06920OyArr[C0PG.LIZ(8)]) != null) {
                    return c06920Oy2;
                }
                C06920Oy LJIIIZ2 = LJIIIZ();
                C0PI c0pi2 = this.LJI;
                if (c0pi2 != null) {
                    c06920Oy = c0pi2.LIZ.LJII();
                } else {
                    c06920Oy = C06920Oy.LJ;
                }
                int i7 = LJIIIZ2.LIZLLL;
                if (i7 > c06920Oy.LIZLLL) {
                    return C06920Oy.LIZIZ(0, 0, 0, i7);
                }
                C06920Oy c06920Oy4 = this.LJII;
                if (c06920Oy4 != null && !c06920Oy4.equals(C06920Oy.LJ) && (i2 = this.LJII.LIZLLL) > c06920Oy.LIZLLL) {
                    return C06920Oy.LIZIZ(0, 0, 0, i2);
                }
                return C06920Oy.LJ;
            }
            C06920Oy LJIIIZ3 = LJIIIZ();
            C0PI c0pi3 = this.LJI;
            if (c0pi3 != null) {
                c06920Oy3 = c0pi3.LIZ.LJII();
            }
            int i8 = LJIIIZ3.LIZLLL;
            if (c06920Oy3 != null) {
                i8 = Math.min(i8, c06920Oy3.LIZLLL);
            }
            return C06920Oy.LIZIZ(LJIIIZ3.LIZ, 0, LJIIIZ3.LIZJ, i8);
        }
        return C06920Oy.LIZIZ(0, LJIIIZ().LIZIZ, 0, 0);
    }

    @Override // X.C0PE
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.LJII, ((C30651If) obj).LJII);
    }

    public C30651If(C0PI c0pi, WindowInsets windowInsets) {
        super(c0pi);
        this.LIZLLL = windowInsets;
    }
}
