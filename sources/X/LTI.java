package X;

import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM$noticeCityChanged$1$1", f = "DiscoveryLandingMapVM.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class LTI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ DiscoveryLandingMapVM LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LTI(DiscoveryLandingMapVM discoveryLandingMapVM, InterfaceC67352kd<? super LTI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = discoveryLandingMapVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new LTI(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC56168M2q interfaceC56168M2q = this.LJLIL.LJLJLLL;
        if (interfaceC56168M2q != null) {
            interfaceC56168M2q.LJFF();
        }
        InterfaceC56168M2q interfaceC56168M2q2 = this.LJLIL.LJLJLLL;
        if (interfaceC56168M2q2 != null) {
            interfaceC56168M2q2.LJII();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
