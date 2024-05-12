package X;

/* loaded from: classes15.dex */
public final class W5Q extends AbstractRunnableC81755W6t<C81392Vwy<W5A>> {
    public final /* synthetic */ InterfaceC81754W6s LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ W5O LJLJLJ;
    public final /* synthetic */ C81758W6w LJLJLLL;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    @Override // X.AbstractRunnableC81755W6t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ() {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W5Q.LJ():java.lang.Object");
    }

    @Override // X.AbstractRunnableC81755W6t
    public final void LIZIZ(Object obj) {
        C81392Vwy.LJ((C81392Vwy) obj);
    }

    @Override // X.AbstractRunnableC81755W6t
    public final java.util.Map LIZLLL(C81392Vwy<W5A> c81392Vwy) {
        boolean z;
        if (c81392Vwy != null) {
            z = true;
        } else {
            z = false;
        }
        return C65618Pp8.of("createdThumbnail", String.valueOf(z));
    }

    @Override // X.AbstractRunnableC81755W6t
    public final void LJI(Exception exc) {
        super.LJI(exc);
        this.LJLJJLL.LIZLLL(this.LJLJL, "VideoThumbnailProducer", false);
    }

    @Override // X.AbstractRunnableC81755W6t
    public final void LJII(C81392Vwy<W5A> c81392Vwy) {
        boolean z;
        super.LJII(c81392Vwy);
        InterfaceC81754W6s interfaceC81754W6s = this.LJLJJLL;
        String str = this.LJLJL;
        if (c81392Vwy != null) {
            z = true;
        } else {
            z = false;
        }
        interfaceC81754W6s.LIZLLL(str, "VideoThumbnailProducer", z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W5Q(C81758W6w c81758W6w, W7F w7f, InterfaceC81754W6s interfaceC81754W6s, String str, InterfaceC81754W6s interfaceC81754W6s2, String str2, W5O w5o) {
        super(w7f, interfaceC81754W6s, "VideoThumbnailProducer", str);
        this.LJLJLLL = c81758W6w;
        this.LJLJJLL = interfaceC81754W6s2;
        this.LJLJL = str2;
        this.LJLJLJ = w5o;
    }
}
