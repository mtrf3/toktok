package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.VnB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80785VnB implements Comparator<View> {
    @Override // java.util.Comparator
    public final int compare(View view, View view2) {
        C80781Vn7 c80781Vn7 = (C80781Vn7) view.getLayoutParams();
        C80781Vn7 c80781Vn72 = (C80781Vn7) view2.getLayoutParams();
        boolean z = c80781Vn7.LIZ;
        if (z != c80781Vn72.LIZ) {
            if (z) {
                return 1;
            }
            return -1;
        }
        return c80781Vn7.LJ - c80781Vn72.LJ;
    }
}
