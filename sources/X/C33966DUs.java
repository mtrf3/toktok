package X;

/* renamed from: X.DUs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33966DUs extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33966DUs LJLIL = new C33966DUs();

    public C33966DUs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33968DUu.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
