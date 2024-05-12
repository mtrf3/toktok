package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailEagerReviewAssem;

/* renamed from: X.A2m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25588A2m implements V53 {
    public final /* synthetic */ PaidContentCollectionDetailEagerReviewAssem LIZ;
    public final /* synthetic */ InterfaceC35811ar<CollectionDetailModel> LIZIZ;

    public C25588A2m(PaidContentCollectionDetailEagerReviewAssem paidContentCollectionDetailEagerReviewAssem, InterfaceC35811ar<CollectionDetailModel> interfaceC35811ar) {
        this.LIZ = paidContentCollectionDetailEagerReviewAssem;
        this.LIZIZ = interfaceC35811ar;
    }

    @Override // X.V53
    public final void LIZIZ(int i, boolean z) {
        FragmentManager fragmentManager;
        if (!z) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this.LIZ);
            if (LIZ != null) {
                fragmentManager = LIZ.getSupportFragmentManager();
            } else {
                fragmentManager = null;
            }
            A4S.LJI(fragmentManager, i, ((C25594A2s) this.LIZ.LJLIL.getValue()).LJLILLLLZI, "eager_review", ((C25594A2s) this.LIZ.LJLIL.getValue()).LJLIL, this.LIZIZ.getValue(), null, null, 448);
        }
    }
}
