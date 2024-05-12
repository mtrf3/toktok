package X;

/* renamed from: X.Idk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47076Idk extends F9E {
    public final long LJLIL;
    public final long LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI)};
    }

    public final boolean isComplete() {
        long j = this.LJLIL;
        if (j > 0 && j == this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public C47076Idk(long j, long j2) {
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
    }
}
