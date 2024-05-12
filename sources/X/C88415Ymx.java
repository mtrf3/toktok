package X;

/* renamed from: X.Ymx, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88415Ymx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88415Ymx LJLIL = new C88415Ymx();

    public C88415Ymx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88408Ymq.LIZ() & 64) == 64 && C88408Ymq.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
