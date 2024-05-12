package X;

/* renamed from: X.8NP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C8NP LJLIL = new C8NP();

    public C8NP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "tt_story_enable_photo_preload", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
