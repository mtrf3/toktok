package X;

/* renamed from: X.8Vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212458Vl extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C212458Vl LJLIL = new C212458Vl();

    public C212458Vl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        try {
            System.out.println(C65352Pkq.LIZ(C16950lX.class));
            return Boolean.TRUE;
        } catch (ClassNotFoundException e) {
            C8V7 c8v7 = C214368bA.LIZIZ;
            if (c8v7 != null) {
                c8v7.LIZ(e, "Could not find AndInflater");
            }
            return Boolean.FALSE;
        }
    }
}