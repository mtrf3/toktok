package Y;

import X.AbstractC36908Ee8;
import X.LLQ;
import X.LLR;
import com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes10.dex */
public class ACallableS7S1000000_9 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS7S1000000_9 aCallableS7S1000000_9) {
        try {
            return FollowRequestApiManager.LIZ.rejectRequest(aCallableS7S1000000_9.s0).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static final Object call$1(ACallableS7S1000000_9 aCallableS7S1000000_9) {
        LLQ llq = LLR.LJIIJ;
        if (llq != null) {
            llq.LJIILL(aCallableS7S1000000_9.s0);
        }
        return Boolean.valueOf(((ArrayList) LLR.LIZLLL).remove(aCallableS7S1000000_9.s0));
    }

    public static final Object call$2(ACallableS7S1000000_9 aCallableS7S1000000_9) {
        LLQ llq = LLR.LJIIJ;
        if (llq != null) {
            llq.LJJIJIIJIL(aCallableS7S1000000_9.s0);
        }
        return Boolean.valueOf(((ArrayList) LLR.LIZLLL).add(aCallableS7S1000000_9.s0));
    }

    public ACallableS7S1000000_9(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
