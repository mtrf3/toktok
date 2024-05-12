package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* renamed from: X.IiA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47350IiA extends AbstractRunnableC47386Iik {
    public final /* synthetic */ SimVideoUrlModel LJLIL;
    public final /* synthetic */ VideoPreloadManager LJLILLLLZI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        if (this.LJLILLLLZI.LJ.get(this.LJLIL.getUri()) != null) {
            this.LJLILLLLZI.getClass();
            C46982IcE.LJI().monitorStatusRate("aweme_media_play_stastics_log", 0, null);
        } else {
            this.LJLILLLLZI.getClass();
            C46982IcE.LJI().monitorStatusRate("aweme_media_play_stastics_log", 1, null);
        }
        return false;
    }

    public C47350IiA(VideoPreloadManager videoPreloadManager, SimVideoUrlModel simVideoUrlModel) {
        this.LJLILLLLZI = videoPreloadManager;
        this.LJLIL = simVideoUrlModel;
    }
}
