package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PMA {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final Keva LIZIZ;
    public static volatile C1FC LIZJ;

    static {
        Keva repo = Keva.getRepo("apm_event_cache_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZIZ = repo;
    }
}
