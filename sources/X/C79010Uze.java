package X;

/* renamed from: X.Uze, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79010Uze extends AbstractC79014Uzi {
    public final short LIZJ;
    public final short LIZLLL;

    public final String toString() {
        short s = this.LIZJ;
        short s2 = this.LIZLLL;
        return "<" + Integer.toBinaryString((s & ((1 << s2) - 1)) | (1 << s2) | (1 << this.LIZLLL)).substring(1) + '>';
    }

    @Override // X.AbstractC79014Uzi
    public final void LIZ(C79008Uzc c79008Uzc, byte[] bArr) {
        c79008Uzc.LIZIZ(this.LIZJ, this.LIZLLL);
    }

    public C79010Uze(AbstractC79014Uzi abstractC79014Uzi, int i, int i2) {
        super(abstractC79014Uzi);
        this.LIZJ = (short) i;
        this.LIZLLL = (short) i2;
    }
}
