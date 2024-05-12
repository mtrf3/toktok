package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopBill;
import com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.shop.TtfShopInfoVH;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.shop.TtfShopInfoVH$updateSalesTaxView$1$1", f = "TtfShopInfoVH.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Afc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26808Afc extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TtfShopInfoVH LJLIL;
    public final /* synthetic */ C26804AfY LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26808Afc(TtfShopInfoVH ttfShopInfoVH, C26804AfY c26804AfY, InterfaceC67352kd<? super C26808Afc> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = ttfShopInfoVH;
        this.LJLILLLLZI = c26804AfY;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        BillItem salesTax;
        String itemText;
        BillItem salesTax2;
        C141335gf.LIZJ(obj);
        TtfShopInfoVH ttfShopInfoVH = this.LJLIL;
        C26804AfY c26804AfY = this.LJLILLLLZI;
        ttfShopInfoVH.getClass();
        Context context = ttfShopInfoVH.LJLIL.getContext();
        o.LJIIIIZZ(context, "view.context");
        C26227ARb LIZ = C3AW.LIZ(context);
        ShopBill shopBill = c26804AfY.LJ;
        String str2 = "";
        if (shopBill == null || (salesTax2 = shopBill.getSalesTax()) == null || (str = salesTax2.getItemName()) == null) {
            str = "";
        }
        LIZ.LJFF(str);
        ShopBill shopBill2 = c26804AfY.LJ;
        if (shopBill2 != null && (salesTax = shopBill2.getSalesTax()) != null && (itemText = salesTax.getItemText()) != null) {
            str2 = itemText;
        }
        LIZ.LIZIZ(str2);
        UC0.LIZJ(LIZ, C26810Afe.LJLIL);
        LIZ.LJI().LIZLLL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C26808Afc(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
