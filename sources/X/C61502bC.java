package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2bC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61502bC extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C61502bC LJLIL = new C61502bC();

    public C61502bC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String param) {
        o.LJIIIZ(param, "param");
        return Boolean.valueOf(o.LJ(param, "ec_search_pdp_guess_use_cache"));
    }
}
