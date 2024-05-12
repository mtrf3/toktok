package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.Card;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.CommonBlock;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.PageData;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$updateState$1", f = "ShopMainViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.LyY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56010LyY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ShopMainResponse LJLIL;
    public final /* synthetic */ ShopMainViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ EnumC56007LyV LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56010LyY(ShopMainResponse shopMainResponse, ShopMainViewModel shopMainViewModel, boolean z, EnumC56007LyV enumC56007LyV, String str, InterfaceC67352kd<? super C56010LyY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = shopMainResponse;
        this.LJLILLLLZI = shopMainViewModel;
        this.LJLJI = z;
        this.LJLJJI = enumC56007LyV;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56010LyY(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        boolean z;
        Card card;
        Card card2;
        List<ToolEntryVO> list;
        boolean z2;
        boolean z3;
        CommonBlock commonBlock;
        CommonBlock LJIJI;
        CommonBlock LJIJI2;
        C141335gf.LIZJ(obj);
        C36746EbW.LIZ(3, "Redbadge update toolAreaInfo");
        PageData pageData = this.LJLIL.getPageData();
        if (pageData != null) {
            bool = Boolean.valueOf(C78946Uyc.LJIL(pageData));
        } else {
            bool = null;
        }
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            C56020Lyi lv0 = this.LJLILLLLZI.lv0();
            EnumC55971Lxv enumC55971Lxv = EnumC55971Lxv.NEW;
            o.LJIIIZ(enumC55971Lxv, "<set-?>");
            lv0.LJLJJL = enumC55971Lxv;
            C56023Lyl.LIZ.LIZLLL(false);
        } else {
            C56020Lyi lv02 = this.LJLILLLLZI.lv0();
            EnumC55971Lxv enumC55971Lxv2 = EnumC55971Lxv.OLD;
            o.LJIIIZ(enumC55971Lxv2, "<set-?>");
            lv02.LJLJJL = enumC55971Lxv2;
            C56023Lyl.LIZ.LIZLLL(true);
        }
        C56020Lyi lv03 = this.LJLILLLLZI.lv0();
        if (this.LJLJI && this.LJLJJI == EnumC56007LyV.FIRST_REQUEST) {
            z = true;
        } else {
            z = false;
        }
        lv03.LJLLLL = z;
        ShopMainViewModel shopMainViewModel = this.LJLILLLLZI;
        PageData pageData2 = this.LJLIL.getPageData();
        if (pageData2 != null && (LJIJI2 = C78946Uyc.LJIJI(pageData2)) != null) {
            card = C1JI.LJIIJ(LJIJI2, EnumC56134M1i.CARD_TYPE_CART_ENTRY.getValue());
        } else {
            card = null;
        }
        C55817LvR gv0 = shopMainViewModel.gv0(card);
        ShopMainViewModel shopMainViewModel2 = this.LJLILLLLZI;
        PageData pageData3 = this.LJLIL.getPageData();
        if (pageData3 != null && (LJIJI = C78946Uyc.LJIJI(pageData3)) != null) {
            card2 = C1JI.LJIIJ(LJIJI, EnumC56134M1i.CARD_TYPE_MORE_ENTRY.getValue());
        } else {
            card2 = null;
        }
        C55964Lxo hv0 = shopMainViewModel2.hv0(card2);
        if (!o.LJ(bool, bool2)) {
            ShopMainViewModel shopMainViewModel3 = this.LJLILLLLZI;
            PageData pageData4 = this.LJLIL.getPageData();
            if (pageData4 != null) {
                commonBlock = C78946Uyc.LJIIZILJ(pageData4);
            } else {
                commonBlock = null;
            }
            list = shopMainViewModel3.jv0(commonBlock, this.LJLJI);
            if (list != null) {
                boolean z4 = this.LJLJI;
                EnumC56007LyV enumC56007LyV = this.LJLJJI;
                ShopMainViewModel shopMainViewModel4 = this.LJLILLLLZI;
                if (z4 && enumC56007LyV == EnumC56007LyV.FIRST_REQUEST && shopMainViewModel4.LJLLILLLL == null) {
                    shopMainViewModel4.LJLLILLLL = new LinkedHashSet();
                    for (ToolEntryVO toolEntryVO : list) {
                        java.util.Set<Integer> set = shopMainViewModel4.LJLLILLLL;
                        if (set != null) {
                            set.add(new Integer(toolEntryVO.getCardType()));
                        }
                    }
                }
            }
        } else {
            list = null;
        }
        C36746EbW.LIZ(3, "UpdateToolPanel old user toolPanel set state");
        if (this.LJLILLLLZI.lv0().LJLLLLLL != ILR.COMPLETED) {
            if (!this.LJLJI) {
                C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
                String stage = EnumC56081Lzh.STAGE_SET_DATA_STATE.getStage();
                String str = this.LJLILLLLZI.lv0().LJZ;
                long currentTimeMillis = System.currentTimeMillis() - C56090Lzq.LIZ;
                if (this.LJLILLLLZI.lv0().LJLLLLLL == ILR.FAILED) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C56045Lz7.LJIILIIL(c56045Lz7, stage, str, currentTimeMillis, z3, E2C.LIZJ("is_data_cache", "1"), 8);
            } else {
                C56045Lz7 c56045Lz72 = C56045Lz7.LIZ;
                String stage2 = EnumC56081Lzh.STAGE_SET_DATA_STATE.getStage();
                String str2 = this.LJLILLLLZI.lv0().LJZ;
                long currentTimeMillis2 = System.currentTimeMillis() - C56090Lzq.LIZ;
                if (this.LJLILLLLZI.lv0().LJLLLLLL == ILR.FAILED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C56045Lz7.LJIILIIL(c56045Lz72, stage2, str2, currentTimeMillis2, z2, E2C.LIZJ("is_data_cache", CardStruct.IStatusCode.DEFAULT), 8);
            }
        }
        this.LJLILLLLZI.setStateImmediate(new C56017Lyf(gv0, hv0, list, this.LJLIL, this.LJLJI, this.LJLJJL, this.LJLJJI, bool));
        C56045Lz7 c56045Lz73 = C56045Lz7.LIZ;
        int status = EnumC56039Lz1.HIDE.getStatus();
        c56045Lz73.getClass();
        C56045Lz7.LJII(status, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
