package X;

/* renamed from: X.Dbz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34227Dbz extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34227Dbz LJLIL = new C34227Dbz();

    public C34227Dbz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        C62822Ol8 c62822Ol8 = C34228Dc0.LIZ;
        if (((Number) c62822Ol8.getValue()).longValue() != -1 && ((Number) c62822Ol8.getValue()).longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
