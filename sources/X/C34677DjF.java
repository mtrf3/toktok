package X;

/* renamed from: X.DjF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34677DjF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34677DjF LJLIL = new C34677DjF();

    public C34677DjF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34676DjE.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
