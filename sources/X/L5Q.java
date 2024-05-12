package X;

/* loaded from: classes10.dex */
public final class L5Q {
    public final float LIZ;
    public final L5S LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L5Q)) {
            return false;
        }
        L5Q l5q = (L5Q) obj;
        return Float.compare(this.LIZ, l5q.LIZ) == 0 && this.LIZIZ == l5q.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryData(process=");
        LIZ.append(this.LIZ);
        LIZ.append(", progressMode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.LIZ) * 31;
        L5S l5s = this.LIZIZ;
        if (l5s == null) {
            hashCode = 0;
        } else {
            hashCode = l5s.hashCode();
        }
        return floatToIntBits + hashCode;
    }

    public L5Q(float f, L5S l5s) {
        this.LIZ = f;
        this.LIZIZ = l5s;
    }
}
