package X;

import android.os.CountDownTimer;
import com.bytedance.android.livesdk.livegoal.LiveGoalPinCardWidget;

/* renamed from: X.Bb3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CountDownTimerC29073Bb3 extends CountDownTimer {
    public final /* synthetic */ LiveGoalPinCardWidget LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.hide();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC29073Bb3(long j, LiveGoalPinCardWidget liveGoalPinCardWidget) {
        super(j, j);
        this.LIZ = liveGoalPinCardWidget;
    }
}
