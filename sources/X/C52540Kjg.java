package X;

/* renamed from: X.Kjg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52540Kjg extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52540Kjg LJLIL = new C52540Kjg();

    public C52540Kjg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "photo_mode_swipe_hint_type_in_creation", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
