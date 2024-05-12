package X;

/* renamed from: X.7CE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7CE LJLIL = new C7CE();

    public C7CE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C7CT.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
