package X;

import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import java.util.TimerTask;

/* renamed from: X.NOn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59285NOn extends TimerTask {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        String str;
        try {
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI != null) {
                str = LJJI.LJIIL("feed");
            } else {
                str = null;
            }
            String LIZJ = O3U.LIZJ(str, this.LJLILLLLZI);
            this.LJLIL++;
            if (C78983UzD.LJJJJ(LIZJ)) {
                AdLandPagePreloadServiceImpl.LJJI().LJIL(LIZJ);
                cancel();
            }
            if (this.LJLIL >= 5) {
                cancel();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public C59285NOn(String str) {
        this.LJLILLLLZI = str;
    }
}
