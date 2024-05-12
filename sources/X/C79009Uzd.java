package X;

/* renamed from: X.Uzd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79009Uzd extends AbstractC79014Uzi {
    public final short LIZJ;
    public final short LIZLLL;

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.LIZJ);
        sb.append("::");
        sb.append((this.LIZJ + this.LIZLLL) - 1);
        sb.append('>');
        return sb.toString();
    }

    @Override // X.AbstractC79014Uzi
    public final void LIZ(C79008Uzc c79008Uzc, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.LIZLLL;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    c79008Uzc.LIZIZ(31, 5);
                    short s2 = this.LIZLLL;
                    if (s2 > 62) {
                        c79008Uzc.LIZIZ(s2 - 31, 16);
                    } else if (i == 0) {
                        c79008Uzc.LIZIZ(Math.min((int) s2, 31), 5);
                    } else {
                        c79008Uzc.LIZIZ(s2 - 31, 5);
                    }
                }
                c79008Uzc.LIZIZ(bArr[this.LIZJ + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public C79009Uzd(AbstractC79014Uzi abstractC79014Uzi, int i, int i2) {
        super(abstractC79014Uzi);
        this.LIZJ = (short) i;
        this.LIZLLL = (short) i2;
    }
}
