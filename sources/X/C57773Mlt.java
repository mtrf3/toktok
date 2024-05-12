package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$onPrepared$2", f = "UserCardListViewModel.kt", l = {184}, m = "invokeSuspend")
/* renamed from: X.Mlt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57773Mlt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ UserCardListViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57773Mlt(UserCardListViewModel userCardListViewModel, InterfaceC67352kd<? super C57773Mlt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = userCardListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57773Mlt(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C57576Mii c57576Mii = C57576Mii.LIZ;
            String str = this.LJLILLLLZI.LJLIL.getTrackerConfig().LIZ;
            this.LJLIL = 1;
            if (C56667MLv.LIZ(c57576Mii, str, this, 1) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
