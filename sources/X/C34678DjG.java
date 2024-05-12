package X;

/* renamed from: X.DjG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34678DjG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34678DjG LJLIL = new C34678DjG();

    public C34678DjG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C34676DjE.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
