package X;

/* loaded from: classes7.dex */
public final class E1Y extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final E1Y LJLIL = new E1Y();

    public E1Y() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) E1X.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
