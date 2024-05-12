package X;

/* renamed from: X.DZj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34087DZj extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34087DZj LJLIL = new C34087DZj();

    public C34087DZj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "ec_photo_search_entrance_optimize", true, false)) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
