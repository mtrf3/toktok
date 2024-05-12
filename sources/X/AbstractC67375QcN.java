package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;

/* renamed from: X.QcN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67375QcN {
    public abstract java.util.Map<String, String> LIZIZ();

    public abstract Integer LIZJ();

    public abstract C67366QcE LIZLLL();

    public abstract long LJ();

    public abstract String LJI();

    public abstract long LJII();

    public final C67362QcA LJIIIIZZ() {
        C67362QcA c67362QcA = new C67362QcA();
        c67362QcA.LIZLLL(LJI());
        c67362QcA.LIZIZ = LIZJ();
        c67362QcA.LIZJ(LIZLLL());
        c67362QcA.LIZLLL = Long.valueOf(LJ());
        c67362QcA.LJ = Long.valueOf(LJII());
        c67362QcA.LJFF = new HashMap(LIZIZ());
        return c67362QcA;
    }

    public final String LIZ(String str) {
        String str2 = LIZIZ().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int LJFF(String str) {
        String str2 = LIZIZ().get(str);
        if (str2 == null) {
            return 0;
        }
        return CastIntegerProtector.valueOf(str2).intValue();
    }
}
