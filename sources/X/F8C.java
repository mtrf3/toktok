package X;

/* loaded from: classes7.dex */
public final class F8C extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final F8C LJLIL = new F8C();

    public F8C() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((F89.LIZ() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
