package X;

/* renamed from: X.DpB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35045DpB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35045DpB LJLIL = new C35045DpB();

    public C35045DpB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C35044DpA.LIZ.getValue()).intValue() & 1) <= 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
