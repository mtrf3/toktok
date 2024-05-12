package X;

/* loaded from: classes6.dex */
public class B7G {
    public final EnumC28204B5c LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TraceNode{type=");
        LIZ.append(this.LIZ);
        LIZ.append(", timeStamp=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", extra='");
        return C77800Ug8.LIZJ(LIZ, this.LIZJ, '\'', '}', LIZ);
    }

    public B7G(long j, String str) {
        this.LIZ = EnumC28204B5c.BACKGROUND;
        this.LIZIZ = j;
        this.LIZJ = str;
    }

    public B7G(EnumC28204B5c enumC28204B5c, long j) {
        this.LIZ = enumC28204B5c;
        this.LIZIZ = j;
    }
}
