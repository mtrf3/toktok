package X;

/* loaded from: classes13.dex */
public final class TLB extends AbstractC65781Prl implements InterfaceC88472Yns<TEN, Boolean> {
    public static final TLB LJLIL = new TLB();

    public TLB() {
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
