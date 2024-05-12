package X;

/* loaded from: classes16.dex */
public final class YI4 extends YI8 {
    public int LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public int LJ = Integer.MAX_VALUE;

    public final int LIZ(int i) {
        if (i >= 0) {
            int i2 = this.LIZJ;
            int i3 = this.LIZLLL;
            int i4 = (i2 - i3) + i;
            int i5 = this.LJ;
            if (i4 <= i5) {
                this.LJ = i4;
                int i6 = this.LIZ + this.LIZIZ;
                this.LIZ = i6;
                int i7 = i6 - i3;
                if (i7 > i4) {
                    int i8 = i7 - i4;
                    this.LIZIZ = i8;
                    this.LIZ = i6 - i8;
                } else {
                    this.LIZIZ = 0;
                }
                return i5;
            }
            throw new YI5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new YI5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public YI4(int i, int i2) {
        this.LIZ = i2 + i;
        this.LIZJ = i;
        this.LIZLLL = i;
    }
}
