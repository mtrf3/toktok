package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.VnY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80808VnY implements Comparator<View> {
    @Override // java.util.Comparator
    public final int compare(View view, View view2) {
        View lhs = view;
        View rhs = view2;
        o.LJIIIZ(lhs, "lhs");
        o.LJIIIZ(rhs, "rhs");
        ViewGroup.LayoutParams layoutParams = lhs.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.LayoutParams");
        C80804VnU c80804VnU = (C80804VnU) layoutParams;
        ViewGroup.LayoutParams layoutParams2 = rhs.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.LayoutParams");
        C80804VnU c80804VnU2 = (C80804VnU) layoutParams2;
        boolean z = c80804VnU.LIZ;
        if (z != c80804VnU2.LIZ) {
            if (z) {
                return 1;
            }
            return -1;
        }
        return c80804VnU.LJ - c80804VnU2.LJ;
    }
}
