package X;

/* renamed from: X.Kih, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52479Kih extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52479Kih LJLIL = new C52479Kih();

    public C52479Kih() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "pinch_to_clear_mode", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
