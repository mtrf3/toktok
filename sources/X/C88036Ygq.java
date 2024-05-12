package X;

/* renamed from: X.Ygq, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88036Ygq extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88036Ygq LJLIL = new C88036Ygq();

    public C88036Ygq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88034Ygo.LIZ() & 512) == 512) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
