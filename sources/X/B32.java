package X;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.DisableLivePlayMonitorOptSetting;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class B32 extends C05630Jz {
    public static final boolean LJII = DisableLivePlayMonitorOptSetting.INSTANCE.getDisable();
    public long LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public int LIZLLL;
    public C28250B6w LJ;
    public final java.util.Map<String, Long> LJFF = new HashMap();
    public final java.util.Map<String, Long> LJI = new HashMap(6);

    public static Pair LJIIIZ() {
        return new Pair(BJM.LJFF(), BJM.LJIIIIZZ());
    }

    public final long LJIIIIZZ() {
        long j;
        if (this.LIZ > 0) {
            j = SystemClock.uptimeMillis() - this.LIZ;
        } else {
            j = 0;
        }
        this.LIZ = 0L;
        return j;
    }

    public final long LJIIJJI(String str) {
        Long l = (Long) ((HashMap) this.LJFF).get(str);
        if (l == null || l.longValue() <= 0) {
            return 0L;
        }
        return l.longValue();
    }

    public final void LJIIJ(int i, String str, String str2, long j, String str3) {
        if (LJII || this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        LJIIIIZZ();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "enter_room_type", "other");
        C05630Jz.LJI(jSONObject, "room_type", str2);
        C05630Jz.LIZ(i, "error_code", jSONObject);
        C05630Jz.LJI(jSONObject, "error_msg", str);
        C05630Jz.LJFF(jSONObject, "room_id", j);
        C05630Jz.LJI(jSONObject, "pull_url", str3);
        Pair LJIIIZ = LJIIIZ();
        C05630Jz.LJI(jSONObject, "enter_from_merge", (String) LJIIIZ.first);
        C05630Jz.LJI(jSONObject, "enter_method", (String) LJIIIZ.second);
        LiveMonitorSampleSetting liveMonitorSampleSetting = LiveMonitorSampleSetting.INSTANCE;
        if (liveMonitorSampleSetting.isReportDolphin("ttlive_audience_enter_room_all", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
            C0K2.LJIIJJI(1, "ttlive_audience_enter_room_all", jSONObject);
        }
        if (liveMonitorSampleSetting.isReportSlardar("ttlive_audience_enter_room_error")) {
            C0K2.LJIILLIIL(1, 1, "ttlive_audience_enter_room_error", jSONObject);
        }
        BKQ LIZIZ = BKQ.LIZIZ();
        String str4 = EnumC30551Byt.Room.info;
        LIZIZ.getClass();
        BKQ.LIZLLL(str4, "ttlive_audience_enter_room", 1, jSONObject);
        if (((C29374Bfu) B83.LIZ().LIZIZ()).LJIIJJI()) {
            C0K2.LJIIJJI(1, "ttlive_audience_minor_enter_room_all", jSONObject);
            C0K2.LJIIIIZZ("ttlive_audience_minor_enter_room_error", 1, jSONObject);
        }
    }
}
