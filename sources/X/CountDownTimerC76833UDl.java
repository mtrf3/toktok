package X;

import android.os.CountDownTimer;
import com.bytedance.android.livesdk.guide.LiveGiftGuideViewModel;

/* renamed from: X.UDl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class CountDownTimerC76833UDl extends CountDownTimer {
    public final /* synthetic */ LiveGiftGuideViewModel LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.LJLL.setValue(new OSZ<>(Boolean.FALSE, EnumC32853Cuv.TIME_UP));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC76833UDl(long j, LiveGiftGuideViewModel liveGiftGuideViewModel) {
        super(j, j);
        this.LIZ = liveGiftGuideViewModel;
    }
}
