package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.5gy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141525gy {
    public static boolean LIZ(int i, int i2) {
        if (i2 * 9 >= i * 16 || Math.abs((i2 / i) - 1.7777777910232544d) < 0.1d) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(int i, int i2, View view) {
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        int LIZIZ = C81184Vtc.LIZIZ(context);
        int LJ = C81184Vtc.LJ(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (LIZIZ * 9 >= LJ * 16 && i < i2) {
            int i3 = (i * LIZIZ) / i2;
            layoutParams.width = i3;
            layoutParams.height = LIZIZ;
            layoutParams.leftMargin = (LJ - i3) / 2;
            layoutParams.topMargin = 0;
        } else {
            layoutParams.width = LJ;
            int i4 = (i2 * LJ) / i;
            layoutParams.height = i4;
            int i5 = (LIZIZ - i4) / 2;
            layoutParams.topMargin = i5;
            if (i5 < 0) {
                i5 = 0;
            }
            layoutParams.topMargin = i5;
            layoutParams.leftMargin = 0;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        view.setLayoutParams(layoutParams);
    }

    public static void LIZJ(int i, int i2, View view) {
        Context context = view.getContext();
        int LIZIZ = C81184Vtc.LIZIZ(context);
        int LJ = C81184Vtc.LJ(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (LIZIZ * 9 >= LJ * 16 && i < i2) {
            int i3 = (i * LIZIZ) / i2;
            layoutParams.width = i3;
            layoutParams.height = LIZIZ;
            layoutParams.leftMargin = (LJ - i3) / 2;
            layoutParams.topMargin = 0;
        } else {
            layoutParams.width = LJ;
            layoutParams.height = LIZIZ;
            layoutParams.topMargin = 0;
            layoutParams.leftMargin = 0;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        view.setLayoutParams(layoutParams);
    }

    public static void LIZLLL(int i, int i2, View view) {
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        int LIZLLL = C81184Vtc.LIZLLL(context);
        int LJ = C81184Vtc.LJ(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (LIZLLL * 9 >= LJ * 16 && i < i2) {
            int LJFF = C81184Vtc.LJFF(context) + LIZLLL;
            int i3 = (i2 * LJ) / i;
            layoutParams.width = LJ;
            layoutParams.height = i3;
            if (i3 < LJFF) {
                int i4 = (LJFF - i3) / 2;
                layoutParams.topMargin = i4;
                layoutParams.bottomMargin = i4;
            }
            float f = ((i * 1.0f) / LJ) * ((LJFF * 1.0f) / i2);
            view.setScaleX(f);
            view.setScaleY(f);
        } else {
            int i5 = (i * LIZLLL) / i2;
            layoutParams.width = i5;
            layoutParams.height = LIZLLL;
            if (i5 < LJ) {
                int i6 = (LJ - i5) / 2;
                layoutParams.leftMargin = i6;
                layoutParams.rightMargin = i6;
            }
            float f2 = ((LJ * 1.0f) / i) * ((i2 * 1.0f) / LIZLLL);
            view.setScaleX(f2);
            view.setScaleY(f2);
        }
        view.setLayoutParams(layoutParams);
    }
}
