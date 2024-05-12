package X;

import com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: X.Lwt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC55907Lwt implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return FollowRequestApiManager.LIZ.approveRequest(this.LJLIL, this.LJLILLLLZI).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public CallableC55907Lwt(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}
