package X;

/* renamed from: X.Dhp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34589Dhp extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34589Dhp LJLIL = new C34589Dhp();

    public C34589Dhp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34588Dho.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
