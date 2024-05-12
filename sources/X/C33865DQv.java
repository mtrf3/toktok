package X;

/* renamed from: X.DQv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33865DQv extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33865DQv LJLIL = new C33865DQv();

    public C33865DQv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        C62822Ol8 c62822Ol8 = C33867DQx.LIZ;
        boolean z = true;
        if (((Number) c62822Ol8.getValue()).intValue() != 1 && ((Number) c62822Ol8.getValue()).intValue() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
