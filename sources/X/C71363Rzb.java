package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS0S3110000_12;
import kotlin.jvm.internal.AqS13S2000000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rzb */
/* loaded from: classes13.dex */
public final class C71363Rzb {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII(int i, ProductListModel productListModel) {
        String str;
        String str2;
        String str3;
        Aweme aweme;
        int i2;
        String str4;
        String str5;
        String str6;
        String str7;
        String LJIIIZ;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        OSZ[] oszArr = new OSZ[16];
        oszArr[0] = new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str8 = null;
        if (productListModel != null) {
            str = productListModel.getAuthorUid();
        } else {
            str = null;
        }
        oszArr[1] = new OSZ("author_id", str);
        if (productListModel != null) {
            str2 = productListModel.getAid();
        } else {
            str2 = null;
        }
        oszArr[2] = new OSZ("group_id", str2);
        String str9 = "";
        if (productListModel == null || (str3 = productListModel.getEventType()) == null) {
            str3 = "";
        }
        oszArr[3] = new OSZ("enter_from", str3);
        if (productListModel != null) {
            aweme = productListModel.getAweme();
        } else {
            aweme = null;
        }
        oszArr[4] = new OSZ("follow_status", S0V.LIZ(aweme));
        if (productListModel != null) {
            i2 = o.LJ(productListModel.isAd(), Boolean.TRUE);
        } else {
            i2 = 0;
        }
        oszArr[5] = new OSZ("is_ad", Integer.valueOf(i2));
        if (productListModel != null) {
            str4 = productListModel.getAuthorUid();
        } else {
            str4 = null;
        }
        oszArr[6] = new OSZ("is_self", Integer.valueOf(o.LJ(str4, BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()) ? 1 : 0));
        if (productListModel != null && o.LJ(productListModel.isAd(), Boolean.TRUE) && productListModel != null) {
            str5 = productListModel.getAwemeRawAdIdStr();
        } else {
            str5 = null;
        }
        oszArr[7] = new OSZ("ad_id", str5);
        if (productListModel != null) {
            str8 = productListModel.getRequestId();
        }
        oszArr[8] = new OSZ("request_id", str8);
        if (productListModel == null || (str6 = productListModel.getPageName()) == null) {
            str6 = "video";
        }
        oszArr[9] = new OSZ("page_name", str6);
        oszArr[10] = new OSZ("source_page_type", "video");
        oszArr[11] = new OSZ("notice_number", Integer.valueOf(i));
        String str10 = "video_multi_anchor";
        if (productListModel == null || (str7 = productListModel.getEnterListForm()) == null) {
            str7 = "video_multi_anchor";
        }
        oszArr[12] = new OSZ("enter_list_form", str7);
        if ((productListModel != null && (LJIIIZ = productListModel.getEntranceForm()) != null) || (LJIIIZ = C71360RzY.LJIIIZ(productListModel, true)) != null) {
            str10 = LJIIIZ;
        }
        oszArr[13] = new OSZ("entrance_form", str10);
        oszArr[14] = new OSZ("list_name", "video_shopping_list");
        if (productListModel != null && o.LJ(productListModel.isAd(), Boolean.TRUE) && (awemeRawAd = productListModel.getAwemeRawAd()) != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
            str9 = String.valueOf(creativeId);
        }
        oszArr[15] = new OSZ("creative_id", str9);
        b.LJJIJIIJIL("tiktokec_cart_entrance_click", oszArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIIZZ(int i, ProductListModel productListModel) {
        String str;
        String str2;
        String str3;
        Aweme aweme;
        int i2;
        String str4;
        String str5;
        String str6;
        String str7;
        String LJIIIZ;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        OSZ[] oszArr = new OSZ[16];
        oszArr[0] = new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str8 = null;
        if (productListModel != null) {
            str = productListModel.getAuthorUid();
        } else {
            str = null;
        }
        oszArr[1] = new OSZ("author_id", str);
        if (productListModel != null) {
            str2 = productListModel.getAid();
        } else {
            str2 = null;
        }
        oszArr[2] = new OSZ("group_id", str2);
        String str9 = "";
        if (productListModel == null || (str3 = productListModel.getEventType()) == null) {
            str3 = "";
        }
        oszArr[3] = new OSZ("enter_from", str3);
        if (productListModel != null) {
            aweme = productListModel.getAweme();
        } else {
            aweme = null;
        }
        oszArr[4] = new OSZ("follow_status", S0V.LIZ(aweme));
        if (productListModel != null) {
            i2 = o.LJ(productListModel.isAd(), Boolean.TRUE);
        } else {
            i2 = 0;
        }
        oszArr[5] = new OSZ("is_ad", Integer.valueOf(i2));
        if (productListModel != null) {
            str4 = productListModel.getAuthorUid();
        } else {
            str4 = null;
        }
        oszArr[6] = new OSZ("is_self", Integer.valueOf(o.LJ(str4, BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()) ? 1 : 0));
        if (productListModel != null && o.LJ(productListModel.isAd(), Boolean.TRUE)) {
            str5 = productListModel.getAwemeRawAdIdStr();
        } else {
            str5 = null;
        }
        oszArr[7] = new OSZ("ad_id", str5);
        if (productListModel != null) {
            str8 = productListModel.getRequestId();
        }
        oszArr[8] = new OSZ("request_id", str8);
        if (productListModel == null || (str6 = productListModel.getPageName()) == null) {
            str6 = "video";
        }
        oszArr[9] = new OSZ("page_name", str6);
        oszArr[10] = new OSZ("source_page_type", "video");
        oszArr[11] = new OSZ("notice_number", Integer.valueOf(i));
        String str10 = "video_multi_anchor";
        if (productListModel == null || (str7 = productListModel.getEnterListForm()) == null) {
            str7 = "video_multi_anchor";
        }
        oszArr[12] = new OSZ("enter_list_form", str7);
        if ((productListModel != null && (LJIIIZ = productListModel.getEntranceForm()) != null) || (LJIIIZ = C71360RzY.LJIIIZ(productListModel, true)) != null) {
            str10 = LJIIIZ;
        }
        oszArr[13] = new OSZ("entrance_form", str10);
        oszArr[14] = new OSZ("list_name", "video_shopping_list");
        if (productListModel != null && o.LJ(productListModel.isAd(), Boolean.TRUE) && (awemeRawAd = productListModel.getAwemeRawAd()) != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
            str9 = String.valueOf(creativeId);
        }
        oszArr[15] = new OSZ("creative_id", str9);
        b.LJJIJIIJIL("tiktokec_cart_entrance_show", oszArr);
    }

    public static void LJIIL(ProductListModel model, ShopWindowAnchorModel shopWindowAnchorModel) {
        Integer num;
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowExtraModel shopWindowExtraModel2;
        o.LJIIIZ(model, "model");
        OSZ[] oszArr = new OSZ[12];
        String eventType = model.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        oszArr[0] = new OSZ("enter_from", eventType);
        oszArr[1] = new OSZ("author_id", model.getAuthorUid());
        oszArr[2] = new OSZ("group_id", model.getAid());
        oszArr[3] = new OSZ("request_id", model.getRequestId());
        oszArr[4] = new OSZ("product_id", "product");
        oszArr[5] = new OSZ("page_type", "video");
        oszArr[6] = new OSZ("anchor_show_type", "video_cart_tag");
        C71361RzZ.LIZ.getClass();
        oszArr[7] = new OSZ("follow_status", C71361RzZ.LJJIIZ(model));
        oszArr[8] = new OSZ("entrance_form", "video_single_anchor");
        oszArr[9] = new OSZ("page_name", "video");
        String str = null;
        if (shopWindowAnchorModel != null && (shopWindowExtraModel2 = shopWindowAnchorModel.LIZ) != null) {
            num = shopWindowExtraModel2.platform;
        } else {
            num = null;
        }
        oszArr[10] = new OSZ("product_source", String.valueOf(num));
        if (shopWindowAnchorModel != null && (shopWindowExtraModel = shopWindowAnchorModel.LIZ) != null) {
            str = shopWindowExtraModel.source;
        }
        oszArr[11] = new OSZ("source", str);
        b.LJJIJIIJIL("enter_product_detail", oszArr);
    }

    public static void LJIJJ(String str, String str2) {
        C76542zS.LIZJ("tiktokec_popup_click", new AqS13S2000000_12(str, str2, 0));
    }

    public static void LJIIJJI(int i, ProductListModel productListModel, int i2) {
        boolean z;
        String str;
        String str2;
        Aweme aweme;
        String str3;
        String str4;
        String LJIIIZ;
        PanelOpenInfo panelOpenInfo;
        PanelOpenInfo panelOpenInfo2;
        int i3 = 1;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        OSZ[] oszArr = new OSZ[12];
        oszArr[0] = new OSZ("page_name", "video");
        if (z) {
            str = "more";
        } else {
            str = "less";
        }
        oszArr[1] = new OSZ("glide_type", str);
        Integer num = null;
        if (productListModel != null) {
            str2 = productListModel.getGroupId();
        } else {
            str2 = null;
        }
        oszArr[2] = new OSZ("list_source_content_id", str2);
        oszArr[3] = new OSZ("list_name", "video_shopping_list");
        if (productListModel != null) {
            aweme = productListModel.getAweme();
        } else {
            aweme = null;
        }
        oszArr[4] = new OSZ("follow_status", S0V.LIZ(aweme));
        if (productListModel != null) {
            str3 = productListModel.getAuthorUid();
        } else {
            str3 = null;
        }
        oszArr[5] = new OSZ("author_id", str3);
        String str5 = "video_multi_anchor";
        if (productListModel == null || (str4 = productListModel.getEnterListForm()) == null) {
            str4 = "video_multi_anchor";
        }
        oszArr[6] = new OSZ("enter_list_form", str4);
        if ((productListModel == null || (LJIIIZ = productListModel.getEntranceForm()) == null) && (LJIIIZ = C71360RzY.LJIIIZ(productListModel, true)) == null) {
            if (productListModel != null && o.LJ(productListModel.isSingleAnchor(), Boolean.TRUE)) {
                str5 = "video_single_anchor";
            }
        } else {
            str5 = LJIIIZ;
        }
        oszArr[7] = new OSZ("entrance_form", str5);
        C71361RzZ.LIZ.getClass();
        oszArr[8] = new OSZ("pure_ecommerce", Integer.valueOf(C71361RzZ.LJJJI(productListModel) ? 1 : 0));
        if (productListModel == null || (panelOpenInfo2 = productListModel.getPanelOpenInfo()) == null || !panelOpenInfo2.getPanelNeedMaybeYouLike()) {
            i3 = 0;
        }
        oszArr[9] = new OSZ("is_add_maybe_you_like", Integer.valueOf(i3));
        if (productListModel != null && (panelOpenInfo = productListModel.getPanelOpenInfo()) != null) {
            num = Integer.valueOf(panelOpenInfo.getPanelStyle());
        }
        oszArr[10] = new OSZ("video_shopping_list_style", num);
        oszArr[11] = new OSZ("product_source", Integer.valueOf(i2));
        b.LJJIJIIJIL("tiktokec_glide_page", oszArr);
    }

    public static void LJIIZILJ(String str, ProductListModel productListModel, ShopWindowAnchorModel shopWindowAnchorModel, String str2) {
        String str3;
        String str4;
        ShopWindowExtraModel shopWindowExtraModel;
        String str5;
        ShopWindowExtraModel shopWindowExtraModel2;
        Long l;
        String str6 = "";
        if (str2 == null) {
            str2 = "";
        }
        android.net.Uri parse = UriProtector.parse(str2);
        if (parse == null || (str4 = C78926UyI.LJJJJI(parse, "sellerId")) == null) {
            if (shopWindowAnchorModel == null || (shopWindowExtraModel = shopWindowAnchorModel.LIZ) == null || (str3 = shopWindowExtraModel.shopLinkSchema) == null) {
                str3 = "";
            }
            android.net.Uri parse2 = UriProtector.parse(str3);
            if (parse2 == null || (str4 = C78926UyI.LJJJJI(parse2, "shopId")) == null) {
                str4 = "";
            }
        }
        OSZ[] oszArr = new OSZ[12];
        oszArr[0] = new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        oszArr[1] = new OSZ("shop_id", str4);
        if (shopWindowAnchorModel == null || (shopWindowExtraModel2 = shopWindowAnchorModel.LIZ) == null || (l = shopWindowExtraModel2.productId) == null || (str5 = l.toString()) == null) {
            str5 = "";
        }
        oszArr[2] = new OSZ("product_id", str5);
        String authorUid = productListModel.getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        oszArr[3] = new OSZ("author_id", authorUid);
        String eventType = productListModel.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        oszArr[4] = new OSZ("enter_from", eventType);
        String requestId = productListModel.getRequestId();
        if (requestId != null) {
            str6 = requestId;
        }
        oszArr[5] = new OSZ("request_id", str6);
        oszArr[6] = new OSZ("is_ad", Integer.valueOf(o.LJ(productListModel.isAd(), Boolean.TRUE) ? 1 : 0));
        oszArr[7] = new OSZ("page_name", "video");
        oszArr[8] = new OSZ("previous_page", "video");
        oszArr[9] = new OSZ("source_page_type", "video");
        oszArr[10] = new OSZ("entrance_type", "shop_icon");
        oszArr[11] = new OSZ("group_id", productListModel.getAid());
        b.LJJIJIIJIL(str, oszArr);
    }

    public static void LJIILIIL(String str, ProductListModel model, Long l, String str2, ShopWindowAnchorModel shopWindowAnchorModel) {
        Integer num;
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowExtraModel shopWindowExtraModel2;
        o.LJIIIZ(model, "model");
        OSZ[] oszArr = new OSZ[12];
        if (str == null) {
            str = "";
        }
        oszArr[0] = new OSZ("enter_from", str);
        oszArr[1] = new OSZ("author_id", model.getAuthorUid());
        oszArr[2] = new OSZ("group_id", model.getAid());
        oszArr[3] = new OSZ("product_type", str2);
        oszArr[4] = new OSZ("duration", String.valueOf(l));
        String str3 = null;
        if (shopWindowAnchorModel != null && (shopWindowExtraModel2 = shopWindowAnchorModel.LIZ) != null) {
            num = shopWindowExtraModel2.platform;
        } else {
            num = null;
        }
        oszArr[5] = new OSZ("product_source", String.valueOf(num));
        if (shopWindowAnchorModel != null && (shopWindowExtraModel = shopWindowAnchorModel.LIZ) != null) {
            str3 = shopWindowExtraModel.source;
        }
        oszArr[6] = new OSZ("source", str3);
        oszArr[7] = new OSZ("page_type", "video");
        oszArr[8] = new OSZ("anchor_show_type", "video_cart_tag");
        oszArr[9] = new OSZ("follow_status", S0V.LIZ(model.getAweme()));
        oszArr[10] = new OSZ("entrance_form", "video_single_anchor");
        oszArr[11] = new OSZ("page_name", "video");
        b.LJJIJIIJIL("product_stay_time", oszArr);
    }

    public static void LJIILJJIL(boolean z, String str, Aweme aweme, List list, String str2) {
        String str3;
        C188727au LIZ2 = LIZ(z, str, aweme, null, list, str2);
        if (z) {
            str3 = "click_list";
        } else {
            str3 = "click_anchor";
        }
        LIZ2.LJIIIZ("click_method", str3);
        C211648Si.LIZ(LIZ2, aweme, str, false);
        FMX.LJIIL("multi_anchor_entrance_click", LIZ2.LIZ);
    }

    public static void LJIILL(int i, long j, boolean z, boolean z2, String str) {
        C76542zS.LIZJ("rd_tiktokec_video_promotion_render", new C36682EaU(i, j, z, z2, str));
    }

    public static C188727au LIZ(boolean z, String str, Aweme aweme, ShopWindowAnchorModel shopWindowAnchorModel, List list, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        ShopWindowAnchorModel shopWindowAnchorModel2;
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowAnchorModel shopWindowAnchorModel3;
        if (aweme != null) {
            aweme.getAnchors();
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LJIIIZ("enter_from", str);
        String str9 = null;
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("author_id", str3);
        c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(aweme));
        if (aweme != null) {
            str4 = aweme.getAid();
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("group_id", str4);
        if (shopWindowAnchorModel != null) {
            str5 = shopWindowAnchorModel.id;
        } else if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ShopWindowAnchorModel) it.next()).id);
            }
            str5 = ORZ.LLD(arrayList, ",", null, null, null, 62);
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("anchor_id", str5);
        if (shopWindowAnchorModel != null) {
            str6 = shopWindowAnchorModel.LIZ.title;
        } else if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ShopWindowAnchorModel) it2.next()).LIZ.title);
            }
            str6 = ORZ.LLD(arrayList2, ",", null, null, null, 62);
        } else {
            str6 = null;
        }
        c188727au.LJIIIZ("anchor_name", str6);
        if (shopWindowAnchorModel != null) {
            str7 = "product";
        } else if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                it3.next();
                arrayList3.add("product");
            }
            str7 = ORZ.LLD(arrayList3, ",", null, null, null, 62);
        } else {
            str7 = null;
        }
        c188727au.LJIIIZ("anchor_type", str7);
        if (list != null && (shopWindowAnchorModel3 = (ShopWindowAnchorModel) ORZ.LJLLLL(list)) != null) {
            str8 = shopWindowAnchorModel3.id;
        } else {
            str8 = null;
        }
        c188727au.LJIIIZ("main_anchor_id", str8);
        if (list != null && (shopWindowAnchorModel2 = (ShopWindowAnchorModel) ORZ.LJLLLL(list)) != null && (shopWindowExtraModel = shopWindowAnchorModel2.LIZ) != null) {
            str9 = shopWindowExtraModel.title;
        }
        c188727au.LJIIIZ("main_anchor_name", str9);
        c188727au.LJIIIZ("main_anchor_type", "product");
        c188727au.LIZLLL(z ? 1 : 0, "multi_anchor");
        if (z) {
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
        } else {
            i = 1;
        }
        c188727au.LIZLLL(i, "anchor_number");
        return c188727au;
    }

    public static void LIZLLL(boolean z, Integer num, String str, String str2, String str3, boolean z2) {
        if (!z2) {
            return;
        }
        C76542zS.LIZJ("rd_tiktok_video_anchor_to_shop", new AqS0S3110000_12(num, str, str2, str3, z, 0));
    }

    public static void LJFF(int i, int i2, ProductListModel model, ShopWindowAnchorModel shopWindowAnchorModel, String str, java.util.Map map) {
        o.LJIIIZ(model, "model");
        C76542zS.LIZJ("tiktokec_button_click", new C71319Ryt(i, i2, model, shopWindowAnchorModel, str, map));
    }

    public static void LJI(ProductListModel model, ShopWindowAnchorModel anchor, int i, String str, int i2, java.util.Map map) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(anchor, "anchor");
        C76542zS.LIZJ("tiktokec_button_show", new C71327Rz1(model, anchor, i, str, null, i2, map));
    }

    public static void LJIIIZ(boolean z, boolean z2, String str, String eventType, ShopWindowAnchorModel shopWindowAnchorModel, Aweme awemeTemp) {
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(awemeTemp, "awemeTemp");
        if (shopWindowAnchorModel == null) {
            return;
        }
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C71330Rz4(awemeTemp, eventType, z, shopWindowAnchorModel, z2, str, null), 3);
    }

    public static void LJIILLIIL(ProductListModel model, ShopWindowExtraModel extraData, String str, String str2, int i, int i2) {
        C71400S0m appendExtraParam;
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            appendExtraParam = C71400S0m.LJLIL;
        } else {
            appendExtraParam = null;
        }
        o.LJIIIZ(model, "model");
        o.LJIIIZ(extraData, "extraData");
        o.LJIIIZ(appendExtraParam, "appendExtraParam");
        ICommerceService LIZ2 = C71396S0i.LIZ();
        C71367Rzf c71367Rzf = new C71367Rzf();
        c71367Rzf.LJIJJ = "TEMAI";
        c71367Rzf.LIZIZ = model.getEventType();
        c71367Rzf.LJIIL = "video_cart_tag";
        c71367Rzf.LJJII = "video";
        Integer num = extraData.productStatus;
        int value = EnumC71103RvP.PRODUCT_STATUS_DOWN.getValue();
        if (num == null || num.intValue() != value) {
            c71367Rzf.LJJJI = S0G.PRODUCT_AVAILABLE.getValue();
        } else {
            c71367Rzf.LJJJI = S0G.PRODUCT_NOT_AVAILABLE.getValue();
        }
        c71367Rzf.LJIJI = "no";
        c71367Rzf.LJJIFFI = "video_multi_anchor";
        c71367Rzf.LJIILL = String.valueOf(extraData.platform);
        c71367Rzf.LJLLLLLL = str;
        c71367Rzf.LJLZ = str2;
        c71367Rzf.LIZ = C71360RzY.LJIILIIL("rd_tiktokec_product_click", model.getAweme(), c71367Rzf.LIZIZ);
        appendExtraParam.invoke(c71367Rzf);
        c71367Rzf.LJJLIIIJJIZ = Integer.valueOf(i);
        LIZ2.logCommerceEvents("rd_tiktokec_product_click", c71367Rzf);
    }

    public static void LJIL(int i, Integer num, String str, String str2, String str3, List list) {
        C76542zS.LIZJ("rd_tiktokec_video_shopping_list_request_send", new C36679EaR(i, num, str, str2, str3, list));
    }

    public static void LIZIZ(ProductListModel model, ShopWindowAnchorModel anchor, int i, String str, boolean z, int i2, java.util.Map map) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(anchor, "anchor");
        C76542zS.LIZJ("tiktokec_button_show", new C71326Rz0(model, anchor, i, z, i2, map));
    }

    public static /* synthetic */ void LJ(boolean z, Integer num, String str, String str2, String str3, boolean z2, int i) {
        String str4 = str2;
        Integer num2 = num;
        String str5 = str;
        String str6 = null;
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            str5 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) == 0) {
            str6 = str3;
        }
        LIZLLL(z, num2, str5, str4, str6, z2);
    }

    public static void LJIJ(ProductListModel productListModel, String str, List anchors, boolean z, long j, L7W shopStatus, int i) {
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z2;
        int i2;
        String str6;
        String str7;
        String str8;
        int i3;
        String str9;
        String str10;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        PanelOpenInfo panelOpenInfo;
        HashMap<String, String> mobParams;
        List<AnchorCommonStruct> anchors2;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        Long adId;
        C71401S0n appendExtraParam = C71401S0n.LJLIL;
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(shopStatus, "shopStatus");
        o.LJIIIZ(appendExtraParam, "appendExtraParam");
        ICommerceService LIZ2 = C71396S0i.LIZ();
        C71367Rzf c71367Rzf = new C71367Rzf();
        c71367Rzf.LJIJJ = "TEMAI";
        c71367Rzf.LJJIIZ = "video_shopping_list";
        if (productListModel == null || (str2 = productListModel.getEnterListForm()) == null) {
            str2 = "video_multi_anchor";
        }
        c71367Rzf.LJJIIZI = str2;
        Aweme aweme = null;
        if (productListModel != null) {
            str3 = productListModel.getAid();
        } else {
            str3 = null;
        }
        c71367Rzf.LIZJ = str3;
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        List LLJILJILJ = ORZ.LLJILJILJ(anchors);
        c71361RzZ.getClass();
        c71367Rzf.LJIIZILJ = C71361RzZ.LJJ(LLJILJILJ);
        c71367Rzf.LJJIIZ = "video_shopping_list";
        if (productListModel != null && o.LJ(productListModel.isAd(), Boolean.TRUE) && productListModel != null && (awemeRawAd2 = productListModel.getAwemeRawAd()) != null && (adId = awemeRawAd2.getAdId()) != null) {
            str4 = String.valueOf(adId);
        } else {
            str4 = null;
        }
        c71367Rzf.LJJ = str4;
        if (productListModel != null && o.LJ(productListModel.isAd(), Boolean.TRUE) && productListModel != null && (awemeRawAd = productListModel.getAwemeRawAd()) != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
            str5 = String.valueOf(creativeId);
        } else {
            str5 = null;
        }
        c71367Rzf.LJJI = str5;
        if (productListModel != null) {
            z2 = o.LJ(productListModel.isAd(), Boolean.TRUE);
        } else {
            z2 = false;
        }
        if (z2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c71367Rzf.LJIL = i2;
        if (productListModel != null) {
            str6 = productListModel.getAuthorUid();
        } else {
            str6 = null;
        }
        c71367Rzf.LIZLLL = str6;
        if (productListModel == null || (str7 = productListModel.getEventType()) == null) {
            str7 = "";
        }
        c71367Rzf.LIZIZ = str7;
        if (productListModel != null) {
            str8 = productListModel.getAuthorUid();
        } else {
            str8 = null;
        }
        if (C025908h.LJFF(false, str8)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c71367Rzf.LJIJ = i3;
        if (productListModel != null) {
            aweme = productListModel.getAweme();
        }
        c71367Rzf.LJJIII = S0V.LIZ(aweme);
        if (productListModel == null || (str9 = productListModel.getEntranceForm()) == null) {
            str9 = str;
        }
        c71367Rzf.LJJIFFI = str9;
        if (productListModel == null || (str10 = productListModel.getPageName()) == null) {
            str10 = "video";
        }
        c71367Rzf.LJJII = str10;
        if (productListModel != null && (anchors2 = productListModel.getAnchors()) != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : anchors2) {
                if (hashSet.add(Integer.valueOf(anchorCommonStruct.getType()))) {
                    arrayList.add(anchorCommonStruct);
                }
            }
            i4 = Integer.valueOf(arrayList.size());
        } else {
            i4 = 0;
        }
        c71367Rzf.LJJIJLIJ = i4;
        c71367Rzf.LJJIJL = Integer.valueOf(anchors.size());
        c71367Rzf.LJJIIJZLJL = C71366Rze.LIZLLL(anchors);
        if (shopStatus != L7W.REGION_UNAVAILABLE) {
            c71367Rzf.LJJJI = S0G.PRODUCT_AVAILABLE.getValue();
        } else {
            c71367Rzf.LJJJI = S0G.PRODUCT_NOT_AVAILABLE.getValue();
        }
        if (productListModel != null && (mobParams = productListModel.getMobParams()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(mobParams.size()));
            for (Map.Entry<String, String> entry : mobParams.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                linkedHashMap.put(key, value);
            }
            c71367Rzf.LIZ = linkedHashMap;
        }
        c71367Rzf.LJIIIZ = String.valueOf(System.currentTimeMillis() - j);
        if (z) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        c71367Rzf.LJIIJ = i5;
        c71367Rzf.LJJLIIIJJIZ = Integer.valueOf(i);
        C71361RzZ c71361RzZ2 = C71361RzZ.LIZ;
        List LLJILJILJ2 = ORZ.LLJILJILJ(anchors);
        c71361RzZ2.getClass();
        if (C71361RzZ.LJJJ(LLJILJILJ2)) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        c71367Rzf.LJJLIIIJL = i6;
        if (C71361RzZ.LJJJI(productListModel)) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        c71367Rzf.LJJJZ = i7;
        appendExtraParam.invoke(c71367Rzf);
        c71367Rzf.LJJIIJZLJL = C71366Rze.LIZLLL(anchors);
        c71367Rzf.LJIIZILJ = C71361RzZ.LJJ(ORZ.LLJILJILJ(anchors));
        c71367Rzf.LJIILL = String.valueOf(C71366Rze.LJI(ORZ.LLJILJILJ(anchors)));
        if (productListModel != null && (panelOpenInfo = productListModel.getPanelOpenInfo()) != null && panelOpenInfo.getPanelNeedMaybeYouLike()) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        c71367Rzf.LJIILLIIL = i8;
        c71367Rzf.LJJJJI = "video";
        LIZ2.logCommerceEvents("tiktokec_shopping_list_show", c71367Rzf);
    }

    public static void LJIIJ(boolean z, String str, Aweme aweme, CommonVideoAnchorModel commonVideoAnchorModel, ShopWindowAnchorModel shopWindowAnchorModel, List list, String str2, int i) {
        C188727au c188727au;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        ShopWindowAnchorModel shopWindowAnchorModel2;
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowAnchorModel shopWindowAnchorModel3;
        String str7;
        Aweme aweme2 = aweme;
        ShopWindowAnchorModel shopWindowAnchorModel4 = shopWindowAnchorModel;
        String str8 = null;
        if ((i & 4) != 0) {
            aweme2 = null;
        }
        if ((i & 8) != 0) {
            commonVideoAnchorModel = null;
        }
        if ((i & 16) != 0) {
            shopWindowAnchorModel4 = null;
        }
        if (aweme2 != null) {
            c188727au = LIZ(z, str, aweme2, shopWindowAnchorModel4, list, str2);
        } else if (commonVideoAnchorModel != null) {
            c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", str2);
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("author_id", commonVideoAnchorModel.getAuthorUid());
            c188727au.LJIIIZ("group_id", commonVideoAnchorModel.getAid());
            if (shopWindowAnchorModel4 != null) {
                str3 = shopWindowAnchorModel4.id;
            } else if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ShopWindowAnchorModel) it.next()).id);
                }
                str3 = ORZ.LLD(arrayList, ",", null, null, null, 62);
            } else {
                str3 = null;
            }
            c188727au.LJIIIZ("anchor_id", str3);
            if (shopWindowAnchorModel4 != null) {
                str4 = shopWindowAnchorModel4.LIZ.title;
            } else if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ShopWindowAnchorModel) it2.next()).LIZ.title);
                }
                str4 = ORZ.LLD(arrayList2, ",", null, null, null, 62);
            } else {
                str4 = null;
            }
            c188727au.LJIIIZ("anchor_name", str4);
            if (shopWindowAnchorModel4 != null) {
                str5 = "product";
            } else if (list != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    it3.next();
                    arrayList3.add("product");
                }
                str5 = ORZ.LLD(arrayList3, ",", null, null, null, 62);
            } else {
                str5 = null;
            }
            c188727au.LJIIIZ("anchor_type", str5);
            if (list != null && (shopWindowAnchorModel3 = (ShopWindowAnchorModel) ORZ.LJLLLL(list)) != null) {
                str6 = shopWindowAnchorModel3.id;
            } else {
                str6 = null;
            }
            c188727au.LJIIIZ("main_anchor_id", str6);
            if (list != null && (shopWindowAnchorModel2 = (ShopWindowAnchorModel) ORZ.LJLLLL(list)) != null && (shopWindowExtraModel = shopWindowAnchorModel2.LIZ) != null) {
                str8 = shopWindowExtraModel.title;
            }
            c188727au.LJIIIZ("main_anchor_name", str8);
            c188727au.LJIIIZ("main_anchor_type", "product");
            c188727au.LIZLLL(z ? 1 : 0, "multi_anchor");
            if (z) {
                if (list != null) {
                    i2 = list.size();
                } else {
                    i2 = 0;
                }
            } else {
                i2 = 1;
            }
            c188727au.LIZLLL(i2, "anchor_number");
        } else {
            c188727au = new C188727au();
        }
        if (z) {
            str7 = "click_list";
        } else {
            str7 = "click_anchor";
        }
        c188727au.LJIIIZ("click_method", str7);
        FMX.LJIIL("enter_multi_anchor_detail", c188727au.LIZ);
    }

    public static void LJIJI(ProductListModel productListModel, String str, int i, List anchors, L7W shopStatus, long j, String str2, int i2, int i3) {
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        int i4;
        String str7;
        String str8;
        String str9;
        int i5;
        String str10;
        String str11;
        int i6;
        int i7;
        int i8;
        int i9;
        PanelOpenInfo panelOpenInfo;
        HashMap<String, String> mobParams;
        List<AnchorCommonStruct> anchors2;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        Long adId;
        C71402S0o appendExtraParam = C71402S0o.LJLIL;
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(shopStatus, "shopStatus");
        o.LJIIIZ(appendExtraParam, "appendExtraParam");
        ICommerceService LIZ2 = C71396S0i.LIZ();
        C71367Rzf c71367Rzf = new C71367Rzf();
        c71367Rzf.LJIJJ = "TEMAI";
        Aweme aweme = null;
        if (productListModel != null) {
            str3 = productListModel.getAid();
        } else {
            str3 = null;
        }
        c71367Rzf.LIZJ = str3;
        c71367Rzf.LJJIIZ = "video_shopping_list";
        if (productListModel != null && o.LJ(productListModel.isAd(), Boolean.TRUE) && (awemeRawAd2 = productListModel.getAwemeRawAd()) != null && (adId = awemeRawAd2.getAdId()) != null) {
            str4 = String.valueOf(adId);
        } else {
            str4 = null;
        }
        c71367Rzf.LJJ = str4;
        if (productListModel != null && o.LJ(productListModel.isAd(), Boolean.TRUE) && (awemeRawAd = productListModel.getAwemeRawAd()) != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
            str5 = String.valueOf(creativeId);
        } else {
            str5 = null;
        }
        c71367Rzf.LJJI = str5;
        if (productListModel == null || (str6 = productListModel.getEnterListForm()) == null) {
            str6 = "video_multi_anchor";
        }
        c71367Rzf.LJJIIZI = str6;
        if (productListModel != null) {
            z = o.LJ(productListModel.isAd(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (z) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c71367Rzf.LJIL = i4;
        if (productListModel != null) {
            str7 = productListModel.getAuthorUid();
        } else {
            str7 = null;
        }
        c71367Rzf.LIZLLL = str7;
        if (productListModel == null || (str8 = productListModel.getEventType()) == null) {
            str8 = "";
        }
        c71367Rzf.LIZIZ = str8;
        if (productListModel != null) {
            str9 = productListModel.getAuthorUid();
        } else {
            str9 = null;
        }
        if (C025908h.LJFF(false, str9)) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        c71367Rzf.LJIJ = i5;
        if (productListModel != null) {
            aweme = productListModel.getAweme();
        }
        c71367Rzf.LJJIII = S0V.LIZ(aweme);
        if (productListModel == null || (str10 = productListModel.getEntranceForm()) == null) {
            str10 = str;
        }
        c71367Rzf.LJJIFFI = str10;
        if (productListModel == null || (str11 = productListModel.getPageName()) == null) {
            str11 = "video";
        }
        c71367Rzf.LJJII = str11;
        c71367Rzf.LJJIJ = Integer.valueOf((int) j);
        c71367Rzf.LJJIJIIJI = Integer.valueOf(i2);
        c71367Rzf.LJJIJIIJIL = str2;
        if (productListModel != null && (anchors2 = productListModel.getAnchors()) != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : anchors2) {
                if (hashSet.add(Integer.valueOf(anchorCommonStruct.getType()))) {
                    arrayList.add(anchorCommonStruct);
                }
            }
            i6 = Integer.valueOf(arrayList.size());
        } else {
            i6 = 0;
        }
        c71367Rzf.LJJIJLIJ = i6;
        c71367Rzf.LJJLIIIJLJLI = Integer.valueOf(i);
        c71367Rzf.LJJIJL = Integer.valueOf(anchors.size());
        c71367Rzf.LJJIIJZLJL = C71366Rze.LIZLLL(anchors);
        if (shopStatus != L7W.REGION_UNAVAILABLE) {
            c71367Rzf.LJJJI = S0G.PRODUCT_AVAILABLE.getValue();
        } else {
            c71367Rzf.LJJJI = S0G.PRODUCT_NOT_AVAILABLE.getValue();
        }
        if (productListModel != null && (mobParams = productListModel.getMobParams()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(mobParams.size()));
            for (Map.Entry<String, String> entry : mobParams.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                linkedHashMap.put(key, value);
            }
            c71367Rzf.LIZ = linkedHashMap;
        }
        c71367Rzf.LJJLIIIJJIZ = Integer.valueOf(i3);
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        List LLJILJILJ = ORZ.LLJILJILJ(anchors);
        c71361RzZ.getClass();
        if (C71361RzZ.LJJJ(LLJILJILJ)) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        c71367Rzf.LJJLIIIJL = i7;
        appendExtraParam.invoke(c71367Rzf);
        c71367Rzf.LJJIIJZLJL = C71366Rze.LIZLLL(anchors);
        c71367Rzf.LJIIZILJ = C71361RzZ.LJJ(ORZ.LLJILJILJ(anchors));
        c71367Rzf.LJIILL = String.valueOf(C71366Rze.LJI(ORZ.LLJILJILJ(anchors)));
        if (C71361RzZ.LJJJI(productListModel)) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        c71367Rzf.LJJJZ = i8;
        if (productListModel != null && (panelOpenInfo = productListModel.getPanelOpenInfo()) != null && panelOpenInfo.getPanelNeedMaybeYouLike()) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        c71367Rzf.LJIILLIIL = i9;
        c71367Rzf.LJJJJI = "video";
        LIZ2.logCommerceEvents("tiktokec_shopping_list_staytime", c71367Rzf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0320  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r14, java.util.List r15, java.lang.Integer r16, java.lang.String r17, java.lang.String r18, boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71363Rzb.LIZJ(com.ss.android.ugc.aweme.ecommerce.model.ProductListModel, java.util.List, java.lang.Integer, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void LJIJJLI(int i, int i2, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, String str4, List products) {
        o.LJIIIZ(products, "products");
        C76542zS.LIZJ("rd_tiktokec_video_shopping_list_request_result", new C36678EaQ(i, i2, num2, num, l, l2, str2, str3, str4, str, products));
    }
}
