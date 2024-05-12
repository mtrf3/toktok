package X;

/* renamed from: X.Y7g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86864Y7g implements InterfaceC86792Y4m {
    public final /* synthetic */ C86861Y7d LIZ;

    @Override // X.InterfaceC86792Y4m
    public final void LJIIIZ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ.LJIIIIZZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C86863Y7f c86863Y7f = this.LIZ.LIZIZ;
        if (c86863Y7f != null) {
            c86863Y7f.LJIL = System.currentTimeMillis();
        }
        C86863Y7f c86863Y7f2 = this.LIZ.LIZIZ;
        if (c86863Y7f2 == null) {
            return;
        }
        c86863Y7f2.LJIJJLI = C30725C4b.LIZ();
    }

    @Override // X.InterfaceC86792Y4m
    public final void onSuccess() {
        C86863Y7f c86863Y7f = this.LIZ.LIZIZ;
        if (c86863Y7f != null) {
            C86861Y7d.LJI(c86863Y7f, 0);
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ.LJII;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C86861Y7d c86861Y7d = this.LIZ;
        c86861Y7d.LIZ = EnumC86865Y7h.IDLE;
        c86861Y7d.LJFF();
    }

    public C86864Y7g(C86861Y7d c86861Y7d) {
        this.LIZ = c86861Y7d;
    }

    @Override // X.InterfaceC86792Y4m
    public final void onFail(int i) {
        C86863Y7f c86863Y7f = this.LIZ.LIZIZ;
        if (c86863Y7f != null) {
            Integer num = c86863Y7f.LJJIFFI;
            if (num != null) {
                if (c86863Y7f != null) {
                    C86861Y7d.LJI(c86863Y7f, num.intValue());
                }
            } else if (c86863Y7f != null) {
                C86861Y7d.LJI(c86863Y7f, i);
            }
        }
        C86861Y7d c86861Y7d = this.LIZ;
        c86861Y7d.LIZ = EnumC86865Y7h.IDLE;
        c86861Y7d.LJFF();
    }
}
