package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v1.PdpSkuHolder;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v1.PdpSkuHolder$onBind$2$1$3$3$1", f = "PdpSkuHolder.kt", l = {103, 112}, m = "invokeSuspend")
/* renamed from: X.ArD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27527ArD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public LinearLayoutManager LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public final /* synthetic */ PdpSkuHolder LJLJJL;
    public final /* synthetic */ List<String> LJLJJLL;
    public final /* synthetic */ C27528ArE LJLJL;
    public final /* synthetic */ C27424ApY LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27527ArD(PdpSkuHolder pdpSkuHolder, List<String> list, C27528ArE c27528ArE, C27424ApY c27424ApY, InterfaceC67352kd<? super C27527ArD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = pdpSkuHolder;
        this.LJLJJLL = list;
        this.LJLJL = c27528ArE;
        this.LJLJLJ = c27424ApY;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27527ArD(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27527ArD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
