package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.RuE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71030RuE implements VTX {
    public final /* synthetic */ ReviewFragment LIZ;

    public C71030RuE(ReviewFragment reviewFragment) {
        this.LIZ = reviewFragment;
    }

    @Override // X.VTY
    public final void LIZ(C80217Ve1 c80217Ve1, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height = c80217Ve1.getHeight() + i;
        ViewGroup.LayoutParams layoutParams = this.LIZ._$_findCachedViewById(R.id.j1_).getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = null;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.topMargin == height) {
            return;
        }
        View review_status = this.LIZ._$_findCachedViewById(R.id.j1_);
        o.LJIIIIZZ(review_status, "review_status");
        ViewGroup.LayoutParams layoutParams3 = review_status.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            layoutParams2 = layoutParams3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (marginLayoutParams2 == null) {
            return;
        }
        marginLayoutParams2.topMargin = height;
        review_status.setLayoutParams(marginLayoutParams2);
    }
}
