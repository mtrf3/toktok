package X;

import android.view.View;

/* renamed from: X.Vpu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80954Vpu extends C80948Vpo {
    public static boolean LJLLI = true;

    @Override // X.C78894Uxm
    public void LJI(View view, int i, int i2, int i3, int i4) {
        if (LJLLI) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                LJLLI = false;
            }
        }
    }
}
