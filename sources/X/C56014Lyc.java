package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.Card;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.CommonBlock;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.PageData;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS113S0300000_9;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$updateToolbarState$1", f = "ShopMainViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Lyc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56014Lyc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ShopMainViewModel LJLIL;
    public final /* synthetic */ ShopMainResponse LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56014Lyc(ShopMainViewModel shopMainViewModel, ShopMainResponse shopMainResponse, InterfaceC67352kd<? super C56014Lyc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = shopMainViewModel;
        this.LJLILLLLZI = shopMainResponse;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56014Lyc(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Card card;
        Card card2;
        boolean z;
        CommonBlock LJIJI;
        CommonBlock LJIJI2;
        C141335gf.LIZJ(obj);
        C36746EbW.LIZ(3, "Redbadge update toolAreaInfo");
        this.LJLIL.lv0().LJLLLL = false;
        ShopMainViewModel shopMainViewModel = this.LJLIL;
        PageData pageData = this.LJLILLLLZI.getPageData();
        CommonBlock commonBlock = null;
        if (pageData != null && (LJIJI2 = C78946Uyc.LJIJI(pageData)) != null) {
            card = C1JI.LJIIJ(LJIJI2, EnumC56134M1i.CARD_TYPE_CART_ENTRY.getValue());
        } else {
            card = null;
        }
        C55817LvR gv0 = shopMainViewModel.gv0(card);
        ShopMainViewModel shopMainViewModel2 = this.LJLIL;
        PageData pageData2 = this.LJLILLLLZI.getPageData();
        if (pageData2 != null && (LJIJI = C78946Uyc.LJIJI(pageData2)) != null) {
            card2 = C1JI.LJIIJ(LJIJI, EnumC56134M1i.CARD_TYPE_MORE_ENTRY.getValue());
        } else {
            card2 = null;
        }
        C55964Lxo hv0 = shopMainViewModel2.hv0(card2);
        ShopMainViewModel shopMainViewModel3 = this.LJLIL;
        PageData pageData3 = this.LJLILLLLZI.getPageData();
        if (pageData3 != null) {
            commonBlock = C78946Uyc.LJIIZILJ(pageData3);
        }
        List<ToolEntryVO> jv0 = shopMainViewModel3.jv0(commonBlock, true);
        PageData pageData4 = this.LJLILLLLZI.getPageData();
        if (pageData4 != null && C78946Uyc.LJIL(pageData4)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C56020Lyi lv0 = this.LJLIL.lv0();
            EnumC55971Lxv enumC55971Lxv = EnumC55971Lxv.NEW;
            o.LJIIIZ(enumC55971Lxv, "<set-?>");
            lv0.LJLJJL = enumC55971Lxv;
            C56023Lyl.LIZ.LIZLLL(false);
        } else {
            C56020Lyi lv02 = this.LJLIL.lv0();
            EnumC55971Lxv enumC55971Lxv2 = EnumC55971Lxv.OLD;
            o.LJIIIZ(enumC55971Lxv2, "<set-?>");
            lv02.LJLJJL = enumC55971Lxv2;
            C56023Lyl.LIZ.LIZLLL(true);
        }
        this.LJLIL.setStateImmediate(new AqS113S0300000_9(gv0, (C55817LvR) hv0, (C55964Lxo) jv0, (List<ToolEntryVO>) 15));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
