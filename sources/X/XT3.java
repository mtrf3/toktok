package X;

import android.os.CountDownTimer;
import java.util.LinkedList;

/* loaded from: classes16.dex */
public final class XT3 extends CountDownTimer {
    public final /* synthetic */ LinkedList<String> LIZ;
    public final /* synthetic */ XT2 LIZIZ;
    public final /* synthetic */ C84881XSz LIZJ;
    public final /* synthetic */ boolean LIZLLL;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        if (C79004UzY.LJJIFFI(this.LIZ)) {
            this.LIZIZ.LIZ(0, 0);
            return;
        }
        this.LIZIZ.LJ(this.LIZJ, this.LIZ, this.LIZLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XT3(LinkedList<String> linkedList, XT2 xt2, C84881XSz c84881XSz, boolean z, long j) {
        super(j, 1000L);
        this.LIZ = linkedList;
        this.LIZIZ = xt2;
        this.LIZJ = c84881XSz;
        this.LIZLLL = z;
    }
}
