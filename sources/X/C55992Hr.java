package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.2Hr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C55992Hr extends C538129h {
    public static boolean LJLLILLLL = true;

    @Override // X.C17J
    public void LJJJJJ(int i, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.LJJJJJ(i, view);
        } else {
            if (!LJLLILLLL) {
                return;
            }
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                LJLLILLLL = false;
            }
        }
    }
}
