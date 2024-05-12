package X;

import com.google.gson.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class FHL {
    public static long LIZ;
    public static C38726FHu LIZIZ;
    public static final o LIZJ;
    public static final List<FIB> LIZLLL;

    static {
        C73849Syb c73849Syb = new C73849Syb();
        LIZJ = new o();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        LIZLLL = new ArrayList();
        try {
            c73849Syb.LJJIFFI(C38721FHp.LJLIL).LJJIJL(FHU.LJLIL).LJIIJJI(5000L, TimeUnit.MILLISECONDS).LJJIJL(FHV.LJLIL).LJJJ(T16.LIZ()).LJJL(T16.LIZ()).LIZ(new FHF());
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ConfigSyncRequestManager init error : ");
            LIZ2.append(th);
            X1D.LIZIZ(LIZ2);
        }
    }
}
