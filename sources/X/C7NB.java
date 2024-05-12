package X;

import com.ss.android.ugc.aweme.models.UserPublishInfo;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDetailListViewModel$onRefresh$userPublishInfoTask$1", f = "NowDetailListViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7NB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7NB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super UserPublishInfo>, Object> {
    public C7NB(InterfaceC67352kd<? super C7NB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C7NB(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C78596Usy.LJJIFFI().LIZLLL.LLIIIL();
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super UserPublishInfo> interfaceC67352kd) {
        return new C7NB(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
