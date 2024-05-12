package X;

import com.bytedance.android.live.liveinteract.api.LinkAnchorPocChangedEvent;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.live.liveinteract.multimatch.business.presenter.audience.MultiMatchAudienceViewPresenter$moveToBattleStart$2$1", f = "MultiMatchAudienceViewPresenter.kt", l = {792}, m = "invokeSuspend")
/* renamed from: X.TyQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76386TyQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C76286Two LJLJJI;
    public final /* synthetic */ List<BattleTeamUserArmies> LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76386TyQ(int i, C76286Two c76286Two, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c76286Two;
        this.LJLJJL = list;
        this.LJLJJLL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C76386TyQ c76386TyQ = new C76386TyQ(this.LJLJJLL, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c76386TyQ.LJLJI = obj;
        return c76386TyQ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Object obj2 = this.LJLJI;
            C76286Two c76286Two = this.LJLJJI;
            List<BattleTeamUserArmies> list = this.LJLJJL;
            int i2 = this.LJLJJLL;
            this.LJLJI = obj2;
            this.LJLIL = list;
            this.LJLILLLLZI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            C0NB.LIZIZ("MultiMatchAudienceViewP", "Start Battle continuation inner begin");
            DataChannel LJIIIIZZ = c76286Two.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                LJIIIIZZ.mv0(LinkAnchorPocChangedEvent.class, obj2, new C76387TyR(xks, list, c76286Two, i2));
            }
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
