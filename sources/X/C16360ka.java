package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16360ka {
    public static ColorStateList LJI(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode LJII(View view) {
        return view.getBackgroundTintMode();
    }

    public static float LJIIIIZZ(View view) {
        return view.getElevation();
    }

    public static C16800lI LJIIIZ(View view) {
        if (C16740lC.LIZLLL && view.isAttachedToWindow()) {
            try {
                Object obj = C16740lC.LIZ.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) C16740lC.LIZIZ.get(obj);
                    Rect rect2 = (Rect) C16740lC.LIZJ.get(obj);
                    if (rect != null && rect2 != null) {
                        C16750lD c16750lD = new C16750lD();
                        c16750lD.LIZ.LIZLLL(C07310Ql.LIZIZ(rect.left, rect.top, rect.right, rect.bottom));
                        c16750lD.LIZ.LJFF(C07310Ql.LIZIZ(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        C16800lI LIZ = c16750lD.LIZ();
                        LIZ.LIZ.LJIJ(LIZ);
                        LIZ.LIZ.LIZLLL(view.getRootView());
                        return LIZ;
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return null;
    }

    public static String LJIIJ(View view) {
        return view.getTransitionName();
    }

    public static float LJIIJJI(View view) {
        return view.getTranslationZ();
    }

    public static float LJIIL(View view) {
        return view.getZ();
    }

    public static boolean LJIILIIL(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean LJIILJJIL(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean LJIILL(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void LJJIFFI(View view) {
        view.stopNestedScroll();
    }

    public static void LIZ(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.l0m);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void LJIILLIIL(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void LJIIZILJ(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void LJIJ(View view, float f) {
        view.setElevation(f);
    }

    public static void LJIJI(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void LJIJJ(final View view, final InterfaceC16710l9 interfaceC16710l9) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.l09, interfaceC16710l9);
        }
        if (interfaceC16710l9 == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.l0m));
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: X.0kZ
                public C16800lI LIZ;

                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C16800lI LJIIJ = C16800lI.LJIIJ(view2, windowInsets);
                    int i = Build.VERSION.SDK_INT;
                    if (i < 30) {
                        C16360ka.LIZ(windowInsets, view);
                        if (LJIIJ.equals(this.LIZ)) {
                            return interfaceC16710l9.LIZ(view2, LJIIJ).LJIIIZ();
                        }
                    }
                    this.LIZ = LJIIJ;
                    C16800lI LIZ = interfaceC16710l9.LIZ(view2, LJIIJ);
                    if (i >= 30) {
                        return LIZ.LJIIIZ();
                    }
                    C16340kY.LIZJ(view2);
                    return LIZ.LJIIIZ();
                }
            });
        }
    }

    public static void LJIJJLI(View view, String str) {
        view.setTransitionName(str);
    }

    public static void LJIL(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void LJJ(View view, float f) {
        view.setZ(f);
    }

    public static boolean LJJI(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static C16800lI LIZIZ(View view, C16800lI c16800lI, Rect rect) {
        WindowInsets LJIIIZ = c16800lI.LJIIIZ();
        if (LJIIIZ != null) {
            return C16800lI.LJIIJ(view, view.computeSystemWindowInsets(LJIIIZ, rect));
        }
        rect.setEmpty();
        return c16800lI;
    }

    public static boolean LIZLLL(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    public static boolean LIZJ(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    public static boolean LJ(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public static boolean LJFF(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }
}
