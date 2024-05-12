package com.ss.android.ugc.aweme.ecommerce.showcase;

import X.C16880lQ;
import X.C188727au;
import X.C47261Igj;
import X.C58096Mr6;
import X.C770830u;
import X.C78685UuP;
import X.ORY;
import X.PII;
import X.Z9N;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService;
import com.ss.android.ugc.aweme.profile.model.ShopEntranceInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class EcommerceStoreBizLogServiceImpl implements IEcommerceStoreBizLogService {
    public static IEcommerceStoreBizLogService LJI() {
        Object LIZ = C58096Mr6.LIZ(IEcommerceStoreBizLogService.class, false);
        if (LIZ != null) {
            return (IEcommerceStoreBizLogService) LIZ;
        }
        if (C58096Mr6.a0 == null) {
            synchronized (IEcommerceStoreBizLogService.class) {
                if (C58096Mr6.a0 == null) {
                    C58096Mr6.a0 = new EcommerceStoreBizLogServiceImpl();
                }
            }
        }
        return C58096Mr6.a0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LIZIZ(Map<String, ? extends Object> params) {
        o.LJIIIZ(params, "params");
        C78685UuP.LJJLIIIJJIZ("tiktokec_enter_shop", params);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LJ(Map<String, Object> eventParams) {
        o.LJIIIZ(eventParams, "eventParams");
        String[] strArr = {"enter_from", "page_name", "entrance_info", "first_source_page", "source_page_type", "entrance_type", "shop_id", "author_id", "author_type", "is_self", "follow_status", "search_id", "search_result_id", "search_entrance", "list_source_content_id"};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : eventParams.entrySet()) {
            if (ORY.LJJIJIIJIL(entry.getKey(), strArr)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C78685UuP.LJJLIIIJJIZ("tiktokec_shop_entrance_click", linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LJFF(JSONObject jSONObject) {
        C78685UuP.LJJLIIIJL("tiktokec_stay_shop", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LIZJ(User user, boolean z, String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("page_name", "follow");
        String uid = user.getUid();
        if (uid == null) {
            uid = "";
        }
        c188727au.LJIIIZ("author_id", uid);
        c188727au.LIZLLL(z ? 1 : 0, "is_self");
        c188727au.LJIIIZ("previous_page", str2);
        c188727au.LIZLLL(user.getFollowStatus(), "follow_status");
        C78685UuP.LJJLIIIJLJLI(c188727au, "tiktokec_showcase_entrance_show");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LIZLLL(Bundle bundle, Map<String, String> map, Map<String, ? extends Object> map2, boolean z) {
        String str;
        Object LLJJIII;
        ArrayList LJII = C47261Igj.LJII("enter_from", "page_name", "entrance_type", "author_id", "follow_status", "search_id", "search_result_id", "previous_page", "list_source_content_id", "has_red_dot");
        ArrayList LJII2 = C47261Igj.LJII("search_id", "search_result_id", "previous_page", "list_source_content_id");
        JSONObject LIZLLL = C770830u.LIZLLL("is_self", z ? 1 : 0);
        LIZLLL.put("traceparent", PII.LIZIZ());
        Iterator it = LJII.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (bundle != null && (LLJJIII = C16880lQ.LLJJIII(bundle, str2)) != null) {
                LIZLLL.put(str2, LLJJIII);
            }
        }
        Iterator it2 = LJII2.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            if (map != null && (str = map.get(str3)) != null) {
                LIZLLL.put(str3, str);
            }
        }
        for (Map.Entry entry : ((HashMap) map2).entrySet()) {
            LIZLLL.put((String) entry.getKey(), entry.getValue());
        }
        C78685UuP.LJJLIIIJL("tiktokec_showcase_entrance_click", LIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LIZ(User user, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        ShopEntranceInfo.ShopCreatorTypeEnum creatorType;
        String mobString;
        String str10 = "";
        Map<String, String> LLJLLIL = Z9N.LIZIZ.LLJLLIL(str3, "");
        String str11 = LLJLLIL.get("search_id");
        String str12 = LLJLLIL.get("search_result_id");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("page_name", str2);
        c188727au.LJIIIZ("is_self", String.valueOf(num));
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJIIIZ("entrance_info", str4);
        c188727au.LJIIIZ("entrance_type", str9);
        c188727au.LJIIIZ("source_page_type", str5);
        if (str6 != null) {
            str11 = str6;
        }
        c188727au.LJIIIZ("search_id", str11);
        if (str7 != null) {
            str12 = str7;
        }
        c188727au.LJIIIZ("search_result_id", str12);
        c188727au.LJIIIZ("list_source_content_id", str8);
        c188727au.LJIIIZ("shop_id", str);
        if (user != null) {
            c188727au.LJI("author_id", user.getUid());
            ShopEntranceInfo shopEntrance = user.getShopEntrance();
            if (shopEntrance != null && (creatorType = shopEntrance.getCreatorType()) != null && (mobString = creatorType.getMobString()) != null) {
                str10 = mobString;
            }
            c188727au.LJI("author_type", str10);
            c188727au.LIZLLL(user.getFollowStatus(), "follow_status");
        }
        C78685UuP.LJJLIIIJLJLI(c188727au, "tiktokec_shop_entrance_show");
    }
}
