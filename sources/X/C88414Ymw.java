package X;

/* renamed from: X.Ymw, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88414Ymw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88414Ymw LJLIL = new C88414Ymw();

    public C88414Ymw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88408Ymq.LIZ() & 32) == 32 && C88408Ymq.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
