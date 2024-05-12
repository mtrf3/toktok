package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;

/* renamed from: X.NJo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59156NJo {
    public long LIZ;

    public final boolean LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LIZ < LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            OC6.LIZ("ThrottleModel", "interval less than 5 minutes");
            return false;
        }
        this.LIZ = currentTimeMillis;
        return true;
    }
}
