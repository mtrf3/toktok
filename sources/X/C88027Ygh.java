package X;

/* renamed from: X.Ygh, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88027Ygh extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88027Ygh LJLIL = new C88027Ygh();

    public C88027Ygh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88024Yge.LIZ() & 512) == 512) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
