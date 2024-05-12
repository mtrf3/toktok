package X;

/* renamed from: X.LLj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54107LLj extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C54107LLj LJLIL = new C54107LLj();

    public C54107LLj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C54103LLf.LIZ < 0) {
            int LIZ = C00F.LIZ(31744, 0, "bottom_tab_animation_optimization", true);
            C54103LLf.LIZ = LIZ;
            if (LIZ < 0) {
                C54103LLf.LIZ = 0;
            }
        }
        if (C54103LLf.LIZ == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
