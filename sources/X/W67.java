package X;

/* loaded from: classes15.dex */
public final class W67 extends AbstractRunnableC81755W6t<W8X> {
    public final /* synthetic */ W5O LJLJJLL;
    public final /* synthetic */ C81757W6v LJLJL;

    /* JADX WARN: Code restructure failed: missing block: B:60:0x002a, code lost:
    
        if (r1 != null) goto L13;
     */
    @Override // X.AbstractRunnableC81755W6t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W67.LJ():java.lang.Object");
    }

    @Override // X.AbstractRunnableC81755W6t
    public final void LIZIZ(Object obj) {
        W8X.LIZIZ((W8X) obj);
    }

    @Override // X.AbstractRunnableC81755W6t
    public final java.util.Map LIZLLL(W8X w8x) {
        boolean z;
        if (w8x != null) {
            z = true;
        } else {
            z = false;
        }
        return C65618Pp8.of("createdThumbnail", Boolean.toString(z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W67(C81757W6v c81757W6v, W7F w7f, InterfaceC81754W6s interfaceC81754W6s, String str, W5O w5o) {
        super(w7f, interfaceC81754W6s, "LocalExifThumbnailProducer", str);
        this.LJLJL = c81757W6v;
        this.LJLJJLL = w5o;
    }
}
