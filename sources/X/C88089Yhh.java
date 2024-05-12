package X;

/* renamed from: X.Yhh, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88089Yhh extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88089Yhh LJLIL = new C88089Yhh();

    public C88089Yhh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88087Yhf.LIZ() & 512) == 512) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
