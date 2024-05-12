package X;

/* renamed from: X.DVt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33993DVt extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33993DVt LJLIL = new C33993DVt();

    public C33993DVt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33994DVu.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
