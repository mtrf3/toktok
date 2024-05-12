package X;

/* loaded from: classes7.dex */
public final class DND extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DND LJLIL = new DND();

    public DND() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) DNB.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
