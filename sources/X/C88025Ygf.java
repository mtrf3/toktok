package X;

/* renamed from: X.Ygf, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88025Ygf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88025Ygf LJLIL = new C88025Ygf();

    public C88025Ygf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88024Yge.LIZ() & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
