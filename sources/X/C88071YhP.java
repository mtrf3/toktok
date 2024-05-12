package X;

/* renamed from: X.YhP, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88071YhP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88071YhP LJLIL = new C88071YhP();

    public C88071YhP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C88074YhS.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
