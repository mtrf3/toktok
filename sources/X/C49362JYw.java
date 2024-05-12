package X;

import Y.IDTListenerS117S0100000_8;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.JYw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49362JYw {
    public static final void LIZ(View descTv, String str) {
        o.LJIIIZ(descTv, "descTv");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_result_id", str);
        C39468FeK.LJFF(descTv, "c3978", "d0", linkedHashMap, null);
    }

    public static final void LIZIZ(View view, Integer num, Integer num2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (view != null) {
            C49363JYx c49363JYx = new C49363JYx(num2, view, num, view.getContext());
            c49363JYx.LJLJLJ = new IDTListenerS117S0100000_8(interfaceC65784Pro, 15);
            view.setOnTouchListener(c49363JYx);
        }
    }

    public static final String LIZLLL(AddressCardProducts product, boolean z, JXS jxs, InterfaceC55235Lm3 scope) {
        String str;
        Uri.Builder builder;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        o.LJIIIZ(product, "product");
        o.LJIIIZ(scope, "scope");
        java.util.Map<String, String> map = product.trackExtra;
        String str2 = product.productId;
        if (str2 == null) {
            str2 = "";
        }
        if (jxs == null || (searchMixFeedBase = jxs.LJLIL) == null || (eComShopCardStruct = searchMixFeedBase.shopCard) == null || (str = eComShopCardStruct.roomId) == null) {
            str = "";
        }
        HashMap<String, Object> LIZJ = LIZJ(map, str2, str, z, jxs, scope);
        String str3 = product.detailUrl;
        if (str3 != null) {
            builder = UriProtector.parse(str3).buildUpon();
            builder.appendQueryParameter("trackParams", C27739Aud.LJI(LIZJ));
            builder.appendQueryParameter("click_scene_start_time", String.valueOf(SystemClock.elapsedRealtime()));
        } else {
            builder = null;
        }
        return String.valueOf(builder);
    }

    public static final HashMap<String, Object> LIZJ(java.util.Map<String, ? extends Object> map, String str, String str2, boolean z, JXS jxs, InterfaceC55235Lm3 scope) {
        Aweme aweme;
        String str3;
        String str4;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct3;
        o.LJIIIZ(scope, "scope");
        HashMap<String, Object> hashMap = new HashMap<>();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String str5 = ((ISearchContextAbility) C55096Ljo.LIZIZ(scope, ISearchContextAbility.class)).If().LIZJ().LJLJI;
        hashMap.put("search_entrance", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope, ISearchContextAbility.class)).cs().LIZJ().LJLIL);
        String str6 = null;
        if (jxs != null && (searchMixFeedBase3 = jxs.LJLIL) != null && (eComShopCardStruct3 = searchMixFeedBase3.shopCard) != null) {
            aweme = eComShopCardStruct3.liveEntity;
        } else {
            aweme = null;
        }
        if (aweme == null) {
            str3 = "general_search";
        } else {
            str3 = "live";
        }
        hashMap.put("source_page_type", str3);
        hashMap.put("search_id", str5);
        if (jxs == null || (searchMixFeedBase2 = jxs.LJLIL) == null || (eComShopCardStruct2 = searchMixFeedBase2.shopCard) == null || (str4 = eComShopCardStruct2.docId) == null) {
            str4 = "";
        }
        hashMap.put("search_result_id", str4);
        hashMap.put("list_item_id", str);
        hashMap.put("entrance_form", "shop_card");
        hashMap.put("enter_from_info", "general_search");
        hashMap.put("enter_from", "general_search");
        hashMap.put("enter_from_merge", "general_search");
        int[] iArr = new int[1];
        if (z) {
            iArr[0] = 7;
            hashMap.put("traffic_source_list", iArr);
        }
        if (jxs != null && (searchMixFeedBase = jxs.LJLIL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null) {
            str6 = eComShopCardStruct.userId;
        }
        hashMap.put("author_id", str6);
        hashMap.put("previous_page", "general_search");
        if (str2 != null) {
            hashMap.put("room_id", str2);
        }
        return hashMap;
    }
}
