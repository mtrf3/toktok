package X;

/* loaded from: classes7.dex */
public final class DT7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DT7 LJLIL = new DT7();

    public DT7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DT6.LJLJI.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
