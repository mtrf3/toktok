package X;

/* renamed from: X.Dbr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34219Dbr extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34219Dbr LJLIL = new C34219Dbr();

    public C34219Dbr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) C34218Dbq.LIZIZ.getValue()).longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
