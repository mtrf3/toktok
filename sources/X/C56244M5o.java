package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.M5o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56244M5o extends AbstractC65781Prl implements InterfaceC88472Yns<M63, C76800UCe> {
    public static final C56244M5o LJLIL = new C56244M5o();

    public C56244M5o() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(M63 m63) {
        C56249M5t c56249M5t;
        Integer num;
        M63 res = m63;
        o.LJIIIZ(res, "res");
        String str = res.LJLIL;
        C56237M5h c56237M5h = C56246M5q.LIZ;
        if (c56237M5h != null && (num = (Integer) ((HashMap) c56237M5h.LIZ).get(str)) != null) {
            ((C56249M5t) c56237M5h.LIZIZ).LIZIZ = num.intValue();
        }
        C56237M5h c56237M5h2 = C56246M5q.LIZ;
        if (c56237M5h2 != null && (c56249M5t = (C56249M5t) c56237M5h2.LIZIZ) != null) {
            M5X m5x = C56246M5q.LJ;
            o.LJI(m5x);
            c56249M5t.LIZIZ(m5x, c56249M5t);
        }
        return C76800UCe.LIZ;
    }
}
