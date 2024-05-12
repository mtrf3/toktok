package X;

import android.os.CountDownTimer;

/* renamed from: X.Boo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CountDownTimerC29926Boo extends CountDownTimer {
    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C0NB.LIZIZ("access_recall_message", "startCountDown：onFinish");
        InterfaceC30442Bx8.X2.LIZ(-1L);
        synchronized (C29925Bon.LJLIL) {
            C29925Bon.LJLJJI = false;
            if (!C29925Bon.LJLJJL) {
                C29925Bon.LIZJ(false);
                C29925Bon.LIZIZ(false);
                C29925Bon.LJLJJL = true;
            }
        }
    }

    public CountDownTimerC29926Boo(long j) {
        super(j, 1000L);
    }
}
