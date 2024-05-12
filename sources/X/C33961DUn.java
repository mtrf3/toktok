package X;

/* renamed from: X.DUn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33961DUn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33961DUn LJLIL = new C33961DUn();

    public C33961DUn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33960DUm.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
