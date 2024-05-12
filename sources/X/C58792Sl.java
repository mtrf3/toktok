package X;

/* renamed from: X.2Sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58792Sl extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58792Sl LJLIL = new C58792Sl();

    public C58792Sl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Object LIZ;
        int i;
        boolean z = true;
        try {
            FFL.LJIIIZ().getClass();
            LIZ = Integer.valueOf(FFL.LJIIJ(31744, 0, "ec_search_result_tab_page_animation", true));
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
        if (i != 1 && i != 3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
