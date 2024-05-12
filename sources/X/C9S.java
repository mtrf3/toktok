package X;

import android.os.CountDownTimer;

/* loaded from: classes6.dex */
public final class C9S extends CountDownTimer {
    public final /* synthetic */ C9N LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C9N c9n = this.LIZ;
        c9n.LJIIIIZZ = true;
        c9n.LJ(C9T.BAD_CONNECTION);
        this.LIZ.LIZ().LIZJ("2");
        this.LIZ.LJI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9S(C9N c9n, long j) {
        super(j, 1000L);
        this.LIZ = c9n;
    }
}
