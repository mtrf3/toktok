package X;

/* renamed from: X.Uza, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79006Uza {
    public static final C79006Uza LJ = new C79006Uza(AbstractC79014Uzi.LIZIZ, 0, 0, 0);
    public final int LIZ;
    public final AbstractC79014Uzi LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final String toString() {
        return C16880lQ.LLLZ("%s bits=%d bytes=%d", new Object[]{C79005UzZ.LIZIZ[this.LIZ], Integer.valueOf(this.LIZLLL), Integer.valueOf(this.LIZJ)});
    }

    public final C79006Uza LIZ(int i) {
        int i2;
        AbstractC79014Uzi abstractC79014Uzi = this.LIZIZ;
        int i3 = this.LIZ;
        int i4 = this.LIZLLL;
        if (i3 == 4 || i3 == 2) {
            int i5 = C79005UzZ.LIZJ[i3][0];
            int i6 = i5 >> 16;
            abstractC79014Uzi.getClass();
            i4 += i6;
            abstractC79014Uzi = new C79010Uze(abstractC79014Uzi, 65535 & i5, i6);
            i3 = 0;
        }
        int i7 = this.LIZJ;
        if (i7 == 0 || i7 == 31) {
            i2 = 18;
        } else if (i7 == 62) {
            i2 = 9;
        } else {
            i2 = 8;
        }
        int i8 = i7 + 1;
        C79006Uza c79006Uza = new C79006Uza(abstractC79014Uzi, i3, i8, i4 + i2);
        if (i8 == 2078) {
            return c79006Uza.LIZIZ(i + 1);
        }
        return c79006Uza;
    }

    public final C79006Uza LIZIZ(int i) {
        int i2 = this.LIZJ;
        if (i2 == 0) {
            return this;
        }
        AbstractC79014Uzi abstractC79014Uzi = this.LIZIZ;
        abstractC79014Uzi.getClass();
        return new C79006Uza(new C79009Uzd(abstractC79014Uzi, i - i2, i2), this.LIZ, 0, this.LIZLLL);
    }

    public final boolean LIZJ(C79006Uza c79006Uza) {
        int i;
        int i2 = this.LIZLLL + (C79005UzZ.LIZJ[this.LIZ][c79006Uza.LIZ] >> 16);
        int i3 = c79006Uza.LIZJ;
        if (i3 > 0 && ((i = this.LIZJ) == 0 || i > i3)) {
            i2 += 10;
        }
        if (i2 <= c79006Uza.LIZLLL) {
            return true;
        }
        return false;
    }

    public final C79006Uza LIZLLL(int i, int i2) {
        int i3;
        int i4 = this.LIZLLL;
        AbstractC79014Uzi abstractC79014Uzi = this.LIZIZ;
        int i5 = this.LIZ;
        if (i != i5) {
            int i6 = C79005UzZ.LIZJ[i5][i];
            int i7 = i6 >> 16;
            abstractC79014Uzi.getClass();
            i4 += i7;
            abstractC79014Uzi = new C79010Uze(abstractC79014Uzi, 65535 & i6, i7);
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        abstractC79014Uzi.getClass();
        return new C79006Uza(new C79010Uze(abstractC79014Uzi, i2, i3), i, 0, i4 + i3);
    }

    public final C79006Uza LJ(int i, int i2) {
        int i3;
        AbstractC79014Uzi abstractC79014Uzi = this.LIZIZ;
        int i4 = this.LIZ;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        int i5 = C79005UzZ.LJ[i4][i];
        abstractC79014Uzi.getClass();
        return new C79006Uza(new C79010Uze(new C79010Uze(abstractC79014Uzi, i5, i3), i2, 5), this.LIZ, 0, this.LIZLLL + i3 + 5);
    }

    public C79006Uza(AbstractC79014Uzi abstractC79014Uzi, int i, int i2, int i3) {
        this.LIZIZ = abstractC79014Uzi;
        this.LIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
