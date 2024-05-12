package X;

/* renamed from: X.Dbf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34207Dbf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34207Dbf LJLIL = new C34207Dbf();

    public C34207Dbf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) C34206Dbe.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
