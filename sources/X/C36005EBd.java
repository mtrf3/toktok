package X;

import com.google.gson.Gson;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel;
import com.ss.android.ugc.aweme.result.common.core.model.SearchLiveList;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel$fetchData$1$liveList$1", f = "LiveVerticalViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EBd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36005EBd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super SearchLiveList>, Object> {
    public final /* synthetic */ LiveVerticalViewModel LJLIL;
    public final /* synthetic */ m LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36005EBd(LiveVerticalViewModel liveVerticalViewModel, m mVar, InterfaceC67352kd<? super C36005EBd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = liveVerticalViewModel;
        this.LJLILLLLZI = mVar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36005EBd(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            Gson gson = this.LJLIL.LJLIL;
            return gson.LJI(gson.LJIILJJIL(this.LJLILLLLZI), SearchLiveList.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super SearchLiveList> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
