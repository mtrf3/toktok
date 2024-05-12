package X;

/* renamed from: X.IsZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47995IsZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C47995IsZ LJLIL = new C47995IsZ();

    public C47995IsZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "enable_lazy_init_mdl", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
