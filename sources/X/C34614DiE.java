package X;

/* renamed from: X.DiE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34614DiE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34614DiE LJLIL = new C34614DiE();

    public C34614DiE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34613DiD.LIZ() & 256) == 256) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
