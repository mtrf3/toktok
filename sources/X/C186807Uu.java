package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel$extendFoldedList$1", f = "PoiReviewListViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186807Uu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PoiReviewListViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186807Uu(PoiReviewListViewModel poiReviewListViewModel, InterfaceC67352kd<? super C186807Uu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = poiReviewListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C186807Uu(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        PoiReviewListViewModel poiReviewListViewModel = this.LJLIL;
        poiReviewListViewModel.manualListLoadMore(new Long(poiReviewListViewModel.LJLJLJ));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
