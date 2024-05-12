package X;

import android.os.CountDownTimer;

/* renamed from: X.VyT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class CountDownTimerC81485VyT extends CountDownTimer {
    public final /* synthetic */ C81484VyS LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        if (this.LIZ.isShowing()) {
            this.LIZ.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC81485VyT(C81484VyS c81484VyS) {
        super(5000L, 500L);
        this.LIZ = c81484VyS;
    }
}
