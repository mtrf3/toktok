package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescImageBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBodyViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescImageBrickVH$onBind$1", f = "ProductDescImageBrickVH.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.At9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27647At9 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ProductDescImageBrickVH LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27647At9(ProductDescImageBrickVH productDescImageBrickVH, InterfaceC67352kd<? super C27647At9> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = productDescImageBrickVH;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        PdpBodyViewModel L = this.LJLIL.L();
        L.LJLILLLLZI = true;
        L.withState(new AqS170S0100000_4(L, 1119));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C27647At9(this.LJLIL, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
