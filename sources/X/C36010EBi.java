package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultLiveViewModel$fetchLoadMoreData$response$1", f = "EcSearchResultLiveViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EBi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36010EBi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super m>, Object> {
    public final /* synthetic */ KFN LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36010EBi(KFN kfn, InterfaceC67352kd<? super C36010EBi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = kfn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36010EBi(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return EcSearchApi.LIZIZ(this.LJLIL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super m> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
