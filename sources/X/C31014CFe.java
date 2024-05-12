package X;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPerformanceReportOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPerformanceReportOptSettingV2;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPerformanceReportOptSettingV3;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.CFe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31014CFe {
    public static int LIZ;
    public static int LIZIZ;
    public static long LIZJ;
    public static int LJI;
    public static InterfaceC65784Pro<Long> LJIJJLI;
    public static InterfaceC65784Pro<Long> LJIL;
    public static InterfaceC65784Pro<Float> LJJ;
    public static InterfaceC65784Pro<String> LJJI;
    public static InterfaceC65784Pro<? extends JSONArray> LJJIFFI;
    public static InterfaceC65784Pro<? extends JSONArray> LJJII;
    public static InterfaceC65784Pro<? extends JSONObject> LJJIII;
    public static boolean LJJIIJ;
    public static final java.util.Map<String, String> LIZLLL = new LinkedHashMap();
    public static final List<String> LJ = new ArrayList();
    public static final ArrayList<String> LJFF = C47261Igj.LJII("device_score", "use_background_music", "use_draw_and_guess", "use_like", "live_state", "camera_mode", "broadcast_scene", "gift_cnt", "time_elapsed_in_room", "sticker_use_time", "effect_use_time", "voice_use_time", "filter_level", "filter_use_time", "channel_id", "linkmic_id", "layout_id", "role", "push_param_invalid", "beauty_effect_list", "filter_effect_id", "voice_effect_id", "effect_effect_id", "sticker_resource_id", "effect_resource_id", "voice_resource_id", "filter_resource_id", "beauty_resource_list", "video_gift_id");
    public static boolean LJII = true;
    public static final List<Double> LJIIIIZZ = new ArrayList();
    public static final List<Double> LJIIIZ = new ArrayList();
    public static final List<Integer> LJIIJ = new ArrayList();
    public static final List<Integer> LJIIJJI = new ArrayList();
    public static final List<String> LJIIL = new ArrayList();
    public static final RunnableC31016CFg LJIILIIL = RunnableC31016CFg.LJLIL;
    public static InterfaceC65784Pro<Integer> LJIILJJIL = C31018CFi.LJLIL;
    public static InterfaceC65784Pro<Long> LJIILL = C31021CFl.LJLIL;
    public static InterfaceC65784Pro<Long> LJIILLIIL = C31020CFk.LJLIL;
    public static InterfaceC65784Pro<Long> LJIIZILJ = C31017CFh.LJLIL;
    public static InterfaceC65784Pro<Long> LJIJ = C31022CFm.LJLIL;
    public static InterfaceC65784Pro<Long> LJIJI = C31019CFj.LJLIL;
    public static final C31015CFf LJIJJ = C31015CFf.LJLIL;
    public static int LJJIIJZLJL = 2;

    public static void LJ() {
        java.util.Map<String, String> map = LIZLLL;
        map.put("linkmic_uv", "1");
        map.put("remote_decode_fps", "[]");
        map.put("remote_render_fps", "[]");
        map.put("remote_resolution_width", "[]");
        map.put("remote_resolution_height", "[]");
        map.put("remote_linkmic_id", "[]");
        map.put("remote_video_frozen", "[]");
        map.put("remote_video_e2e_delay", "[]");
    }

    public static java.util.Map LJIIIZ() {
        LinkedHashMap linkedHashMap;
        java.util.Map<String, String> map = LIZLLL;
        synchronized (map) {
            map.put("push_param_invalid", String.valueOf(LJII));
            if (LJII) {
                for (String str : ((LinkedHashMap) map).keySet()) {
                    if (!LJFF.contains(str)) {
                        LIZLLL.put(str, "-2");
                    }
                }
            }
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(LIZLLL);
            LJII = true;
            try {
                Iterator it = ((ArrayList) LJ).iterator();
                while (it.hasNext()) {
                    LIZLLL.remove((String) it.next());
                }
                ((ArrayList) LJ).clear();
            } catch (Throwable unused) {
            }
        }
        return linkedHashMap;
    }

    public static void LJIIJ() {
        java.util.Map<String, String> map = LIZLLL;
        map.put("device_score", String.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        map.put("use_background_music", "false");
        map.put("use_draw_and_guess", "false");
        map.put("use_like", "false");
        LJJIIJ = false;
    }

    public static void LJIILIIL() {
        java.util.Map<String, String> map = LIZLLL;
        map.remove("linkmic_uv");
        map.remove("remote_decode_fps");
        map.remove("remote_render_fps");
        map.remove("remote_resolution_width");
        map.remove("remote_resolution_height");
        map.remove("remote_linkmic_id");
        map.remove("remote_video_frozen");
        map.remove("remote_video_e2e_delay");
        map.remove("local_audio_diagnosis_score");
    }

    public static void LJIILL() {
        boolean z;
        String str;
        User owner;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (owner = room.getOwner()) != null && owner.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        java.util.Map<String, String> map = LIZLLL;
        if (z) {
            str = "host";
        } else {
            str = "guest";
        }
        map.put("role", str);
    }

    public static void LJIILLIIL() {
        LIZLLL.put("use_like", "true");
        Handler LIZ2 = C15610jN.LIZ();
        RunnableC31016CFg runnableC31016CFg = LJIILIIL;
        LIZ2.removeCallbacks(runnableC31016CFg);
        LIZ2.postDelayed(runnableC31016CFg, 5000L);
    }

    public static void LIZ(List list) {
        if (!((ArrayList) list).isEmpty()) {
            LIZLLL.put("beauty_level", list.toString());
        } else {
            LIZLLL.put("beauty_level", "");
        }
    }

    public static void LIZIZ(List list) {
        if (!((ArrayList) list).isEmpty()) {
            LIZLLL.put("beauty_effect_list", list.toString());
        } else {
            LIZLLL.remove("beauty_effect_list");
        }
    }

    public static void LIZJ(List list) {
        String str;
        if (LinkMicPerformanceReportOptSetting.INSTANCE.useOpt()) {
            str = "beauty_resource_list";
        } else {
            str = "beauty_list";
        }
        if (!((ArrayList) list).isEmpty()) {
            LIZLLL.put(str, list.toString());
        } else {
            LIZLLL.remove(str);
        }
    }

    public static void LIZLLL(String channelId) {
        o.LJIIIZ(channelId, "channelId");
        LIZLLL.put("channel_id", channelId);
    }

    public static void LJFF(String id) {
        boolean z;
        o.LJIIIZ(id, "id");
        if (id.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZLLL.remove("effect_effect_id");
        } else {
            LIZLLL.put("effect_effect_id", id);
            LIZJ = System.currentTimeMillis();
        }
    }

    public static void LJI(String id) {
        boolean z;
        o.LJIIIZ(id, "id");
        if (id.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = "effect_resource_id";
        if (z) {
            java.util.Map<String, String> map = LIZLLL;
            if (!LinkMicPerformanceReportOptSetting.INSTANCE.useOpt()) {
                str = "effect_id";
            }
            map.remove(str);
            return;
        }
        java.util.Map<String, String> map2 = LIZLLL;
        if (!LinkMicPerformanceReportOptSetting.INSTANCE.useOpt()) {
            str = "effect_id";
        }
        map2.put(str, id);
        LIZJ = System.currentTimeMillis();
    }

    public static void LJII(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZLLL.remove("filter_effect_id");
        } else {
            LIZLLL.put("filter_effect_id", str);
        }
    }

    public static void LJIIIIZZ(String str) {
        String str2;
        if (LinkMicPerformanceReportOptSetting.INSTANCE.useOpt()) {
            str2 = "filter_resource_id";
        } else {
            str2 = "filter_id";
        }
        if (str.length() == 0) {
            LIZLLL.remove(str2);
        } else {
            LIZLLL.put(str2, str);
        }
    }

    public static void LJIIJJI(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        LIZLLL.put("linkmic_id", linkMicId);
    }

    public static void LJIIZILJ(String str) {
        String str2;
        if (LinkMicPerformanceReportOptSetting.INSTANCE.useOpt()) {
            str2 = "sticker_resource_id";
        } else {
            str2 = "sticker_id";
        }
        if (str.length() == 0) {
            LIZLLL.remove(str2);
        } else {
            LIZLLL.put(str2, str);
        }
    }

    public static void LJIJ(boolean z) {
        String valueOf;
        Long l;
        Float f;
        String str;
        String str2;
        java.util.Map<String, String> map = LIZLLL;
        map.put("gift_cnt", String.valueOf(LJIILJJIL.invoke().intValue()));
        map.put("gift_id", String.valueOf(LJIILL.invoke().longValue()));
        map.put("gift_effect_id", String.valueOf(LJIILLIIL.invoke().longValue()));
        map.put("time_elapsed_in_room", String.valueOf(LJIIZILJ.invoke().longValue()));
        map.put("sticker_use_time", String.valueOf(LJIJ.invoke().longValue()));
        if (z) {
            valueOf = String.valueOf(((Number) LJIJJ.invoke()).floatValue());
        } else {
            valueOf = String.valueOf(LJIJI.invoke().longValue());
        }
        map.put("effect_use_time", valueOf);
        InterfaceC65784Pro<Long> interfaceC65784Pro = LJIJJLI;
        Long l2 = null;
        if (interfaceC65784Pro != null) {
            l = interfaceC65784Pro.invoke();
        } else {
            l = null;
        }
        map.put("voice_use_time", String.valueOf(l));
        InterfaceC65784Pro<Float> interfaceC65784Pro2 = LJJ;
        if (interfaceC65784Pro2 != null) {
            f = interfaceC65784Pro2.invoke();
        } else {
            f = null;
        }
        map.put("filter_level", String.valueOf(f));
        try {
            InterfaceC65784Pro<String> interfaceC65784Pro3 = LJJI;
            if (interfaceC65784Pro3 != null) {
                str2 = interfaceC65784Pro3.invoke();
            } else {
                str2 = null;
            }
            String valueOf2 = String.valueOf(str2);
            if (!TextUtils.isEmpty(valueOf2)) {
                JSONObject jSONObject = new JSONObject(valueOf2);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "effectProgressJSONObject.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    ((ArrayList) LJ).add(next);
                    LIZLLL.put(next, jSONObject.get(next).toString());
                }
            }
        } catch (Throwable unused) {
        }
        java.util.Map<String, String> map2 = LIZLLL;
        InterfaceC65784Pro<Long> interfaceC65784Pro4 = LJIL;
        if (interfaceC65784Pro4 != null) {
            l2 = interfaceC65784Pro4.invoke();
        }
        map2.put("filter_use_time", String.valueOf(l2));
        if (LJJIIJ) {
            str = "Paused";
        } else {
            str = "Normal";
        }
        map2.put("live_state", str);
        map2.put("camera_mode", String.valueOf(LJJIIJZLJL));
    }

    public static void LJIJI(boolean z) {
        String str;
        java.util.Map<String, String> map = LIZLLL;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        map.put("use_background_music", str);
    }

    public static void LJIJJ(boolean z) {
        String str;
        java.util.Map<String, String> map = LIZLLL;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        map.put("use_draw_and_guess", str);
    }

    public static void LJIJJLI(String id) {
        boolean z;
        o.LJIIIZ(id, "id");
        if (id.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZLLL.remove("voice_effect_id");
        } else {
            LIZLLL.put("voice_effect_id", id);
        }
    }

    public static void LJIL(String id) {
        String str;
        o.LJIIIZ(id, "id");
        if (LinkMicPerformanceReportOptSetting.INSTANCE.useOpt()) {
            str = "voice_resource_id";
        } else {
            str = "voice_id";
        }
        if (id.length() == 0) {
            LIZLLL.remove(str);
        } else {
            LIZLLL.put(str, id);
        }
    }

    public static void LJIIL(JSONObject jSONObject, InterfaceC30734C4k interfaceC30734C4k) {
        if (jSONObject == null) {
            return;
        }
        java.util.Map<String, String> map = LIZLLL;
        synchronized (map) {
            try {
                if (o.LJ(jSONObject.optString("event_key"), "push_stream") || (o.LJ(jSONObject.optString("event_key"), "rtc_push_stream") && LinkMicPerformanceReportOptSetting.INSTANCE.useOpt())) {
                    LJII = false;
                    String optString = jSONObject.optString("event_key");
                    o.LJIIIIZZ(optString, "json.optString(\"event_key\")");
                    map.put("event_key", optString);
                    map.put("bitrate", String.valueOf(jSONObject.optInt("real_bitrate", -1)));
                    map.put("resolution_width", String.valueOf(jSONObject.optInt("width", -1)));
                    map.put("resolution_height", String.valueOf(jSONObject.optInt("height", -1)));
                    if (LIZ == 0) {
                        LIZ = jSONObject.optInt("video_capture_width", -1);
                    }
                    if (LIZIZ == 0) {
                        LIZIZ = jSONObject.optInt("video_capture_height", -1);
                    }
                    map.put("video_capture_width", String.valueOf(LIZ));
                    map.put("video_capture_height", String.valueOf(LIZIZ));
                    map.put("push_fps", String.valueOf(jSONObject.optDouble("real_video_framerate", -1.0d)));
                    map.put("preview_fps", String.valueOf(jSONObject.optDouble("preview_fps", -1.0d)));
                    map.put("in_cap_fps", String.valueOf(jSONObject.optDouble("in_cap_fps", -1.0d)));
                    map.put("out_cap_fps", String.valueOf(jSONObject.optDouble("out_cap_fps", -1.0d)));
                    map.put("encode_fps", String.valueOf(jSONObject.optDouble("encode_fps", -1.0d)));
                    String optString2 = jSONObject.optString("audio_codec", "-1");
                    optString2.toString();
                    map.put("audio_codec", optString2);
                    String optString3 = jSONObject.optString("video_codec", "-1");
                    optString3.toString();
                    map.put("video_codec", optString3);
                    String optString4 = jSONObject.optString("publish_url", "");
                    o.LJIIIIZZ(optString4, "json.optString(\"publish_url\", \"\")");
                    String str = (String) ORZ.LJLLLL(s.LJLJJL(optString4, new String[]{":"}, 0, 6));
                    if (str == null) {
                        str = "-1";
                    }
                    map.put("push_protocol", str);
                    map.put("is_hw", String.valueOf(jSONObject.optInt("hardware", -1)));
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString("message"));
                    try {
                        if (!TextUtils.isEmpty(jSONObject2.optString("video_frame_elapse_v2"))) {
                            JSONArray jSONArray = new JSONArray(jSONObject2.optString("video_frame_elapse_v2"));
                            map.put("camera_capture_time", String.valueOf(jSONArray.optInt(0, -1)));
                            map.put("camera_to_processor_latency", String.valueOf(jSONArray.optInt(1, -1)));
                            map.put("update_tex_image_time", String.valueOf(jSONArray.optInt(2, -1)));
                            map.put("oes_to_2d_time", String.valueOf(jSONArray.optInt(3, -1)));
                            map.put("effect_process_time", String.valueOf(jSONArray.optInt(4, -1)));
                            map.put("after_effect_gl_finish_time", String.valueOf(jSONArray.optInt(5, -1)));
                            map.put("post_process_algorithm_time", String.valueOf(jSONArray.optInt(6, -1)));
                            map.put("process_to_render_latency", String.valueOf(jSONArray.optInt(7, -1)));
                            map.put("render_time", String.valueOf(jSONArray.optInt(8, -1)));
                            map.put("process_to_encoder_latency", String.valueOf(jSONArray.optInt(9, -1)));
                            map.put("encoder_draw_surface_time", String.valueOf(jSONArray.optInt(10, -1)));
                        }
                    } catch (Throwable unused) {
                    }
                    if (LinkMicPerformanceReportOptSetting.INSTANCE.useOpt()) {
                        try {
                            long optLong = jSONObject2.optLong("averageExposureTime", 0L);
                            if (optLong > 0) {
                                optLong /= 1000000;
                            }
                            java.util.Map<String, String> map2 = LIZLLL;
                            map2.put("camera_exposure_time", String.valueOf(optLong));
                            map2.put("camera_iso_value", String.valueOf(jSONObject2.optLong("cameraISOInfo")));
                        } catch (Throwable unused2) {
                        }
                    }
                    if (LinkMicPerformanceReportOptSettingV2.INSTANCE.useOpt()) {
                        try {
                            java.util.Map<String, String> map3 = LIZLLL;
                            map3.put("adapted_resolution_width", String.valueOf(jSONObject.optInt("adpt_res_w", -1)));
                            map3.put("adapted_resolution_height", String.valueOf(jSONObject.optInt("adpt_res_h", -1)));
                            if (o.LJ(jSONObject.optString("event_key"), "rtc_push_stream")) {
                                map3.put("encode_fps", String.valueOf(jSONObject.optDouble("send_vencode_fps", -1.0d)));
                                map3.put("bitrate", String.valueOf(jSONObject.optInt("send_video_bitrate", -1)));
                                String optString5 = jSONObject.optString("remote_user_info", "");
                                if (!TextUtils.isEmpty(optString5)) {
                                    JSONArray jSONArray2 = new JSONArray(optString5);
                                    if (jSONArray2.length() > 0) {
                                        map3.put("linkmic_uv", String.valueOf(jSONArray2.length() + 1));
                                        if (interfaceC30734C4k != null) {
                                            LJIILJJIL(jSONArray2, interfaceC30734C4k, map3);
                                        }
                                    } else {
                                        LJ();
                                    }
                                } else {
                                    LJ();
                                }
                            } else {
                                LJIILIIL();
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                    if (LinkMicPerformanceReportOptSettingV3.INSTANCE.useOpt()) {
                        java.util.Map<String, String> map4 = LIZLLL;
                        map4.put("camera_type", String.valueOf(jSONObject.optInt("camera_type", -1)));
                        if (o.LJ("2", ((LinkedHashMap) map4).get("camera_type"))) {
                            map4.put("camera_avg_result_fps", String.valueOf(jSONObject.optInt("camera_avg_result_fps", -1)));
                        }
                        map4.put("camera_capture_width", String.valueOf(jSONObject.optInt("camera_capture_width", -1)));
                        map4.put("camera_capture_height", String.valueOf(jSONObject.optInt("camera_capture_height", -1)));
                        String optString6 = jSONObject.optString("camera_real_fps_range", "-1");
                        o.LJIIIIZZ(optString6, "json.optString(\"camera_r…e\", DEFAULT_VALUE_STRING)");
                        map4.put("camera_real_fps_range", optString6);
                    }
                }
            } catch (Exception unused4) {
            }
        }
    }

    public static void LJIILJJIL(JSONArray jSONArray, InterfaceC30734C4k interfaceC30734C4k, java.util.Map map) {
        ((ArrayList) LJIIIIZZ).clear();
        ((ArrayList) LJIIIZ).clear();
        ((ArrayList) LJIIJ).clear();
        ((ArrayList) LJIIJJI).clear();
        ((ArrayList) LJIIL).clear();
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        for (int i = 0; i < length; i++) {
            arrayList.add(null);
        }
        for (int i2 = 0; i2 < length; i2++) {
            String linkMicId = JSONArrayProtectorUtils.getJSONObject(jSONArray, i2).optString("user_id", "");
            o.LJIIIIZZ(linkMicId, "linkMicId");
            int LIZ2 = interfaceC30734C4k.LIZ(linkMicId);
            if (LIZ2 == -1) {
                ListProtector.set(arrayList, i2, JSONArrayProtectorUtils.getJSONObject(jSONArray, i2));
            } else {
                ListProtector.set(arrayList, LIZ2, JSONArrayProtectorUtils.getJSONObject(jSONArray, i2));
            }
        }
        int i3 = length + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            JSONObject jSONObject = (JSONObject) ListProtector.get(arrayList, i4);
            if (jSONObject != null) {
                ((ArrayList) LJIIIIZZ).add(Double.valueOf(jSONObject.optDouble("recv_vdecode_fps", -1.0d)));
                ((ArrayList) LJIIIZ).add(Double.valueOf(jSONObject.optDouble("recv_vrender_fps", -1.0d)));
                ((ArrayList) LJIIJ).add(Integer.valueOf(jSONObject.optInt("recv_video_width", -1)));
                ((ArrayList) LJIIJJI).add(Integer.valueOf(jSONObject.optInt("recv_video_height", -1)));
                List<String> list = LJIIL;
                String optString = jSONObject.optString("user_id", "-1");
                o.LJIIIIZZ(optString, "remoteUserInfo.optString…d\", DEFAULT_VALUE_STRING)");
                ((ArrayList) list).add(optString);
            }
        }
        map.put("remote_decode_fps", LJIIIIZZ.toString());
        map.put("remote_render_fps", LJIIIZ.toString());
        map.put("remote_resolution_width", LJIIJ.toString());
        map.put("remote_resolution_height", LJIIJJI.toString());
        map.put("remote_linkmic_id", LJIIL.toString());
    }
}
