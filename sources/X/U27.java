package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeSyncSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class U27 extends C05630Jz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJIIIIZZ(long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "match_left_time", j);
        if (z) {
            LJIILLIIL(jSONObject, "task_over");
        } else {
            LJIIZILJ(jSONObject, "task_over");
        }
    }

    public static void LJIIJ(long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "match_left_time", j);
        if (z) {
            LJIILLIIL(jSONObject, "progress_para_error");
        } else {
            LJIIZILJ(jSONObject, "progress_para_error");
        }
    }

    public static void LJIILLIIL(JSONObject jSONObject, String str) {
        C76272Twa.LIZ.LJIILLIIL(jSONObject, C76265TwT.LIZ);
        C05630Jz.LJI(jSONObject, "event_id", str);
        C05630Jz.LJII(jSONObject, "is_time_sync", MatchTimeSyncSetting.INSTANCE.getValue());
        if (C8E.LIZLLL().LLIFFJFJJ()) {
            C05630Jz.LIZ(C8E.LIZLLL().LJIILJJIL().size(), "anchors_count", jSONObject);
        } else {
            C05630Jz.LIZ(2, "anchors_count", jSONObject);
        }
        C0K2.LJIIIIZZ("ttlive_client_anchor_match_bonus_monitor", 0, jSONObject);
    }

    public static void LJIIZILJ(JSONObject jSONObject, String str) {
        if (!LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_client_audience_match_bonus_monitor")) {
            return;
        }
        C76272Twa.LIZ.LJIILLIIL(jSONObject, C76265TwT.LIZ);
        C05630Jz.LJI(jSONObject, "event_id", str);
        C05630Jz.LJII(jSONObject, "is_time_sync", true);
        if (C8E.LIZLLL().LLIFFJFJJ()) {
            C05630Jz.LIZ(C8E.LIZLLL().LJIILJJIL().size(), "anchors_count", jSONObject);
        } else {
            C05630Jz.LIZ(2, "anchors_count", jSONObject);
        }
        C0K2.LJIIIIZZ("ttlive_client_audience_match_bonus_monitor", 0, jSONObject);
    }

    public static void LJIIIZ(long j, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "match_left_time", j);
        C05630Jz.LJI(jSONObject, "log_id", str);
        if (z) {
            LJIILLIIL(jSONObject, "progress_error");
        } else {
            LJIIZILJ(jSONObject, "progress_error");
        }
    }

    public static void LJIIL(long j, long j2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "match_left_time", j);
        C05630Jz.LJFF(jSONObject, "progress", j2);
        if (z) {
            LJIILLIIL(jSONObject, "task_failed");
        } else {
            LJIIZILJ(jSONObject, "task_failed");
        }
    }

    public static void LJIILJJIL(long j, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "match_left_time", j);
        C05630Jz.LJI(jSONObject, "field", str);
        if (z) {
            LJIILLIIL(jSONObject, "task_para_error");
        } else {
            LJIIZILJ(jSONObject, "task_para_error");
        }
    }

    public static void LJIIJJI(long j, String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "match_left_time", j);
        C05630Jz.LJI(jSONObject, "client_reward", str);
        C05630Jz.LJI(jSONObject, "server_reward", str2);
        if (z) {
            LJIILLIIL(jSONObject, "reward_settle");
        }
    }

    public static void LJIILIIL(long j, long j2, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "match_left_time", j);
        C05630Jz.LJFF(jSONObject, "target", j2);
        C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, str);
        if (z) {
            LJIILLIIL(jSONObject, "task_init");
        } else {
            LJIIZILJ(jSONObject, "task_init");
        }
    }

    public static void LJIILL(int i, long j, long j2, long j3, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "match_left_time", j);
        C05630Jz.LIZ(i, "both_succeed", jSONObject);
        C05630Jz.LJFF(jSONObject, "progress", j2);
        C05630Jz.LJFF(jSONObject, "target", j3);
        C05630Jz.LJII(jSONObject, "is_message", z2);
        if (z) {
            LJIILLIIL(jSONObject, "task_succeed");
        } else {
            LJIIZILJ(jSONObject, "task_succeed");
        }
    }
}
