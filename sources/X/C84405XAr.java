package X;

import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XAr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84405XAr {
    public static final C46141rW<String> LIZ = new C46141rW<>(true);

    public static void LIZIZ(Effect effect) {
        o.LJIIJ(effect, "effect");
        C46141rW<String> c46141rW = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(effect.getUnzipPath());
        LIZ2.append("_trans_");
        c46141rW.remove(X1D.LIZIZ(LIZ2));
    }

    public static void LIZ(Effect effect, String parentDir) {
        o.LJIIJ(parentDir, "parentDir");
        o.LJIIJ(effect, "effect");
        List<C32621Pu> LJIILJJIL = C10820be.LJIILJJIL(parentDir);
        if (LJIILJJIL != null) {
            for (C32621Pu c32621Pu : LJIILJJIL) {
                String str = c32621Pu.LJLIL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(effect.getId());
                LIZ2.append("_trans_");
                if (ujb.o.LJJJLIIL(str, X1D.LIZIZ(LIZ2), false)) {
                    C10820be.LJIILLIIL(c32621Pu.LJLILLLLZI);
                }
            }
        }
        LIZIZ(effect);
    }
}
