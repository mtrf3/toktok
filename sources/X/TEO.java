package X;

/* loaded from: classes13.dex */
public final class TEO extends AbstractC65781Prl implements InterfaceC88472Yns<TEN, Boolean> {
    public static final TEO LJLIL = new TEO();

    public TEO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(TEN ten) {
        boolean z;
        if (ten == TEN.ERROR) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
