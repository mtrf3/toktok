package X;

import android.os.CountDownTimer;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;

/* loaded from: classes8.dex */
public final class GLZ extends CountDownTimer {
    public final /* synthetic */ GUG LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.LJ(new C41359GLb("time out", false, null, 6));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLZ(GUG gug) {
        super(LivePlayEnforceIntervalSetting.DEFAULT, LivePlayEnforceIntervalSetting.DEFAULT);
        this.LIZ = gug;
    }
}
