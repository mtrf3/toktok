package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftListOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Csc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32710Csc {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static String LIZ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "receive_update_message" : "receive_new_effect" : "show_gift_panel" : "enter_room" : "app_launch";
    }

    public static final void LJIIIIZZ() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        BZI LIZ2 = C28787BRn.LIZ("gift_panel_click_retry");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
        C0K2.LJI("gift_panel_click_retry", jSONObject3, jSONObject2, jSONObject);
    }

    public static int LIZIZ() {
        Object obj;
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29824BnA.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = 0;
        }
        return o.LJ(valueOf, obj) ? 1 : 0;
    }

    public static final void LJIIIZ(C32722Cso c32722Cso, C32730Csw c32730Csw, C32712Cse c32712Cse, C32711Csd c32711Csd) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click_react_duration", c32712Cse.LIZIZ);
        jSONObject.put("click_data_structure_ready_duration", c32712Cse.LJFF);
        jSONObject.put("click_data_show_duration", c32712Cse.LIZJ);
        jSONObject.put("click_panel_animation_duration", c32712Cse.LJI);
        long j = c32712Cse.LIZJ;
        long j2 = c32712Cse.LJI;
        if (j < j2) {
            j = j2;
        }
        jSONObject.put("click_panel_available_duration", j);
        jSONObject.put("first_screen_image_scc_cnt", c32722Cso.LJFF);
        jSONObject.put("first_screen_image_cache_cnt", c32722Cso.LJI);
        jSONObject.put("first_screen_image_load_rate", String.valueOf(c32722Cso.LJFF / c32722Cso.LJ));
        jSONObject.put("click_panel_first_frame_duration", c32712Cse.LIZLLL);
        jSONObject.put("live_dur_when_open_panel", c32712Cse.LJ);
        jSONObject.put("loading_view_count", c32722Cso.LIZLLL);
        jSONObject.put("initialize_gift_panel_leaf_duration", c32711Csd.LIZIZ);
        jSONObject.put("update_gift_pages_duration", c32711Csd.LIZJ);
        jSONObject.put("load_visible_image_duration", c32711Csd.LIZLLL);
        jSONObject.put("add_gift_panel_leaf_duration", c32711Csd.LJ);
        jSONObject.put("add_top_sub_leaf_duration", c32711Csd.LJFF);
        jSONObject.put("add_bottom_sub_leaf_duration", c32711Csd.LJI);
        jSONObject.put("add_match_tray_leaf_duration", c32711Csd.LJII);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_anchor", LIZIZ());
        jSONObject2.put("data_status", c32722Cso.LIZIZ);
        jSONObject2.put("first_screen_gift_count", c32722Cso.LJ);
        jSONObject2.put("is_use_cache", c32722Cso.LIZJ);
        jSONObject2.put("gift_enter_from", c32722Cso.LIZ);
        jSONObject2.put("is_landscape", c32722Cso.LJII ? 1 : 0);
        jSONObject2.put("error_type", c32730Csw.LIZIZ);
        jSONObject2.put("error_msg", c32730Csw.LIZJ);
        jSONObject2.put("error_code", c32730Csw.LIZLLL);
        jSONObject2.put("is_gift_list_optimized", LiveGiftListOptSetting.INSTANCE.getValue() ? 1 : 0);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("error_msg", c32730Csw.LIZJ);
        jSONObject3.put("error_code", c32730Csw.LIZLLL);
        C32455CoV.LJII(jSONObject2, jSONObject3);
        BZI LIZ2 = C28787BRn.LIZ("gift_panel_data_show");
        LIZ2.LJIIZILJ();
        LIZ2.LJJ(jSONObject2);
        LIZ2.LJJ(jSONObject);
        LIZ2.LJJ(jSONObject3);
        LIZ2.LJJIIJZLJL();
        if (c32722Cso.LIZIZ != 0) {
            C0K2.LJI("gift_panel_data_show", jSONObject2, jSONObject, jSONObject3);
        } else {
            C0K2.LJ("gift_panel_data_show", jSONObject2, jSONObject, jSONObject3);
            C0K2.LJI("gift_panel_data_show_error", jSONObject2, jSONObject, jSONObject3);
        }
    }

    public static final void LJIIJ(int i, String str, Boolean bool, int i2) {
        int i3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click_react_duration", 0);
        jSONObject.put("click_data_structure_ready_duration", 0);
        jSONObject.put("click_data_show_duration", 0);
        jSONObject.put("click_panel_animation_duration", 0);
        jSONObject.put("click_panel_available_duration", 0);
        jSONObject.put("first_screen_image_scc_cnt", 0);
        jSONObject.put("first_screen_image_cache_cnt", 0);
        jSONObject.put("first_screen_image_load_rate", "");
        jSONObject.put("click_panel_first_frame_duration", 0);
        jSONObject.put("live_dur_when_open_panel", 0);
        jSONObject.put("loading_view_count", 0);
        jSONObject.put("initialize_gift_panel_leaf_duration", 0);
        jSONObject.put("update_gift_pages_duration", 0);
        jSONObject.put("load_visible_image_duration", 0);
        jSONObject.put("add_gift_panel_leaf_duration", 0);
        jSONObject.put("add_top_sub_leaf_duration", 0);
        jSONObject.put("add_bottom_sub_leaf_duration", 0);
        jSONObject.put("add_match_tray_leaf_duration", 0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_anchor", LIZIZ());
        jSONObject2.put("data_status", i);
        jSONObject2.put("first_screen_gift_count", 0);
        jSONObject2.put("is_use_cache", 0);
        jSONObject2.put("gift_enter_from", str);
        if (bool == null || o.LJ(bool, Boolean.TRUE)) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        jSONObject2.put("is_landscape", i3);
        jSONObject2.put("error_type", 0);
        jSONObject2.put("error_msg", "");
        jSONObject2.put("error_code", 0);
        jSONObject2.put("is_gift_list_optimized", 0);
        jSONObject2.put("upload_opportunity", i2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("error_msg", "");
        jSONObject3.put("error_code", 0);
        C32455CoV.LJII(jSONObject2, jSONObject3);
        BZI LIZ2 = C28787BRn.LIZ("gift_panel_data_show");
        LIZ2.LJIIZILJ();
        LIZ2.LJJ(jSONObject2);
        LIZ2.LJJ(jSONObject);
        LIZ2.LJJ(jSONObject3);
        LIZ2.LJJIIJZLJL();
        C0K2.LJ("gift_panel_data_show", jSONObject2, jSONObject, jSONObject3);
        jSONObject.put("panel_stay_time", 0);
        jSONObject.put("retry_view_count", 0);
        jSONObject.put("first_screen_image_load_duration", 0);
        jSONObject2.put("first_screen_image_status", "");
        C32455CoV.LJII(jSONObject2, jSONObject3);
        BZI LIZ3 = C28787BRn.LIZ("gift_panel_dismiss");
        LIZ3.LJIIZILJ();
        LIZ3.LJJ(jSONObject2);
        LIZ3.LJJ(jSONObject);
        LIZ3.LJJ(jSONObject3);
        LIZ3.LJJIIJZLJL();
        C0K2.LJI("gift_panel_dismiss", jSONObject2, jSONObject, jSONObject3);
        C32112Ciy.LIZ.storeBoolean("sp_is_gift_panel_dismiss_uploaded", true);
    }

    public static final void LJII(int i, int i2, long j, String str, String str2) {
        String str3;
        JSONObject LIZLLL = Q7K.LIZLLL("duration", j);
        JSONObject LIZLLL2 = C770830u.LIZLLL("error_code", i);
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        LIZLLL2.put("error_msg", str3);
        LIZLLL2.put("fetch_giftlist_from", LIZ(i2));
        LIZLLL2.put("is_use_cache", 0);
        LIZLLL2.put("is_gift_list_optimized", LiveGiftListOptSetting.INSTANCE.getValue() ? 1 : 0);
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        jSONObject.put("error_msg", str);
        jSONObject.put("error_code", i);
        jSONObject.put("log_id", str2);
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_gift_list_data_fetch", 0.1d)) {
            BZI LIZ2 = C28787BRn.LIZ("gift_list_data_fetch");
            LIZ2.LJIJJ(Integer.valueOf(LIZIZ()), "is_anchor");
            LIZ2.LJJ(LIZLLL);
            LIZ2.LJJ(LIZLLL2);
            LIZ2.LJJ(jSONObject);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJIIZILJ();
                LIZ2.LJJIIJZLJL();
            } else {
                LIZ2.LJJIJ();
                LIZ2.LJI();
                LIZ2.LJJIIZI();
            }
        }
        if (i == 0) {
            C0K2.LJI("gift_list_data_fetch", LIZLLL2, LIZLLL, jSONObject);
        } else {
            C0K2.LJ("gift_list_data_fetch", LIZLLL2, LIZLLL, jSONObject);
            C0K2.LJI("gift_list_data_fetch_error", LIZLLL2, LIZLLL, jSONObject);
        }
    }

    public static final void LJI(int i, String msg, String str, long j, long j2, int i2) {
        o.LJIIIZ(msg, "msg");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", j);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("error_code", i);
        jSONObject2.put("is_use_cache", i2);
        JSONObject LIZIZ2 = C1B8.LIZIZ("error_msg", msg, "error_code", i);
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_gift_panel_image_load", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            BZI LIZ2 = C28787BRn.LIZ("gift_panel_image_load");
            LIZ2.LJJ(jSONObject);
            LIZ2.LJIJJ(Integer.valueOf(LIZIZ()), "is_anchor");
            LIZ2.LJIJJ(Long.valueOf(j), "duration");
            LIZ2.LJIJJ(Integer.valueOf(i), "error_code");
            KNV.LJ(i2, LIZ2, "is_use_cache", msg, "error_msg");
            C07250Qf.LIZJ(j2, LIZ2, "gift_id", str, "image_url");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJIIZILJ();
                LIZ2.LJJIIJZLJL();
            } else {
                LIZ2.LJJIJ();
                LIZ2.LJI();
                LIZ2.LJJIIZI();
            }
        }
        if (i == 0) {
            if (!C32777Cth.LIZ(0.01f, "gift_panel_image_load") || !LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gift_panel_image_load", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
                return;
            }
            C0K2.LJI("gift_panel_image_load", jSONObject2, jSONObject, LIZIZ2);
            return;
        }
        if (C32777Cth.LIZ(0.01f, "gift_panel_image_load") && LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gift_panel_image_load", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
            C0K2.LJ("gift_panel_image_load", jSONObject2, jSONObject, LIZIZ2);
        }
        C0K2.LJI("gift_panel_image_load_error", jSONObject2, jSONObject, LIZIZ2);
    }

    public static final void LIZJ(int i, int i2, int i3, int i4, String str, String str2, long j, String str3, String str4, Integer num) {
        Integer num2;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", j);
        jSONObject.putOpt("missing_effects_count", num);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("error_code", i3);
        jSONObject2.put("source", i4);
        jSONObject2.put("error_msg", str);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("effects_count", i);
        jSONObject3.put("request_effects_count", i2);
        jSONObject3.put("log_id", str3);
        if (room != null) {
            num2 = Integer.valueOf(room.getOrientation());
        } else {
            num2 = null;
        }
        jSONObject3.put("room_type", num2);
        jSONObject3.put("error_code", i3);
        jSONObject3.put("error_msg", str);
        jSONObject3.put("error_domain", str2);
        jSONObject3.putOpt("missing_effects_ids", str4);
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_gift_assets_effects_fetch_status", 0.1d)) {
            BZI LIZ2 = C28787BRn.LIZ("gift_assets_effects_fetch_status");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(Integer.valueOf(LIZIZ()), "is_anchor");
            LIZ2.LJJ(jSONObject);
            LIZ2.LJJ(jSONObject2);
            LIZ2.LJJ(jSONObject3);
            LIZ2.LJJIIJZLJL();
        }
        if (i3 == 0) {
            C0K2.LJI("gift_assets_effects_fetch_status", jSONObject2, jSONObject, jSONObject3);
        } else {
            C0K2.LJI("gift_assets_effects_fetch_status", jSONObject2, jSONObject, jSONObject3);
            C0K2.LJI("gift_assets_effects_fetch_status_error", jSONObject2, jSONObject, jSONObject3);
        }
    }

    public static final void LJIIJJI(C32722Cso c32722Cso, C32730Csw c32730Csw, C32712Cse c32712Cse, C32711Csd c32711Csd, long j, long j2, String str, int i, long j3, long j4, int i2) {
        JSONObject LIZLLL = Q7K.LIZLLL("panel_stay_time", j);
        LIZLLL.put("click_react_duration", c32712Cse.LIZIZ);
        LIZLLL.put("click_data_structure_ready_duration", c32712Cse.LJFF);
        LIZLLL.put("click_data_show_duration", c32712Cse.LIZJ);
        LIZLLL.put("click_panel_animation_duration", c32712Cse.LJI);
        long j5 = c32712Cse.LIZJ;
        long j6 = c32712Cse.LJI;
        if (j5 < j6) {
            j5 = j6;
        }
        LIZLLL.put("click_panel_available_duration", j5);
        LIZLLL.put("first_screen_image_scc_cnt", c32722Cso.LJFF);
        LIZLLL.put("first_screen_image_cache_cnt", c32722Cso.LJI);
        LIZLLL.put("first_screen_image_load_rate", String.valueOf(c32722Cso.LJFF / c32722Cso.LJ));
        LIZLLL.put("first_screen_image_load_duration", j2);
        LIZLLL.put("click_panel_first_frame_duration", c32712Cse.LIZLLL);
        LIZLLL.put("live_dur_when_open_panel", c32712Cse.LJ);
        LIZLLL.put("loading_view_count", c32722Cso.LIZLLL);
        LIZLLL.put("retry_view_count", i);
        LIZLLL.put("initialize_gift_panel_leaf_duration", c32711Csd.LIZIZ);
        LIZLLL.put("update_gift_pages_duration", c32711Csd.LIZJ);
        LIZLLL.put("load_visible_image_duration", c32711Csd.LIZLLL);
        LIZLLL.put("add_gift_panel_leaf_duration", c32711Csd.LJ);
        LIZLLL.put("add_top_sub_leaf_duration", c32711Csd.LJFF);
        LIZLLL.put("add_bottom_sub_leaf_duration", c32711Csd.LJI);
        LIZLLL.put("add_match_tray_leaf_duration", c32711Csd.LJII);
        if (j3 != 0) {
            LIZLLL.put("multi_guest_view_create_time", j3);
        }
        if (j4 != 0) {
            LIZLLL.put("multi_guest_view_start_time", j4);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_anchor", LIZIZ());
        jSONObject.put("data_status", c32722Cso.LIZIZ);
        jSONObject.put("first_screen_gift_count", c32722Cso.LJ);
        jSONObject.put("is_use_cache", c32722Cso.LIZJ);
        jSONObject.put("gift_enter_from", c32722Cso.LIZ);
        jSONObject.put("is_landscape", c32722Cso.LJII ? 1 : 0);
        jSONObject.put("error_type", c32730Csw.LIZIZ);
        jSONObject.put("error_msg", c32730Csw.LIZJ);
        jSONObject.put("error_code", c32730Csw.LIZLLL);
        jSONObject.put("first_screen_image_status", str);
        jSONObject.put("is_gift_list_optimized", LiveGiftListOptSetting.INSTANCE.getValue() ? 1 : 0);
        jSONObject.put("upload_opportunity", i2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("error_msg", c32730Csw.LIZJ);
        jSONObject2.put("error_code", c32730Csw.LIZLLL);
        C32455CoV.LJII(jSONObject, jSONObject2);
        BZI LIZ2 = C28787BRn.LIZ("gift_panel_dismiss");
        LIZ2.LJIIZILJ();
        LIZ2.LJJ(jSONObject);
        LIZ2.LJJ(LIZLLL);
        LIZ2.LJJ(jSONObject2);
        LIZ2.LJJIIJZLJL();
        C0K2.LJI("gift_panel_dismiss", jSONObject, LIZLLL, jSONObject2);
        C32112Ciy.LIZ.storeBoolean("sp_is_gift_panel_dismiss_uploaded", true);
    }

    public static void LJFF(int i, int i2, int i3, long j, long j2, long j3, Long l, Long l2, String str, String str2, String str3, String str4, String str5, java.util.Map map) {
        C65032gt.LIZ(new RunnableC76943UHr(i2, i, i3, j2, j, j3, l, l2, str, str2, str3, str4, str5, map));
    }

    public static void LIZLLL(long j, long j2, Long l, Long l2, String resourceFormat, String str, String str2, int i, String str3, int i2, String str4, String str5, Long l3, long j3, java.util.Map giftCommonParams, int i3, int i4) {
        int i5;
        Integer LJJIL;
        int i6 = i3;
        Long l4 = l3;
        String localMd5 = str4;
        int i7 = i;
        String str6 = str3;
        if ((i4 & 128) != 0) {
            i7 = 0;
        }
        if ((i4 & 256) != 0) {
            str6 = "";
        }
        if ((i4 & 1024) != 0) {
            localMd5 = "null";
        }
        if ((i4 & 4096) != 0) {
            l4 = 0L;
        }
        if ((i4 & 32768) != 0) {
            i6 = 0;
        }
        o.LJIIIZ(resourceFormat, "resourceFormat");
        o.LJIIIZ(localMd5, "localMd5");
        o.LJIIIZ(giftCommonParams, "giftCommonParams");
        String str7 = (String) giftCommonParams.get("is_own_send");
        if (str7 != null && (LJJIL = C38350F3i.LJJIL(str7)) != null) {
            i5 = LJJIL.intValue();
        } else {
            i5 = 0;
        }
        if (i5 == 0 && C32257ClJ.LJFF() == 1) {
            LJ(i7, i2, i6, j, j2, j3, l, l2, l4, "_anchor", resourceFormat, str, str2, str6, localMd5, str5, giftCommonParams);
        } else if (i5 == 1) {
            LJ(i7, i2, i6, j, j2, j3, l, l2, l4, "_self", resourceFormat, str, str2, str6, localMd5, str5, giftCommonParams);
        }
        LJ(i7, i2, i6, j, j2, j3, l, l2, l4, "", resourceFormat, str, str2, str6, localMd5, str5, giftCommonParams);
    }

    public static final void LJ(int i, int i2, int i3, long j, long j2, long j3, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, java.util.Map map) {
        C65032gt.LIZ(new RunnableC76942UHq(i, i2, i3, j2, j, j3, l, l2, l3, str, str2, str3, str4, str6, str7, str5, map));
    }
}
