package X;

/* renamed from: X.7CH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CH extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7CH LJLIL = new C7CH();

    public C7CH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C7CR.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
