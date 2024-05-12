package X;

import Y.ACallableS32S1100000_4;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.CoinBottomTab;
import com.bytedance.touchpoint.core.model.ProfileActivityButton;
import com.bytedance.touchpoint.core.model.ProfileActivityIcon;
import com.bytedance.touchpoint.core.model.ReferralFeedBanner;
import com.bytedance.touchpoint.core.model.TextLink;
import com.bytedance.touchpoint.core.model.TouchPoint;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9nX */
/* loaded from: classes5.dex */
public final class C247519nX {
    public static final C247519nX LIZ = new C247519nX();

    public static TouchPoint LIZ(int i) {
        C95U LIZ2 = C96O.LIZ(i, CoinBottomTab.class);
        if (LIZ2 != null) {
            int i2 = LIZ2.LIZ;
            String str = LIZ2.LIZIZ;
            if (str == null) {
                str = "";
            }
            Integer num = LIZ2.LIZJ;
            java.util.Map<String, String> map = LIZ2.LJ;
            String str2 = LIZ2.LIZLLL;
            String str3 = LIZ2.LJFF;
            if (str3 == null) {
                str3 = "";
            }
            return new TouchPoint(i2, str, num, map, null, str2, "", str3, false);
        }
        return null;
    }

    public static void LIZIZ(boolean z) {
        Object obj;
        LinkedHashMap LIZ2 = C0JU.LIZ("enter_from", "feed");
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("is_adult", obj);
        if (!C247509nW.LIZIZ()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("is_login", str);
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            interfaceC247459nR.LIZIZ("age_pop_click", LIZ2);
        }
    }

