package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Bpi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29982Bpi {
    public static int LIZ;
    public static int LIZIZ;
    public static int LIZLLL;
    public static int LJ;
    public static int LJFF;
    public static int LJI;
    public static Room LJII;
    public static long LJIIIIZZ;
    public static String LIZJ = "";
    public static final HashMap<String, C29987Bpn> LJIIIZ = new HashMap<>();

    public static void LIZ(int i, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", SystemClock.uptimeMillis() - j);
            jSONObject.put("error_code", i);
        } catch (JSONException unused) {
        }
        C0K2.LIZLLL("ttlive_like_query_icons_duration", new JSONObject(), null, jSONObject);
    }

    public static void LIZIZ(int i, Room room, String anchorId, long j) {
        Long l;
        String str;
        LiveMode streamType;
        o.LJIIIZ(anchorId, "anchorId");
        if (!LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_like_tap_count")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("count", i);
            jSONObject.put("anchor_id", anchorId);
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            jSONObject.put("room_id", l);
            jSONObject.put("api_duration", SystemClock.uptimeMillis() - j);
            if (room != null && (streamType = room.getStreamType()) != null) {
                str = streamType.logStreamingType;
            } else {
                str = null;
            }
            jSONObject.put("room_type", str);
        } catch (JSONException unused) {
        }
        LJI += i;
        C0K2.LIZLLL("ttlive_like_tap_count", new JSONObject(), null, jSONObject);
    }
}
