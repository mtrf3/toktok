package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import fjb.a;
import java.util.List;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM$feedReachUpdate$1", f = "EcVideoGuideVM.kt", l = {386, 386}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ECJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ReachCfg LJLILLLLZI;
    public final /* synthetic */ EcVideoGuideVM LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECJ(ReachCfg reachCfg, EcVideoGuideVM ecVideoGuideVM, int i, int i2, InterfaceC67352kd<? super ECJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = reachCfg;
        this.LJLJI = ecVideoGuideVM;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ECJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C3C5.m7constructorimpl(obj);
                return C76800UCe.LIZ;
            }
        } else {
            C141335gf.LIZJ(obj);
            ReachCfg reachCfg = this.LJLILLLLZI;
            EcVideoGuideVM ecVideoGuideVM = this.LJLJI;
            int i2 = this.LJLJJI;
            int i3 = this.LJLJJL;
            List LJJIJ = C47261Igj.LJJIJ(reachCfg);
            String str = ecVideoGuideVM.LJLJJL;
            java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("mall_request_scene", new Integer(i2)));
            ECI eci = new ECI(ecVideoGuideVM, i3, LJJIJ, i2, null);
            this.LJLIL = 2;
            obj = C36669EaH.LIZLLL(str, LJJIIZI, eci, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C3C5.m7constructorimpl((C64797Pbt) obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
