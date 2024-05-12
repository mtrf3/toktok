package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerV2;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* renamed from: X.IiB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47351IiB extends AbstractRunnableC47385Iij {
    public final /* synthetic */ SimVideoUrlModel LJLIL;
    public final /* synthetic */ VideoPreloadManagerV2 LJLILLLLZI;

    @Override // X.AbstractRunnableC47385Iij
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

    public C47351IiB(VideoPreloadManagerV2 videoPreloadManagerV2, SimVideoUrlModel simVideoUrlModel) {
        this.LJLILLLLZI = videoPreloadManagerV2;
        this.LJLIL = simVideoUrlModel;
    }
}
