package X;

/* renamed from: X.6gL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166616gL extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C166616gL LJLIL = new C166616gL();

    public C166616gL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 20;
        int LIZ = C00F.LIZ(31744, 20, "vc_request_limit_size", true);
        if (LIZ > 0) {
            i = LIZ;
        }
        return Integer.valueOf(i);
    }
}
