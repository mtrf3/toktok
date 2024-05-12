package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.PdpRepositoryOptimized$fetchProductInfo$source$2$1", f = "PdpRepositoryOptimized.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.RcJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69919RcJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ IPdpStarter.PdpEnterParam LJLIL;
    public final /* synthetic */ ProductPackStruct LJLILLLLZI;
    public final /* synthetic */ RYH LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69919RcJ(IPdpStarter.PdpEnterParam pdpEnterParam, ProductPackStruct productPackStruct, RYH ryh, int i, long j, InterfaceC67352kd<? super C69919RcJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = pdpEnterParam;
        this.LJLILLLLZI = productPackStruct;
        this.LJLJI = ryh;
        this.LJLJJI = i;
        this.LJLJJL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69919RcJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C69995RdX c69995RdX = C69995RdX.LJLILLLLZI;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LJLIL;
        ProductPackStruct productPackStruct = this.LJLILLLLZI;
        RYH resp = this.LJLJI;
        o.LJIIIIZZ(resp, "resp");
        int i = this.LJLJJI;
        long j = this.LJLJJL;
        c69995RdX.getClass();
        C69995RdX.LLLZ(pdpEnterParam, productPackStruct, resp, i, j);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
