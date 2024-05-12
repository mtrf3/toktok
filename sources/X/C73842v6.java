package X;

import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.google.gson.internal.b;
import com.google.gson.m;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$updateButtons$3$1", f = "StoreFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2v6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73842v6 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73842v6(String str, InterfaceC67352kd<? super C73842v6> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        View view = (View) this.LJLIL;
        m mVar = new m();
        b.LJJIIZI("enter_from", "shop_page", mVar);
        b.LJJIIZI("enter_method", "shop_page_button_click", mVar);
        b.LJJIIZI("source_page_type", "show_window", mVar);
        Context context = view.getContext();
        android.net.Uri parse = UriProtector.parse(this.LJLILLLLZI);
        o.LJIIIIZZ(parse, "Uri.parse(this)");
        SmartRouter.buildRoute(context, String.valueOf(C45804HyK.LIZIZ(parse, new OSZ("trackParams", mVar)))).open();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C73842v6 c73842v6 = new C73842v6(this.LJLILLLLZI, interfaceC67352kd);
        c73842v6.LJLIL = view;
        return c73842v6.invokeSuspend(C76800UCe.LIZ);
    }
}
