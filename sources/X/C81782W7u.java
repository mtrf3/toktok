package X;

import java.io.IOException;

/* renamed from: X.W7u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81782W7u {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public final WB4 LJII;

    public C81782W7u(WB4 wb4) {
        wb4.getClass();
        this.LJII = wb4;
        this.LIZJ = 0;
        this.LIZIZ = 0;
        this.LIZLLL = 0;
        this.LJFF = 0;
        this.LJ = 0;
        this.LIZ = 0;
    }

    public final boolean LIZ(C81384Vwq c81384Vwq) {
        int read;
        int i = this.LJ;
        while (this.LIZ != 6 && (read = c81384Vwq.read()) != -1) {
            try {
                int i2 = this.LIZJ + 1;
                this.LIZJ = i2;
                if (this.LJI) {
                    this.LIZ = 6;
                    this.LJI = false;
                    return false;
                }
                int i3 = this.LIZ;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 != 5) {
                                        C32151Nz.LJIIIZ(false);
                                    } else {
                                        int i4 = ((this.LIZIZ << 8) + read) - 2;
                                        C81385Vwr.LIZ(c81384Vwq, i4);
                                        this.LIZJ += i4;
                                        this.LIZ = 2;
                                    }
                                } else {
                                    this.LIZ = 5;
                                }
                            } else if (read == 255) {
                                this.LIZ = 3;
                            } else if (read == 0) {
                                this.LIZ = 2;
                            } else if (read == 217) {
                                this.LJI = true;
                                int i5 = i2 - 2;
                                int i6 = this.LIZLLL;
                                if (i6 > 0) {
                                    this.LJFF = i5;
                                }
                                this.LIZLLL = i6 + 1;
                                this.LJ = i6;
                                this.LIZ = 2;
                            } else {
                                if (read != 218) {
                                    if (read != 1) {
                                        if (read >= 208) {
                                            if (read > 215 && read != 217 && read != 216) {
                                            }
                                        }
                                    }
                                    this.LIZ = 2;
                                } else {
                                    int i7 = i2 - 2;
                                    int i8 = this.LIZLLL;
                                    if (i8 > 0) {
                                        this.LJFF = i7;
                                    }
                                    this.LIZLLL = i8 + 1;
                                    this.LJ = i8;
                                }
                                this.LIZ = 4;
                            }
                        } else if (read == 255) {
                            this.LIZ = 3;
                        }
                    } else if (read == 216) {
                        this.LIZ = 2;
                    } else {
                        this.LIZ = 6;
                    }
                } else if (read == 255) {
                    this.LIZ = 1;
                } else {
                    this.LIZ = 6;
                }
                this.LIZIZ = read;
            } catch (IOException e) {
                J7I.LJIIL(e);
                throw null;
            }
        }
        if (this.LIZ != 6 && this.LJ != i) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ(W8X w8x) {
        if (this.LIZ == 6 || w8x.LJI() <= this.LIZJ) {
            return false;
        }
        C81384Vwq c81384Vwq = new C81384Vwq(w8x.LJFF(), this.LJII.get(16384), this.LJII);
        try {
            try {
                C81385Vwr.LIZ(c81384Vwq, this.LIZJ);
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
