package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Cow, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32482Cow {
    public static final String LJ = O5Y.LJJL("ttlive_ws_connect_status");
    public static final String LJFF = O5Y.LJJLI("ttlive_ws_connect_status");
    public long LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public final C31495CXr LIZLLL;

    public final long LIZ() {
        long j;
        if (this.LIZ > 0) {
            j = SystemClock.uptimeMillis() - this.LIZ;
        } else {
            j = 0;
        }
        this.LIZ = 0L;
        this.LIZIZ = false;
        return j;
    }

    public C32482Cow(boolean z, C31495CXr c31495CXr) {
        this.LIZJ = z;
        this.LIZLLL = c31495CXr;
    }

    public final void LIZIZ(long j, String str, String str2, boolean z) {
        long j2;
        InterfaceC31203CMl interfaceC31203CMl;
        LIZ();
        JSONObject jSONObject = new JSONObject();
        C12800eq.LIZ(jSONObject, "room_id", j);
        C12800eq.LIZIZ(jSONObject, "reason", str);
        C12800eq.LIZIZ(jSONObject, "push_server", str2);
        long j3 = 1;
        long j4 = 0;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        C12800eq.LIZ(jSONObject, "has_interrupted", j2);
        if (!this.LIZJ) {
            j3 = 0;
        }
        C12800eq.LIZ(jSONObject, "is_anchor", j3);
        Integer num = (Integer) DataChannelGlobal.LJLJJI.mv0(C29027BaJ.class);
        if (num != null) {
            j4 = num.intValue();
        }
        C12800eq.LIZ(jSONObject, "room_count", j4);
        this.LIZLLL.LIZIZ(jSONObject);
        LiveMonitorSampleSetting liveMonitorSampleSetting = LiveMonitorSampleSetting.INSTANCE;
        String str3 = LJ;
        if (liveMonitorSampleSetting.isReportSlardar(str3) && (interfaceC31203CMl = C0K2.LIZ) != null) {
            interfaceC31203CMl.LIZJ(2, str3, jSONObject);
        }
        BKQ LIZIZ = BKQ.LIZIZ();
        String str4 = EnumC30551Byt.Room.info;
        LIZIZ.getClass();
        BKQ.LIZLLL(str4, "ttlive_ws_connect_status", 2, jSONObject);
    }

    public final void LIZJ(long j, int i, String str, String str2, HashMap<String, String> hashMap, boolean z, boolean z2) {
        long j2;
        long j3;
        InterfaceC31203CMl interfaceC31203CMl;
        LIZ();
        JSONObject jSONObject = new JSONObject();
        C12800eq.LIZ(jSONObject, "room_id", j);
        C12800eq.LIZ(jSONObject, "error_code", i);
        C12800eq.LIZIZ(jSONObject, "error_msg", str);
        C12800eq.LIZIZ(jSONObject, "push_server", str2);
        long j4 = 1;
        long j5 = 0;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        C12800eq.LIZ(jSONObject, "is_suspend", j2);
        if (z2) {
            j3 = 1;
        } else {
            j3 = 0;
        }
        C12800eq.LIZ(jSONObject, "has_interrupted", j3);
        if (!this.LIZJ) {
            j4 = 0;
        }
        C12800eq.LIZ(jSONObject, "is_anchor", j4);
        if (hashMap != null) {
            C12800eq.LIZIZ(jSONObject, "params", hashMap.toString());
        }
        Integer num = (Integer) DataChannelGlobal.LJLJJI.mv0(C29027BaJ.class);
        if (num != null) {
            j5 = num.intValue();
        }
        C12800eq.LIZ(jSONObject, "room_count", j5);
        this.LIZLLL.LIZIZ(jSONObject);
        LiveMonitorSampleSetting liveMonitorSampleSetting = LiveMonitorSampleSetting.INSTANCE;
        String str3 = LJ;
        if (liveMonitorSampleSetting.isReportSlardar(str3) && (interfaceC31203CMl = C0K2.LIZ) != null) {
            interfaceC31203CMl.LIZJ(1, str3, jSONObject);
        }
        String str4 = LJFF;
        if (liveMonitorSampleSetting.isReportDolphin(str4, 0.2d)) {
            C0K2.LJIIIIZZ(str4, 1, jSONObject);
        }
        BKQ LIZIZ = BKQ.LIZIZ();
        String str5 = EnumC30551Byt.Room.info;
        LIZIZ.getClass();
        BKQ.LIZLLL(str5, "ttlive_ws_connect_status", 1, jSONObject);
    }
}
