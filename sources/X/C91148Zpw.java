package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.Zpw, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91148Zpw implements Comparator<View> {
    @Override // java.util.Comparator
    public final int compare(View view, View view2) {
        View lhs = view;
        View rhs = view2;
        o.LJIIIZ(lhs, "lhs");
        o.LJIIIZ(rhs, "rhs");
        ViewGroup.LayoutParams layoutParams = lhs.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.LayoutParams");
        C91145Zpt c91145Zpt = (C91145Zpt) layoutParams;
        ViewGroup.LayoutParams layoutParams2 = rhs.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.LayoutParams");
        C91145Zpt c91145Zpt2 = (C91145Zpt) layoutParams2;
        boolean z = c91145Zpt.LIZ;
        if (z != c91145Zpt2.LIZ) {
            if (z) {
                return 1;
            }
            return -1;
        }
        return c91145Zpt.LJ - c91145Zpt2.LJ;
    }
}
