package Y;

import X.C0NB;
import X.C15610jN;
import X.C75516TkO;
import X.C75878TqE;
import X.C8E;
import X.InterfaceC74695TTf;
import X.InterfaceC75441TjB;
import X.InterfaceC75941TrF;
import X.X1D;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostModeSwitchLoopCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostModeSwitchLoopIntervalSetting;
import defpackage.b1;

/* loaded from: classes14.dex */
public class ARunnableS0S0102200_13 implements Runnable {
    public final int $t;
    public int i2;
    public long j4;
    public Object l0;
    public int i1 = LiveCoHostModeSwitchLoopCountSetting.getValue();
    public long j3 = LiveCoHostModeSwitchLoopIntervalSetting.getValue();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z;
        InterfaceC74695TTf LLIIJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNeedJoinChannel: closeCallback.run(), currentCount = ");
        LIZ.append(this.i2);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
            z = LLIIJLIL.LJIIIIZZ();
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onNeedJoinChannel: joinChannel(), currentCount = ");
            LIZ2.append(this.i2);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
            long uptimeMillis = SystemClock.uptimeMillis();
            ((InterfaceC75941TrF) this.l0).joinChannel();
            new C75878TqE().LJJJLIIL(1, this.i2, uptimeMillis - this.j4);
            return;
        }
        if (this.i2 < this.i1) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onNeedJoinChannel: postDelayed, currentCount = ");
            b1.LJ(LIZ3, this.i2, LIZ3, "MultiHostCrossAdapter");
            C15610jN.LIZJ(this, this.j3);
            this.i2++;
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("onNeedJoinChannel: timeout, currentCount = ");
        b1.LJ(LIZ4, this.i2, LIZ4, "MultiHostCrossAdapter");
        C75516TkO.LIZ.LIZ(1098, "cohost_mode_switch_timeout", null);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        ((InterfaceC75941TrF) this.l0).joinChannel();
        new C75878TqE().LJJJLIIL(2, this.i2, uptimeMillis2 - this.j4);
    }

    public final void LIZ$1() {
        boolean z;
        InterfaceC74695TTf LLIIJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNeedJoinChannel: closeCallback.run(), currentCount = ");
        LIZ.append(this.i2);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
            z = LLIIJLIL.LJIIIIZZ();
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onNeedJoinChannel: joinChannel(), currentCount = ");
            LIZ2.append(this.i2);
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
            long uptimeMillis = SystemClock.uptimeMillis();
            ((InterfaceC75941TrF) this.l0).joinChannel();
            new C75878TqE().LJJJLIIL(1, this.i2, uptimeMillis - this.j4);
            return;
        }
        if (this.i2 < this.i1) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onNeedJoinChannel: postDelayed, currentCount = ");
            b1.LJ(LIZ3, this.i2, LIZ3, "MultiHostMultiAdapter");
            C15610jN.LIZJ(this, this.j3);
            this.i2++;
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("onNeedJoinChannel: timeout, currentCount = ");
        b1.LJ(LIZ4, this.i2, LIZ4, "MultiHostMultiAdapter");
        C75516TkO.LIZ.LIZ(1098, "cohost_mode_switch_timeout", null);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        ((InterfaceC75941TrF) this.l0).joinChannel();
        new C75878TqE().LJJJLIIL(2, this.i2, uptimeMillis2 - this.j4);
    }

    public static final void run$0(ARunnableS0S0102200_13 aRunnableS0S0102200_13) {
        boolean LIZ;
        try {
            aRunnableS0S0102200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0102200_13 aRunnableS0S0102200_13) {
        boolean LIZ;
        try {
            aRunnableS0S0102200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0102200_13(InterfaceC75941TrF interfaceC75941TrF, long j, int i) {
        this.$t = i;
        this.l0 = interfaceC75941TrF;
        this.j4 = j;
    }
}
