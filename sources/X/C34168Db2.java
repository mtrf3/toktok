package X;

/* renamed from: X.Db2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34168Db2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34168Db2 LJLIL = new C34168Db2();

    public C34168Db2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) C34169Db3.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
