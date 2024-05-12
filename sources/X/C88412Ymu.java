package X;

/* renamed from: X.Ymu, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88412Ymu extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88412Ymu LJLIL = new C88412Ymu();

    public C88412Ymu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88408Ymq.LIZ() & 8) == 8 && C88408Ymq.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
