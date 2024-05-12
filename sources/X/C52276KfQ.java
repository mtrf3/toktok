package X;

/* renamed from: X.KfQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52276KfQ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52276KfQ LJLIL = new C52276KfQ();

    public C52276KfQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "tt_story_enable_photo_multi_rate", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
