package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.live.liveinteract.multimatch.business.presenter.audience.MultiMatchAudienceViewPresenter$moveToBattleStart$2", f = "MultiMatchAudienceViewPresenter.kt", l = {546}, m = "invokeSuspend")
/* renamed from: X.Ty5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76365Ty5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<BattleTeamUserArmies> LJLILLLLZI;
    public final /* synthetic */ C76286Two LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76365Ty5(int i, C76286Two c76286Two, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = c76286Two;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        List<BattleTeamUserArmies> list = this.LJLILLLLZI;
        return new C76365Ty5(this.LJLJJI, this.LJLJI, list, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                C76386TyQ c76386TyQ = new C76386TyQ(this.LJLJJI, this.LJLJI, this.LJLILLLLZI, null);
                this.LJLIL = 1;
                if (C74209TAn.LIZIZ(4000L, c76386TyQ, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (C74185T9p unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Start Battle Delay - over 4000ms --- armies size ");
            LIZ.append(this.LJLILLLLZI.size());
            C0NB.LIZIZ("MultiMatchAudienceViewP", X1D.LIZIZ(LIZ));
            C76271TwZ.LJJLIIIJ(C76271TwZ.LIZ, C76265TwT.LIZ.LIZIZ(), B5G.LIZIZ().LJFF);
            this.LJLJI.LJFF(this.LJLJJI, this.LJLILLLLZI);
            this.LJLJI.LJIL(this.LJLILLLLZI, 0L, 0L);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
