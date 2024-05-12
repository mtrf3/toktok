package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.Vpt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80953Vpt extends C80954Vpu {
    public static boolean LJLLILLLL = true;

    @Override // X.C78894Uxm
    public void LJII(int i, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.LJII(i, view);
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
