package X;

/* renamed from: X.DMd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33743DMd extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33743DMd LJLIL = new C33743DMd();

    public C33743DMd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33744DMe.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
