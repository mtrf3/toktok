package X;

/* renamed from: X.Ymt, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88411Ymt extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88411Ymt LJLIL = new C88411Ymt();

    public C88411Ymt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88408Ymq.LIZ() & 4) == 4 && C88408Ymq.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
