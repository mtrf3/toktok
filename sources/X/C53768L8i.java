package X;

/* renamed from: X.L8i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53768L8i extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C53768L8i LJLIL = new C53768L8i();

    public C53768L8i() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C53765L8f.LJIIL("NOTIFICATION") && C53765L8f.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
