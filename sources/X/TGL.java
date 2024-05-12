package X;

/* loaded from: classes13.dex */
public final class TGL extends AbstractC65781Prl implements InterfaceC88472Yns<TEN, Boolean> {
    public static final TGL LJLIL = new TGL();

    public TGL() {
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
