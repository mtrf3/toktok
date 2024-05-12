package Y;

import X.C88141YiX;
import X.C88145Yib;
import X.InterfaceC88142YiY;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes17.dex */
public class ARunnableS0S0111100_16 implements Runnable {
    public final int $t;
    public int i2;
    public long j3;
    public Object l0;
    public boolean z1;

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
        InterfaceC88142YiY interfaceC88142YiY = ((C88145Yib) this.l0).LIZIZ.LIZLLL;
        ((C88141YiX) interfaceC88142YiY).LIZ.LIZLLL(this.i2, this.j3, this.z1);
        if (this.z1) {
            InterfaceC88142YiY interfaceC88142YiY2 = ((C88145Yib) this.l0).LIZIZ.LIZLLL;
            int i = this.i2;
            NetworkChangeNotifier networkChangeNotifier = ((C88141YiX) interfaceC88142YiY2).LIZ;
            networkChangeNotifier.LIZLLL = i;
            networkChangeNotifier.LIZJ(i, networkChangeNotifier.getCurrentDefaultNetId());
            ((C88141YiX) ((C88145Yib) this.l0).LIZIZ.LIZLLL).LIZ.LJI(new long[]{this.j3});
        }
    }

    public static final void run$0(ARunnableS0S0111100_16 aRunnableS0S0111100_16) {
        boolean LIZ;
        try {
            aRunnableS0S0111100_16.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0111100_16 aRunnableS0S0111100_16) {
        boolean LIZ;
        try {
            InterfaceC88142YiY interfaceC88142YiY = ((C88145Yib) aRunnableS0S0111100_16.l0).LIZIZ.LIZLLL;
            long j = aRunnableS0S0111100_16.j3;
            ((C88141YiX) interfaceC88142YiY).LIZ.LIZLLL(aRunnableS0S0111100_16.i2, j, aRunnableS0S0111100_16.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0111100_16(C88145Yib c88145Yib, long j, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = c88145Yib;
        this.j3 = j;
        this.i2 = i;
        this.z1 = z;
    }
}
