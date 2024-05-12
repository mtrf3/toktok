package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescTextBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBodyViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescTextBrickVH$onBind$2", f = "ProductDescTextBrickVH.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.At8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27646At8 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ProductDescTextBrickVH LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27646At8(ProductDescTextBrickVH productDescTextBrickVH, InterfaceC67352kd<? super C27646At8> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = productDescTextBrickVH;
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
        return new C27646At8(this.LJLIL, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
