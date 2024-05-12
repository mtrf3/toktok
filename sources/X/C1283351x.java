package X;

/* renamed from: X.51x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1283351x extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C1283351x LJLIL = new C1283351x();

    public C1283351x() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "studio_editor_pro_enable_copy", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
