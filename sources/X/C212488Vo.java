package X;

/* renamed from: X.8Vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212488Vo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C212488Vo LJLIL = new C212488Vo();

    public C212488Vo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        try {
            System.out.println(C65352Pkq.LIZ(C15Y.class));
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
