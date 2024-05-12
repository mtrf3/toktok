package X;

/* renamed from: X.DUw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33970DUw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33970DUw LJLIL = new C33970DUw();

    public C33970DUw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33972DUy.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
