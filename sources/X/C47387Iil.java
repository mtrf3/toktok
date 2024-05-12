package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import java.util.List;

/* renamed from: X.Iil, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47387Iil extends AbstractRunnableC47386Iik {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ int LJLILLLLZI = Integer.MAX_VALUE;
    public final /* synthetic */ VideoPreloadManager LJLJI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        return this.LJLJI.LJIJJLI().preloadSub(this.LJLIL, this.LJLILLLLZI);
    }

    public C47387Iil(VideoPreloadManager videoPreloadManager, List list) {
        this.LJLJI = videoPreloadManager;
        this.LJLIL = list;
    }
}
