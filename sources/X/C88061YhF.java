package X;

/* renamed from: X.YhF, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88061YhF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88061YhF LJLIL = new C88061YhF();

    public C88061YhF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C88063YhH.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
