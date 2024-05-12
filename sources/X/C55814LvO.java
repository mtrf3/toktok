package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallShopCartAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.LvO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C55814LvO extends TBS implements InterfaceC88473Ynt<java.util.Map<String, ? extends String>, InterfaceC88472Yns<? super java.util.Map<String, ? extends String>, ? extends C76800UCe>, String, C76800UCe> {
    public C55814LvO(MallShopCartAssem mallShopCartAssem) {
        super(3, mallShopCartAssem, MallShopCartAssem.class, "setupCartClickListener", "setupCartClickListener(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(java.util.Map<String, ? extends String> map, InterfaceC88472Yns<? super java.util.Map<String, ? extends String>, ? extends C76800UCe> interfaceC88472Yns, String str) {
        java.util.Map<String, ? extends String> p0 = map;
        String p2 = str;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        ((MallShopCartAssem) this.receiver).v3(p2, p0, interfaceC88472Yns);
        return C76800UCe.LIZ;
    }
}
