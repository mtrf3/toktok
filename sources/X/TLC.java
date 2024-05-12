package X;

/* loaded from: classes13.dex */
public final class TLC extends AbstractC65781Prl implements InterfaceC88472Yns<TEN, Boolean> {
    public static final TLC LJLIL = new TLC();

    public TLC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(TEN ten) {
        boolean z;
        if (ten == TEN.LOADING) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
