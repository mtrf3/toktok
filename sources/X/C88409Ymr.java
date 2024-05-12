package X;

/* renamed from: X.Ymr, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88409Ymr extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88409Ymr LJLIL = new C88409Ymr();

    public C88409Ymr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C88408Ymq.LIZ() & 1) != 1 || !C88408Ymq.LIZ) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
