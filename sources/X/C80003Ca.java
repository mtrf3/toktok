package X;

import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel$locationRefreshByUser$1", f = "SearchGlobalViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Ca, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80003Ca extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SearchGlobalViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80003Ca(SearchGlobalViewModel searchGlobalViewModel, InterfaceC67352kd<? super C80003Ca> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = searchGlobalViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80003Ca(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLLLL.postValue(Boolean.TRUE);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}