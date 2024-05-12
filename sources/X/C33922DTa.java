package X;

/* renamed from: X.DTa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33922DTa extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33922DTa LJLIL = new C33922DTa();

    public C33922DTa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        int intValue = ((Number) DTZ.LIZIZ.getValue()).intValue();
        if (intValue != 200 && intValue != 250 && intValue != 300 && intValue != 350) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
