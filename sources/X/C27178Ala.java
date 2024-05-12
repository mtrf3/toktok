package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.ProductDescImageViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.ProductDescImageViewHolder$onBind$4", f = "ProductDescImageViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Ala, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27178Ala extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ProductDescImageViewHolder LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27178Ala(ProductDescImageViewHolder productDescImageViewHolder, InterfaceC67352kd<? super C27178Ala> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = productDescImageViewHolder;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        PdpViewModel viewModel = this.LJLIL.getViewModel();
        viewModel.LLJJI = true;
        viewModel.setState(new AqS178S0100000_12(viewModel, 67));
        View findViewById = this.LJLIL.itemView.findViewById(R.id.nav);
        o.LJIIIIZZ(findViewById, "itemView.view_more");
        C78946Uyc.LJJIIJ(findViewById, new C70919RsR(), C27181Ald.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C27178Ala(this.LJLIL, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
