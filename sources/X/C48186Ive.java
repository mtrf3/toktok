package X;

/* renamed from: X.Ive, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48186Ive extends Exception {
    public static final long serialVersionUID = -1098012010869697449L;
    public final int LJLIL;
    public final long LJLILLLLZI;

    public long getLength() {
        return this.LJLILLLLZI;
    }

    public int getMaxSize() {
        return this.LJLIL;
    }

    public C48186Ive(int i, long j) {
        super(C00F.LIZJ("Download file too large: ", i, " ", j));
        this.LJLIL = i;
        this.LJLILLLLZI = j;
    }
}
