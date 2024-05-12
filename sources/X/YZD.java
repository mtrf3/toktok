package X;

/* loaded from: classes17.dex */
public final class YZD {
    public static final YZD LIZJ = new YZD(YZH.none, null);
    public static final YZD LIZLLL = new YZD(YZH.xMidYMid, YZC.meet);
    public final YZH LIZ;
    public final YZC LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(" ");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || YZD.class != obj.getClass()) {
            return false;
        }
        YZD yzd = (YZD) obj;
        if (this.LIZ == yzd.LIZ && this.LIZIZ == yzd.LIZIZ) {
            return true;
        }
        return false;
    }

    public YZD(YZH yzh, YZC yzc) {
        this.LIZ = yzh;
        this.LIZIZ = yzc;
    }
}
