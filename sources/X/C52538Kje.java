package X;

/* renamed from: X.Kje, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52538Kje extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52538Kje LJLIL = new C52538Kje();

    public C52538Kje() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "photo_mode_swipe_hint_type_in_creation", true) == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
