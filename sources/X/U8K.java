package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutApplogCombineSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class U8K {
    public static String LIZIZ;
    public static long LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static C73411SrX LJIIIZ;
    public static String LIZ = "audience";
    public static int LJI = -1;
    public static int LJII = -1;
    public static int LJIIIIZZ = -1;

    public static void LIZJ() {
        if (!LivesdkLinkmicLayoutApplogCombineSetting.INSTANCE.isDslDownloadFailedReportEnable()) {
            return;
        }
        JSONObject LIZ2 = LIZ(null);
        LIZ2.put("sub_event", "dsl_download_failed");
        LIZ2.put("gecko_channel", "tiktok_live_link_mic");
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_linkmic_layout_exception", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
            BZI LIZ3 = C28787BRn.LIZ("livesdk_linkmic_layout_exception");
            LIZ3.LJJ(LIZ2);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
                LIZ3.LJJIIJZLJL();
            } else {
                LIZ3.LJJIJ();
                LIZ3.LJJIIZI();
            }
        }
        C76175Tv1 c76175Tv1 = C76175Tv1.LIZ;
        String jSONObject = LIZ2.toString();
        o.LJIIIIZZ(jSONObject, "this.toString()");
        c76175Tv1.LIZ(40005, jSONObject, null);
    }

    public static JSONObject LIZ(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        int i = LJI;
        if (i == 4) {
            str2 = "multi-guest";
        } else if (i == 2) {
            str2 = "multi-host";
        } else {
            str2 = "unknown";
        }
        String str3 = LIZIZ;
        if (str3 != null) {
            jSONObject.put("linkmic_id", str3);
        }
        if (str != null) {
            jSONObject.put("extra", str);
        }
        jSONObject.put("role", LIZ);
        jSONObject.put("layout_change_times", LIZJ);
        jSONObject.put("timestamp", C31012CFc.LIZIZ());
        jSONObject.put("room_id", LJ);
        jSONObject.put("channel_id", LIZLLL);
        jSONObject.put("live_type", LJFF);
        jSONObject.put(WM7.SCENE_SERVICE, str2);
        jSONObject.put("source", "multi_live_sdk");
        return jSONObject;
    }

    public static void LIZIZ(String str, String str2) {
        String str3;
        if (!LivesdkLinkmicLayoutApplogCombineSetting.INSTANCE.isChannelIdMismatchReportEnable() || (str3 = LIZLLL) == null || !(!TextUtils.equals(str3, "-1"))) {
            return;
        }
        JSONObject LIZ2 = LIZ(null);
        LIZ2.put("sub_event", "channel_id_mismatch");
        if (str == null) {
            str = "null";
        }
        LIZ2.put("room_channel_id", str);
        if (str2 == null) {
            str2 = "null";
        }
        LIZ2.put("sei_channel_id", str2);
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_linkmic_layout_exception", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
            BZI LIZ3 = C28787BRn.LIZ("livesdk_linkmic_layout_exception");
            LIZ3.LJJ(LIZ2);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
                LIZ3.LJJIIJZLJL();
            } else {
                LIZ3.LJJIJ();
                LIZ3.LJJIIZI();
            }
        }
        C76175Tv1 c76175Tv1 = C76175Tv1.LIZ;
        String jSONObject = LIZ2.toString();
        o.LJIIIIZZ(jSONObject, "this.toString()");
        c76175Tv1.LIZ(40002, jSONObject, null);
    }

    public static void LJFF(long j, long j2) {
        if (!LivesdkLinkmicLayoutApplogCombineSetting.INSTANCE.isSeiWrongOrderReportEnable()) {
            return;
        }
        JSONObject LIZ2 = LIZ(null);
        LIZ2.put("sub_event", "sei_wrong_order");
        LIZ2.put("last_sei_ts", j);
        LIZ2.put("received_sei_ts", j2);
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_linkmic_layout_exception", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
            BZI LIZ3 = C28787BRn.LIZ("livesdk_linkmic_layout_exception");
            LIZ3.LJJ(LIZ2);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
                LIZ3.LJJIIJZLJL();
            } else {
                LIZ3.LJJIJ();
                LIZ3.LJJIIZI();
            }
        }
        C76175Tv1 c76175Tv1 = C76175Tv1.LIZ;
        String jSONObject = LIZ2.toString();
        o.LJIIIIZZ(jSONObject, "this.toString()");
        c76175Tv1.LIZ(40007, jSONObject, null);
    }

    public static void LIZLLL(boolean z, int i, String errorMsg) {
        String str;
        o.LJIIIZ(errorMsg, "errorMsg");
        if (!LivesdkLinkmicLayoutApplogCombineSetting.INSTANCE.isDslLoadFailedReportEnable()) {
            return;
        }
        JSONObject LIZ2 = LIZ(null);
        LIZ2.put("sub_event", "dsl_loading_failed");
        if (z) {
            str = "local";
        } else {
            str = "gecko";
        }
        LIZ2.put("dsl_source", str);
        LIZ2.put("error_code", i);
        LIZ2.put("error_msg", errorMsg);
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_linkmic_layout_exception", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
            BZI LIZ3 = C28787BRn.LIZ("livesdk_linkmic_layout_exception");
            LIZ3.LJJ(LIZ2);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
                LIZ3.LJJIIJZLJL();
            } else {
                LIZ3.LJJIJ();
                LIZ3.LJJIIZI();
            }
        }
        C76175Tv1 c76175Tv1 = C76175Tv1.LIZ;
        String jSONObject = LIZ2.toString();
        o.LJIIIIZZ(jSONObject, "this.toString()");
        c76175Tv1.LIZ(40006, jSONObject, null);
    }

    public static void LJ(String layoutId, int i, boolean z, boolean z2) {
        o.LJIIIZ(layoutId, "layoutId");
        if (!LivesdkLinkmicLayoutApplogCombineSetting.INSTANCE.isLayoutNotFoundReportEnable()) {
            return;
        }
        JSONObject LIZ2 = LIZ(null);
        LIZ2.put("sub_event", "layout_not_found");
        LIZ2.put("layout_id", layoutId);
        LIZ2.put("layout_version", i);
        LIZ2.put("is_local_file", z ? 1 : 0);
        LIZ2.put("is_gecko_enable", z2 ? 1 : 0);
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_linkmic_layout_exception", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
            BZI LIZ3 = C28787BRn.LIZ("livesdk_linkmic_layout_exception");
            LIZ3.LJJ(LIZ2);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
                LIZ3.LJJIIJZLJL();
            } else {
                LIZ3.LJJIJ();
                LIZ3.LJJIIZI();
            }
        }
        C76175Tv1 c76175Tv1 = C76175Tv1.LIZ;
        String jSONObject = LIZ2.toString();
        o.LJIIIIZZ(jSONObject, "this.toString()");
        c76175Tv1.LIZ(40004, jSONObject, null);
    }
}
