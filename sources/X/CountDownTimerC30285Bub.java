package X;

import Y.ARunnableS41S0100000_5;
import Y.IDAListenerS232S0100000_5;
import android.os.CountDownTimer;

/* renamed from: X.Bub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CountDownTimerC30285Bub extends CountDownTimer {
    public final /* synthetic */ C30284Bua LIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.post(new ARunnableS41S0100000_5(this, 143));
        this.LIZ.setVisibility(8);
        InterfaceC30283BuZ interfaceC30283BuZ = this.LIZ.LJLJI;
        if (interfaceC30283BuZ != null) {
            interfaceC30283BuZ.LIZ();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        long j2 = j / 1000;
        this.LIZ.LJLILLLLZI.setText(String.valueOf(1 + j2));
        if (j2 < 2) {
            this.LIZ.LJLIL.setAnimationListener(new IDAListenerS232S0100000_5(this, 9));
        }
        this.LIZ.LJLIL.reset();
        C30284Bua c30284Bua = this.LIZ;
        c30284Bua.LJLILLLLZI.startAnimation(c30284Bua.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC30285Bub(C30284Bua c30284Bua, long j) {
        super(j, 1000L);
        this.LIZ = c30284Bua;
    }
}
