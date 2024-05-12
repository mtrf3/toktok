package X;

import android.os.CountDownTimer;

/* loaded from: classes16.dex */
public final class XT0 extends CountDownTimer {
    public final /* synthetic */ C84880XSy LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.LIZLLL.LIZJ();
        XT6 xt6 = this.LIZ.LJIILIIL;
        if (xt6 != null) {
            xt6.LIZIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XT0(C84880XSy c84880XSy, long j) {
        super(j, 1000L);
        this.LIZ = c84880XSy;
    }
}
