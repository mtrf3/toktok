package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.videoarch.strategy.LiveStrategyManager;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PMU extends C79359VCp {
    public static volatile PMU LJIILL;
    public double LIZJ;
    public long LIZLLL;
    public double LJ;
    public long LJFF;
    public double LJI;
    public long LJII;
    public double LJIIIIZZ;
    public JSONObject LJIIIZ;
    public long LJIIJ;
    public JSONObject LJIIJJI;
    public long LJIIL;
    public final ConcurrentHashMap<String, PH4> LJIILIIL;
    public boolean LJIILJJIL;

    public PMU() {
        super(3);
        this.LIZJ = -1.0d;
        this.LJ = -1.0d;
        this.LJI = -1.0d;
        this.LJIIIIZZ = -1.0d;
        this.LJIIIZ = new JSONObject();
        this.LJIIJ = 0L;
        this.LJIIJJI = new JSONObject();
        this.LJIIL = 0L;
        this.LJIILIIL = new ConcurrentHashMap<>();
        this.LJIILJJIL = false;
        this.LIZ = "TypeDeviceFeature";
        Object obj = this.LIZIZ;
        if (obj != null) {
            ((VD4) obj).LIZ = "TypeDeviceFeature";
        }
    }

    public static JSONObject LIZLLL() {
        double d;
        JSONObject jSONObject = new JSONObject();
        if (LiveStrategyManager.inst().mBatteryIntent != null) {
            int intExtra = LiveStrategyManager.inst().mBatteryIntent.getIntExtra("level", -1);
            int intExtra2 = LiveStrategyManager.inst().mBatteryIntent.getIntExtra("scale", -1);
            if (intExtra2 != 0) {
                d = (intExtra / intExtra2) * 100.0d;
            } else {
                d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            }
            try {
                jSONObject.put("battery_percentage", d).put("battery_status", LiveStrategyManager.inst().mBatteryIntent.getIntExtra("status", 1)).put("battery_temperature", LiveStrategyManager.inst().mBatteryIntent.getIntExtra("temperature", 0) / 10);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return jSONObject;
    }

    public static PMU LJ() {
        if (LJIILL == null) {
            synchronized (PMU.class) {
                if (LJIILL == null) {
                    LJIILL = new PMU();
                }
            }
        }
        return LJIILL;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd A[Catch: Exception -> 0x0183, TryCatch #0 {Exception -> 0x0183, blocks: (B:6:0x000f, B:7:0x0015, B:8:0x0018, B:13:0x00dd, B:15:0x00eb, B:17:0x00f4, B:20:0x0029, B:22:0x0031, B:24:0x0043, B:26:0x00fb, B:28:0x004a, B:30:0x0052, B:32:0x0059, B:34:0x0061, B:36:0x0073, B:38:0x0108, B:40:0x007a, B:42:0x0082, B:44:0x0094, B:46:0x0118, B:48:0x009b, B:50:0x00a3, B:52:0x00b5, B:54:0x0128, B:56:0x00bc, B:58:0x00c4, B:60:0x00d6, B:62:0x0134), top: B:5:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZJ(org.json.JSONObject r11, org.json.JSONArray r12, org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PMU.LIZJ(org.json.JSONObject, org.json.JSONArray, org.json.JSONObject):org.json.JSONObject");
    }
}
