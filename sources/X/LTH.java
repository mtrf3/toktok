package X;

import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM$noticeCityChanged$1", f = "DiscoveryLandingMapVM.kt", l = {812}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class LTH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DiscoveryLandingMapVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LTH(DiscoveryLandingMapVM discoveryLandingMapVM, InterfaceC67352kd<? super LTH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = discoveryLandingMapVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new LTH(this.LJLILLLLZI, interfaceC67352kd);
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
            C2U8.LIZ(new RoamingLocationInfo(null, null, false, 5));
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            LTI lti = new LTI(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, lti, this) == enumC58928NAu) {
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