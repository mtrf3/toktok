package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.WYo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82478WYo {
    public final C145995oB LIZ;
    public final java.util.Map<String, String> LIZIZ;
    public Effect LIZJ;
    public volatile boolean LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public JSONObject LJIIIZ;

    public final void LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        this.LJFF = currentTimeMillis;
        this.LJI = currentTimeMillis;
        this.LJII = currentTimeMillis;
        this.LJ = currentTimeMillis;
    }

    public final void LIZLLL() {
        long currentTimeMillis = System.currentTimeMillis() - this.LJII;
        this.LJII = currentTimeMillis;
        this.LIZ.LIZIZ(currentTimeMillis, "first_packet_cost");
    }

    public final void LJ() {
        this.LIZ.LIZIZ(System.currentTimeMillis() - this.LJFF, "audiosdk_vcserver_duration");
    }

    public final void LJFF() {
        this.LIZ.LIZIZ(System.currentTimeMillis() - this.LJ, "audiosdk_vc_duration");
    }

    public final void LJI() {
        this.LIZ.LIZIZ(System.currentTimeMillis() - this.LJI, "audiosdk_websocket_duration");
    }

    public C82478WYo(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("content_source", shortVideoContext.LIZLLL().getContentSource());
        c145995oB.LJI("content_type", shortVideoContext.LIZLLL().getContentType());
        this.LIZ = c145995oB;
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new Effect(null, 1, null);
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIZ = new JSONObject();
    }

    public final void LIZ(int i) {
        String str;
        if (this.LIZLLL) {
            return;
        }
        this.LIZ.LIZ(i, "calling_event_index");
        C145995oB c145995oB = this.LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "undefined";
                } else {
                    str = "shoot_vc";
                }
            } else {
                str = "preview_record";
            }
        } else {
            str = "preview_play";
        }
        c145995oB.LIZLLL("debug_vc_scene", str);
    }

    public final void LIZJ(String str) {
        if (this.LIZLLL || C78685UuP.LJJJZ((String) ((LinkedHashMap) this.LIZIZ).get("task_id"))) {
            return;
        }
        this.LIZIZ.put("task_id", str);
    }

    public final void LJIIIIZZ(String errorCode, String str) {
        o.LJIIIZ(errorCode, "errorCode");
        LJII(errorCode, str, false);
    }

    public final void LJII(String str, String str2, boolean z) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        C145995oB c145995oB = this.LIZ;
        if (z) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LIZLLL("error_code", str);
        c145995oB.LIZLLL("error_msg", str2);
        c145995oB.LIZLLL("effect_name", this.LIZJ.getName());
        c145995oB.LIZLLL("speaker_id", OUP.LJJJLZIJ(this.LIZJ));
        c145995oB.LIZIZ(this.LJIIIZ.optLong("vc_connect_server_cost", -1L), "vc_connect_server_cost");
        c145995oB.LIZIZ(this.LJIIIZ.optLong("vc_play_delay", -1L), "vc_play_delay");
        c145995oB.LIZIZ(this.LJIIIZ.optLong("vc_play_latency", -1L), "vc_play_latency");
        c145995oB.LIZIZ(this.LJIIIZ.optLong("vc_play_latency_delay", -1L), "vc_play_latency_delay");
        c145995oB.LIZIZ(this.LJIIIZ.optLong("vc_play_latency_delay_max", -1L), "vc_play_latency_delay_max");
        c145995oB.LIZIZ(this.LJIIIZ.optLong("net_error_code", -1L), "net_error_code");
        c145995oB.LIZLLL("net_error_msg", this.LJIIIZ.optString("net_error_msg", ""));
        c145995oB.LIZIZ(this.LJIIIIZZ, "send_data_length");
        c145995oB.LIZLLL("voice_play_type", C82468WYe.LIZ());
        if (!((HashMap) c145995oB.LIZ).containsKey("is_change_vc")) {
            c145995oB.LIZ(0, "is_change_vc");
        }
        if (!((HashMap) c145995oB.LIZ).containsKey("is_force_stop")) {
            c145995oB.LIZ(0, "is_force_stop");
        }
        if (!((HashMap) c145995oB.LIZ).containsKey("calling_event_index")) {
            c145995oB.LIZ(-1, "calling_event_index");
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
            c145995oB.LIZLLL((String) entry.getKey(), (String) entry.getValue());
        }
        FMX.LJIIL("audio_vc_stream_event", c145995oB.LIZ);
        try {
            JSONObject jSONObject = new JSONObject();
            java.util.Map<String, String> map = c145995oB.LIZ;
            if (map != null) {
                for (Map.Entry entry2 : ((HashMap) map).entrySet()) {
                    jSONObject.put((String) entry2.getKey(), entry2.getValue());
                }
            }
            C09900aA.LJIIJJI("creative_tool_stream_vc_preview", 0, jSONObject);
        } catch (JSONException unused) {
        }
    }
}
