package X;

/* renamed from: X.DNb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33767DNb extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33767DNb LJLIL = new C33767DNb();

    public C33767DNb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C33768DNc.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
