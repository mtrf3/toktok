package X;

/* renamed from: X.3AZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AZ extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C3AZ LJLIL = new C3AZ();

    public C3AZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key_save_2_device_tip_shown_");
        HG3.LJIIL();
        LIZ.append(HG3.LJLJL.LJFF().getCurUserId());
        return X1D.LIZIZ(LIZ);
    }
}
