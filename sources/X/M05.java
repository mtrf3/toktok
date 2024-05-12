package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CountCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DaParams;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceRes;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceResCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionTargetRes;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionTargetResCfg;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M05 {
    public static final /* synthetic */ int LIZ = 0;

    public static M08 LIZJ(CountCfg countCfg) {
        if (countCfg == null) {
            return null;
        }
        Integer showType = countCfg.getShowType();
        if (showType == null || showType.intValue() != 2 || countCfg.getCount() == null || countCfg.getCount().intValue() <= 0) {
            return M08.NORMAL;
        }
        return M08.NUMBER;
    }

    public static M06 LIZLLL(CustomDotResponse customDotResponse, DiversionData diversionData) {
        DiversionEntranceRes LJJ;
        DiversionEntranceResCfg config;
        if (customDotResponse == null || (customDotResponse.getIconConfig() == null && customDotResponse.getCountConfig() == null && (diversionData == null || (LJJ = C73340SqO.LJJ(diversionData)) == null || (config = LJJ.getConfig()) == null || config.getRedDot() == null))) {
            return M06.NONE;
        }
        if (customDotResponse.getIconConfig() != null) {
            return M06.SPECIAL;
        }
        return M06.NORMAL;
    }

    public static java.util.Map LIZ(DiversionData diversionData, boolean z, boolean z2) {
        String str;
        String str2;
        DiversionTargetRes LJJI;
        DiversionTargetResCfg diversionTargetResCfg;
        String str3;
        Object obj;
        DiversionEntranceRes LJJ;
        DiversionEntranceResCfg config;
        if (diversionData != null) {
            DaParams daParams = diversionData.getDaParams();
            String str4 = "";
            if (daParams == null || (str = daParams.getBubbleType()) == null) {
                str = "";
            }
            DaParams daParams2 = diversionData.getDaParams();
            if (daParams2 == null || (str2 = daParams2.getBubbleTextType()) == null) {
                str2 = "";
            }
            if (!z ? !((LJJI = C73340SqO.LJJI(diversionData)) == null || (diversionTargetResCfg = LJJI.config) == null || (str3 = diversionTargetResCfg.text) == null) : !((LJJ = C73340SqO.LJJ(diversionData)) == null || (config = LJJ.getConfig()) == null || (str3 = config.getText()) == null)) {
                str4 = str3;
            }
            String str5 = "1";
            if (C78685UuP.LJJJZ(str4)) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            LinkedHashMap LIZIZ = JF1.LIZIZ("bubble_type", str, "bubble_text_type", str2);
            LIZIZ.put("bubble_text", str4);
            LIZIZ.put("is_bubble_text_show", obj);
            if (!z2) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZIZ.put("is_bubble_pic_show", str5);
            return LIZIZ;
        }
        return null;
    }

    public static java.util.Map LIZIZ(DiversionData diversionData, boolean z, boolean z2, int i) {
        String str;
        String str2;
        if (diversionData != null && z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            L86 l86 = L86.BOTTOM_TAB;
            if (i == l86.getValue()) {
                str = "mall_tab";
            } else {
                str = "mall_top_tab";
            }
            linkedHashMap.put("bubble_position", str);
            if (i == l86.getValue()) {
                str2 = "homepage_bottom_tab";
            } else {
                str2 = "homepage_top_tab";
            }
            linkedHashMap.put("mall_entrance", str2);
            linkedHashMap.put("is_bubble_clickable", "1");
            java.util.Map LIZ2 = LIZ(diversionData, true, z2);
            if (LIZ2 != null) {
                linkedHashMap.putAll(LIZ2);
                return linkedHashMap;
            }
            return linkedHashMap;
        }
        return null;
    }

    public static void LJ(String str, String str2, String str3, java.util.Map map) {
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        HashMap LIZJ = C03660Ck.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (str != null) {
            LIZJ.put("enter_from", str);
        }
        if (str2 != null) {
            LIZJ.put("page_name", str2);
        }
        LIZJ.put("bubble_position", str3);
        LIZJ.put("is_bubble_clickable", "1");
        if (map != null) {
            LIZJ.putAll(map);
        }
        c56092Lzs.getClass();
        C56092Lzs.LJIILIIL("tiktokec_bubble_click", LIZJ);
    }

    public static void LJI(String str, String str2, String str3, java.util.Map map) {
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        HashMap LIZJ = C03660Ck.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (str != null) {
            LIZJ.put("enter_from", str);
        }
        if (str2 != null) {
            LIZJ.put("page_name", str2);
        }
        LIZJ.put("bubble_position", str3);
        LIZJ.put("is_bubble_clickable", "1");
        if (map != null) {
            LIZJ.putAll(map);
        }
        c56092Lzs.getClass();
        C56092Lzs.LJIILIIL("tiktokec_bubble_show", LIZJ);
    }

    public static void LJFF(String str, String str2, String str3, String str4, java.util.Map map) {
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        HashMap LIZJ = C03660Ck.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (str != null) {
            LIZJ.put("enter_from", str);
        }
        if (str2 != null) {
            LIZJ.put("page_name", str2);
        }
        LIZJ.put("bubble_position", str3);
        LIZJ.put("is_bubble_clickable", "1");
        LIZJ.put("disappear_type", str4);
        if (map != null) {
            LIZJ.putAll(map);
        }
        c56092Lzs.getClass();
        C56092Lzs.LJIILIIL("tiktokec_bubble_disappear", LIZJ);
    }

    public static void LJII(M06 redDotType, M08 m08, Integer num, EnumC56125M0z position, EnumC55932LxI userPosition, java.util.Map map, java.util.Map map2) {
        o.LJIIIZ(redDotType, "redDotType");
        o.LJIIIZ(position, "position");
        o.LJIIIZ(userPosition, "userPosition");
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        HashMap LIZJ = C03660Ck.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        LIZJ.put("red_dot_type", redDotType.getValue());
        if (m08 != null) {
            LIZJ.put("red_dot_number_type", m08.getValue());
        }
        if (num != null) {
            LIZJ.put("red_dot_number", Integer.valueOf(num.intValue()));
        }
        LIZJ.put("position", position.getValue());
        LIZJ.put("user_position", userPosition.getValue());
        if (map != null) {
            LIZJ.putAll(map);
        }
        if (map2 != null) {
            LIZJ.putAll(map2);
        }
        c56092Lzs.getClass();
        C56092Lzs.LJIILIIL("tiktokec_red_dot_show", LIZJ);
    }
}
