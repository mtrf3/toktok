package X;

import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDetailListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDetailListViewModel$onRefresh$awemeTask$1", f = "NowDetailListViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7NA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7NA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Aweme>, Object> {
    public final /* synthetic */ NowDetailListViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7NA(NowDetailListViewModel nowDetailListViewModel, InterfaceC67352kd<? super C7NA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = nowDetailListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C7NA(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return DetailFeedServiceImpl.LJIIJ().LIZ(((C7N8) this.LJLIL.getState()).LJLILLLLZI, null);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Aweme> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
