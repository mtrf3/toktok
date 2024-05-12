package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C1H implements CGK {
    public static final C1H LIZ = new C1H();
    public static CG5 LIZIZ;

    @Override // X.CGK
    public final void LIZ(CG4 collector) {
        o.LJIIIZ(collector, "collector");
    }

    @Override // X.CGK
    public final void LIZLLL(CG4 collector) {
        o.LJIIIZ(collector, "collector");
    }

    public static String LJ() {
        CG5 cg5 = LIZIZ;
        if (cg5 != null) {
            Object[] objArr = new Object[1];
            if (cg5.LIZIZ == 0.0f) {
                cg5.LIZ();
            }
            objArr[0] = Float.valueOf(cg5.LIZIZ);
            return Q8U.LIZIZ(objArr, 1, "%.2f", "format(format, *args)");
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.CGK
    public final void LIZIZ(CG4 collector) {
        o.LJIIIZ(collector, "collector");
        collector.LIZLLL(this);
        LIZIZ = null;
    }

    @Override // X.CGK
    public final void LIZJ(CGA cga) {
        CG5 cg5 = LIZIZ;
        if (cg5 != null) {
            cg5.LIZ();
        }
    }
}
