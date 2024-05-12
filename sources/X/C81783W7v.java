package X;

import java.io.IOException;

/* renamed from: X.W7v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81783W7v {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final WB4 LJ;

    public C81783W7v(WB4 wb4) {
        wb4.getClass();
        this.LJ = wb4;
        this.LIZ = 0;
        this.LIZJ = -1;
    }

    public final boolean LIZ(C81384Vwq c81384Vwq) {
        int i;
        int read;
        int i2 = this.LIZJ;
        while (this.LIZ != -1 && (read = c81384Vwq.read()) != -1) {
            try {
                int i3 = this.LIZIZ + 1;
                this.LIZIZ = i3;
                switch (this.LIZ) {
                    case 0:
                    case 4:
                    case 6:
                        if (i3 == 13) {
                            if (read == 86) {
                                break;
                            } else {
                                this.LIZ = -1;
                                break;
                            }
                        } else if (i3 == 14) {
                            if (read == 80) {
                                break;
                            } else {
                                this.LIZ = -1;
                                break;
                            }
                        } else if (i3 == 15) {
                            if (read == 56) {
                                break;
                            } else {
                                this.LIZ = -1;
                                break;
                            }
                        } else if (i3 == 16) {
                            if (read == 88) {
                                break;
                            } else {
                                this.LIZ = -1;
                                break;
                            }
                        } else if (i3 == 21 && (read & 2) != 2) {
                            this.LIZ = -1;
                            break;
                        } else if (read != 65) {
                            break;
                        } else {
                            this.LIZ = 1;
                            break;
                        }
                    case 1:
                        if (read == 78) {
                            this.LIZ = 2;
                            break;
                        } else {
                            this.LIZ = 0;
                            break;
                        }
                    case 2:
                        if (read == 73) {
                            this.LIZ = 3;
                            break;
                        } else if (read == 77) {
                            this.LIZ = 5;
                            break;
                        } else {
                            this.LIZ = 0;
                            break;
                        }
                    case 3:
                        if (read == 77) {
                            this.LIZ = 4;
                            break;
                        } else {
                            this.LIZ = 0;
                            break;
                        }
                    case 5:
                        if (read == 70) {
                            this.LIZ = 6;
                            this.LIZLLL = i3;
                            this.LIZJ++;
                            break;
                        } else {
                            this.LIZ = 0;
                            break;
                        }
                }
            } catch (IOException e) {
                J7I.LJIIL(e);
                throw null;
            }
        }
        if (this.LIZ == -1 || (i = this.LIZJ) == i2 || i <= 0) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ(W8X w8x) {
        if (this.LIZ == -1 || w8x.LJI() <= this.LIZIZ) {
            return false;
        }
        C81384Vwq c81384Vwq = new C81384Vwq(w8x.LJFF(), this.LJ.get(16384), this.LJ);
        try {
            try {
                C81385Vwr.LIZ(c81384Vwq, this.LIZIZ);
                return LIZ(c81384Vwq);
            } catch (IOException e) {
                J7I.LJIIL(e);
                throw null;
            }
        } finally {
            WFR.LIZIZ(c81384Vwq);
        }
    }
}
