package X;

/* renamed from: X.7CD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CD extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7CD LJLIL = new C7CD();

    public C7CD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C7CN.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
