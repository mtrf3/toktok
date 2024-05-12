package X;

import android.os.CountDownTimer;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class C1J extends CountDownTimer {
    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C1I.LIZ.LIZ(0, null);
    }

    public C1J(long j) {
        super(j, 1000L);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        C1I.LIZLLL = j;
        Iterator<C1M> it = C1I.LJFF.iterator();
        while (it.hasNext()) {
            it.next().LJIILIIL(j);
        }
    }
}
