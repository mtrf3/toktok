package X;

/* renamed from: X.YhW, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88078YhW extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88078YhW LJLIL = new C88078YhW();

    public C88078YhW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88074YhS.LIZ() & 512) == 512) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
