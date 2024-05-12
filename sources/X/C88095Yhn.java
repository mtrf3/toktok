package X;

/* renamed from: X.Yhn, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88095Yhn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88095Yhn LJLIL = new C88095Yhn();

    public C88095Yhn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C88087Yhf.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
