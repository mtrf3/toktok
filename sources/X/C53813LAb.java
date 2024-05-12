package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.LAb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53813LAb {
    public static String LIZIZ = ((RBX) HG3.LJIILL()).getCurUserId();
    public static C53813LAb LIZJ;
    public final Keva LIZ;

    public C53813LAb() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("social_relation");
        LIZ.append(LIZIZ);
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(PREFIX_FEAT_NAME + uid)");
        this.LIZ = repo;
    }

    public final void LIZ(int i, int i2) {
        this.LIZ.storeBoolean(KMP.LJ("go_through_social_recommend_flow", i), true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("go_through_social_recommend_flow");
        LIZ.append(i);
        LIZ.append(i2);
        this.LIZ.storeBoolean(X1D.LIZIZ(LIZ), true);
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZ.storeLong(KMP.LJ("go_through_time_ms", i), currentTimeMillis);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("go_through_time_ms");
        LIZ2.append(i);
        LIZ2.append(i2);
        this.LIZ.storeLong(X1D.LIZIZ(LIZ2), currentTimeMillis);
    }
}
