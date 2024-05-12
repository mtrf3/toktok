package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;

/* renamed from: X.Iia, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47376Iia extends AbstractRunnableC47386Iik {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ VideoPreloadManager LJLILLLLZI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLILLLLZI.LJIJJLI().tryToClearAndGetCachesByUsedTime(this.LJLIL, true);
        return false;
    }

    public C47376Iia(VideoPreloadManager videoPreloadManager, long j) {
        this.LJLILLLLZI = videoPreloadManager;
        this.LJLIL = j;
    }
}
