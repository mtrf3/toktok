package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.RuD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71029RuD implements VTX {
    public final /* synthetic */ ReviewFragmentV1 LIZ;

    public C71029RuD(ReviewFragmentV1 reviewFragmentV1) {
        this.LIZ = reviewFragmentV1;
    }

    @Override // X.VTY
    public final void LIZ(C80217Ve1 c80217Ve1, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height = c80217Ve1.getHeight() + i;
        ViewGroup.LayoutParams layoutParams = this.LIZ._$_findCachedViewById(R.id.j1a).getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = null;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.topMargin == height) {
            return;
        }
        View review_status_v1 = this.LIZ._$_findCachedViewById(R.id.j1a);
        o.LJIIIIZZ(review_status_v1, "review_status_v1");
        ViewGroup.LayoutParams layoutParams3 = review_status_v1.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            layoutParams2 = layoutParams3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (marginLayoutParams2 == null) {
            return;
        }
        marginLayoutParams2.topMargin = height;
        review_status_v1.setLayoutParams(marginLayoutParams2);
    }
}
