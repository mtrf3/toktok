package X;

import android.view.View;

/* renamed from: X.1iZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40591iZ extends C17J {
    public static boolean LJLJLJ = true;

    public float LJJJJZI(View view) {
        if (LJLJLJ) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                LJLJLJ = false;
            }
        }
        return view.getAlpha();
    }

    public void LJJJLIIL(View view, float f) {
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
