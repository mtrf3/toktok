package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: X.1V3, reason: invalid class name */
/* loaded from: classes.dex */
public class C1V3 extends C16770lF {
    public static boolean LJII;
    public static Method LJIIIIZZ;
    public static Class<?> LJIIIZ;
    public static Field LJIIJ;
    public static Field LJIIJJI;
    public final WindowInsets LIZJ;
    public C07310Ql[] LIZLLL;
    public C07310Ql LJ;
    public C16800lI LJFF;
    public C07310Ql LJI;

    public static void LJJIFFI() {
        try {
            LJIIIIZZ = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            LJIIIZ = cls;
            LJIIJ = cls.getDeclaredField("mVisibleInsets");
            LJIIJJI = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            LJIIJ.setAccessible(true);
            LJIIJJI.setAccessible(true);
        } catch (ReflectiveOperationException unused) {
        }
        LJII = true;
    }

    private C07310Ql LJIL() {
        C16800lI c16800lI = this.LJFF;
        if (c16800lI != null) {
            return c16800lI.LIZ.LJIIIIZZ();
        }
        return C07310Ql.LJ;
    }

    @Override // X.C16770lF
    public final C07310Ql LJIIJ() {
        if (this.LJ == null) {
            this.LJ = C07310Ql.LIZIZ(this.LIZJ.getSystemWindowInsetLeft(), this.LIZJ.getSystemWindowInsetTop(), this.LIZJ.getSystemWindowInsetRight(), this.LIZJ.getSystemWindowInsetBottom());
        }
        return this.LJ;
    }

    @Override // X.C16770lF
    public boolean LJIILJJIL() {
        return this.LIZJ.isRound();
    }

