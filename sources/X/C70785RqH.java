package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.RqH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70785RqH extends C0A6 {
    public int LJLIL;
    public final /* synthetic */ ReviewFragment LJLILLLLZI;

    public C70785RqH(ReviewFragment reviewFragment) {
        this.LJLILLLLZI = reviewFragment;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        int i3 = this.LJLIL + i2;
        this.LJLIL = i3;
        if (i3 < (C27162AlK.LIZIZ - this.LJLILLLLZI._$_findCachedViewById(R.id.j11).getHeight()) - C27162AlK.LJIIL) {
            this.LJLILLLLZI._$_findCachedViewById(R.id.le_).setVisibility(8);
        } else {
            this.LJLILLLLZI._$_findCachedViewById(R.id.le_).setVisibility(0);
        }
    }
}
