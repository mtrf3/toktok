package X;

/* renamed from: X.XKf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84653XKf<T> extends C84662XKo<T> {
    public MBA LJLJJI;
    public Object LJLJJL;

    public final boolean LJJZZIII() {
        if (this.LJLJJI == null) {
            return false;
        }
        this.LJLJJI = null;
        this.LJLJJL = null;
        return true;
    }

    @Override // X.C84662XKo, X.XKZ
    public final void LJJLL(Object obj) {
        MBA mba = this.LJLJJI;
        C84653XKf<?> c84653XKf = null;
        if (mba != null) {
            XLG.LIZ(this.LJLJJL, mba);
            this.LJLJJI = null;
            this.LJLJJL = null;
        }
        Object LJIILIIL = C56509MFt.LJIILIIL(obj);
        InterfaceC67352kd<T> interfaceC67352kd = this.LJLJI;
        MBA context = interfaceC67352kd.getContext();
        Object LIZJ = XLG.LIZJ(null, context);
        if (LIZJ != XLG.LIZ) {
            c84653XKf = C84648XKa.LIZIZ(interfaceC67352kd, context, LIZJ);
        }
        try {
            this.LJLJI.resumeWith(LJIILIIL);
        } finally {
            if (c84653XKf == null || c84653XKf.LJJZZIII()) {
                XLG.LIZ(LIZJ, context);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C84653XKf(X.InterfaceC67352kd r3, X.MBA r4) {
        /*
            r2 = this;
            X.MB7 r1 = X.MB7.LJLIL
            X.MBD r0 = r4.get(r1)
            if (r0 != 0) goto Lc
            X.MBA r4 = r4.plus(r1)
        Lc:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84653XKf.<init>(X.2kd, X.MBA):void");
    }
}
