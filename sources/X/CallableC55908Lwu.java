package X;

import com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.Lwu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC55908Lwu<V> implements Callable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI = 1;
    public final /* synthetic */ int LJLJI;

    public CallableC55908Lwu(long j, int i) {
        this.LJLIL = j;
        this.LJLJI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return FollowRequestApiManager.LIZ(this.LJLJI, this.LJLIL, this.LJLILLLLZI);
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }
}
