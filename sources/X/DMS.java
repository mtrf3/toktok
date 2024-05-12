package X;

/* loaded from: classes7.dex */
public final class DMS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DMS LJLIL = new DMS();

    public DMS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) DMT.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
