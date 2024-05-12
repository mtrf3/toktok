package X;

/* loaded from: classes16.dex */
public final class XLH extends AbstractC65781Prl implements InterfaceC88471Ynr<XLJ, MBD, XLJ> {
    public static final XLH LJLIL = new XLH();

    public XLH() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final XLJ invoke(XLJ xlj, MBD mbd) {
        XLJ xlj2 = xlj;
        MBD mbd2 = mbd;
        if (mbd2 instanceof XLF) {
            XLF<Object> xlf = (XLF) mbd2;
            Object LJJIL = xlf.LJJIL(xlj2.LIZ);
            Object[] objArr = xlj2.LIZIZ;
            int i = xlj2.LIZLLL;
            objArr[i] = LJJIL;
            XLF<Object>[] xlfArr = xlj2.LIZJ;
            xlj2.LIZLLL = i + 1;
            xlfArr[i] = xlf;
        }
        return xlj2;
    }
}
