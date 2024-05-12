package X;

/* loaded from: classes9.dex */
public final class INA extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final INA LJLIL = new INA();

    public INA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (INB.LIZ() != 1 && INB.LIZ() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