    public static void LJIIJ(TouchPoint touchPoint) {
        String str;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("touch_point_id", String.valueOf(touchPoint.touchPointId));
        linkedHashMap.put("touch_point_name", touchPoint.touchPointName);
        linkedHashMap.put("launch_plan_id", String.valueOf(touchPoint.launchPlanId));
        linkedHashMap.put("touch_point_ab_versions", String.valueOf(touchPoint.abVersions));
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null) {
            str = abstractC247499nV.LJIIJ();
        } else {
            str = null;
        }
        linkedHashMap.put("region", str);
        linkedHashMap.put("cold_start_cnt", String.valueOf(C249979rV.LIZJ));
        if (C247509nW.LIZIZ()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_login", str2);
        java.util.Map<String, String> map = touchPoint.customEventParams;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            interfaceC247459nR.LIZIZ("touch_point_receive", linkedHashMap);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC247499nV abstractC247499nV2 = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV2 != null) {
                str3 = abstractC247499nV2.LJIIJ();
            } else {
                str3 = null;
            }
            jSONObject.put("region", str3);
            jSONObject.put("touch_point_id", touchPoint.touchPointId);
            jSONObject.put("launch_plan_id", touchPoint.launchPlanId);
        } catch (JSONException unused) {
        }
        C09900aA.LJI("touchpoint_receive_monitor", jSONObject, null, null);
    }

    public final void LJ(ReferralFeedBanner referralFeedBanner, String eventType) {
        String str;
        int i;
        java.util.Map<String, String> map;
        o.LJIIIZ(eventType, "eventType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (o.LJ(eventType, "homepage_friends")) {
            str = "friends_tab";
        } else {
            str = "homepage_hot";
        }
        linkedHashMap.put("enter_from", str);
        if (referralFeedBanner != null && (map = referralFeedBanner.eventParams) != null) {
            linkedHashMap.putAll(map);
        }
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            interfaceC247459nR.LIZIZ("now_card_click", linkedHashMap);
        }
        if (referralFeedBanner != null) {
            i = referralFeedBanner.LIZ;
        } else {
            i = 0;
        }
        LJIIIZ(this, i, new HashMap(), null, null, 28);
    }

    public final void LJI(ProfileActivityIcon profileActivityIcon, List<ProfileActivityButton> profileActivityButtonList) {
        String str;
        o.LJIIIZ(profileActivityButtonList, "profileActivityButtonList");
        if (profileActivityButtonList.size() > 1) {
            str = "merge_button";
        } else {
            str = ((ProfileActivityButton) ListProtector.get(profileActivityButtonList, 0)).activityId;
        }
        LinkedHashMap LIZIZ = JF1.LIZIZ("bubble_type", str, "enter_from", "personal_homepage");
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        String str2 = null;
        if (abstractC247499nV != null) {
            str2 = abstractC247499nV.LJIIJ();
        }
        LIZIZ.put("region", str2);
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            interfaceC247459nR.LIZIZ("gift_entrance_click", LIZIZ);
        }
        if (profileActivityIcon != null && profileActivityIcon.LIZIZ != null && profileActivityIcon.LIZIZ.length() > 0) {
            LJIIIZ(this, profileActivityIcon.LIZ, C0JU.LIZ("click_position", "widget"), null, null, 28);
        }
    }

    public static void LIZLLL(int i, String str, String str2) {
        String str3;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", String.valueOf(i));
            linkedHashMap.put("name", str);
            linkedHashMap.put("task_id", str2);
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str3 = abstractC247499nV.LJIIJ();
            } else {
                str3 = null;
            }
            linkedHashMap.put("region", str3);
            interfaceC247459nR.LIZIZ("receive_inapp_push_request", linkedHashMap);
        }
    }

    public final void LJII(boolean z, String str, TextLink textLink) {
        o.LJIIIZ(textLink, "textLink");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("group_id", str);
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            interfaceC247459nR.LIZIZ("text_link_show", linkedHashMap);
        }
        if (z) {
            LJIIL(this, textLink.LIZ, new HashMap(), textLink.LIZJ, null, 56);
        }
    }

    public static void LIZJ(int i, String str, String str2, String str3) {
        String str4;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", String.valueOf(i));
            linkedHashMap.put("name", str);
            linkedHashMap.put("task_id", str2);
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str4 = abstractC247499nV.LJIIJ();
            } else {
                str4 = null;
            }
            linkedHashMap.put("region", str4);
            linkedHashMap.put("result", str3);
            interfaceC247459nR.LIZIZ("inapp_push_filtered_reason", linkedHashMap);
        }
    }

    public static void LJIIIIZZ(int i, java.util.Map map, Integer num, Integer num2, String str) {
        TouchPoint LIZJ;
        String str2;
        String str3;
        String str4;
        if (i == 29) {
            LIZJ = LIZ(i);
        } else {
            LIZJ = C2MW.LIZ().LIZJ(i, num);
        }
        if (LIZJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("touch_point_id", String.valueOf(LIZJ.touchPointId));
            linkedHashMap.put("touch_point_name", LIZJ.touchPointName);
            linkedHashMap.put("launch_plan_id", String.valueOf(LIZJ.launchPlanId));
            linkedHashMap.put("touch_point_ab_versions", String.valueOf(LIZJ.abVersions));
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str2 = abstractC247499nV.LJIIJ();
            } else {
                str2 = null;
            }
            linkedHashMap.put("region", str2);
            linkedHashMap.put("cold_start_cnt", String.valueOf(C249979rV.LIZJ));
            if (C247509nW.LIZIZ()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_login", str3);
            if (num2 != null) {
                linkedHashMap.put("vv_cnt", String.valueOf(num2.intValue()));
            }
            if (str != null) {
                linkedHashMap.put("status", str);
            }
            java.util.Map<String, String> map2 = LIZJ.customEventParams;
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
            linkedHashMap.putAll(map);
            if (i == 4) {
                linkedHashMap.putAll(C26408AYa.LIZJ());
                linkedHashMap.put("vv_cnt_total", String.valueOf(C249979rV.LIZLLL));
            } else if (i == 2) {
                C247679nn.LIZ().getClass();
                linkedHashMap.put("task_status", C249479qh.LJJIFFI());
            }
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                interfaceC247459nR.LIZIZ("touch_point_click", linkedHashMap);
            }
            String valueOf = String.valueOf(map.get("click_position"));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("touch_point_id", LIZJ.touchPointId);
                jSONObject.put("launch_plan_id", LIZJ.launchPlanId);
                jSONObject.put("click_position", valueOf);
                AbstractC247499nV abstractC247499nV2 = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV2 != null) {
                    str4 = abstractC247499nV2.LJIIJ();
                } else {
                    str4 = null;
                }
                jSONObject.put("region", str4);
            } catch (JSONException unused) {
            }
            C09900aA.LJI("touchpoint_click_monitor", jSONObject, null, null);
        }
    }

    public static /* synthetic */ void LJIIIZ(C247519nX c247519nX, int i, java.util.Map map, Integer num, Integer num2, int i2) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        c247519nX.getClass();
        LJIIIIZZ(i, map, num, num2, null);
    }

    public static void LJIIJJI(int i, java.util.Map map, Integer num, Integer num2, String str, String subType) {
        TouchPoint LIZJ;
        String str2;
        String str3;
        String str4;
        o.LJIIIZ(subType, "subType");
        if (i == 29) {
            LIZJ = LIZ(i);
        } else {
            LIZJ = C2MW.LIZ().LIZJ(i, num);
        }
        if (LIZJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("touch_point_id", String.valueOf(LIZJ.touchPointId));
            linkedHashMap.put("touch_point_name", LIZJ.touchPointName);
            linkedHashMap.put("launch_plan_id", String.valueOf(LIZJ.launchPlanId));
            linkedHashMap.put("touch_point_ab_versions", String.valueOf(LIZJ.abVersions));
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str2 = abstractC247499nV.LJIIJ();
            } else {
                str2 = null;
            }
            linkedHashMap.put("region", str2);
            linkedHashMap.put("cold_start_cnt", String.valueOf(C249979rV.LIZJ));
            if (C247509nW.LIZIZ()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_login", str3);
            if (subType.length() > 0) {
                linkedHashMap.put("sub_type", subType);
            }
            if (num2 != null) {
                linkedHashMap.put("vv_cnt", String.valueOf(num2.intValue()));
            }
            if (str != null) {
                linkedHashMap.put("status", str);
            }
            java.util.Map<String, String> map2 = LIZJ.customEventParams;
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
            linkedHashMap.putAll(map);
            if (i == 4) {
                linkedHashMap.putAll(C26408AYa.LIZJ());
                linkedHashMap.put("vv_cnt_total", String.valueOf(C249979rV.LIZLLL));
            } else if (i == 2) {
                C247679nn.LIZ().getClass();
                linkedHashMap.put("task_status", C249479qh.LJJIFFI());
            }
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                interfaceC247459nR.LIZIZ("touch_point_show", linkedHashMap);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("touch_point_id", LIZJ.touchPointId);
                jSONObject.put("launch_plan_id", LIZJ.launchPlanId);
                AbstractC247499nV abstractC247499nV2 = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV2 != null) {
                    str4 = abstractC247499nV2.LJIIJ();
                } else {
                    str4 = null;
                }
                jSONObject.put("region", str4);
            } catch (JSONException unused) {
            }
            C09900aA.LJI("touchpoint_show_monitor", jSONObject, null, null);
        }
        C247569nc.LJLJJL.getClass();
        C247569nc.LJLJJI = true;
        C247569nc.LJJI();
    }

    public static /* synthetic */ void LJIIL(C247519nX c247519nX, int i, java.util.Map map, Integer num, Integer num2, int i2) {
        Integer num3 = num;
        Integer num4 = num2;
        String str = null;
        if ((i2 & 4) != 0) {
            num3 = null;
        }
        if ((i2 & 8) != 0) {
            num4 = null;
        }
        if ((i2 & 32) != 0) {
            str = "";
        }
        c247519nX.getClass();
        LJIIJJI(i, map, num3, num4, null, str);
    }

    public static void LJFF(String str, String str2, String str3, int i, String str4, C9OT c9ot, String str5, boolean z, String str6, int i2, String subType) {
        int i3;
        String str7;
        ActivityTask activityTask;
        String str8;
        ActivityTask activityTask2;
        String str9;
        String str10;
        o.LJIIIZ(subType, "subType");
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            LinkedHashMap LIZIZ = JF1.LIZIZ("position", str, "widget_name", str2);
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str9 = abstractC247499nV.LJIIIZ();
            } else {
                str9 = null;
            }
            C132805Jc.LJFF(LIZIZ, "page", str9, 0, "is_selected");
            C132805Jc.LJFF(LIZIZ, "group_id", str3, i, "is_tiktok_bonus");
            LIZIZ.put("click", str4);
            LIZIZ.put("event_keyword", C249919rP.LIZJ(c9ot));
            LIZIZ.put("activity_name", C249919rP.LIZ(c9ot, str2));
            LIZIZ.put("is_login", String.valueOf(C247509nW.LIZIZ()));
            LIZIZ.put("status", str6);
            LIZIZ.put("vv_cnt", String.valueOf(i2));
            AbstractC247499nV abstractC247499nV2 = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV2 != null) {
                str10 = abstractC247499nV2.LJIIJ();
            } else {
                str10 = null;
            }
            LIZIZ.put("region", str10);
            LIZIZ.put("enter_from", str5);
            interfaceC247459nR.LIZIZ("widget_time_tracker_click", LIZIZ);
        }
        if (o.LJ(str2, "non_tracker")) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (o.LJ(str2, "non_tracker")) {
            str7 = "close";
            if (!o.LJ(str4, "close")) {
                str7 = "widget";
            }
        } else {
            str7 = "timer_widget";
        }
        linkedHashMap.put("click_position", str7);
        C247679nn.LIZ().getClass();
        C249479qh.LJJII();
        String str11 = "";
        if (C247539nZ.LIZ().LJJIIJZLJL() ? !(C247599nf.LIZ().LJJIIJ() || (activityTask = C247599nf.LIZ().LJLJJL) == null || (str8 = activityTask.taskKey) == null) : !((activityTask2 = C247539nZ.LIZ().LJLJJL) == null || (str8 = activityTask2.taskKey) == null)) {
            str11 = str8;
        }
        linkedHashMap.put("task_key", str11);
        linkedHashMap.put("sub_type", subType);
        LJIIIIZZ(i3, linkedHashMap, null, Integer.valueOf(i2), str6);
        if (z && o.LJ(str2, "non_tracker")) {
            C10K.LIZJ(new ACallableS32S1100000_4(c9ot, str4, 0));
        }
    }
}
