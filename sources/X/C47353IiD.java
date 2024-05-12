package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* renamed from: X.IiD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47353IiD extends AbstractRunnableC47386Iik {
    public final /* synthetic */ SimVideoUrlModel LJLIL;
    public final /* synthetic */ C26206AQg LJLILLLLZI;
    public final /* synthetic */ VideoPreloadManager LJLJI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLJI.LJIJJLI().addPreloadItem(this.LJLIL, this.LJLILLLLZI);
        return false;
    }

    public C47353IiD(VideoPreloadManager videoPreloadManager, SimVideoUrlModel simVideoUrlModel, C26206AQg c26206AQg) {
        this.LJLJI = videoPreloadManager;
        this.LJLIL = simVideoUrlModel;
        this.LJLILLLLZI = c26206AQg;
    }
}
