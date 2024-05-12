package X;

/* renamed from: X.HbA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44368HbA extends F9E {
    public final Integer LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;

    public C44368HbA() {
        this(0L, 7);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Long.valueOf(this.LJLJI)};
    }

    public /* synthetic */ C44368HbA(long j, int i) {
        this(null, (i & 4) != 0 ? 0L : j, null);
    }

    public C44368HbA(Integer num, long j, String str) {
        this.LJLIL = num;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
    }
}
