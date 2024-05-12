package X;

/* loaded from: classes13.dex */
public final class TGK extends AbstractC65781Prl implements InterfaceC88472Yns<TEN, Boolean> {
    public static final TGK LJLIL = new TGK();

    public TGK() {
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
