package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.ProductDescTextViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.ProductDescTextViewHolder$onBind$4", f = "ProductDescTextViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.AlX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27175AlX extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ProductDescTextViewHolder LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27175AlX(ProductDescTextViewHolder productDescTextViewHolder, InterfaceC67352kd<? super C27175AlX> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = productDescTextViewHolder;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        PdpViewModel pdpViewModel = (PdpViewModel) this.LJLIL.LJLJI.getValue();
        pdpViewModel.LLJJI = true;
        pdpViewModel.setState(new AqS178S0100000_12(pdpViewModel, 67));
        View findViewById = this.LJLIL.itemView.findViewById(R.id.nav);
        o.LJIIIIZZ(findViewById, "itemView.view_more");
        C78946Uyc.LJJIIJ(findViewById, new C70919RsR(), C27176AlY.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C27175AlX(this.LJLIL, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
