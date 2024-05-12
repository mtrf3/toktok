package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;

/* loaded from: classes12.dex */
public final class PI3 extends PI2 {
    public int LJ;

    @Override // X.PI2
    public final boolean LJIIZILJ() {
        this.LJ = 0;
        ((PI1) this.LIZ).LIZJ();
        return true;
    }

    @Override // X.PI2
    public final long LJIILL() {
        if (this.LIZLLL) {
            return LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        }
        return 5000L;
    }

    @Override // X.PMI
    public final PI8 LJIIIIZZ() {
        return PI8.PROCESS_DOUBLE_DETECT;
    }

    public PI3(PI1 pi1) {
        super(pi1);
    }

    @Override // X.PI2, X.PMI
    public final void LJI(boolean z) {
        if (z) {
            this.LJ = 0;
        }
        super.LJI(z);
    }

    @Override // X.PI2
    public final boolean LJIILLIIL(boolean z) {
        if (z) {
            this.LJ++;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("over time: ");
            LIZ.append(this.LJ);
            LIZ.append(" max over time: ");
            LIZ.append(2);
            LIZ(X1D.LIZIZ(LIZ));
            if (this.LJ < 2) {
                return false;
            }
            this.LJ = 0;
            PI1 pi1 = (PI1) this.LIZ;
            synchronized (pi1) {
                pi1.LIZ(pi1.LJIIIZ);
            }
            return true;
        }
        this.LJ = 0;
        ((PI1) this.LIZ).LIZJ();
        return true;
    }
}
