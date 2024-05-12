package X;

import com.ss.android.ugc.aweme.user.UserStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes12.dex */
public final class RBZ<V> implements Callable {
    public static final RBZ<V> LJLIL = new RBZ<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (UserStore.LIZIZ) {
            Iterator it = ((ArrayList) UserStore.LJII()).iterator();
            while (it.hasNext()) {
                ((RB3) it.next()).LIZLLL();
            }
        }
        UserStore.LIZLLL.edit().putString("current_foreground_uid", UserStore.LIZLLL()).apply();
        return C76800UCe.LIZ;
    }
}
