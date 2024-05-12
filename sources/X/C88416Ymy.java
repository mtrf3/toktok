package X;

/* renamed from: X.Ymy, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88416Ymy extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88416Ymy LJLIL = new C88416Ymy();

    public C88416Ymy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88408Ymq.LIZ() & 128) == 128 && C88408Ymq.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
