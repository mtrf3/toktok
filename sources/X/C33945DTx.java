package X;

/* renamed from: X.DTx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33945DTx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33945DTx LJLIL = new C33945DTx();

    public C33945DTx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33944DTw.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
