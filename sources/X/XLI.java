package X;

/* loaded from: classes16.dex */
public final class XLI extends AbstractC65781Prl implements InterfaceC88471Ynr<Object, MBD, Object> {
    public static final XLI LJLIL = new XLI();

    public XLI() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, MBD mbd) {
        int i;
        Integer num;
        if (mbd instanceof XLF) {
            if (!(obj instanceof Integer) || (num = (Integer) obj) == null) {
                i = 1;
            } else {
                i = num.intValue();
                if (i == 0) {
                    return mbd;
                }
            }
            return Integer.valueOf(i + 1);
        }
        return obj;
    }
}
