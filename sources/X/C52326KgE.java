package X;

/* renamed from: X.KgE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52326KgE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52326KgE LJLIL = new C52326KgE();

    public C52326KgE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "opt_seek_bar_invalidate", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
