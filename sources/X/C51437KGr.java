package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import defpackage.e;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.KGr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51437KGr extends e {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String str;
        String str2;
        String str3;
        KAK kak;
        String str4;
        String str5;
        String str6;
        e.b bVar = (e.b) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        Activity activity = null;
        if (interfaceC38263Ezz != null) {
            activity = interfaceC38263Ezz.LIZLLL();
        }
        if ((activity instanceof ActivityC45651qj) && activity != null) {
            String searchWord = bVar.getSearchWord();
            String searchWordId = bVar.getSearchWordId();
            Number searchWordPosition = bVar.getSearchWordPosition();
            String searchLogId = bVar.getSearchLogId();
            String ecHintCouponInfo = bVar.getEcHintCouponInfo();
            String promotionInfo = bVar.getPromotionInfo();
            String attachProducts = bVar.getAttachProducts();
            try {
                ICommonFeedApiService LIZ = CommonFeedApiService.LIZ();
                if (LIZ == null || (str = LIZ.LJJIFFI()) == null) {
                    str = "";
                }
                if (searchWord == null) {
                    str2 = "";
                } else {
                    str2 = searchWord;
                }
                if (KLA.LIZ() != 0) {
                    str3 = "//ec/search";
                } else {
                    str3 = "//search";
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(activity, str3);
                C56092Lzs.LIZ.getClass();
                buildRoute.withParam("enter_from", C56092Lzs.LIZJ());
                buildRoute.withParam("group_id", str);
                buildRoute.withParam("in_single_stack", true);
                int i = 0;
                buildRoute.withParam("set_hint_by_sug_word", false);
                FHD.LIZLLL().getClass();
                if (FHD.LJ(1, 0, "TTK_mall_search_land_in_shop_tab", true) == 0) {
                    kak = KAK.TOP;
                } else {
                    kak = KAK.SHOP;
                }
                buildRoute.withParam("target_tab", kak.getTabName());
                buildRoute.withParam("keep_tab_position", true);
                if (searchWordId == null) {
                    str4 = "";
                } else {
                    str4 = searchWordId;
                }
                buildRoute.withParam("hint_group_id", str4);
                if (searchLogId == null) {
                    str5 = "";
                } else {
                    str5 = searchLogId;
                }
                buildRoute.withParam("hint_imp_id", str5);
                if (searchWordPosition != null) {
                    i = searchWordPosition.intValue();
                }
                buildRoute.withParam("hint_position", i);
                String jSONArray = new JSONArray((Collection) C47261Igj.LJJIJ(6)).toString();
                if (jSONArray == null) {
                    jSONArray = "[]";
                }
                buildRoute.withParam("traffic_source_list", jSONArray);
                buildRoute.withParam("blankpage_enter_from", C56092Lzs.LIZJ());
                buildRoute.withParam("blankpage_enter_method", "enter");
                buildRoute.withParam("search_from", C56092Lzs.LIZJ());
                if (KLA.LIZ() != 2) {
                    str6 = "";
                } else {
                    str6 = KAK.SHOP.getTabName();
                }
                buildRoute.withParam("single_tab_type", str6);
                if (ecHintCouponInfo == null) {
                    ecHintCouponInfo = "";
                }
                buildRoute.withParam("ec_hint_coupon_info", ecHintCouponInfo);
                if (promotionInfo == null) {
                    promotionInfo = "";
                }
                buildRoute.withParam("promotion_info", promotionInfo);
                if (attachProducts == null) {
                    attachProducts = "";
                }
                buildRoute.withParam("attach_products", attachProducts);
                if (!ujb.o.LJJJJJL(str2)) {
                    buildRoute.withParam("search_hint_word", str2);
                }
                buildRoute.open();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_method", "enter");
                c188727au.LJIIIZ("enter_from", C56092Lzs.LIZJ());
                c188727au.LJIIIZ("search_entrance", C56092Lzs.LIZJ());
                java.util.Map<String, String> map = c188727au.LIZ;
                o.LJIIIIZZ(map, "newBuilder()\n           …               .builder()");
                C76542zS.LIZ("enter_search_blankpage", map);
                C36746EbW.LIZ(3, "ShopTabV3 setSearchData searchWord " + searchWord + " searchWordId " + searchWordId + " searchWordPosition " + searchWordPosition + " searchLogId " + searchLogId);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }
}
