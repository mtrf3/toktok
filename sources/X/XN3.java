package X;

import com.ss.android.vesdk.VEInfo;

/* loaded from: classes16.dex */
public final class XN3 implements X0L {
    public final XN4 LIZ;

    @Override // X.X0E
    public final void LJFF(int i) {
    }

    @Override // X.X0E
    public final void LJI(boolean z) {
    }

    public XN3(XN4 xn4) {
        this.LIZ = xn4;
    }

    @Override // X.X0L
    public final void onInfo(int i, int i2, String str) {
        if (i != VEInfo.TE_MSG_EFFECT_EXPORT_RES_DONE) {
            return;
        }
        if (i2 == 0) {
            synchronized (this.LIZ) {
                this.LIZ.LIZ = true;
            }
        } else {
            synchronized (this.LIZ) {
                this.LIZ.LIZIZ = true;
            }
        }
    }
}
