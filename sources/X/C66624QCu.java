package X;

/* renamed from: X.QCu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66624QCu {
    public final int LIZ;
    public int LIZIZ;

    public final String toString() {
        C66622QCs c66622QCs = new C66622QCs(16);
        c66622QCs.LIZ('[');
        c66622QCs.LIZIZ(Integer.toString(0));
        c66622QCs.LIZ('>');
        c66622QCs.LIZIZ(Integer.toString(this.LIZIZ));
        c66622QCs.LIZ('>');
        c66622QCs.LIZIZ(Integer.toString(this.LIZ));
        c66622QCs.LIZ(']');
        return c66622QCs.toString();
    }

    public C66624QCu(int i) {
        if (i >= 0) {
            this.LIZ = i;
            this.LIZIZ = 0;
            return;
        }
        throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
    }

    public final void LIZ(int i) {
        if (i >= 0) {
            if (i <= this.LIZ) {
                this.LIZIZ = i;
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }
}
