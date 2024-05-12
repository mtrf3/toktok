package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.96E, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C96E {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        Keva repo = Keva.getRepo("trending_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO)");
        if (repo.getInt("ever_next", -1) == 1) {
            return true;
        }
        return false;
    }
}
