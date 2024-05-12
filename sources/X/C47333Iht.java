package X;

/* renamed from: X.Iht, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47333Iht {
    public String LIZ;
    public java.util.Map<String, Float> LIZIZ;
    public Float LIZJ;
    public java.util.Map<String, Object> LIZLLL;
    public int LJ;

    public C47333Iht() {
        this((Object) null);
    }

    public final boolean LIZ() {
        if (this.LJ == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{success:");
        LIZ.append(LIZ());
        LIZ.append(", errorCode:");
        LIZ.append(this.LJ);
        sb.append(X1D.LIZIZ(LIZ));
        if (this.LIZ != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(", label:");
            LIZ2.append(this.LIZ);
            LIZ2.append('}');
            sb.append(X1D.LIZIZ(LIZ2));
        }
        if (this.LIZIZ != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(", scoreMap=");
            LIZ3.append(this.LIZIZ);
            sb.append(X1D.LIZIZ(LIZ3));
        }
        if (this.LIZJ != null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(", value=");
            LIZ4.append(this.LIZJ);
            sb.append(X1D.LIZIZ(LIZ4));
        }
        if (this.LIZLLL != null) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(", extOutMap=");
            LIZ5.append(this.LIZLLL);
            sb.append(X1D.LIZIZ(LIZ5));
        }
        return C0EH.LIZJ(sb, "}", "sb.toString()");
    }

    public C47333Iht(int i) {
        this.LJ = i;
    }

    public /* synthetic */ C47333Iht(Object obj) {
        this(-100);
    }
}
