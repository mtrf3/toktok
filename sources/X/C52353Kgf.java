package X;

/* renamed from: X.Kgf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52353Kgf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52353Kgf LJLIL = new C52353Kgf();

    public C52353Kgf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "tablet_long_term_ab_auto_volume_adjustment", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
