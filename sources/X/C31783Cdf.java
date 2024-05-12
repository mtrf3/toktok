package X;

/* renamed from: X.Cdf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31783Cdf<T, R> implements C3EO<T, T> {
    public final AbstractC73672Svk<R> LIZ;
    public final R LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UntilEventObservableTransformer{lifecycle=");
        LIZ.append(this.LIZ);
        LIZ.append(", event=");
        return U26.LIZJ(LIZ, this.LIZIZ, '}', LIZ);
    }

    @Override // X.C3EO
    public final InterfaceC115714gR<T> LIZ(AbstractC73672Svk<T> abstractC73672Svk) {
        AbstractC73672Svk<R> abstractC73672Svk2 = this.LIZ;
        final R r = this.LIZIZ;
        C73456SsG LJJLIIIJ = abstractC73672Svk2.LJJIFFI(new InterfaceC73592SuS() { // from class: X.Cdg
            @Override // X.InterfaceC73592SuS
            public final boolean test(Object obj) {
                return obj.equals(r);
            }
        }).LJJLIIIJ(1L);
        abstractC73672Svk.getClass();
        return new C73888SzE(abstractC73672Svk, LJJLIIIJ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31783Cdf.class != obj.getClass()) {
            return false;
        }
        C31783Cdf c31783Cdf = (C31783Cdf) obj;
        if (!this.LIZ.equals(c31783Cdf.LIZ)) {
            return false;
        }
        return this.LIZIZ.equals(c31783Cdf.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C31783Cdf(AbstractC73672Svk abstractC73672Svk, EnumC29270BeE enumC29270BeE) {
        this.LIZ = abstractC73672Svk;
        this.LIZIZ = enumC29270BeE;
    }
}
