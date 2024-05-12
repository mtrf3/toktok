package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CoA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32434CoA {
    public final boolean LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;

    public final String LIZJ() {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Stat(self(");
            LIZ.append(this.LIZ);
            LIZ.append(") msg(");
            LIZ.append(this.LIZIZ);
            LIZ.append(") node(");
            LIZ.append(this.LIZJ);
            LIZ.append(") small(");
            LIZ.append(this.LIZLLL);
            LIZ.append(") 70-5200(");
            LIZ.append(this.LJ);
            LIZ.append(") -30000(");
            LIZ.append(this.LJFF);
            LIZ.append(")  large(");
            return C08380Uo.LIZ(LIZ, this.LJI, "))", LIZ);
        }
        return "";
    }

    public C32434CoA(boolean z) {
        this.LIZ = z;
    }

    public static String LIZLLL(C78072UkW c78072UkW) {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TrayMsg id(");
            LIZ.append(c78072UkW.LJJJJIZL);
            LIZ.append(" valid(");
            LIZ.append(c78072UkW.LJJLI);
            LIZ.append(") local(");
            LIZ.append(c78072UkW.LJJJJJL);
            LIZ.append(" price(");
            return C08380Uo.LIZ(LIZ, c78072UkW.LJJJJLI, ")))", LIZ);
        }
        return "";
    }

    public final void LIZ(C78072UkW msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("self(");
        LIZ.append(this.LIZ);
        LIZ.append(") onAdd:");
        LIZ.append(LIZLLL(msg));
        C32441CoH.LIZ(X1D.LIZIZ(LIZ));
        if (msg.LJJLI) {
            this.LIZIZ = msg.LJJIJLIJ.size() + this.LIZIZ;
            this.LIZJ++;
            int i = msg.LJJJJLI;
            if (i <= 70) {
                this.LIZLLL++;
                return;
            }
            if (i < 5200) {
                this.LJ++;
                return;
            }
            if (5201 > i) {
                return;
            }
            if (i < 30000) {
                this.LJFF++;
            } else {
                if (i <= 30000) {
                    return;
                }
                this.LJI++;
            }
        }
    }

    public final void LIZIZ(C78072UkW c78072UkW) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("self(");
        LIZ.append(this.LIZ);
        LIZ.append(") onAdd:");
        LIZ.append(LIZLLL(c78072UkW));
        C32441CoH.LIZ(X1D.LIZIZ(LIZ));
        if (c78072UkW.LJJLI) {
            int size = this.LIZIZ - c78072UkW.LJJIJLIJ.size();
            this.LIZIZ = size;
            if (size < 0) {
                this.LIZIZ = 0;
            }
            int i2 = this.LIZJ;
            if (i2 > 0) {
                this.LIZJ = i2 - 1;
            }
            int i3 = c78072UkW.LJJJJLI;
            if (i3 < 70) {
                int i4 = this.LIZLLL;
                if (i4 > 0) {
                    this.LIZLLL = i4 - 1;
                    return;
                }
                return;
            }
            if (i3 < 5200) {
                int i5 = this.LJ;
                if (i5 <= 0) {
                    return;
                }
                this.LJ = i5 - 1;
                return;
            }
            if (5200 > i3) {
                return;
            }
            if (i3 < 30000) {
                int i6 = this.LJFF;
                if (i6 <= 0) {
                    return;
                }
                this.LJFF = i6 - 1;
                return;
            }
            if (i3 <= 30000 || (i = this.LJI) <= 0) {
                return;
            }
            this.LJI = i - 1;
        }
    }
}
