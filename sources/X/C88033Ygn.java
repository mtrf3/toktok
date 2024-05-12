package X;

/* renamed from: X.Ygn, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88033Ygn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88033Ygn LJLIL = new C88033Ygn();

    public C88033Ygn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C88034Ygo.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
