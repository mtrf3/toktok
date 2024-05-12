package X;

/* renamed from: X.Kgd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52351Kgd extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52351Kgd LJLIL = new C52351Kgd();

    public C52351Kgd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (C00F.LIZ(31744, 1, "tablet_long_term_ab_adjust_video_cache", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
