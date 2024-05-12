package X;

/* renamed from: X.Daa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34140Daa extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34140Daa LJLIL = new C34140Daa();

    public C34140Daa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C34135DaV.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
