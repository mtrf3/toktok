package X;

import android.os.CountDownTimer;

/* renamed from: X.4bJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CountDownTimerC112534bJ extends CountDownTimer {
    public C112454bB LIZ;
    public final /* synthetic */ C112424b8 LIZIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C112424b8.LIZIZ(this.LIZIZ, false, 3);
        this.LIZIZ.LJFF("auto", this.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC112534bJ(C112424b8 c112424b8) {
        super(5000L, 50L);
        this.LIZIZ = c112424b8;
    }

    public final void LIZ(C112454bB c112454bB) {
        synchronized (this) {
            this.LIZ = c112454bB;
            start();
        }
    }
}
