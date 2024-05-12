package com.ss.android.ugc.aweme.ecommerce.fashionmall.vm;

import X.C113554cx;
import X.C27739Aud;
import X.C32I;
import X.C36746EbW;
import X.C47261Igj;
import X.C47704Ins;
import X.C48189Ivh;
import X.C51546KKw;
import X.C55749LuL;
import X.C55817LvR;
import X.C55913Lwz;
import X.C55973Lxx;
import X.C55978Ly2;
import X.C56008LyW;
import X.C56009LyX;
import X.C56010LyY;
import X.C56020Lyi;
import X.C56023Lyl;
import X.C56024Lym;
import X.C56045Lz7;
import X.C56090Lzq;
import X.C62562cu;
import X.C65330PkU;
import X.C65352Pkq;
import X.C76542zS;
import X.C78404Ups;
import X.C78565UsT;
import X.C78613UtF;
import X.C79057V0z;
import X.C84661XKn;
import X.EV6;
import X.EnumC56006LyU;
import X.EnumC56007LyV;
import X.EnumC56059LzL;
import X.EnumC56081Lzh;
import X.EnumC56120M0u;
import X.EnumC56134M1i;
import X.EnumC64802gW;
import X.FKM;
import X.HG3;
import X.ILR;
import X.JBR;
import X.ORZ;
import X.OSZ;
import X.RBX;
import X.X1D;
import android.content.res.Resources;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.Card;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.CardTip;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.CommonBlock;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.MallToolPanelData;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.settings.ECFashionMallConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto.ToolPanelEntryCardFullDTO;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto.ToolPanelEntryCardStyleDTO;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto.ToolPanelEntryCardStyleKt;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto.ToolPanelEntryIconDTO;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto.ToolPanelEntryLinkDTO;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto.ToolPanelEntryTitleDTO;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.Notice;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ShopMainViewModel extends AssemViewModel<C55978Ly2> {
    public static final List<ToolEntryVO> LJLLJ;
    public volatile C84661XKn LJLIL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public Notice LJLL;
    public Set<Integer> LJLLILLLL;
    public String LJLILLLLZI = ((RBX) HG3.LJIILL()).getCurUserId();
    public final EV6 LJLJI = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C55913Lwz.class));
    public final C55749LuL LJLJJI = new C55749LuL(C47704Ins.LJFF(this, C56020Lyi.class, null), true);
    public volatile boolean LJLJJL = true;
    public volatile String LJLJJLL = CardStruct.IStatusCode.DEFAULT;
    public volatile Map<String, String> LJLJL = C113554cx.LJJJLIIL();
    public boolean LJLLI = true;

    static {
        String str;
        String str2;
        String str3;
        String str4;
        ToolEntryVO[] toolEntryVOArr = new ToolEntryVO[5];
        int value = EnumC56134M1i.CARD_TYPE_ORDER_ENTRY.getValue();
        Resources LIZJ = FKM.LIZJ();
        String str5 = null;
        if (LIZJ != null) {
            str = LIZJ.getString(R.string.fen);
        } else {
            str = null;
        }
        o.LJI(str);
        toolEntryVOArr[0] = new ToolEntryVO(value, str, "aweme://lynxview?surl=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fteu%2Fclient-t%2Flynx%2Ffe_teu_lynx_order_center%2Fapp%2Ftemplate.js&channel=fe_teu_lynx_order_center&bundle=app%2Ftemplate.js&use_gecko_first=1&dynamic=1&hide_nav_bar=true&use_bdx=1&trans_status_bar=1&tab_name=all&previous_page=mall", null, new C62562cu(C47261Igj.LJJIJIIJI("https://p16-oec-va.ibyteimg.com/tos-maliva-i-5i1jvf5urr-us/ttec_mall_tool_panel_order_20220815.png~tplv-o3syd03w52-origin-png.png?", "https://p19-oec-va.ibyteimg.com/tos-maliva-i-5i1jvf5urr-us/ttec_mall_tool_panel_order_20220815.png~tplv-o3syd03w52-origin-png.png?")), "orders", false, null, false, 392, null);
        int value2 = EnumC56134M1i.CARD_TYPE_COUPON_ENTRY.getValue();
        Resources LIZJ2 = FKM.LIZJ();
        if (LIZJ2 != null) {
            str2 = LIZJ2.getString(R.string.fem);
        } else {
            str2 = null;
        }
        o.LJI(str2);
        toolEntryVOArr[1] = new ToolEntryVO(value2, str2, "aweme://echybrid?url=https%3A%2F%2Foec-api.tiktokv.com%2Fview%2Ffe_tiktok_ecommerce_voucher%2Findex.html%2F%3FdisableBounces%3D1%26hide_source%3D1%26__status_bar%3Dtrue%26hide_nav_bar%3D1%26should_full_screen%3D1%26container_color_auto_dark%3D1%26trackParams%3D%257b%2522previous_page%2522%253a%2522mall%2522%257d", null, new C62562cu(C47261Igj.LJJIJIIJI("https://p16-oec-va.ibyteimg.com/tos-maliva-i-5i1jvf5urr-us/ttec_mall_tool_panel_coupon_20220815.png~tplv-o3syd03w52-origin-png.png?", "https://p19-oec-va.ibyteimg.com/tos-maliva-i-5i1jvf5urr-us/ttec_mall_tool_panel_coupon_20220815.png~tplv-o3syd03w52-origin-png.png?")), "coupon", false, null, false, 392, null);
        int value3 = EnumC56134M1i.CARD_TYPE_MESSAGE_ENTRY.getValue();
        Resources LIZJ3 = FKM.LIZJ();
        if (LIZJ3 != null) {
            str3 = LIZJ3.getString(R.string.f_x);
        } else {
            str3 = null;
        }
        o.LJI(str3);
        toolEntryVOArr[2] = new ToolEntryVO(value3, str3, "aweme://ec/shop_message?show_tablist=0&title=Shop Message&previous_page=mall", null, new C62562cu(C47261Igj.LJJIJIIJI("https://p16-oec-va.ibyteimg.com/tos-maliva-i-5i1jvf5urr-us/ttec_mall_tool_panel_message_20220815.png~tplv-o3syd03w52-origin-png.png?", "https://p19-oec-va.ibyteimg.com/tos-maliva-i-5i1jvf5urr-us/ttec_mall_tool_panel_message_20220815.png~tplv-o3syd03w52-origin-png.png?")), "messages", false, null, false, 392, null);
        int value4 = EnumC56134M1i.CARD_TYPE_ADDRESS_ENTRY.getValue();
        Resources LIZJ4 = FKM.LIZJ();
        if (LIZJ4 != null) {
            str4 = LIZJ4.getString(R.string.fel);
        } else {
            str4 = null;
        }
        o.LJI(str4);
        toolEntryVOArr[3] = new ToolEntryVO(value4, str4, "aweme://ec/address/list?&trackParams=%7b%22previous_page%22%3a%22mall%22%7d", null, new C62562cu(C47261Igj.LJJIJIIJI("https://p16-oec-va.ibyteimg.com/tos-maliva-i-5i1jvf5urr-us/ttec_mall_tool_panel_address_20220815.png~tplv-o3syd03w52-origin-png.png?", "https://p19-oec-va.ibyteimg.com/tos-maliva-i-5i1jvf5urr-us/ttec_mall_tool_panel_address_20220815.png~tplv-o3syd03w52-origin-png.png?")), "address", false, null, false, 392, null);
        int value5 = EnumC56134M1i.CARD_TYPE_PAYMENT_ENTRY.getValue();
        Resources LIZJ5 = FKM.LIZJ();
        if (LIZJ5 != null) {
            str5 = LIZJ5.getString(R.string.feo);
        }
        o.LJI(str5);
        toolEntryVOArr[4] = new ToolEntryVO(value5, str5, "aweme://ec/payment?source=mall&previous_page=mall&url=https%3A%2F%2Foec-api.tiktokv.com%2Fview%2Ffe_tiktok_ecommerce_payment_manager%2Findex.html%3F__INTERNAL_ROUTE__%3D%252Fpayment%252Flist%26__status_bar%3Dtrue%26container_color_auto_dark%3D1%26disableBounces%3D1%26hide_nav_bar%3D1%26hide_source%3D1%26trackParams%3D%257b%2522previous_page%2522%253a%2522mall%2522%257d", null, new C62562cu(C47261Igj.LJJIJIIJI("https://p16-oec-va.ibyteimg.com/tos-maliva-i-5i1jvf5urr-us/ttec_mall_tool_panel_payment_20220815.png~tplv-o3syd03w52-origin-png.png?", "https://p19-oec-va.ibyteimg.com/tos-maliva-i-5i1jvf5urr-us/ttec_mall_tool_panel_payment_20220815.png~tplv-o3syd03w52-origin-png.png?")), "payment", false, null, false, 392, null);
        LJLLJ = C47261Igj.LJJIJIIJI(toolEntryVOArr);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C55978Ly2 defaultState() {
        return new C55978Ly2(0);
    }

    public final C56020Lyi lv0() {
        C56020Lyi c56020Lyi = (C56020Lyi) this.LJLJJI.getValue();
        if (c56020Lyi == null) {
            C56045Lz7.LIZ.getClass();
            C76542zS.LIZJ("rd_tiktokec_hierarchy_null", C56024Lym.LJLIL);
            return new C56020Lyi(0);
        }
        return c56020Lyi;
    }

    public static ShopMainResponse kv0() {
        if (!ECFashionMallConfigSettings.LIZ().useCache) {
            return null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C79057V0z.LJJIFFI(C56023Lyl.LIZIZ(), "ec_shop_main_cache_data"), C65330PkU.LIZJ(C65352Pkq.LIZLLL(ShopMainResponse.class)));
            if (!(fromJson instanceof ShopMainResponse)) {
                fromJson = null;
            }
            return (ShopMainResponse) fromJson;
        } catch (s unused) {
            return null;
        }
    }

    public static void pv0(Map map) {
        if (!C48189Ivh.LJFF(FKM.LIZ())) {
            C56045Lz7.LIZ.getClass();
            C56045Lz7.LJIIIZ(map, false);
        } else {
            C56045Lz7.LIZ.getClass();
            C56045Lz7.LJIIIZ(map, true);
        }
    }

    public static boolean rv0(List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ToolEntryVO) next).getNotify()) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C55817LvR gv0(Card card) {
        ToolPanelEntryCardStyleDTO toolPanelEntryCardStyleDTO;
        String str;
        int i;
        CardTip cardTip;
        Integer num = null;
        if (card == null) {
            return null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), card.getStyle(), C65330PkU.LIZJ(C65352Pkq.LJI(ToolPanelEntryCardStyleDTO.class)));
            if (!(fromJson instanceof ToolPanelEntryCardStyleDTO)) {
                fromJson = null;
            }
            toolPanelEntryCardStyleDTO = (ToolPanelEntryCardStyleDTO) fromJson;
        } catch (s unused) {
        }
        if (toolPanelEntryCardStyleDTO == null) {
            return null;
        }
        String buttonName = toolPanelEntryCardStyleDTO.getButtonName();
        if (buttonName == null) {
            buttonName = "";
        }
        ToolPanelEntryLinkDTO link = toolPanelEntryCardStyleDTO.getLink();
        if (link == null || (str = link.getLink()) == null) {
            str = "sslocal://webcast_lynxview?hide_nav_bar=1&use_new_container=1&trans_status_bar=1&hide_status_bar=0&trackParams=%7B%22previous_page%22%3A%22mall%22%2C%22enter_from%22%3A%22mall%22%7D&url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_shop_cart%2Fall%2Fpages%2Fmain%2Ftemplate.js";
        }
        List<CardTip> tipList = card.getTipList();
        if (tipList != null) {
            Iterator<CardTip> it = tipList.iterator();
            while (true) {
                i = 0;
                if (it.hasNext()) {
                    cardTip = it.next();
                    Integer type = cardTip.getType();
                    int value = EnumC64802gW.CARD_TIP_TYPE_REDDOT.getValue();
                    if (type != null && type.intValue() == value) {
                        break;
                    }
                } else {
                    cardTip = null;
                    break;
                }
            }
            CardTip cardTip2 = cardTip;
            if (cardTip2 != null) {
                try {
                    String data = cardTip2.getData();
                    if (data != null) {
                        i = CastIntegerProtector.parseInt(data);
                    }
                    num = Integer.valueOf(i);
                } catch (Throwable unused2) {
                }
                return new C55817LvR(Integer.valueOf(EnumC56134M1i.CARD_TYPE_CART_ENTRY.getValue()), num, str, buttonName, lv0().LJLLLL);
            }
        }
        return new C55817LvR(8, Integer.valueOf(EnumC56134M1i.CARD_TYPE_CART_ENTRY.getValue()), str, buttonName, lv0().LJLLLL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0029, code lost:
    
        if (r2 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C55964Lxo hv0(com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.Card r6) {
        /*
            r5 = this;
            r3 = 0
            if (r6 == 0) goto L46
            java.lang.String r2 = r6.getStyle()
            com.google.gson.Gson r1 = X.C27739Aud.LJFF()     // Catch: com.google.gson.s -> L22
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto.ToolPanelEntryCardStyleDTO> r0 = com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto.ToolPanelEntryCardStyleDTO.class
            X.Pkc r0 = X.C65352Pkq.LJI(r0)     // Catch: com.google.gson.s -> L22
            java.lang.reflect.Type r0 = X.C65330PkU.LIZJ(r0)     // Catch: com.google.gson.s -> L22
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)     // Catch: com.google.gson.s -> L22
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto.ToolPanelEntryCardStyleDTO     // Catch: com.google.gson.s -> L22
            if (r0 != 0) goto L1e
            r1 = r3
        L1e:
            com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto.ToolPanelEntryCardStyleDTO r1 = (com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto.ToolPanelEntryCardStyleDTO) r1     // Catch: com.google.gson.s -> L22
            if (r1 != 0) goto L5e
        L22:
            return r3
        L23:
            int r1 = r1.intValue()
            if (r1 != r0) goto L70
            if (r2 != 0) goto L2f
        L2b:
            boolean r0 = r5.LJLJLLL
            if (r0 == 0) goto L47
        L2f:
            X.Lxo r3 = new X.Lxo
            X.M1i r0 = X.EnumC56134M1i.CARD_TYPE_MORE_ENTRY
            int r0 = r0.getValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.Lyi r0 = r5.lv0()
            boolean r0 = r0.LJLLLL
            r3.<init>(r2, r4, r1, r0)
        L46:
            return r3
        L47:
            X.Lxo r3 = new X.Lxo
            X.M1i r0 = X.EnumC56134M1i.CARD_TYPE_MORE_ENTRY
            int r0 = r0.getValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.Lyi r0 = r5.lv0()
            boolean r1 = r0.LJLLLL
            r0 = 4
            r3.<init>(r2, r4, r1, r0)
            goto L46
        L5e:
            java.lang.String r4 = r1.getButtonName()
            if (r4 != 0) goto L66
            java.lang.String r4 = ""
        L66:
            java.util.List r0 = r6.getTipList()
            if (r0 == 0) goto L2b
            java.util.Iterator r3 = r0.iterator()
        L70:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.CardTip r0 = (com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.CardTip) r0
            java.lang.Integer r1 = r0.getType()
            X.2gW r0 = X.EnumC64802gW.CARD_TIP_TYPE_REDDOT
            int r0 = r0.getValue()
            if (r1 != 0) goto L23
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel.hv0(com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.Card):X.Lxo");
    }

    public final List<ToolEntryVO> iv0(MallToolPanelData mallToolPanelData) {
        List<Card> list;
        ArrayList arrayList;
        boolean z;
        ToolPanelEntryCardStyleDTO toolPanelEntryCardStyleDTO;
        int i;
        String str;
        String str2;
        String str3;
        C62562cu c62562cu;
        boolean z2;
        ToolEntryVO toolEntryVO;
        Card card;
        String str4;
        List<CardTip> tipList;
        CardTip cardTip;
        boolean z3;
        String buttonName;
        ToolPanelEntryIconDTO icon;
        ToolPanelEntryTitleDTO linkTitle;
        ToolPanelEntryLinkDTO link;
        ToolPanelEntryTitleDTO title;
        List<CommonBlock> blockList;
        CommonBlock commonBlock;
        if (mallToolPanelData != null && (blockList = mallToolPanelData.getBlockList()) != null && (commonBlock = (CommonBlock) ORZ.LJLLLL(blockList)) != null) {
            list = commonBlock.getCardList();
        } else {
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (Card card2 : list) {
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), card2.getStyle(), C65330PkU.LIZJ(C65352Pkq.LJI(ToolPanelEntryCardStyleDTO.class)));
                    if (!(fromJson instanceof ToolPanelEntryCardStyleDTO)) {
                        fromJson = null;
                    }
                    toolPanelEntryCardStyleDTO = (ToolPanelEntryCardStyleDTO) fromJson;
                } catch (s unused) {
                    toolPanelEntryCardStyleDTO = null;
                }
                if (toolPanelEntryCardStyleDTO == null) {
                    toolEntryVO = null;
                } else {
                    ToolPanelEntryCardFullDTO toolPanelEntryCardFullDTO = new ToolPanelEntryCardFullDTO(toolPanelEntryCardStyleDTO, Integer.valueOf(card2.getType()));
                    Integer type = toolPanelEntryCardFullDTO.getType();
                    if (type != null) {
                        i = type.intValue();
                    } else {
                        i = 0;
                    }
                    ToolPanelEntryCardStyleDTO style = toolPanelEntryCardFullDTO.getStyle();
                    String str5 = "";
                    if (style == null || (title = style.getTitle()) == null || (str = title.getText()) == null) {
                        str = "";
                    }
                    ToolPanelEntryCardStyleDTO style2 = toolPanelEntryCardFullDTO.getStyle();
                    if (style2 == null || (link = style2.getLink()) == null || (str2 = link.getLink()) == null) {
                        str2 = "";
                    }
                    ToolPanelEntryCardStyleDTO style3 = toolPanelEntryCardFullDTO.getStyle();
                    if (style3 == null || (linkTitle = style3.getLinkTitle()) == null || (str3 = linkTitle.getText()) == null) {
                        str3 = "";
                    }
                    ToolPanelEntryCardStyleDTO style4 = toolPanelEntryCardFullDTO.getStyle();
                    if (style4 != null && (icon = style4.getIcon()) != null) {
                        c62562cu = ToolPanelEntryCardStyleKt.toImageUrlModel(icon);
                    } else {
                        c62562cu = null;
                    }
                    ToolPanelEntryCardStyleDTO style5 = toolPanelEntryCardFullDTO.getStyle();
                    if (style5 != null && (buttonName = style5.getButtonName()) != null) {
                        str5 = buttonName;
                    }
                    Integer type2 = toolPanelEntryCardFullDTO.getType();
                    int value = EnumC56134M1i.CARD_TYPE_MESSAGE_ENTRY.getValue();
                    if (type2 == null || type2.intValue() != value) {
                        Iterator<Card> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                card = it.next();
                                int type3 = card.getType();
                                Integer type4 = toolPanelEntryCardFullDTO.getType();
                                if (type4 == null || type3 != type4.intValue()) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (z3) {
                                    break;
                                }
                            } else {
                                card = null;
                                break;
                            }
                        }
                        Card card3 = card;
                        if (card3 != null && (tipList = card3.getTipList()) != null && (cardTip = (CardTip) ORZ.LJLLLL(tipList)) != null) {
                            str4 = cardTip.getData();
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = this.LJLJLLL;
                    }
                    toolEntryVO = new ToolEntryVO(i, str, str2, str3, c62562cu, str5, z2, null, false, 384, null);
                }
                if (toolEntryVO != null) {
                    arrayList.add(toolEntryVO);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lv0().LJLLL = true;
            return LJLLJ;
        }
        lv0().LJLLL = false;
        return arrayList;
    }

    public final List<ToolEntryVO> jv0(CommonBlock commonBlock, boolean z) {
        List<Card> list;
        boolean z2;
        ToolPanelEntryCardStyleDTO toolPanelEntryCardStyleDTO;
        boolean z3;
        ToolEntryVO toolEntryVO;
        int i;
        String str;
        String str2;
        String str3;
        C62562cu c62562cu;
        String buttonName;
        ToolPanelEntryIconDTO icon;
        ToolPanelEntryTitleDTO linkTitle;
        ToolPanelEntryLinkDTO link;
        ToolPanelEntryTitleDTO title;
        Card card;
        String str4;
        List<CardTip> tipList;
        CardTip cardTip;
        boolean z4;
        ArrayList arrayList = null;
        if (commonBlock != null) {
            list = commonBlock.getCardList();
        } else {
            list = null;
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Card card2 : list) {
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), card2.getStyle(), C65330PkU.LIZJ(C65352Pkq.LJI(ToolPanelEntryCardStyleDTO.class)));
                    if (!(fromJson instanceof ToolPanelEntryCardStyleDTO)) {
                        fromJson = null;
                    }
                    toolPanelEntryCardStyleDTO = (ToolPanelEntryCardStyleDTO) fromJson;
                } catch (s unused) {
                    toolPanelEntryCardStyleDTO = null;
                }
                if (toolPanelEntryCardStyleDTO == null) {
                    toolEntryVO = null;
                } else {
                    ToolPanelEntryCardFullDTO toolPanelEntryCardFullDTO = new ToolPanelEntryCardFullDTO(toolPanelEntryCardStyleDTO, Integer.valueOf(card2.getType()));
                    if (z) {
                        Integer type = toolPanelEntryCardFullDTO.getType();
                        int value = EnumC56134M1i.CARD_TYPE_MESSAGE_ENTRY.getValue();
                        if (type == null || type.intValue() != value) {
                            Iterator<Card> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    card = it.next();
                                    int type2 = card.getType();
                                    Integer type3 = toolPanelEntryCardFullDTO.getType();
                                    if (type3 == null || type2 != type3.intValue()) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z4) {
                                        break;
                                    }
                                } else {
                                    card = null;
                                    break;
                                }
                            }
                            Card card3 = card;
                            if (card3 != null && (tipList = card3.getTipList()) != null && (cardTip = (CardTip) ORZ.LJLLLL(tipList)) != null) {
                                str4 = cardTip.getData();
                            } else {
                                str4 = null;
                            }
                            if (str4 != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            z3 = this.LJLJLLL;
                        }
                    } else {
                        z3 = false;
                    }
                    Integer type4 = toolPanelEntryCardFullDTO.getType();
                    if (type4 != null) {
                        i = type4.intValue();
                    } else {
                        i = 0;
                    }
                    ToolPanelEntryCardStyleDTO style = toolPanelEntryCardFullDTO.getStyle();
                    String str5 = "";
                    if (style == null || (title = style.getTitle()) == null || (str = title.getText()) == null) {
                        str = "";
                    }
                    ToolPanelEntryCardStyleDTO style2 = toolPanelEntryCardFullDTO.getStyle();
                    if (style2 == null || (link = style2.getLink()) == null || (str2 = link.getLink()) == null) {
                        str2 = "";
                    }
                    ToolPanelEntryCardStyleDTO style3 = toolPanelEntryCardFullDTO.getStyle();
                    if (style3 == null || (linkTitle = style3.getLinkTitle()) == null || (str3 = linkTitle.getText()) == null) {
                        str3 = "";
                    }
                    ToolPanelEntryCardStyleDTO style4 = toolPanelEntryCardFullDTO.getStyle();
                    if (style4 != null && (icon = style4.getIcon()) != null) {
                        c62562cu = ToolPanelEntryCardStyleKt.toImageUrlModel(icon);
                    } else {
                        c62562cu = null;
                    }
                    ToolPanelEntryCardStyleDTO style5 = toolPanelEntryCardFullDTO.getStyle();
                    if (style5 != null && (buttonName = style5.getButtonName()) != null) {
                        str5 = buttonName;
                    }
                    toolEntryVO = new ToolEntryVO(i, str, str2, str3, c62562cu, str5, z3, null, false, 384, null);
                    Integer type5 = toolPanelEntryCardFullDTO.getType();
                    int value2 = EnumC56134M1i.CARD_TYPE_MESSAGE_ENTRY.getValue();
                    if (type5 != null && type5.intValue() == value2) {
                        toolEntryVO.setMsgPopupData(this.LJLL);
                        toolEntryVO.setItemVisible(this.LJLLI);
                    }
                }
                if (toolEntryVO != null) {
                    arrayList2.add(toolEntryVO);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            lv0().LJLLL = true;
            return LJLLJ;
        }
        lv0().LJLLL = false;
        return arrayList;
    }

    public final void mv0(boolean z, boolean z2) {
        EnumC56007LyV enumC56007LyV;
        int type;
        if (!C48189Ivh.LJFF(FKM.LIZ())) {
            lv0().LIZ(EnumC56059LzL.NETWORK_UNAVAILABLE_RETRY);
            setState(C56008LyW.LJLIL);
            if (lv0().LJLLLLLL != ILR.COMPLETED) {
                C56020Lyi lv0 = lv0();
                ILR ilr = ILR.FAILED;
                o.LJIIIZ(ilr, "<set-?>");
                lv0.LJLLLLLL = ilr;
                EnumC56120M0u enumC56120M0u = EnumC56120M0u.NETWORK_UNAVAILABLE;
                ov0(enumC56120M0u.getErrMsg(), true);
                ov0(enumC56120M0u.getErrMsg(), false);
            }
            if (z) {
                type = EnumC56006LyU.FIRST_REQUEST.getType();
            } else if (z2) {
                type = EnumC56006LyU.REFRESH.getType();
            } else {
                type = EnumC56006LyU.ERROR_RETRY.getType();
            }
            pv0(C113554cx.LJJL(new OSZ("mall_request_type", Integer.valueOf(type)), new OSZ("mall_request_scene", "ttmall_homepage")));
            return;
        }
        if (z2) {
            enumC56007LyV = EnumC56007LyV.REFRESH;
        } else {
            enumC56007LyV = EnumC56007LyV.FIRST_REQUEST;
        }
        C78565UsT.LJJIJIIJI(this, C78613UtF.LIZJ, new C56009LyX(this, z, enumC56007LyV, null));
    }

    public final void nv0(boolean z, boolean z2) {
        int value;
        long currentTimeMillis = System.currentTimeMillis();
        if (z2) {
            value = EnumC56007LyV.REFRESH.getValue();
        } else if (z) {
            value = EnumC56007LyV.FIRST_REQUEST.getValue();
        } else {
            value = EnumC56007LyV.ERROR_RETRY.getValue();
        }
        if (!C48189Ivh.LJFF(FKM.LIZ())) {
            qv0(value, 0, currentTimeMillis, "net_is_not_available");
        } else {
            C78565UsT.LJJIJIIJI(this, C78613UtF.LIZJ, new C55973Lxx(this, currentTimeMillis, value, null));
        }
    }

    public final void ov0(String str, boolean z) {
        String str2;
        boolean z2;
        boolean z3;
        OSZ[] oszArr = new OSZ[1];
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ("is_data_cache", str2);
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (str != null) {
            LJJLIIIIJ.put("err_msg", str);
        }
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        String stage = EnumC56081Lzh.STAGE_LOAD_DATA.getStage();
        String str3 = lv0().LJZ;
        long currentTimeMillis = System.currentTimeMillis() - C56090Lzq.LIZ;
        if (str == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (lv0().LJLLLLLL == ILR.FAILED) {
            z3 = true;
        } else {
            z3 = false;
        }
        c56045Lz7.getClass();
        C56045Lz7.LJIIL(stage, str3, currentTimeMillis, z2, z3, LJJLIIIIJ);
    }

    public final List sv0(List list, Notice notice, Boolean bool) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ToolEntryVO toolEntryVO = (ToolEntryVO) it.next();
            if (toolEntryVO.getCardType() == EnumC56134M1i.CARD_TYPE_MESSAGE_ENTRY.getValue()) {
                ToolEntryVO toolEntryVO2 = new ToolEntryVO(toolEntryVO.getCardType(), toolEntryVO.getTitle(), toolEntryVO.getLink(), toolEntryVO.getLinkTitleText(), toolEntryVO.getImageUrls(), toolEntryVO.getButtonName(), this.LJLJLLL, notice, false, 256, null);
                if (bool != null) {
                    toolEntryVO2.setItemVisible(bool.booleanValue());
                }
                toolEntryVO = toolEntryVO2;
            }
            arrayList.add(toolEntryVO);
        }
        return arrayList;
    }

    public static void qv0(int i, int i2, long j, String str) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        C56045Lz7.LIZ.getClass();
        C76542zS.LIZJ("rd_new_user_tool_panel_api_request_result", new C51546KKw(i2, i, currentTimeMillis, str));
    }

    public final void tv0(ShopMainResponse shopMainResponse, boolean z, String str, EnumC56007LyV enumC56007LyV) {
        C78565UsT.LJJIJIIJI(this, C78613UtF.LIZJ, new C56010LyY(shopMainResponse, this, z, enumC56007LyV, str, null));
        StringBuilder LJI = JBR.LJI("updateState : fromOnline=", z, " duration = ");
        LJI.append(System.currentTimeMillis() - lv0().LJLIL);
        C36746EbW.LIZ(3, X1D.LIZIZ(LJI));
    }
}
