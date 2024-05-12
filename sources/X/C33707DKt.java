package X;

/* renamed from: X.DKt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33707DKt extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33707DKt LJLIL = new C33707DKt();

    public C33707DKt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C33706DKs.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
