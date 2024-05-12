package X;

/* renamed from: X.Duo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35394Duo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35394Duo LJLIL = new C35394Duo();

    public C35394Duo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C35393Dun.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
