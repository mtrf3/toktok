package X;

/* renamed from: X.Kpr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52923Kpr extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52923Kpr LJLIL = new C52923Kpr();

    public C52923Kpr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "notice_recommend_independent", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
