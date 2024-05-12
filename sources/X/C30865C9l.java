package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS22S0010000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.C9l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30865C9l {
    public static final List<OSZ<String, EnumC30866C9m>> LJFF = C47261Igj.LJJIJIIJI(new OSZ("start_native_api_call_time", EnumC30866C9m.LIVECORE_START_TIME), new OSZ("start_cpp_api_call_time", EnumC30866C9m.LIVECORE_CPP_START_TIME), new OSZ("node_optimize_time", EnumC30866C9m.LIVECORE_NODE_TEST_TIME), new OSZ("dns_time", EnumC30866C9m.LIVECORE_DNS_TEST_TIME), new OSZ("socket_connect_time", EnumC30866C9m.LIVECORE_SOCKET_TEST_TIME), new OSZ("rtmp_connect_time", EnumC30866C9m.LIVECORE_RTMP_TEST_TIME), new OSZ("start_send_packet_time", EnumC30866C9m.LIVECORE_PACK_TEST_TIME));
    public final HashMap<EnumC30866C9m, String> LIZ = new HashMap<>();
    public long LIZIZ = -1;
    public boolean LIZJ;
    public Integer LIZLLL;
    public String LJ;

    public final void LIZLLL() {
        C0NB.LIZIZ("LiveSpeedTestLogRecorder", "recordSpeedTestStart");
        this.LIZ.clear();
        this.LIZJ = true;
        this.LIZIZ = System.currentTimeMillis();
        this.LIZ.put(EnumC30866C9m.START_SPEED_TEST_TIME, String.valueOf(System.currentTimeMillis()));
    }

    public static String LIZ(C30865C9l c30865C9l) {
        return String.valueOf(System.currentTimeMillis() - c30865C9l.LIZIZ);
    }

    public final void LIZJ(String str) {
        C279017q.LJ("recordRequestResult: ", str, "LiveSpeedTestLogRecorder");
        if (!this.LIZJ) {
            LIZLLL();
        }
        this.LIZ.put(EnumC30866C9m.SPEED_TEST_RESPONSE_TIME, LIZ(this));
        this.LIZ.put(EnumC30866C9m.SPEED_TEST_RESPONSE_RESULT, str);
    }

    public final void LJ(String timeStr, String str) {
        o.LJIIIZ(timeStr, "timeStr");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recordStartRequestUrl: ");
        LIZ.append(timeStr);
        LIZ.append(", result: ");
        LIZ.append(str);
        LIZ.append(", shouldReport: ");
        C19U.LIZJ(LIZ, this.LIZJ, LIZ, "LiveSpeedTestLogRecorder");
        if (!this.LIZJ) {
            LIZLLL();
        }
        this.LIZ.put(EnumC30866C9m.START_REQUEST_URL_TIME, timeStr);
        this.LIZ.put(EnumC30866C9m.START_REQUEST_URL_RESULT, str);
    }

    public final void LIZIZ(JSONObject jSONObject, int i, Integer num, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("parseLiveCoreCallback shouldReport: ");
        LIZ.append(this.LIZJ);
        C0NB.LIZIZ("LiveSpeedTestLogRecorder", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("parseLiveCoreCallback params: ");
        LIZ2.append(i);
        LIZ2.append(", ");
        LIZ2.append(num);
        LIZ2.append(", ");
        LIZ2.append(str);
        C0NB.LIZIZ("LiveSpeedTestLogRecorder", X1D.LIZIZ(LIZ2));
        if (!this.LIZJ) {
            LIZLLL();
        }
        this.LIZ.put(EnumC30866C9m.SPEED_TEST_END_TIME, LIZ(this));
        this.LIZ.put(EnumC30866C9m.SPEED_TEST_END_STATUS_RESULT, String.valueOf(i));
        try {
            for (OSZ<String, EnumC30866C9m> osz : LJFF) {
                if (jSONObject.has(osz.getFirst())) {
                    String v = JSONObjectProtectorUtils.getString(jSONObject, osz.getFirst());
                    HashMap<EnumC30866C9m, String> hashMap = this.LIZ;
                    EnumC30866C9m second = osz.getSecond();
                    o.LJIIIIZZ(v, "v");
                    hashMap.put(second, String.valueOf(CastLongProtector.parseLong(v) - this.LIZIZ));
                } else {
                    this.LIZ.put(osz.getSecond(), "-999");
                }
            }
        } catch (Exception unused) {
            C0NB.LJIIIZ("LiveSpeedTestLogRecorder", "ParseLiveCoreCallback failed");
        }
        this.LIZLLL = num;
        this.LJ = str;
    }

    public final void LJFF(long j, String str, String definition, String roomId) {
        Long l;
        int i;
        Room room;
        o.LJIIIZ(definition, "definition");
        o.LJIIIZ(roomId, "roomId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("report: ");
        LIZ.append(this.LIZJ);
        LIZ.append(", roomId: ");
        LIZ.append(roomId);
        LIZ.append(", globalData: ");
        C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        if (c28246B6s != null && (room = c28246B6s.LIZIZ) != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        C07670Rv.LJ(LIZ, l, LIZ, "LiveSpeedTestLogRecorder");
        if (!this.LIZJ) {
            return;
        }
        this.LIZJ = false;
        boolean z = !o.LJ(str, "active_exit");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_golive_speedtest_monitor");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(String.valueOf(j), "tS_enter_golive_preview");
        LIZ2.LJIJJ(LIZ(this), "tF_leave_golive_preview");
        LIZ2.LJIJJ(str, "leave_golive_preview_status");
        LIZ2.LJJI(definition, "definition_golive", new AqS22S0010000_5(z, 0));
        LIZ2.LJJI(roomId, "room_id", new AqS22S0010000_5(z, 1));
        AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(this, 304);
        Integer num = this.LIZLLL;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -999;
        }
        LIZ2.LJJI(Integer.valueOf(i), "r10_speedtest_result", aqS155S0100000_5);
        AqS155S0100000_5 aqS155S0100000_52 = new AqS155S0100000_5(this, 305);
        String str2 = this.LJ;
        if (str2 == null) {
            str2 = "-999";
        }
        LIZ2.LJJI(str2, "r10_definition_recommend", aqS155S0100000_52);
        for (EnumC30866C9m enumC30866C9m : EnumC30866C9m.values()) {
            String key = enumC30866C9m.getKey();
            String str3 = this.LIZ.get(enumC30866C9m);
            if (str3 == null) {
                str3 = "-999";
            }
            LIZ2.LJIJJ(str3, key);
        }
        LIZ2.LJJIIJZLJL();
    }
}
