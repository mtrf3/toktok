package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jd7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49585Jd7 extends AbstractC65781Prl implements InterfaceC88471Ynr<C49587Jd9, C49584Jd6, C49587Jd9> {
    public static final C49585Jd7 LJLIL = new C49585Jd7();

    public C49585Jd7() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C49587Jd9 invoke(C49587Jd9 c49587Jd9, C49584Jd6 c49584Jd6) {
        int i;
        boolean z;
        C49587Jd9 lastState = c49587Jd9;
        C49584Jd6 action = c49584Jd6;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        String str = action.LJLIL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = action.LJLJI;
        if (str3 == null) {
            str3 = "";
        }
        Integer num = action.LJLJJI;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        int i2 = action.LJLILLLLZI;
        Boolean bool = action.LJLJJL;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{\"impr_id\":\"");
        String LJFF = JBR.LJFF(LIZ, action.LJLIL, "\"}", LIZ);
        String str4 = action.LJLJJLL;
        if (str4 != null) {
            str2 = str4;
        }
        return C49587Jd9.LIZ(lastState, str, i2, str3, i, z, LJFF, str2, false, 384);
    }
}
