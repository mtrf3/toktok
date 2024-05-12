package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;

/* renamed from: X.Oxv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63615Oxv {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C63615Oxv() {
        this.LIZ = LiveTryModeCountDownThresholdSetting.DEFAULT;
        this.LIZIZ = 3;
        this.LIZJ = 300;
    }

    public C63615Oxv(int i, int i2, int i3) {
        this.LIZ = LiveTryModeCountDownThresholdSetting.DEFAULT;
        this.LIZIZ = 3;
        this.LIZJ = 300;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
