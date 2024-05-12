package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C39468FeK;
import X.C48658J7u;
import X.C48929JIf;
import X.C49362JYw;
import X.C55096Ljo;
import X.C76800UCe;
import X.HG3;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.JUK;
import X.JXS;
import X.ORZ;
import X.RBX;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.general.ECStoreProductAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class AqS38S0301000_8 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS38S0301000_8 aqS38S0301000_8) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        int i2;
        String str6;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        User user;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct3;
        SearchMixFeedBase searchMixFeedBase4;
        EComShopCardStruct eComShopCardStruct4;
        List<AddressCardProducts> list;
        AddressCardProducts addressCardProducts;
        SearchMixFeedBase searchMixFeedBase5;
        EComShopCardStruct eComShopCardStruct5;
        SearchMixFeedBase searchMixFeedBase6;
        EComShopCardStruct eComShopCardStruct6;
        SearchMixFeedBase searchMixFeedBase7;
        EComShopCardStruct eComShopCardStruct7;
        SearchMixFeedBase searchMixFeedBase8;
        EComShopCardStruct eComShopCardStruct8;
        View productItemView = (View) aqS38S0301000_8.l0;
        o.LJIIIIZZ(productItemView, "productItemView");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ec_search_tab_name", "general_search");
        Aweme aweme = null;
        C39468FeK.LJFF(productItemView, "c3978", "d0", linkedHashMap, null);
        Context context = ((View) aqS38S0301000_8.l0).getContext();
        AddressCardProducts addressCardProducts2 = (AddressCardProducts) aqS38S0301000_8.l1;
        ECStoreProductAssem eCStoreProductAssem = (ECStoreProductAssem) aqS38S0301000_8.l2;
        SmartRouter.buildRoute(context, C49362JYw.LIZLLL(addressCardProducts2, true, eCStoreProductAssem.LLFF, C55096Ljo.LJIIZILJ(eCStoreProductAssem))).open();
        String str7 = ((AddressCardProducts) aqS38S0301000_8.l1).productId;
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        int i3 = aqS38S0301000_8.i3;
        ECStoreProductAssem eCStoreProductAssem2 = (ECStoreProductAssem) aqS38S0301000_8.l2;
        JXS jxs = eCStoreProductAssem2.LLFF;
        InterfaceC55235Lm3 scope = C55096Ljo.LJIIZILJ(eCStoreProductAssem2);
        o.LJIIIZ(scope, "scope");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope, ISearchContextAbility.class)).If().LIZJ().LJLJI);
        jSONObject.put("enter_from", "general_search");
        if (jxs != null && (searchMixFeedBase8 = jxs.LJLIL) != null && (eComShopCardStruct8 = searchMixFeedBase8.shopCard) != null && eComShopCardStruct8.liveEntity != null) {
            str = "live";
        } else {
            str = "mt_goods";
        }
        jSONObject.put("list_result_type", str);
        jSONObject.put("list_item_id", str7);
        if (jxs == null || (searchMixFeedBase7 = jxs.LJLIL) == null || (eComShopCardStruct7 = searchMixFeedBase7.shopCard) == null || (str2 = eComShopCardStruct7.docId) == null) {
            str2 = "";
        }
        jSONObject.put("search_result_id", str2);
        jSONObject.put("search_keyword", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope, ISearchContextAbility.class)).If().LIZJ().LJLJJI);
        jSONObject.put("token_type", "shop");
        jSONObject.put("rank", ((SearchServiceCenter$CardCommonAbility) C55096Ljo.LIZIZ(scope, SearchServiceCenter$CardCommonAbility.class)).C40().getLayoutPosition());
        jSONObject.put("aladdin_rank", i3);
        if (jxs != null && (searchMixFeedBase6 = jxs.LJLIL) != null && (eComShopCardStruct6 = searchMixFeedBase6.shopCard) != null) {
            aweme = eComShopCardStruct6.liveEntity;
        }
        if (aweme != null) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("is_live", i);
        jSONObject.put("aladdin_button_type", "click_goods");
        C48658J7u.LIZIZ("search_result_click", jSONObject);
        ECStoreProductAssem eCStoreProductAssem3 = (ECStoreProductAssem) aqS38S0301000_8.l2;
        JXS jxs2 = eCStoreProductAssem3.LLFF;
        AddressCardProducts product = (AddressCardProducts) aqS38S0301000_8.l1;
        int i4 = aqS38S0301000_8.i3;
        InterfaceC55235Lm3 scope2 = C55096Ljo.LJIIZILJ(eCStoreProductAssem3);
        o.LJIIIZ(product, "product");
        o.LJIIIZ(scope2, "scope");
        JSONObject jSONObject2 = new JSONObject();
        if (jxs2 == null || (searchMixFeedBase5 = jxs2.LJLIL) == null || (eComShopCardStruct5 = searchMixFeedBase5.shopCard) == null || (str3 = eComShopCardStruct5.shopId) == null) {
            str3 = "";
        }
        jSONObject2.put("shop_id", str3);
        if (jxs2 == null || (searchMixFeedBase4 = jxs2.LJLIL) == null || (eComShopCardStruct4 = searchMixFeedBase4.shopCard) == null || (list = eComShopCardStruct4.addressCardProduct) == null || (addressCardProducts = (AddressCardProducts) ORZ.LJLLLLLL(0, list)) == null || (str4 = addressCardProducts.platform) == null) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("product_source", str4);
        Map<String, String> map = product.trackExtra;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (o.LJ(entry.getKey(), "source_from")) {
                    jSONObject2.put("source_from", entry.getValue());
                }
                if (o.LJ(entry.getKey(), "source")) {
                    jSONObject2.put("source", entry.getValue());
                }
            }
        }
        String str9 = product.productId;
        if (str9 == null) {
            str9 = "";
        }
        jSONObject2.put("product_id", str9);
        if (jxs2 != null && (searchMixFeedBase3 = jxs2.LJLIL) != null && (eComShopCardStruct3 = searchMixFeedBase3.shopCard) != null) {
            str5 = eComShopCardStruct3.userId;
        } else {
            str5 = null;
        }
        jSONObject2.put("is_self", TextUtils.equals(str5, ((RBX) HG3.LJIILL()).getCurUserId()) ? 1 : 0);
        jSONObject2.put("item_order", i4 + 1);
        jSONObject2.put("page_name", "general_search");
        if (jxs2 != null && (searchMixFeedBase2 = jxs2.LJLIL) != null && (eComShopCardStruct2 = searchMixFeedBase2.shopCard) != null && (user = eComShopCardStruct2.userInfo) != null) {
            i2 = user.getFollowStatus();
        } else {
            i2 = 0;
        }
        jSONObject2.put("follow_status", i2);
        jSONObject2.put("entrance_form", "shop_card");
        jSONObject2.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope2, ISearchContextAbility.class)).If().LIZJ().LJLJI);
        if (jxs2 == null || (searchMixFeedBase = jxs2.LJLIL) == null || (eComShopCardStruct = searchMixFeedBase.shopCard) == null || (str6 = eComShopCardStruct.docId) == null) {
            str6 = "";
        }
        jSONObject2.put("search_result_id", str6);
        String str10 = product.productId;
        if (str10 != null) {
            str8 = str10;
        }
        jSONObject2.put("list_item_id", str8);
        jSONObject2.put("search_entrance", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope2, ISearchContextAbility.class)).cs().LIZJ().LJLIL);
        jSONObject2.put("enter_from", "general_search");
        C48658J7u.LIZIZ("tiktokec_product_click", jSONObject2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS38S0301000_8 aqS38S0301000_8) {
        JUK juk = new JUK((Context) aqS38S0301000_8.l0, (AttributeSet) aqS38S0301000_8.l1, aqS38S0301000_8.i3);
        juk.LIZ(new AqS158S0100000_8((C48929JIf) aqS38S0301000_8.l2, 727));
        ((C48929JIf) aqS38S0301000_8.l2).addView(juk);
        return juk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS38S0301000_8(Context context, AttributeSet attributeSet, int i, C48929JIf c48929JIf, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = context;
        this.l1 = attributeSet;
        this.i3 = i;
        this.l2 = c48929JIf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS38S0301000_8(View view, AddressCardProducts addressCardProducts, ECStoreProductAssem eCStoreProductAssem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = view;
        this.l1 = addressCardProducts;
        this.l2 = eCStoreProductAssem;
        this.i3 = i;
    }
}
