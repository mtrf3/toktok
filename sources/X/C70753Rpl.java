package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryViewModel;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rpl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70753Rpl extends AbstractC70752Rpk {
    public final /* synthetic */ ReviewGalleryFragment LJLJI;

    public C70753Rpl(ReviewGalleryFragment reviewGalleryFragment) {
        this.LJLJI = reviewGalleryFragment;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 2) {
            ReviewGalleryFragment reviewGalleryFragment = this.LJLJI;
            if (reviewGalleryFragment.LJLLL > reviewGalleryFragment.LJLLLL) {
                ReviewGalleryViewModel wl = reviewGalleryFragment.wl();
                int i2 = reviewGalleryFragment.LJLLL;
                wl.getClass();
                wl.withState(new AqS99S0101000_12(i2, wl, 24));
            }
        }
    }
}
