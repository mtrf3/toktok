package X;

import java.io.Serializable;

/* renamed from: X.Ibq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46958Ibq implements Comparable<C46958Ibq>, Serializable {
    public static final long serialVersionUID = 7003130400674500845L;
    public final double mDownThreshold;
    public final double mRate;
    public final double mUpThreshold;

    public double getMedianThreshold() {
        return (this.mDownThreshold + this.mUpThreshold) / 2.0d;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mRate);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.mDownThreshold);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.mUpThreshold);
        return (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Shift{mRate=");
        LIZ.append(this.mRate);
        LIZ.append(", mDownThreshold=");
        LIZ.append(this.mDownThreshold);
        LIZ.append(", mUpThreshold=");
        return C07670Rv.LIZ(LIZ, this.mUpThreshold, '}', LIZ);
    }

    @Override // java.lang.Comparable
    public int compareTo(C46958Ibq c46958Ibq) {
        return Double.compare(this.mRate, c46958Ibq.mRate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46958Ibq)) {
            return false;
        }
        C46958Ibq c46958Ibq = (C46958Ibq) obj;
        if (Double.compare(c46958Ibq.mRate, this.mRate) == 0 && Double.compare(c46958Ibq.mDownThreshold, this.mDownThreshold) == 0 && Double.compare(c46958Ibq.mUpThreshold, this.mUpThreshold) == 0) {
            return true;
        }
        return false;
    }

    public C46958Ibq(double d, double d2, double d3) {
        this.mRate = d;
        this.mDownThreshold = d2;
        this.mUpThreshold = d3;
    }
}
