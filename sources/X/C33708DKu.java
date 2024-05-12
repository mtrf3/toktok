package X;

/* renamed from: X.DKu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33708DKu extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33708DKu LJLIL = new C33708DKu();

    public C33708DKu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C33706DKs.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
