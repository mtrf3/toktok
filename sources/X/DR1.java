package X;

/* loaded from: classes7.dex */
public final class DR1 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DR1 LJLIL = new DR1();

    public DR1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        C62822Ol8 c62822Ol8 = DR0.LIZJ;
        int intValue = ((Number) c62822Ol8.getValue()).intValue();
        boolean z = false;
        if (1 <= intValue && intValue < 9 && ((Number) c62822Ol8.getValue()).intValue() != 4) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
