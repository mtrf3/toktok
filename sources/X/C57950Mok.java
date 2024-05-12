package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$onRefreshSuccess$1", f = "UserCardListViewModel.kt", l = {SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.Mok, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57950Mok extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ UserCardListViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57950Mok(long j, UserCardListViewModel userCardListViewModel, InterfaceC67352kd<? super C57950Mok> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = userCardListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57950Mok(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            long j = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C57979MpD c57979MpD = this.LJLJI.jv0().LJLLJ;
        if ((c57979MpD instanceof C57979MpD) && c57979MpD != null) {
            c57979MpD.LIZ = true;
        }
        AYY ayy = AYY.LIZ;
        String str = this.LJLJI.LJLJJL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("delay ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", set PageMerge to is append");
        String LIZIZ = X1D.LIZIZ(LIZ);
        ayy.getClass();
        AYY.LIZIZ(str, LIZIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
