package X;

/* loaded from: classes7.dex */
public final class F8A extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final F8A LJLIL = new F8A();

    public F8A() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((F89.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
