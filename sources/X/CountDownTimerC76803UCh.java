package X;

import android.os.CountDownTimer;

/* renamed from: X.UCh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class CountDownTimerC76803UCh extends CountDownTimer {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ C76802UCg LIZIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        InterfaceC76804UCi interfaceC76804UCi = this.LIZIZ.LIZ;
        if (interfaceC76804UCi != null) {
            interfaceC76804UCi.LIZ();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        InterfaceC76804UCi interfaceC76804UCi;
        long j2 = j / 1000;
        if (j - (1000 * j2) > 600) {
            j2++;
        }
        if (j2 != this.LIZ && (interfaceC76804UCi = this.LIZIZ.LIZ) != null) {
            interfaceC76804UCi.LJIILIIL(j2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC76803UCh(long j, long j2, C76802UCg c76802UCg, long j3) {
        super(j3, j);
        this.LIZ = j2;
        this.LIZIZ = c76802UCg;
    }
}
