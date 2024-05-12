package X;

import android.os.CountDownTimer;

/* renamed from: X.HXm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CountDownTimerC44230HXm extends CountDownTimer {
    public float LIZ;
    public final /* synthetic */ C44226HXi LIZIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        A90 LJJLL = this.LIZIZ.LJJLL();
        if (LJJLL != null) {
            LJJLL.LIZLLL(99.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC44230HXm(C44226HXi c44226HXi) {
        super(3000L, 100L);
        this.LIZIZ = c44226HXi;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        float LJIJ = this.LIZ + C78842Uww.LJIJ(V0Q.Default, new C40517FvF(1, 8));
        this.LIZ = LJIJ;
        if (LJIJ > 100.0f) {
            this.LIZ = 99.0f;
        }
        A90 LJJLL = this.LIZIZ.LJJLL();
        if (LJJLL != null) {
            LJJLL.LIZLLL(this.LIZ);
        }
    }
}
