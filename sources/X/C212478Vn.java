package X;

/* renamed from: X.8Vn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212478Vn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C212478Vn LJLIL = new C212478Vn();

    public C212478Vn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        try {
            System.out.print(C65352Pkq.LIZ(C15Y.class));
            return Boolean.TRUE;
        } catch (ClassNotFoundException e) {
            C8V7 c8v7 = C214368bA.LIZIZ;
            if (c8v7 != null) {
                c8v7.LIZ(e, "Could not find AsyncLayoutInflater");
            }
            return Boolean.FALSE;
        }
    }
}
