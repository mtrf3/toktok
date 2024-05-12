package X;

/* renamed from: X.92j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2303792j extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2303792j LJLIL = new C2303792j();

    public C2303792j() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        int intValue = ((Number) C2303892k.LIZ.getValue()).intValue();
        boolean z = true;
        if (1 > intValue || intValue >= 100) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
