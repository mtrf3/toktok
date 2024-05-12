package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.Vnc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80812Vnc implements Comparator<View> {
    @Override // java.util.Comparator
    public final int compare(View view, View view2) {
        C80805VnV c80805VnV = (C80805VnV) view.getLayoutParams();
        C80805VnV c80805VnV2 = (C80805VnV) view2.getLayoutParams();
        boolean z = c80805VnV.LIZ;
        if (z != c80805VnV2.LIZ) {
            if (z) {
                return 1;
            }
            return -1;
        }
        return c80805VnV.LJ - c80805VnV2.LJ;
    }
}
