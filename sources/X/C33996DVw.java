package X;

/* renamed from: X.DVw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33996DVw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33996DVw LJLIL = new C33996DVw();

    public C33996DVw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33997DVx.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
