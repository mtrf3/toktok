package X;

/* loaded from: classes16.dex */
public final class XLK extends AbstractC65781Prl implements InterfaceC88471Ynr<XLF<?>, MBD, XLF<?>> {
    public static final XLK LJLIL = new XLK();

    public XLK() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.MBD, X.XLF<?>] */
    @Override // X.InterfaceC88471Ynr
    public final XLF<?> invoke(XLF<?> xlf, MBD mbd) {
        MBD mbd2 = mbd;
        if (xlf != null) {
            return xlf;
        }
        if (mbd2 instanceof XLF) {
            return mbd2;
        }
        return null;
    }
}
