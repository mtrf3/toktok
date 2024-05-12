package X;

/* renamed from: X.DKp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33703DKp extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33703DKp LJLIL = new C33703DKp();

    public C33703DKp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33700DKm.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
