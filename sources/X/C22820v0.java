package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveUserWatchDurationLayoutSettings;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0v0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22820v0 {
    public final boolean LIZ;
    public final JSONObject LIZIZ;

    public static JSONObject LIZ() {
        JSONObject putOpt = new JSONObject(C19660pu.LIZ).putOpt("live_user_consume_amt_avg_layer", Integer.valueOf(LiveGiftUserConsumeLayerSetting.INSTANCE.getValue())).putOpt("live_user_watch_duration_avg_layer", Integer.valueOf(LiveUserWatchDurationLayoutSettings.INSTANCE.getValue()));
        o.LJIIIIZZ(putOpt, "JSONObject(LiveFeatureCe…ayoutSettings.getValue())");
        return putOpt;
    }

    public C22820v0(boolean z, JSONObject jSONObject) {
        this.LIZ = z;
        this.LIZIZ = jSONObject;
    }
}
