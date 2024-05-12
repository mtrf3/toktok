package X;

/* renamed from: X.Ksl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53103Ksl extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C53103Ksl LJLIL = new C53103Ksl();

    public C53103Ksl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "new_followers_preload", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
