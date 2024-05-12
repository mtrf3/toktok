package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.W7n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81775W7n<T> extends W80<T> {
    public final /* synthetic */ InterfaceC81754W6s LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ W7F LJLL;
    public final /* synthetic */ InterfaceC81770W7i LJLLI;
    public final /* synthetic */ C81774W7m LJLLILLLL;

    @Override // X.AbstractRunnableC81755W6t
    public final void LIZIZ(T t) {
    }

    @Override // X.AbstractRunnableC81755W6t
    public final T LJ() {
        return null;
    }

    @Override // X.AbstractRunnableC81755W6t
    public final java.util.Map LIZJ() {
        long j = this.LJLJL;
        if (j > 0 && j > 0) {
            return C65618Pp8.of("pendingTime", String.valueOf(j));
        }
        return null;
    }

    @Override // X.AbstractRunnableC81755W6t
    public final java.util.Map<String, String> LIZLLL(T t) {
        long j = this.LJLJL;
        if (j > 0 && j > 0) {
            return C65618Pp8.of("pendingTime", String.valueOf(j));
        }
        return null;
    }

    @Override // X.AbstractRunnableC81755W6t
    public final void LJII(T t) {
        java.util.Map<String, String> map;
        InterfaceC81754W6s interfaceC81754W6s = this.LJLJLJ;
        String str = this.LJLJLLL;
        if (interfaceC81754W6s.LJIIIZ(str)) {
            map = LIZLLL(t);
        } else {
            map = null;
        }
        interfaceC81754W6s.LIZIZ(str, "BackgroundThreadHandoffProducer", map);
        this.LJLLILLLL.LIZ.LIZIZ(this.LJLL, this.LJLLI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81775W7n(C81774W7m c81774W7m, W7F w7f, InterfaceC81754W6s interfaceC81754W6s, String str, InterfaceC81754W6s interfaceC81754W6s2, String str2, W7F w7f2, InterfaceC81770W7i interfaceC81770W7i) {
        super(w7f, interfaceC81754W6s, str);
        this.LJLLILLLL = c81774W7m;
        this.LJLJLJ = interfaceC81754W6s2;
        this.LJLJLLL = str2;
        this.LJLL = w7f2;
        this.LJLLI = interfaceC81770W7i;
    }
}
