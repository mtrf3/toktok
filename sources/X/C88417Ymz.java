package X;

/* renamed from: X.Ymz, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88417Ymz extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88417Ymz LJLIL = new C88417Ymz();

    public C88417Ymz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88408Ymq.LIZ() & 256) == 256 && C88408Ymq.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
