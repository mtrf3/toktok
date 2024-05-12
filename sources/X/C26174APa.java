package X;

/* renamed from: X.APa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26174APa extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C26174APa LJLIL = new C26174APa();

    public C26174APa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "story_profile_avatar_click_to_publish", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
