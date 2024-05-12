package com.ss.android.ugc.aweme.utils;

import X.C17N;
import X.C39468FeK;
import X.C47135Ieh;
import X.C48658J7u;
import X.C55096Ljo;
import X.C68322mC;
import X.C70756Rpo;
import X.C73994T2g;
import X.InterfaceC55235Lm3;
import X.JXS;
import X.JZ1;
import X.TAT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.general.ECStoreLiveAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class Au2S0S0301000_8 extends TAT {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S0S0301000_8 au2S0S0301000_8, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct3;
        SearchMixFeedBase searchMixFeedBase4;
        EComShopCardStruct eComShopCardStruct4;
        Aweme aweme;
        SearchMixFeedBase searchMixFeedBase5;
        EComShopCardStruct eComShopCardStruct5;
        if (view != null) {
            View productItemView = (View) au2S0S0301000_8.l0;
            o.LJIIIIZZ(productItemView, "productItemView");
            View descTv = (View) au2S0S0301000_8.l0;
            JXS jxs = ((ECStoreLiveAssem) au2S0S0301000_8.l1).LLFF;
            if (jxs == null || (searchMixFeedBase5 = jxs.LJLIL) == null || (eComShopCardStruct5 = searchMixFeedBase5.shopCard) == null || (str = eComShopCardStruct5.docId) == null) {
                str = "";
            }
            o.LJIIIZ(descTv, "descTv");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("search_result_id", str);
            C39468FeK.LJFF(descTv, "c3978", "d0", linkedHashMap, null);
            ECStoreLiveAssem eCStoreLiveAssem = (ECStoreLiveAssem) au2S0S0301000_8.l1;
            AddressCardProducts addressCardProducts = (AddressCardProducts) au2S0S0301000_8.l2;
            JXS jxs2 = eCStoreLiveAssem.LLFF;
            if (jxs2 != null && (aweme = jxs2.LJLILLLLZI) != null) {
                SearchServiceCenter$NavigateAbility searchServiceCenter$NavigateAbility = (SearchServiceCenter$NavigateAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(eCStoreLiveAssem), SearchServiceCenter$NavigateAbility.class);
                AqS139S0200000_8 aqS139S0200000_8 = new AqS139S0200000_8(addressCardProducts, eCStoreLiveAssem, 45);
                if (searchServiceCenter$NavigateAbility.xK()) {
                    C17N.LJJJJL(aweme).j4(new JZ1(aqS139S0200000_8));
                    searchServiceCenter$NavigateAbility.y80(C55096Ljo.LJIIZILJ(eCStoreLiveAssem), aweme, null);
                } else {
                    searchServiceCenter$NavigateAbility.ns(C55096Ljo.LJIIZILJ(eCStoreLiveAssem), aweme, aqS139S0200000_8);
                }
            }
            ECStoreLiveAssem eCStoreLiveAssem2 = (ECStoreLiveAssem) au2S0S0301000_8.l1;
            JXS jxs3 = eCStoreLiveAssem2.LLFF;
            AddressCardProducts product = (AddressCardProducts) au2S0S0301000_8.l2;
            InterfaceC55235Lm3 vScope = C55096Ljo.LJIIZILJ(eCStoreLiveAssem2);
            o.LJIIIZ(product, "product");
            o.LJIIIZ(vScope, "vScope");
            JSONObject LJ = C47135Ieh.LJ("page_name", "general_search", "enter_from_merge", "general_search");
            LJ.put("entrance_form", "search_live_card_anchor");
            if (jxs3 == null || (searchMixFeedBase4 = jxs3.LJLIL) == null || (eComShopCardStruct4 = searchMixFeedBase4.shopCard) == null || (str2 = eComShopCardStruct4.roomId) == null) {
                str2 = "";
            }
            LJ.put("list_item_id", str2);
            LJ.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class)).If().LIZJ().LJLJI);
            if (jxs3 == null || (searchMixFeedBase3 = jxs3.LJLIL) == null || (eComShopCardStruct3 = searchMixFeedBase3.shopCard) == null || (str3 = eComShopCardStruct3.docId) == null) {
                str3 = "";
            }
            LJ.put("search_result_id", str3);
            LJ.put("list_result_type", "live");
            C73994T2g.LJII(product, jxs3, vScope, LJ);
            C48658J7u.LIZIZ("livesdk_tiktokec_product_entrance_click", LJ);
            ECStoreLiveAssem eCStoreLiveAssem3 = (ECStoreLiveAssem) au2S0S0301000_8.l1;
            JXS jxs4 = eCStoreLiveAssem3.LLFF;
            AddressCardProducts product2 = (AddressCardProducts) au2S0S0301000_8.l2;
            int i = au2S0S0301000_8.i3;
            InterfaceC55235Lm3 vScope2 = C55096Ljo.LJIIZILJ(eCStoreLiveAssem3);
            o.LJIIIZ(product2, "product");
            o.LJIIIZ(vScope2, "vScope");
            JSONObject LJ2 = C47135Ieh.LJ("page_name", "general_search", "enter_from_merge", "general_search");
            LJ2.put("entrance_form", "search_live_card_anchor");
            if (jxs4 == null || (searchMixFeedBase2 = jxs4.LJLIL) == null || (eComShopCardStruct2 = searchMixFeedBase2.shopCard) == null || (str4 = eComShopCardStruct2.roomId) == null) {
                str4 = "";
            }
            LJ2.put("list_item_id", str4);
            LJ2.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(vScope2, ISearchContextAbility.class)).If().LIZJ().LJLJI);
            if (jxs4 == null || (searchMixFeedBase = jxs4.LJLIL) == null || (eComShopCardStruct = searchMixFeedBase.shopCard) == null || (str5 = eComShopCardStruct.docId) == null) {
                str5 = "";
            }
            LJ2.put("search_result_id", str5);
            LJ2.put("list_result_type", "live");
            LJ2.put("item_order", i + 1);
            C73994T2g.LJII(product2, jxs4, vScope2, LJ2);
            C48658J7u.LIZIZ("livesdk_tiktokec_product_click", LJ2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$1(Au2S0S0301000_8 au2S0S0301000_8, View view) {
        if (view != null) {
            C70756Rpo c70756Rpo = (C70756Rpo) au2S0S0301000_8.l0;
            Context context = ((View) ((C68322mC) au2S0S0301000_8.l1).element).getContext();
            o.LJIIIIZZ(context, "imageView.context");
            c70756Rpo.LJJIIJZLJL(context, au2S0S0301000_8.i3, (ViewGroup) au2S0S0301000_8.l2);
        }
    }

    public static final void LIZ$2(Au2S0S0301000_8 au2S0S0301000_8, View view) {
        if (view != null) {
            C70756Rpo c70756Rpo = (C70756Rpo) au2S0S0301000_8.l0;
            Context context = ((View) au2S0S0301000_8.l1).getContext();
            o.LJIIIIZZ(context, "videoView.context");
            c70756Rpo.LJJIIJZLJL(context, au2S0S0301000_8.i3, (ViewGroup) au2S0S0301000_8.l2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S0301000_8(Object obj, Object obj2, Object obj3, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
    }
}
