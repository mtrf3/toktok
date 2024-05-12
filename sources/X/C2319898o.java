package X;

import kotlin.jvm.internal.o;

/* renamed from: X.98o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2319898o extends AbstractC65781Prl implements InterfaceC88472Yns<C2320198r, C76800UCe> {
    public static final C2319898o LJLIL = new C2319898o();

    public C2319898o() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C2320198r c2320198r) {
        String str;
        C2320198r state = c2320198r;
        o.LJIIIZ(state, "state");
        int i = C2320398t.LIZ[state.LJLJJI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = "click";
            }
        } else {
            str = "auto";
        }
        C26335AVf.LJIJJLI(str, "personal_homepage");
        return C76800UCe.LIZ;
    }
}
