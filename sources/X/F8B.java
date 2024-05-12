package X;

/* loaded from: classes7.dex */
public final class F8B extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final F8B LJLIL = new F8B();

    public F8B() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((F89.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
