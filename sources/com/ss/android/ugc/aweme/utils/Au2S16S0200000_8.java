package com.ss.android.ugc.aweme.utils;

import X.C17N;
import X.C48658J7u;
import X.C49362JYw;
import X.C55096Ljo;
import X.HG3;
import X.InterfaceC49027JLz;
import X.InterfaceC55235Lm3;
import X.JIP;
import X.JXS;
import X.JYR;
import X.JZ1;
import X.RBX;
import X.TAT;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.general.ECStoreInfoAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PodcastBottomBarAssem;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class Au2S16S0200000_8 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S16S0200000_8 au2S16S0200000_8, View view) {
        Aweme aweme;
        String str;
        User user;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        String str9;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct3;
        SearchMixFeedBase searchMixFeedBase4;
        EComShopCardStruct eComShopCardStruct4;
        SearchMixFeedBase searchMixFeedBase5;
        EComShopCardStruct eComShopCardStruct5;
        SearchMixFeedBase searchMixFeedBase6;
        SearchMixFeedBase searchMixFeedBase7;
        EComShopCardStruct eComShopCardStruct6;
        SearchMixFeedBase searchMixFeedBase8;
        EComShopCardStruct eComShopCardStruct7;
        SearchMixFeedBase searchMixFeedBase9;
        EComShopCardStruct eComShopCardStruct8;
        SearchMixFeedBase searchMixFeedBase10;
        EComShopCardStruct eComShopCardStruct9;
        SearchMixFeedBase searchMixFeedBase11;
        EComShopCardStruct eComShopCardStruct10;
        Aweme aweme2;
        SearchMixFeedBase searchMixFeedBase12;
        EComShopCardStruct eComShopCardStruct11;
        if (view != null) {
            EComShopCardStruct eComShopCardStruct12 = ((InterfaceC49027JLz) au2S16S0200000_8.l0).LJJJJZI().shopCard;
            String str10 = null;
            if (eComShopCardStruct12 != null) {
                aweme = eComShopCardStruct12.liveEntity;
            } else {
                aweme = null;
            }
            if (aweme != null) {
                ECStoreInfoAssem eCStoreInfoAssem = (ECStoreInfoAssem) au2S16S0200000_8.l1;
                JXS jxs = eCStoreInfoAssem.LLFF;
                String str11 = "";
                if (jxs == null || (searchMixFeedBase12 = jxs.LJLIL) == null || (eComShopCardStruct11 = searchMixFeedBase12.shopCard) == null || (str = eComShopCardStruct11.docId) == null) {
                    str = "";
                }
                C49362JYw.LIZ(view, str);
                JXS jxs2 = eCStoreInfoAssem.LLFF;
                if (jxs2 != null && (searchMixFeedBase11 = jxs2.LJLIL) != null && (eComShopCardStruct10 = searchMixFeedBase11.shopCard) != null && (aweme2 = eComShopCardStruct10.liveEntity) != null) {
                    C17N.LJJJJL(aweme2).j4(new JZ1(JYR.LJLIL));
                    SearchServiceCenter$NavigateAbility searchServiceCenter$NavigateAbility = (SearchServiceCenter$NavigateAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(eCStoreInfoAssem), SearchServiceCenter$NavigateAbility.class, null);
                    if (searchServiceCenter$NavigateAbility != null) {
                        searchServiceCenter$NavigateAbility.y80(C55096Ljo.LJIIZILJ(eCStoreInfoAssem), aweme2, null);
                    }
                }
                JXS jxs3 = eCStoreInfoAssem.LLFF;
                InterfaceC55235Lm3 scope = C55096Ljo.LJIIZILJ(eCStoreInfoAssem);
                o.LJIIIZ(scope, "scope");
                if (jxs3 != null && (searchMixFeedBase10 = jxs3.LJLIL) != null && (eComShopCardStruct9 = searchMixFeedBase10.shopCard) != null) {
                    user = eComShopCardStruct9.userInfo;
                } else {
                    user = null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope, ISearchContextAbility.class)).If().LIZJ().LJLJI);
                jSONObject.put("enter_from", "general_search");
                if (jxs3 == null || (searchMixFeedBase9 = jxs3.LJLIL) == null || (eComShopCardStruct8 = searchMixFeedBase9.shopCard) == null || (str2 = eComShopCardStruct8.docId) == null) {
                    str2 = "";
                }
                jSONObject.put("search_result_id", str2);
                jSONObject.put("search_keyword", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope, ISearchContextAbility.class)).If().LIZJ().LJLJJI);
                if (user != null) {
                    num = Integer.valueOf(user.getFollowerStatus());
                } else {
                    num = null;
                }
                jSONObject.put("follow_status", num);
                jSONObject.put("search_type", "general");
                if (jxs3 == null || (searchMixFeedBase8 = jxs3.LJLIL) == null || (eComShopCardStruct7 = searchMixFeedBase8.shopCard) == null || (str3 = eComShopCardStruct7.roomId) == null) {
                    str3 = "";
                }
                jSONObject.put("list_item_id", str3);
                jSONObject.put("enter_from_merge", "general_search");
                jSONObject.put("enter_method", "others_photo");
                jSONObject.put("action_type", "click");
                if (user != null) {
                    str4 = user.getUid();
                } else {
                    str4 = null;
                }
                jSONObject.put("anchor_id", str4);
                if (jxs3 == null || (searchMixFeedBase7 = jxs3.LJLIL) == null || (eComShopCardStruct6 = searchMixFeedBase7.shopCard) == null || (str5 = eComShopCardStruct6.roomId) == null) {
                    str5 = "";
                }
                jSONObject.put("room_id", str5);
                if (jxs3 != null && (searchMixFeedBase6 = jxs3.LJLIL) != null) {
                    str6 = searchMixFeedBase6.getRequestId();
                } else {
                    str6 = null;
                }
                jSONObject.put("request_id", str6);
                jSONObject.put("is_ecom", 1);
                jSONObject.put("aladdin_button_type", "click_info");
                C48658J7u.LIZIZ("search_result_click", jSONObject);
                JXS jxs4 = eCStoreInfoAssem.LLFF;
                InterfaceC55235Lm3 scope2 = C55096Ljo.LJIIZILJ(eCStoreInfoAssem);
                o.LJIIIZ(scope2, "scope");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                jSONObject2.put("enter_from", "general_search");
                jSONObject2.put("page_name", "general_search");
                if (jxs4 != null && (searchMixFeedBase5 = jxs4.LJLIL) != null && (eComShopCardStruct5 = searchMixFeedBase5.shopCard) != null && o.LJ(eComShopCardStruct5.isOfficial, Boolean.TRUE)) {
                    jSONObject2.put("logo_type", "official_brand");
                }
                jSONObject2.put("entrance_type", "shop_card");
                if (jxs4 == null || (searchMixFeedBase4 = jxs4.LJLIL) == null || (eComShopCardStruct4 = searchMixFeedBase4.shopCard) == null || (str7 = eComShopCardStruct4.shopId) == null) {
                    str7 = "";
                }
                jSONObject2.put("shop_id", str7);
                if (jxs4 == null || (searchMixFeedBase3 = jxs4.LJLIL) == null || (eComShopCardStruct3 = searchMixFeedBase3.shopCard) == null || (str8 = eComShopCardStruct3.userId) == null) {
                    str8 = "";
                }
                jSONObject2.put("author_id", str8);
                if (jxs4 != null && (searchMixFeedBase2 = jxs4.LJLIL) != null && (eComShopCardStruct2 = searchMixFeedBase2.shopCard) != null) {
                    str10 = eComShopCardStruct2.userId;
                }
                jSONObject2.put("is_self", TextUtils.equals(str10, ((RBX) HG3.LJIILL()).getCurUserId()) ? 1 : 0);
                jSONObject2.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope2, ISearchContextAbility.class)).If().LIZJ().LJLJI);
                if (jxs4 != null && (searchMixFeedBase = jxs4.LJLIL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (str9 = eComShopCardStruct.docId) != null) {
                    str11 = str9;
                }
                jSONObject2.put("search_result_id", str11);
                jSONObject2.put("search_entrance", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope2, ISearchContextAbility.class)).cs().LIZJ().LJLIL);
                C48658J7u.LIZIZ("tiktokec_shop_entrance_click", jSONObject2);
                return;
            }
            ((ECStoreInfoAssem) au2S16S0200000_8.l1).p4(view, "click_info", "goods_click_photo");
        }
    }

    public static final void LIZ$1(Au2S16S0200000_8 au2S16S0200000_8, View view) {
        Aweme aweme = ((VideoItemParams) au2S16S0200000_8.l0).getAweme();
        if (aweme != null) {
            PodcastBottomBarAssem podcastBottomBarAssem = (PodcastBottomBarAssem) au2S16S0200000_8.l1;
            VideoItemParams videoItemParams = (VideoItemParams) au2S16S0200000_8.l0;
            JIP jip = JIP.LIZIZ;
            Context context = podcastBottomBarAssem.Y3().getContext();
            o.LJIIIIZZ(context, "contentView.context");
            jip.LIZ(context, aweme, videoItemParams.mEventType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S16S0200000_8(InterfaceC49027JLz interfaceC49027JLz, ECStoreInfoAssem eCStoreInfoAssem, int i) {
        super(700L);
        this.$t = i;
        this.l0 = interfaceC49027JLz;
        this.l1 = eCStoreInfoAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S16S0200000_8(VideoItemParams videoItemParams, PodcastBottomBarAssem podcastBottomBarAssem, int i) {
        super(500L);
        this.$t = i;
        this.l0 = videoItemParams;
        this.l1 = podcastBottomBarAssem;
    }
}
