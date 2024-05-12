package X;

/* renamed from: X.CrO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32634CrO extends F9E {
    public final boolean LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;

    public C32634CrO() {
        this(false, 0L, 7);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI)};
    }

    public /* synthetic */ C32634CrO(boolean z, long j, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? Long.MAX_VALUE : 0L);
    }

    public C32634CrO(boolean z, long j, long j2) {
        this.LJLIL = z;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }
}
