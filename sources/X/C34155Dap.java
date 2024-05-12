package X;

/* renamed from: X.Dap, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34155Dap extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34155Dap LJLIL = new C34155Dap();

    public C34155Dap() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C34158Das.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
