package X;

/* renamed from: X.Ymv, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88413Ymv extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88413Ymv LJLIL = new C88413Ymv();

    public C88413Ymv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88408Ymq.LIZ() & 16) == 16 && C88408Ymq.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
