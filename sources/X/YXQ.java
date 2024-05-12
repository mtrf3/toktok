package X;

import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class YXQ {
    public final float LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public YXQ(boolean z, boolean z2) {
        if (z) {
            this.LIZ += YXO.DOWNLOAD_TYPE.getWeight();
        }
        if (z2) {
            this.LIZ += YXO.WATER_TYPE.getWeight();
        }
    }

    public final int LIZ(YXO process, int i) {
        o.LJIIIZ(process, "process");
        int i2 = YXP.LIZ[process.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.LIZJ = true;
            }
        } else {
            this.LIZIZ = true;
        }
        float weight = (process.getWeight() / this.LIZ) * i;
        int i3 = 0;
        if (process != YXO.DOWNLOAD_TYPE && this.LIZIZ) {
            i3 = 0 + ((int) ((r1.getWeight() / this.LIZ) * 100));
        }
        if (process != YXO.WATER_TYPE && this.LIZJ) {
            i3 += (int) ((r1.getWeight() / this.LIZ) * 100);
        }
        return (int) (weight + i3);
    }
}
