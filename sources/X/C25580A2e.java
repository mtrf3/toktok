package X;

import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidContentReview;
import com.ss.android.ugc.aweme.paidcontent.api.PaidCollectionReviewDetailApi;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReviewDetailsFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A2e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25580A2e implements InterfaceC86443XwF {
    public final /* synthetic */ InterfaceC35811ar<List<A4Y>> LIZ;
    public final /* synthetic */ CollectionDetailModel LIZIZ;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LIZJ;
    public final /* synthetic */ PaidContentReviewDetailsFragment LIZLLL;
    public final /* synthetic */ ComposeView LJ;

    @Override // X.InterfaceC86443XwF
    public final void onError() {
        ActivityC45651qj mo49getActivity = this.LIZLLL.mo49getActivity();
        if (mo49getActivity != null) {
            ComposeView composeView = this.LJ;
            C26045AKb c26045AKb = new C26045AKb(mo49getActivity);
            c26045AKb.LJIIIZ(composeView.getResources().getString(R.string.rjt));
            c26045AKb.LJIIJ();
        }
    }

    @Override // X.InterfaceC86443XwF
    public final void LIZ(PaidCollectionReviewDetailApi.PaidCollectionReviewDetailResponse resp) {
        o.LJIIIZ(resp, "resp");
        List<PaidContentReview> list = resp.reviews;
        InterfaceC35811ar<List<A4Y>> interfaceC35811ar = this.LIZ;
        CollectionDetailModel collectionDetailModel = this.LIZIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (PaidContentReview paidContentReview : list) {
            List<A4Y> LLJILJILJ = ORZ.LLJILJILJ(interfaceC35811ar.getValue());
            ((ArrayList) LLJILJILJ).addAll(A4S.LJIIJ(paidContentReview, collectionDetailModel.getCollectionId()));
            interfaceC35811ar.setValue(LLJILJILJ);
            arrayList.add(C76800UCe.LIZ);
        }
        this.LIZJ.setValue(Boolean.valueOf(resp.hasMore));
    }

    public C25580A2e(InterfaceC35811ar<List<A4Y>> interfaceC35811ar, CollectionDetailModel collectionDetailModel, InterfaceC35811ar<Boolean> interfaceC35811ar2, PaidContentReviewDetailsFragment paidContentReviewDetailsFragment, ComposeView composeView) {
        this.LIZ = interfaceC35811ar;
        this.LIZIZ = collectionDetailModel;
        this.LIZJ = interfaceC35811ar2;
        this.LIZLLL = paidContentReviewDetailsFragment;
        this.LJ = composeView;
    }
}
