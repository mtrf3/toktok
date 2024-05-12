package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.HashMap;

/* renamed from: X.1iY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40581iY extends C1CW {
    public static final TimeInterpolator LLII = new DecelerateInterpolator();
    public static final TimeInterpolator LLIIII = new AccelerateInterpolator();
    public static final C40571iX LLIIIILZ;
    public InterfaceC03830Db LLIFFJFJJ = LLIIIILZ;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.1iX] */
    static {
        new AbstractC29371Dh() { // from class: X.1iS
            @Override // X.InterfaceC03830Db
            public final float LIZ(View view, ViewGroup viewGroup) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
        };
        new AbstractC29371Dh() { // from class: X.1iT
            @Override // X.InterfaceC03830Db
            public final float LIZ(View view, ViewGroup viewGroup) {
                if (C16310kV.LIZLLL(viewGroup) == 1) {
                    return view.getTranslationX() + viewGroup.getWidth();
                }
                return view.getTranslationX() - viewGroup.getWidth();
            }
        };
        new AbstractC29381Di() { // from class: X.1iU
            @Override // X.InterfaceC03830Db
            public final float LIZIZ(View view, ViewGroup viewGroup) {
                return view.getTranslationY() - viewGroup.getHeight();
            }
        };
        new AbstractC29371Dh() { // from class: X.1iV
            @Override // X.InterfaceC03830Db
            public final float LIZ(View view, ViewGroup viewGroup) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
        };
        new AbstractC29371Dh() { // from class: X.1iW
            @Override // X.InterfaceC03830Db
            public final float LIZ(View view, ViewGroup viewGroup) {
                if (C16310kV.LIZLLL(viewGroup) == 1) {
                    return view.getTranslationX() - viewGroup.getWidth();
                }
                return view.getTranslationX() + viewGroup.getWidth();
            }
        };
        LLIIIILZ = new AbstractC29381Di() { // from class: X.1iX
            @Override // X.InterfaceC03830Db
            public final float LIZIZ(View view, ViewGroup viewGroup) {
                return view.getTranslationY() + viewGroup.getHeight();
            }
        };
    }

    public C40581iY() {
        C46121rU c46121rU = new C46121rU();
        c46121rU.LJLIL = 80;
        this.LL = c46121rU;
    }

    @Override // X.C1CW, X.AbstractC03490Bt
    public final void LIZLLL(C03860De c03860De) {
        C1CW.LJJIJL(c03860De);
        int[] iArr = new int[2];
        c03860De.LIZIZ.getLocationOnScreen(iArr);
        ((HashMap) c03860De.LIZ).put("android:slide:screenPosition", iArr);
    }

    @Override // X.AbstractC03490Bt
    public final void LJI(C03860De c03860De) {
        C1CW.LJJIJL(c03860De);
        int[] iArr = new int[2];
        c03860De.LIZIZ.getLocationOnScreen(iArr);
        ((HashMap) c03860De.LIZ).put("android:slide:screenPosition", iArr);
    }

    @Override // X.C1CW
    public final Animator LJJIZ(ViewGroup viewGroup, View view, C03860De c03860De) {
        if (c03860De == null) {
            return null;
        }
        int[] iArr = (int[]) ((HashMap) c03860De.LIZ).get("android:slide:screenPosition");
        return C03520Bw.LIZ(view, c03860De, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.LLIFFJFJJ.LIZ(view, viewGroup), this.LLIFFJFJJ.LIZIZ(view, viewGroup), LLIIII, this);
    }

    @Override // X.C1CW
    public final Animator LJJIL(ViewGroup viewGroup, View view, C03860De c03860De, C03860De c03860De2) {
        if (c03860De2 == null) {
            return null;
        }
        int[] iArr = (int[]) ((HashMap) c03860De2.LIZ).get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C03520Bw.LIZ(view, c03860De2, iArr[0], iArr[1], this.LLIFFJFJJ.LIZ(view, viewGroup), this.LLIFFJFJJ.LIZIZ(view, viewGroup), translationX, translationY, LLII, this);
    }
}
