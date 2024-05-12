package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2bB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61492bB extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C61492bB LJLIL = new C61492bB();

    public C61492bB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String param) {
        o.LJIIIZ(param, "param");
        return Boolean.valueOf(o.LJ(param, "ec_search_pdp_guess_use_cache"));
    }
}
