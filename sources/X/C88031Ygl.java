package X;

/* renamed from: X.Ygl, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88031Ygl extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88031Ygl LJLIL = new C88031Ygl();

    public C88031Ygl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88034Ygo.LIZ() & 1024) == 1024) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
