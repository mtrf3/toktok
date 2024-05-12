package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jvu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50750Jvu extends AbstractC65781Prl implements InterfaceC88471Ynr<C50751Jvv, C50678Juk, C50751Jvv> {
    public static final C50750Jvu LJLIL = new C50750Jvu();

    public C50750Jvu() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50751Jvv invoke(C50751Jvv c50751Jvv, C50678Juk c50678Juk) {
        C50751Jvv state = c50751Jvv;
        C50678Juk action = c50678Juk;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        String str = action.LIZ;
        long j = state.LJLILLLLZI;
        if (j != 0) {
            C50749Jvt c50749Jvt = C50749Jvt.LIZJ;
            long j2 = state.LJLJI;
            long currentTimeMillis = System.currentTimeMillis();
            if (str == null) {
                str = "";
            }
            C50751Jvv L = C50751Jvv.L(state, false, j, j2, currentTimeMillis, str, 1);
            c50749Jvt.getClass();
            C50758Jw2 c50758Jw2 = new C50758Jw2();
            c50758Jw2.LJIIZILJ("start_time", String.valueOf(L.LJLILLLLZI));
            c50758Jw2.LJIIZILJ("refresh_blankpage_time", String.valueOf(L.LJLJI));
            c50758Jw2.LJIIZILJ("end_blankpage_time", String.valueOf(L.LJLJJI));
            c50758Jw2.LJIIZILJ("refresh_blankpage_cost", String.valueOf(L.LJLJI - L.LJLILLLLZI));
            c50758Jw2.LJIIZILJ("decision_blankpage_cost", String.valueOf(L.LJLJJI - L.LJLJI));
            c50758Jw2.LJIIZILJ("end_blankpage_cost", String.valueOf(L.LJLJJI - L.LJLILLLLZI));
            c50758Jw2.LJIIZILJ("end_blankpage_method", L.LJLJJL);
            c50758Jw2.LJIILIIL();
            C50717JvN.LJFF.getClass();
            return new C50751Jvv(0);
        }
        return state;
    }
}
