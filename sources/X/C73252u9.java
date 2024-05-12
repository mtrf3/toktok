package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.shop.ShopCell$onBind$15", f = "ShopProvider.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2u9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73252u9 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;

    public C73252u9(InterfaceC67352kd<? super C73252u9> interfaceC67352kd) {
        super(3, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        AnonymousClass030.LJ((View) this.LJLIL, R.string.nqc);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C73252u9 c73252u9 = new C73252u9(interfaceC67352kd);
        c73252u9.LJLIL = view;
        return c73252u9.invokeSuspend(C76800UCe.LIZ);
    }
}
