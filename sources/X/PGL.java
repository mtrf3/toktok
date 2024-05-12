package X;

/* loaded from: classes12.dex */
public enum PGL {
    B(0),
    KB(1),
    MB(2),
    GB(3),
    TB(4),
    PB(5);

    public long LJLIL = -1;
    public int exponent;

    public long getBytes() {
        long j = this.LJLIL;
        if (j > 0) {
            return j;
        }
        long j2 = 1;
        for (int i = 0; i < this.exponent; i++) {
            j2 *= 1024;
        }
        this.LJLIL = j2;
        return j2;
    }

    public static PGL valueOf(String str) {
        return (PGL) V0N.LJJJ(PGL.class, str);
    }

    public double getByUnit(PGL pgl) {
        return (getBytes() * 1.0d) / pgl.getBytes();
    }

    public long getLongByUnit(PGL pgl) {
        return getBytes() / pgl.getBytes();
    }

    PGL(int i) {
        this.exponent = i;
    }
}
