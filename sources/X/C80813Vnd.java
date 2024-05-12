package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.Vnd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80813Vnd implements Comparator<View> {
    @Override // java.util.Comparator
    public final int compare(View view, View view2) {
        C80807VnX c80807VnX = (C80807VnX) view.getLayoutParams();
        C80807VnX c80807VnX2 = (C80807VnX) view2.getLayoutParams();
        boolean z = c80807VnX.LIZ;
        if (z != c80807VnX2.LIZ) {
            if (z) {
                return 1;
            }
            return -1;
        }
        return c80807VnX.LJ - c80807VnX2.LJ;
    }
}
