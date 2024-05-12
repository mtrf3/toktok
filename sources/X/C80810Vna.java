package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.Vna, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80810Vna implements Comparator<View> {
    @Override // java.util.Comparator
    public final int compare(View view, View view2) {
        C80806VnW c80806VnW = (C80806VnW) view.getLayoutParams();
        C80806VnW c80806VnW2 = (C80806VnW) view2.getLayoutParams();
        boolean z = c80806VnW.LIZ;
        if (z != c80806VnW2.LIZ) {
            if (z) {
                return 1;
            }
            return -1;
        }
        return c80806VnW.LJ - c80806VnW2.LJ;
    }
}
