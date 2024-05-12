package X;

/* renamed from: X.Dit, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34655Dit extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34655Dit LJLIL = new C34655Dit();

    public C34655Dit() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34652Diq.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
