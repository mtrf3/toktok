package X;

/* renamed from: X.Dis, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34654Dis extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34654Dis LJLIL = new C34654Dis();

    public C34654Dis() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C34652Diq.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
