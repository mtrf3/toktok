package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Aun, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27749Aun extends C0A6 {
    public int LJLIL;
    public final /* synthetic */ ReviewFragmentV1 LJLILLLLZI;

    public C27749Aun(ReviewFragmentV1 reviewFragmentV1) {
        this.LJLILLLLZI = reviewFragmentV1;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL += i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("offset:");
        LIZ.append(this.LJLIL);
        LIZ.append(", dy:");
        LIZ.append(i2);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        if (this.LJLIL < (C27162AlK.LIZIZ - this.LJLILLLLZI._$_findCachedViewById(R.id.j13).getHeight()) - C27162AlK.LJIIL) {
            this.LJLILLLLZI._$_findCachedViewById(R.id.leb).setVisibility(8);
        } else {
            this.LJLILLLLZI._$_findCachedViewById(R.id.leb).setVisibility(0);
        }
    }
}
