package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Dci, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34272Dci {
    public static final Keva LIZ;

    static {
        Keva repoSync = KevaImpl.getRepoSync("repo_player_kv", 0);
        o.LJIIIIZZ(repoSync, "getRepoSync(REPO_NAME, K…ants.MODE_SINGLE_PROCESS)");
        LIZ = repoSync;
    }
}
