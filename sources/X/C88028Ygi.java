package X;

/* renamed from: X.Ygi, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88028Ygi extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88028Ygi LJLIL = new C88028Ygi();

    public C88028Ygi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88024Yge.LIZ() & 256) == 256) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}