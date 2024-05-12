package X;

/* renamed from: X.Dus, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35398Dus extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35398Dus LJLIL = new C35398Dus();

    public C35398Dus() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C35397Dur.LIZ.getValue()).intValue() & 1) == 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
