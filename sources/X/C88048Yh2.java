package X;

/* renamed from: X.Yh2, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88048Yh2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88048Yh2 LJLIL = new C88048Yh2();

    public C88048Yh2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C88045Ygz.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
