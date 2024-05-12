package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.KxG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53382KxG {
    public static String LIZIZ = ((RBX) HG3.LJIILL()).getCurUserId();
    public static C53382KxG LIZJ;
    public final Keva LIZ;

    public C53382KxG() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recommend_friends_in_dm");
        LIZ.append(LIZIZ);
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(PREFIX_FEAT_NAME + uid)");
        this.LIZ = repo;
    }
}
