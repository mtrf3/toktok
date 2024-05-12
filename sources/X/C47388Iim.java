package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerV2;
import java.util.List;

/* renamed from: X.Iim, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47388Iim extends AbstractRunnableC47385Iij {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ int LJLILLLLZI = Integer.MAX_VALUE;
    public final /* synthetic */ VideoPreloadManagerV2 LJLJI;

    @Override // X.AbstractRunnableC47385Iij
    public final boolean LIZ() {
        return this.LJLJI.LJIJJ().preloadSub(this.LJLIL, this.LJLILLLLZI);
    }

    public C47388Iim(VideoPreloadManagerV2 videoPreloadManagerV2, List list) {
        this.LJLJI = videoPreloadManagerV2;
        this.LJLIL = list;
    }
}
