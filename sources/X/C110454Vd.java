package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4Vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110454Vd {
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public int LJI;
    public String LIZ = "";
    public String LJFF = "";

    public final void LIZ(C4VW stage, long j) {
        o.LJIIIZ(stage, "stage");
        int i = C4VX.LIZ[stage.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    this.LJ = j;
                    return;
                }
                this.LIZLLL = j;
                return;
            }
            this.LIZJ = j;
            return;
        }
        this.LIZIZ = j;
    }
}
