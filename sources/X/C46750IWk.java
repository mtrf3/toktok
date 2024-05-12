package X;

/* renamed from: X.IWk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46750IWk extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C46750IWk LJLIL = new C46750IWk();

    public C46750IWk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (IXN.LIZJ.getPlayerBackgroundSleepStrategy() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
