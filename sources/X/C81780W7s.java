package X;

/* renamed from: X.W7s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81780W7s extends AbstractRunnableC81755W6t<W8X> {
    public final /* synthetic */ W5O LJLJJLL;
    public final /* synthetic */ InterfaceC81754W6s LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ AbstractC81781W7t LJLJLLL;

    @Override // X.AbstractRunnableC81755W6t
    public final Object LJ() {
        W8X LIZLLL = this.LJLJLLL.LIZLLL(this.LJLJJLL);
        if (LIZLLL == null) {
            this.LJLJL.LIZLLL(this.LJLJLJ, this.LJLJLLL.LJ(), false);
            return null;
        }
        LIZLLL.LJIIL();
        this.LJLJL.LIZLLL(this.LJLJLJ, this.LJLJLLL.LJ(), true);
        return LIZLLL;
    }

    @Override // X.AbstractRunnableC81755W6t
    public final void LIZIZ(Object obj) {
        W8X.LIZIZ((W8X) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81780W7s(AbstractC81781W7t abstractC81781W7t, W7F w7f, InterfaceC81754W6s interfaceC81754W6s, String str, String str2, W5O w5o, InterfaceC81754W6s interfaceC81754W6s2, String str3) {
        super(w7f, interfaceC81754W6s, str, str2);
        this.LJLJLLL = abstractC81781W7t;
        this.LJLJJLL = w5o;
        this.LJLJL = interfaceC81754W6s2;
        this.LJLJLJ = str3;
    }
}
