package X;

import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssemVM;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinRule;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.ConsultRegisterInfoResponse;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS8S1000000_31;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssemVM$requestRegisterInfo$2$1", f = "LandingAssemVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLw, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93132aLw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C64797Pbt<BaseResponse<ConsultRegisterInfoResponse>> LJLIL;
    public final /* synthetic */ LandingAssemVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93132aLw(C64797Pbt<BaseResponse<ConsultRegisterInfoResponse>> c64797Pbt, LandingAssemVM landingAssemVM, InterfaceC67352kd<? super C93132aLw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c64797Pbt;
        this.LJLILLLLZI = landingAssemVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93132aLw(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.LIZIZ()) {
            ConsultRegisterInfoResponse consultRegisterInfoResponse = this.LJLIL.LIZIZ.data;
            C92059a4d c92059a4d = C92059a4d.LIZ;
            ArrayList<PinRule> pinRules = consultRegisterInfoResponse.pinRuleList;
            c92059a4d.getClass();
            o.LJIIIZ(pinRules, "pinRules");
            ArrayList<PinRule> arrayList = C92059a4d.LIZLLL;
            arrayList.clear();
            arrayList.addAll(pinRules);
            this.LJLILLLLZI.setState(new IDqS418S0100000_31(consultRegisterInfoResponse, 94));
        } else {
            LandingAssemVM landingAssemVM = this.LJLILLLLZI;
            String str = this.LJLIL.LIZIZ.errorContent;
            landingAssemVM.getClass();
            landingAssemVM.setState(new IDqS8S1000000_31(str, 4));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
