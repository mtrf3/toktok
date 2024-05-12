package X;

import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: X.LFl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC53953LFl<V> implements Callable {
    public static final CallableC53953LFl<V> LJLIL = new CallableC53953LFl<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (CommonFeedServiceImpl.LJJIJLIJ().LJJIJ() || CommonFeedServiceImpl.LJJIJLIJ().LJJIIZI()) {
            C54969Lhl.LIZIZ = (C73411SrX) AbstractC73672Svk.LJJIJIIJI(5L, TimeUnit.MINUTES).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJJZI(C53954LFm.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}
