package X;

import android.os.CountDownTimer;

/* renamed from: X.UCg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76802UCg {
    public InterfaceC76804UCi LIZ;
    public CountDownTimer LIZIZ;

    public final void LIZ() {
        CountDownTimer countDownTimer = this.LIZIZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LIZ = null;
    }

    public final void LIZIZ(long j, long j2) {
        CountDownTimer countDownTimer = this.LIZIZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LIZIZ = new CountDownTimerC76803UCh(j2, j, this, j * 1000).start();
    }
}
