package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QM8 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public int LIZLLL;
    public String LJ;
    public String LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReadResult(isSuccess=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errorMsg='");
        LIZ.append(this.LIZJ);
        LIZ.append("', readType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", fromPkg='");
        LIZ.append(this.LIZ);
        LIZ.append("', key='");
        LIZ.append(this.LJ);
        LIZ.append("', value='");
        return JBR.LJFF(LIZ, this.LJFF, "')", LIZ);
    }

    public QM8(int i, String fromPkg, String errorMsg, boolean z) {
        o.LJIIIZ(fromPkg, "fromPkg");
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LIZ = fromPkg;
        this.LIZIZ = z;
        this.LIZJ = errorMsg;
        this.LIZLLL = i;
        this.LJ = "";
        this.LJFF = "";
    }

    public /* synthetic */ QM8(String str, String str2, boolean z, int i) {
        this(0, str, (i & 4) != 0 ? "" : str2, (i & 2) != 0 ? false : z);
    }
}
