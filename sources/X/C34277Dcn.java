package X;

/* renamed from: X.Dcn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34277Dcn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34277Dcn LJLIL = new C34277Dcn();

    public C34277Dcn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Boolean) C34276Dcm.LJ.getValue()).booleanValue() || (C34276Dcm.LIZ() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
