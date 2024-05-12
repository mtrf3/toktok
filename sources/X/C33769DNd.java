package X;

/* renamed from: X.DNd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33769DNd extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33769DNd LJLIL = new C33769DNd();

    public C33769DNd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33768DNc.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
