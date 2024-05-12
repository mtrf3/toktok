package X;

/* renamed from: X.0at, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10350at {
    public float LIZ = 0.0f;
    public float LIZIZ = 0.0f;
    public float LIZJ = 0.0f;
    public float LIZLLL = 0.0f;

    public final boolean LIZIZ() {
        if (this.LIZ >= this.LIZJ || this.LIZIZ >= this.LIZLLL) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MutableRect(");
        LIZ.append(C87277YNd.LJJJJIZL(this.LIZ));
        LIZ.append(", ");
        LIZ.append(C87277YNd.LJJJJIZL(this.LIZIZ));
        LIZ.append(", ");
        LIZ.append(C87277YNd.LJJJJIZL(this.LIZJ));
        LIZ.append(", ");
        LIZ.append(C87277YNd.LJJJJIZL(this.LIZLLL));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZ(float f, float f2, float f3, float f4) {
        this.LIZ = Math.max(f, this.LIZ);
        this.LIZIZ = Math.max(f2, this.LIZIZ);
        this.LIZJ = Math.min(f3, this.LIZJ);
        this.LIZLLL = Math.min(f4, this.LIZLLL);
    }
}
