package X;

/* renamed from: X.DMr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33757DMr extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33757DMr LJLIL = new C33757DMr();

    public C33757DMr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C33755DMp.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
