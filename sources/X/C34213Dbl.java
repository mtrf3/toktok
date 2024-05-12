package X;

/* renamed from: X.Dbl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34213Dbl extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34213Dbl LJLIL = new C34213Dbl();

    public C34213Dbl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) C34214Dbm.LIZ.getValue()).longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
