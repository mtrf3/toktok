package X;

/* renamed from: X.Duu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35400Duu extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35400Duu LJLIL = new C35400Duu();

    public C35400Duu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C35401Duv.LIZ() && ((Boolean) C35401Duv.LIZJ.getValue()).booleanValue() && (((Number) C35397Dur.LIZ.getValue()).intValue() & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
