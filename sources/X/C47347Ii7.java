package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ii7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47347Ii7 extends AbstractRunnableC47386Iik {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ SimVideoUrlModel LJLILLLLZI;
    public final /* synthetic */ AbstractC46738IVy LJLJI;
    public final /* synthetic */ C46729IVp LJLJJI;
    public final /* synthetic */ List LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ List LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ VideoPreloadManager LJLJLLL;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        List list;
        List list2;
        this.LJLJLLL.checkInit();
        boolean preload = this.LJLJLLL.LJIJJLI().preload(this.LJLILLLLZI, Math.max(this.LJLIL, 0), this.LJLJI, this.LJLJJI);
        boolean preloadSub = this.LJLJLLL.LJIJJLI().preloadSub(this.LJLJJL, this.LJLJJLL);
        boolean preloadAudio = this.LJLJLLL.LJIJJLI().preloadAudio(this.LJLJL, this.LJLJLJ);
        if (preload) {
            this.LJLJLLL.LJ.put(this.LJLILLLLZI.getUri(), 0L);
        }
        if (preloadSub && (list2 = this.LJLJJL) != null && !list2.isEmpty()) {
            Iterator it = this.LJLJJL.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (preloadAudio && (list = this.LJLJL) != null && !list.isEmpty()) {
            Iterator it2 = this.LJLJL.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (!preload && !preloadSub && !preloadAudio) {
            return false;
        }
        return true;
    }

    public C47347Ii7(VideoPreloadManager videoPreloadManager, int i, SimVideoUrlModel simVideoUrlModel, C46737IVx c46737IVx, C46729IVp c46729IVp, List list, int i2, List list2, int i3) {
        this.LJLJLLL = videoPreloadManager;
        this.LJLIL = i;
        this.LJLILLLLZI = simVideoUrlModel;
        this.LJLJI = c46737IVx;
        this.LJLJJI = c46729IVp;
        this.LJLJJL = list;
        this.LJLJJLL = i2;
        this.LJLJL = list2;
        this.LJLJLJ = i3;
    }
}
