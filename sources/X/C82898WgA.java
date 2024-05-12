package X;

/* renamed from: X.WgA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82898WgA extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C82898WgA LJLIL = new C82898WgA();

    public C82898WgA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Boolean LJI;
        InterfaceC82904WgG interfaceC82904WgG = C82891Wg3.LJII;
        if (interfaceC82904WgG != null && (LJI = interfaceC82904WgG.LJI()) != null) {
            z = LJI.booleanValue();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
