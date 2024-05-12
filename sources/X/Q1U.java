package X;

import com.google.gson.m;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class Q1U extends AbstractC65781Prl implements InterfaceC65784Pro<C3C5<? extends C76800UCe>> {
    public static final Q1U LJLIL = new Q1U();

    public Q1U() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final C3C5<? extends C76800UCe> invoke() {
        C3C5<? extends C76800UCe> c3c5;
        String LIZIZ;
        String jVar;
        try {
            for (Map.Entry entry : ((LinkedHashMap) Q1T.LIZ).entrySet()) {
                m mVar = ((Q1R) entry.getValue()).LJFF;
                if (mVar == null || (jVar = mVar.toString()) == null || jVar.length() == 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(Q1T.LJFF.LJIILL(((Q1R) entry.getValue()).LIZ));
                    LIZ.append(((Q1R) entry.getValue()).LJ);
                    LIZIZ = X1D.LIZIZ(LIZ);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(Q1T.LJFF.LJIILL(((Q1R) entry.getValue()).LIZ));
                    LIZ2.append(((Q1R) entry.getValue()).LJ);
                    LIZ2.append(((Q1R) entry.getValue()).LJFF);
                    LIZIZ = X1D.LIZIZ(LIZ2);
                }
                Q1I.LIZIZ((String) entry.getKey(), LIZIZ);
            }
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            c3c5 = c76800UCe;
        } catch (Throwable th) {
            C3C4 LIZ3 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ3);
            c3c5 = LIZ3;
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(c3c5);
        if (m10exceptionOrNullimpl != null) {
            Q1V.LIZ(Q1T.LJI, m10exceptionOrNullimpl, 313, m10exceptionOrNullimpl.getLocalizedMessage());
        }
        return c3c5;
    }
}