    private static C07310Ql LJJ(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!LJII) {
                LJJIFFI();
            }
            Method method = LJIIIIZZ;
            C07310Ql c07310Ql = null;
            if (method == null || LJIIIZ == null || LJIIJ == null) {
                return null;
            }
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    return null;
                }
                Rect rect = (Rect) LJIIJ.get(LJIIJJI.get(invoke));
                if (rect == null) {
                    return null;
                }
                c07310Ql = C07310Ql.LIZIZ(rect.left, rect.top, rect.right, rect.bottom);
                return c07310Ql;
            } catch (ReflectiveOperationException unused) {
                return c07310Ql;
            }
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @Override // X.C16770lF
    public void LIZLLL(View view) {
        C07310Ql LJJ = LJJ(view);
        if (LJJ == null) {
            LJJ = C07310Ql.LJ;
        }
        LJIIZILJ(LJJ);
    }

    @Override // X.C16770lF
    public void LJ(C16800lI c16800lI) {
        c16800lI.LIZ.LJIJ(this.LJFF);
        c16800lI.LIZ.LJIIZILJ(this.LJI);
    }

    @Override // X.C16770lF
    public C07310Ql LJI(int i) {
        return LJIJJ(i, false);
    }

    @Override // X.C16770lF
    public boolean LJIILL(int i) {
        int i2 = 1;
        do {
            if ((i & i2) == 0 || LJJI(i2)) {
                i2 <<= 1;
            } else {
                return false;
            }
        } while (i2 <= 256);
        return true;
    }

    @Override // X.C16770lF
    public void LJIILLIIL(C07310Ql[] c07310QlArr) {
        this.LIZLLL = c07310QlArr;
    }

    @Override // X.C16770lF
    public void LJIIZILJ(C07310Ql c07310Ql) {
        this.LJI = c07310Ql;
    }

    @Override // X.C16770lF
    public void LJIJ(C16800lI c16800lI) {
        this.LJFF = c16800lI;
    }

    public boolean LJJI(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !LJIJJLI(i, false).equals(C07310Ql.LJ);
    }

    @Override // X.C16770lF
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.LJI, ((C1V3) obj).LJI);
    }

    public C1V3(C16800lI c16800lI, C1V3 c1v3) {
        this(c16800lI, new WindowInsets(c1v3.LIZJ));
    }

    private C07310Ql LJIJJ(int i, boolean z) {
        C07310Ql c07310Ql = C07310Ql.LJ;
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                c07310Ql = C07310Ql.LIZ(c07310Ql, LJIJJLI(i2, z));
            }
            i2 <<= 1;
        } while (i2 <= 256);
        return c07310Ql;
    }

    public C07310Ql LJIJJLI(int i, boolean z) {
        int i2;
        C07310Ql c07310Ql;
        C16210kL LJFF;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (i != 1) {
            C07310Ql c07310Ql2 = null;
            if (i != 2) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i != 128) {
                                    return C07310Ql.LJ;
                                }
                                C16800lI c16800lI = this.LJFF;
                                if (c16800lI != null) {
                                    LJFF = c16800lI.LIZ.LJFF();
                                } else {
                                    LJFF = LJFF();
                                }
                                if (LJFF != null) {
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        i3 = C16200kK.LIZLLL(LJFF.LIZ);
                                        i4 = C16200kK.LJFF(LJFF.LIZ);
                                        i5 = C16200kK.LJ(LJFF.LIZ);
                                        i6 = C16200kK.LIZJ(LJFF.LIZ);
                                    } else {
                                        i3 = 0;
                                        i4 = 0;
                                        i5 = 0;
                                    }
                                    return C07310Ql.LIZIZ(i3, i4, i5, i6);
                                }
                                return C07310Ql.LJ;
                            }
                            return LJIIJJI();
                        }
                        return LJII();
                    }
                    return LJIIIZ();
                }
                C07310Ql[] c07310QlArr = this.LIZLLL;
                if (c07310QlArr != null && (c07310Ql = c07310QlArr[C16780lG.LIZ(8)]) != null) {
                    return c07310Ql;
                }
                C07310Ql LJIIJ2 = LJIIJ();
                C07310Ql LJIL = LJIL();
                int i7 = LJIIJ2.LIZLLL;
                if (i7 > LJIL.LIZLLL) {
                    return C07310Ql.LIZIZ(0, 0, 0, i7);
                }
                C07310Ql c07310Ql3 = this.LJI;
                if (c07310Ql3 != null && !c07310Ql3.equals(C07310Ql.LJ) && (i2 = this.LJI.LIZLLL) > LJIL.LIZLLL) {
                    return C07310Ql.LIZIZ(0, 0, 0, i2);
                }
                return C07310Ql.LJ;
            }
            if (z) {
                C07310Ql LJIL2 = LJIL();
                C07310Ql LJIIIIZZ2 = LJIIIIZZ();
                return C07310Ql.LIZIZ(Math.max(LJIL2.LIZ, LJIIIIZZ2.LIZ), 0, Math.max(LJIL2.LIZJ, LJIIIIZZ2.LIZJ), Math.max(LJIL2.LIZLLL, LJIIIIZZ2.LIZLLL));
            }
            C07310Ql LJIIJ3 = LJIIJ();
            C16800lI c16800lI2 = this.LJFF;
            if (c16800lI2 != null) {
                c07310Ql2 = c16800lI2.LIZ.LJIIIIZZ();
            }
            int i8 = LJIIJ3.LIZLLL;
            if (c07310Ql2 != null) {
                i8 = Math.min(i8, c07310Ql2.LIZLLL);
            }
            return C07310Ql.LIZIZ(LJIIJ3.LIZ, 0, LJIIJ3.LIZJ, i8);
        }
        if (z) {
            return C07310Ql.LIZIZ(0, Math.max(LJIL().LIZIZ, LJIIJ().LIZIZ), 0, 0);
        }
        return C07310Ql.LIZIZ(0, LJIIJ().LIZIZ, 0, 0);
    }

    public C1V3(C16800lI c16800lI, WindowInsets windowInsets) {
        super(c16800lI);
        this.LIZJ = windowInsets;
    }

    @Override // X.C16770lF
    public C16800lI LJIIL(int i, int i2, int i3, int i4) {
        C16750lD c16750lD = new C16750lD(C16800lI.LJIIJ(null, this.LIZJ));
        c16750lD.LIZ.LJFF(C16800lI.LJFF(LJIIJ(), i, i2, i3, i4));
        c16750lD.LIZ.LIZLLL(C16800lI.LJFF(LJIIIIZZ(), i, i2, i3, i4));
        return c16750lD.LIZ();
    }
}
