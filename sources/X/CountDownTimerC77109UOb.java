package X;

import android.os.CountDownTimer;

/* renamed from: X.UOb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class CountDownTimerC77109UOb extends CountDownTimer {
    public final /* synthetic */ AbstractC77108UOa LIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.LJJJLL();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.LIZ.LJIILIIL(j / 1000);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC77109UOb(AbstractC77108UOa abstractC77108UOa, long j) {
        super(j, 1000L);
        this.LIZ = abstractC77108UOa;
    }
}
