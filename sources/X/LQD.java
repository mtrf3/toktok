package X;

import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class LQD<V> implements Callable {
    public static final LQD<V> LJLIL = new LQD<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C73353Sqb.LJI().LJIIJ();
        LiveOuterService.LJJJLL().LJJIZ().LJJIJIIJIL();
        if (Live.getLiteService() == null) {
            return null;
        }
        Live.getLiteService().e9();
        return null;
    }
}
