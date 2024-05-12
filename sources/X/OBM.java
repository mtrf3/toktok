package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OBM {
    public static final HashSet<String> LIZ = new HashSet<>();
    public static final ONJ LIZIZ = new ONJ("NeedShowSurvey");

    public static final boolean LIZ(Aweme aweme, String str) {
        boolean z;
        boolean LJIJJ;
        boolean z2;
        boolean LJIJJ2;
        boolean z3 = false;
        if (aweme == null) {
            return false;
        }
        if (aweme.isAd()) {
            try {
                if (C59050NFm.LIZIZ.LJIIIIZZ(aweme)) {
                    return true;
                }
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        if (!o.LJ(str, "homepage_hot") || ((Number) C52421Khl.LIZ.getValue()).intValue() != 1 || aweme.getIsSubAweme() || ONM.LJI(aweme) || C54838Lfe.LJJI(aweme) || !C224888s8.LJFF(false)) {
            return false;
        }
        int i = OMK.LIZ[C79081V1x.LJIILLIIL(aweme).ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return true;
            }
            boolean z4 = !OMU.LIZ.isEmpty();
            if (!C61776OMi.LIZJ(aweme, true)) {
                if (!C55016LiW.LIZ().LIZJ(OBQ.BACKGROUND.getType(), aweme.getAid())) {
                    z2 = false;
                    LJIJJ2 = C79081V1x.LJIJJ(aweme);
                    ONJ onj = LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("isBackground:");
                    LIZ2.append(LJIJJ2);
                    LIZ2.append(", needShow:");
                    LIZ2.append(z2);
                    onj.LJII(aweme, X1D.LIZIZ(LIZ2));
                    if (LJIJJ2 && z4 && z2) {
                        z3 = true;
                    }
                }
            }
            z2 = true;
            LJIJJ2 = C79081V1x.LJIJJ(aweme);
            ONJ onj2 = LIZIZ;
            StringBuilder LIZ22 = X1D.LIZ();
            LIZ22.append("isBackground:");
            LIZ22.append(LJIJJ2);
            LIZ22.append(", needShow:");
            LIZ22.append(z2);
            onj2.LJII(aweme, X1D.LIZIZ(LIZ22));
            if (LJIJJ2) {
                z3 = true;
            }
        } else {
            HashSet<String> hashSet = LIZ;
            if (-1 > hashSet.size()) {
                hashSet.add(aweme.getAid());
            }
            boolean LIZLLL = C61780OMm.LIZLLL();
            if (!C61780OMm.LJ(aweme, false)) {
                if (!C55016LiW.LIZ().LIZJ(OBQ.BACKGROUND.getType(), aweme.getAid())) {
                    z = false;
                    LJIJJ = C79081V1x.LJIJJ(aweme);
                    ONJ onj3 = LIZIZ;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("isBackground:");
                    LIZ3.append(LJIJJ);
                    LIZ3.append(", needShow:");
                    LIZ3.append(z);
                    onj3.LJII(aweme, X1D.LIZIZ(LIZ3));
                    if (LJIJJ && LIZLLL && z) {
                        z3 = true;
                        hashSet.clear();
                    }
                }
            }
            z = true;
            LJIJJ = C79081V1x.LJIJJ(aweme);
            ONJ onj32 = LIZIZ;
            StringBuilder LIZ32 = X1D.LIZ();
            LIZ32.append("isBackground:");
            LIZ32.append(LJIJJ);
            LIZ32.append(", needShow:");
            LIZ32.append(z);
            onj32.LJII(aweme, X1D.LIZIZ(LIZ32));
            if (LJIJJ) {
                z3 = true;
                hashSet.clear();
            }
        }
        return z3;
    }
}
