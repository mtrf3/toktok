package X;

/* renamed from: X.DqM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35118DqM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35118DqM LJLIL = new C35118DqM();

    public C35118DqM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C35116DqK.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
