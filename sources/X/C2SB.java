package X;

/* renamed from: X.2SB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2SB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2SB LJLIL = new C2SB();

    public C2SB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Object LIZ;
        int i;
        try {
            FFL.LJIIIZ().getClass();
            LIZ = Integer.valueOf(FFL.LJIIJ(31744, 0, "ec_search_api_json_optimize", true));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Integer num = (Integer) LIZ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        return Boolean.valueOf(i == 1);
    }
}
