package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import java.util.concurrent.Callable;

/* renamed from: X.J7z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC48663J7z<V> implements Callable {
    public final /* synthetic */ String LJLIL;

    public CallableC48663J7z(String str) {
        this.LJLIL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.LJLIL;
        synchronized (C48247Iwd.LJ) {
            Aweme LIZJ = C48247Iwd.LIZJ(str);
            if (LIZJ != null) {
                C48247Iwd.LIZLLL = LIZJ;
                CommonFeedServiceImpl.LJJIJLIJ().LJI(LIZJ);
            }
        }
        return C76800UCe.LIZ;
    }
}
