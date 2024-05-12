package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.3LD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LD {
    public final Keva LIZ;

    public final boolean LIZ() {
        if (this.LIZ.getLong("TIMESTAMP", 0L) != 0) {
            return true;
        }
        return false;
    }

    public C3LD() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stranger_cell_perst_");
        LIZ.append((Object) C80763Ey.LIZ(false));
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME + AppUtil.getUid().toString())");
        this.LIZ = repo;
        if (repo.getBoolean("CLEAR_OLD_REPO", true)) {
            Keva.getRepo("stranger_cell_perst").clear();
            repo.storeBoolean("CLEAR_OLD_REPO", false);
        }
    }
}
