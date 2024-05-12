package X;

import com.ss.android.ugc.aweme.challenge.service.ChallengeServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.concurrent.Callable;

/* renamed from: X.OGd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC61615OGd implements Callable<Challenge> {
    public final String LJLIL;
    public final int LJLILLLLZI = 0;
    public final boolean LJLJI = false;

    @Override // java.util.concurrent.Callable
    public final Challenge call() {
        try {
            return ChallengeServiceImpl.LJFF().LIZIZ(this.LJLILLLLZI, this.LJLIL, this.LJLJI);
        } catch (Throwable unused) {
            return null;
        }
    }

    public CallableC61615OGd(String str) {
        this.LJLIL = str;
    }
}
