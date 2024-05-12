package X;

/* renamed from: X.0PD, reason: invalid class name */
/* loaded from: classes.dex */
public class C0PD {
    public C06920Oy[] LIZ;

    public C0PI LIZIZ() {
        throw null;
    }

    public void LIZLLL(C06920Oy c06920Oy) {
    }

    public void LJ(C06920Oy c06920Oy) {
        throw null;
    }

    public void LJFF(C06920Oy c06920Oy) {
    }

    public void LJI(C06920Oy c06920Oy) {
        throw null;
    }

    public void LJII(C06920Oy c06920Oy) {
    }

    public C0PD() {
        this(new C0PI());
    }

    public final void LIZ() {
        C06920Oy[] c06920OyArr = this.LIZ;
        if (c06920OyArr != null) {
            C06920Oy c06920Oy = c06920OyArr[C0PG.LIZ(1)];
            C06920Oy c06920Oy2 = this.LIZ[C0PG.LIZ(2)];
            if (c06920Oy != null) {
                if (c06920Oy2 != null) {
                    LJI(C06920Oy.LIZ(c06920Oy, c06920Oy2));
                } else {
                    LJI(c06920Oy);
                }
            } else if (c06920Oy2 != null) {
                LJI(c06920Oy2);
            }
            C06920Oy c06920Oy3 = this.LIZ[C0PG.LIZ(16)];
            if (c06920Oy3 != null) {
                LJFF(c06920Oy3);
            }
            C06920Oy c06920Oy4 = this.LIZ[C0PG.LIZ(32)];
            if (c06920Oy4 != null) {
                LIZLLL(c06920Oy4);
            }
            C06920Oy c06920Oy5 = this.LIZ[C0PG.LIZ(64)];
            if (c06920Oy5 != null) {
                LJII(c06920Oy5);
            }
        }
    }

    public C0PD(C0PI c0pi) {
    }

    public void LIZJ(int i, C06920Oy c06920Oy) {
        if (this.LIZ == null) {
            this.LIZ = new C06920Oy[9];
        }
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                this.LIZ[C0PG.LIZ(i2)] = c06920Oy;
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }
}
