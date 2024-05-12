package X;

import android.os.CountDownTimer;

/* renamed from: X.Wq4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class CountDownTimerC83512Wq4 extends CountDownTimer {
    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    public CountDownTimerC83512Wq4() {
        super(1500L, 3000L);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = C83515Wq7.LIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }
}
