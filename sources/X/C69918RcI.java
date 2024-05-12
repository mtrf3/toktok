package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.PdpRepositoryOptimized$fetchProductInfo$source$4$1", f = "PdpRepositoryOptimized.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.RcI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69918RcI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ IPdpStarter.PdpEnterParam LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69918RcI(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i, InterfaceC67352kd<? super C69918RcI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = pdpEnterParam;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69918RcI(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C69995RdX c69995RdX = C69995RdX.LJLILLLLZI;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        int i = this.LJLJI;
        c69995RdX.getClass();
        C69995RdX.LLLZI(pdpEnterParam, z, i);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
