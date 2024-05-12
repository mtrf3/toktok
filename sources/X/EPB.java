package X;

/* loaded from: classes7.dex */
public final class EPB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final EPB LJLIL = new EPB();

    public EPB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        try {
            z = FCD.LJFF(EF7.LIZIZ(), "com.android.vending");
        } catch (Throwable unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
