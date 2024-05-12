package X;

import java.util.Arrays;

/* loaded from: classes15.dex */
public final class VI8 {
    public static final VI8 LJI;
    public int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final byte LIZLLL;
    public final byte[] LJ;
    public boolean LJFF;

    static {
        VI8 vi8 = new VI8(new VI8().LIZ(0));
        vi8.LIZIZ = true;
        LJI = vi8;
        new VI8(new VI8().LIZ(1));
        new VI8(new VI8().LIZ(2));
        new VI8();
        VI8 vi82 = new VI8(new VI8());
        vi82.LIZJ = true;
        VI8 LIZ = vi82.LIZ(2);
        LIZ.LIZ(2);
        LIZ.LIZ(1);
        LIZ.LIZ(0);
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.LJ) + ((((((((1147 + this.LIZ) * 37) + (!this.LIZIZ ? 1 : 0)) * 37) + (!this.LIZJ ? 1 : 0)) * 37) + this.LIZLLL) * 37)) * 37) + (!this.LJFF ? 1 : 0);
    }

    public VI8() {
        this.LIZ = 2;
    }

    public VI8(VI8 vi8) {
        this.LIZ = vi8.LIZ;
        this.LIZIZ = vi8.LIZIZ;
        this.LIZJ = vi8.LIZJ;
        this.LIZLLL = vi8.LIZLLL;
        this.LJ = vi8.LJ;
    }

    public final VI8 LIZ(int i) {
        VI8 vi8 = new VI8(this);
        vi8.LIZ = i;
        return vi8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VI8)) {
            return false;
        }
        VI8 vi8 = (VI8) obj;
        if (this.LIZ == vi8.LIZ && this.LIZIZ == vi8.LIZIZ && this.LIZJ == vi8.LIZJ && this.LIZLLL == vi8.LIZLLL && Arrays.equals(this.LJ, vi8.LJ) && this.LJFF == vi8.LJFF) {
            return true;
        }
        return false;
    }
}
