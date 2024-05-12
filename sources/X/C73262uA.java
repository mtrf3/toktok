package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.shop.ShopCell$onBind$4", f = "ShopProvider.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2uA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73262uA extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;

    public C73262uA(InterfaceC67352kd<? super C73262uA> interfaceC67352kd) {
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
        C73262uA c73262uA = new C73262uA(interfaceC67352kd);
        c73262uA.LJLIL = view;
        return c73262uA.invokeSuspend(C76800UCe.LIZ);
    }
}
