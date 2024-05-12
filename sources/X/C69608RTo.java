package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.RTo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69608RTo {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69608RTo)) {
            return false;
        }
        C69608RTo c69608RTo = (C69608RTo) obj;
        return this.LIZ == c69608RTo.LIZ && o.LJ(this.LIZIZ, c69608RTo.LIZIZ) && this.LIZJ == c69608RTo.LIZJ && this.LIZLLL == c69608RTo.LIZLLL && this.LJ == c69608RTo.LJ && this.LJFF == c69608RTo.LJFF && this.LJI == c69608RTo.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZJ = (JBR.LIZJ(this.LIZLLL, (C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31) + this.LIZJ) * 31, 31) + this.LJ) * 31;
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((LIZJ + i) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrayStatus(pos=");
        LIZ.append(this.LIZ);
        LIZ.append(", comboKey=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", giftType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", giftID=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", currentComboNumber=");
        LIZ.append(this.LJ);
        LIZ.append(", needDownloadOnDequeueCheck=");
        LIZ.append(this.LJFF);
        LIZ.append(", hash=");
        return b0.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public C69608RTo(long j, String comboKey, int i, int i2, int i3, int i4, boolean z) {
        o.LJIIIZ(comboKey, "comboKey");
        this.LIZ = i;
        this.LIZIZ = comboKey;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = i3;
        this.LJFF = z;
        this.LJI = i4;
    }
}
