package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;

/* loaded from: classes9.dex */
public final class KOO {
    public static final KOO LIZ = new KOO();
    public static final List<String> LIZIZ = C47261Igj.LJJIJ(C774632g.LIZ());

    public static void LIZIZ() {
        C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
        ALE ale = new ALE();
        ale.LIZ = "photo_mode_spark_biz";
        ale.LJIIJ = 8;
        ale.LJIIJJI = 600;
        ale.LIZIZ(KOP.LJLIL);
        ale.LJIIL = KOQ.LJLIL;
        ale.LJIILIIL = LIZIZ;
        c60827Nu3.getClass();
        C60827Nu3.LJIIJJI(ale, Boolean.FALSE);
    }

    public static String LIZ(String str) {
        Object LIZ2;
        try {
            LIZ2 = UriProtector.getQueryParameter(UriProtector.parse(str), "url");
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        return (String) LIZ2;
    }
}
