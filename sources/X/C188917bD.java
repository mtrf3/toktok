package X;

/* renamed from: X.7bD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188917bD extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C188917bD LJLIL = new C188917bD();

    public C188917bD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "photo_mode_interact_sticker", true, false)) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }
}
