package X;

import android.os.CountDownTimer;

/* renamed from: X.UjK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class CountDownTimerC77998UjK extends CountDownTimer {
    public InterfaceC78031Ujr LIZ;
    public boolean LIZIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZIZ = true;
        InterfaceC78031Ujr interfaceC78031Ujr = this.LIZ;
        if (interfaceC78031Ujr != null) {
            interfaceC78031Ujr.LIZ();
        }
    }

    public CountDownTimerC77998UjK(long j) {
        super(j, 1000L);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        InterfaceC78031Ujr interfaceC78031Ujr = this.LIZ;
        if (interfaceC78031Ujr != null) {
            interfaceC78031Ujr.LJIILIIL(j);
        }
    }
}
