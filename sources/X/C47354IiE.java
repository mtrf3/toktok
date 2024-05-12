package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* renamed from: X.IiE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47354IiE extends AbstractRunnableC47386Iik {
    public final /* synthetic */ SimVideoUrlModel LJLIL;
    public final /* synthetic */ VideoPreloadManager LJLILLLLZI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLILLLLZI.LJIJJLI().cancelPreload(this.LJLIL);
        return false;
    }

    public C47354IiE(VideoPreloadManager videoPreloadManager, SimVideoUrlModel simVideoUrlModel) {
        this.LJLILLLLZI = videoPreloadManager;
        this.LJLIL = simVideoUrlModel;
    }
}
