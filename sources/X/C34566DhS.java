package X;

/* renamed from: X.DhS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34566DhS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34566DhS LJLIL = new C34566DhS();

    public C34566DhS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C34573DhZ.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
