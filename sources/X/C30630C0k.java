package X;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.C0k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30630C0k {
    public static final C5H3 LIZ = C78996UzQ.LJJIJIIJI(C13.LJLIL);
    public static int LIZIZ;
    public static int LIZJ;
    public static DataChannel LIZLLL;
    public static boolean LJ;
    public static long LJFF;
    public static Handler LJI;

    public static void LIZ(int i) {
        if (i == 291) {
            if (LJ) {
                if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_anchor_share_special_effect_show")) {
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_share_special_effect_show");
                    LIZ2.LJIILLIIL(LIZLLL);
                    UFE.LIZIZ(LIZIZ, LIZ2, "special_effect_amount");
                }
            } else if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_share_special_effect_audience_show")) {
                BZI LIZ3 = C28787BRn.LIZ("livesdk_share_special_effect_audience_show");
                LIZ3.LJIILLIIL(LIZLLL);
                UFE.LIZIZ(LIZIZ, LIZ3, "special_effect_amount");
            }
            LIZIZ = 0;
            int i2 = LIZIZ;
            long j = LJFF;
            if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_share_anim_show_count_each_min")) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("count", i2);
                    jSONObject.put("room_id", j);
                } catch (JSONException unused) {
                }
                C0K2.LIZLLL("ttlive_share_anim_show_count_each_min", new JSONObject(), null, jSONObject);
            }
            Handler handler = LJI;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(291, 60000L);
            }
        }
    }
}
