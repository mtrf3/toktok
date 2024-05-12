package X;

import Y.ARunnableS16S0000000_9;
import android.os.Handler;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* renamed from: X.LoQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55382LoQ extends LiveOuterService {
    public static C55382LoQ LJ;
    public boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.live.LiveOuterService, com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C55382LoQ LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.live.LiveOuterService
    public final void LJJL(boolean z) {
        if (this.LIZLLL) {
            return;
        }
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS16S0000000_9(4));
        if (Live.getLiteService() == null) {
            return;
        }
        this.LIZLLL = true;
    }
}
