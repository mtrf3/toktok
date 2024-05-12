package X;

/* renamed from: X.Yms, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88410Yms extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88410Yms LJLIL = new C88410Yms();

    public C88410Yms() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88408Ymq.LIZ() & 2) == 2 && C88408Ymq.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
