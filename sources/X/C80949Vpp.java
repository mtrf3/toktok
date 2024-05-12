package X;

import android.view.View;

/* renamed from: X.Vpp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80949Vpp extends C78894Uxm {
    public static boolean LJLJLJ = true;

    public float LJIIIIZZ(View view) {
        if (LJLJLJ) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                LJLJLJ = false;
            }
        }
        return view.getAlpha();
    }

    public void LJIIIZ(View view, float f) {
        if (LJLJLJ) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                LJLJLJ = false;
            }
        }
        view.setAlpha(f);
    }
}
