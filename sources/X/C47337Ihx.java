package X;

import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Ihx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47337Ihx extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ DVideoPreloadManager LJLILLLLZI;
    public final /* synthetic */ SimVideoUrlModel LJLJI;
    public final /* synthetic */ AbstractC46738IVy LJLJJI;
    public final /* synthetic */ C46729IVp LJLJJL;
    public final /* synthetic */ List<SimVideoUrlModel> LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ List<SimVideoUrlModel> LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47337Ihx(int i, DVideoPreloadManager dVideoPreloadManager, SimVideoUrlModel simVideoUrlModel, C46737IVx c46737IVx, C46729IVp c46729IVp, List list, int i2, List list2, int i3) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = dVideoPreloadManager;
        this.LJLJI = simVideoUrlModel;
        this.LJLJJI = c46737IVx;
        this.LJLJJL = c46729IVp;
        this.LJLJJLL = list;
        this.LJLJL = i2;
        this.LJLJLJ = list2;
        this.LJLJLLL = i3;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        List<SimVideoUrlModel> list;
        List<SimVideoUrlModel> list2;
        String uri;
        if (this.LJLILLLLZI.LIZLLL.preload(this.LJLJI, Math.max(this.LJLIL, 0), this.LJLJJI, this.LJLJJL)) {
            ConcurrentHashMap<String, Long> concurrentHashMap = this.LJLILLLLZI.LJFF;
            SimVideoUrlModel simVideoUrlModel = this.LJLJI;
            if (simVideoUrlModel == null || (uri = simVideoUrlModel.getUri()) == null) {
                uri = "";
            }
            concurrentHashMap.put(uri, 0L);
        }
        if (this.LJLILLLLZI.LIZLLL.preloadSub(this.LJLJJLL, this.LJLJL) && (list2 = this.LJLJJLL) != null && !list2.isEmpty()) {
            Iterator<SimVideoUrlModel> it = this.LJLJJLL.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (this.LJLILLLLZI.LIZLLL.preloadAudio(this.LJLJLJ, this.LJLJLLL) && (list = this.LJLJLJ) != null && !list.isEmpty()) {
            Iterator<SimVideoUrlModel> it2 = this.LJLJLJ.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        return C76800UCe.LIZ;
    }
}
