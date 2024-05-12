package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.1Ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30611Ib extends C0P9 {
    public static C0P4 LJIIIZ(View view) {
        Object tag = view.getTag(R.id.l0m);
        if (tag instanceof C0P7) {
            return ((C0P7) tag).LIZ;
        }
        return null;
    }

    public static void LJ(View view, C0PA c0pa) {
        C0P4 LJIIIZ = LJIIIZ(view);
        if (LJIIIZ != null) {
            LJIIIZ.LIZIZ(c0pa);
            if (LJIIIZ.LIZIZ == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJ(viewGroup.getChildAt(i), c0pa);
            }
        }
    }

    public static WindowInsets LJIIIIZZ(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.l09) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public C30611Ib(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    public static void LJI(View view, C0PI c0pi, List<C0PA> list) {
        C0P4 LJIIIZ = LJIIIZ(view);
        if (LJIIIZ != null) {
            LJIIIZ.LIZLLL(c0pi, list);
            if (LJIIIZ.LIZIZ == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJI(viewGroup.getChildAt(i), c0pi, list);
            }
        }
    }

    public static void LJII(View view, C0PA c0pa, C0P3 c0p3) {
        C0P4 LJIIIZ = LJIIIZ(view);
        if (LJIIIZ != null) {
            LJIIIZ.LJ(c0pa, c0p3);
            if (LJIIIZ.LIZIZ == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJII(viewGroup.getChildAt(i), c0pa, c0p3);
            }
        }
    }

    public static void LJFF(View view, C0PA c0pa, WindowInsets windowInsets, boolean z) {
        C0P4 LJIIIZ = LJIIIZ(view);
        if (LJIIIZ != null) {
            LJIIIZ.LIZ = windowInsets;
            if (!z) {
                LJIIIZ.LIZJ(c0pa);
                if (LJIIIZ.LIZIZ == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJFF(viewGroup.getChildAt(i), c0pa, windowInsets, z);
            }
        }
    }
}
