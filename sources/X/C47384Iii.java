package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerV2;

/* renamed from: X.Iii, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47384Iii extends AbstractRunnableC47385Iij {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ VideoPreloadManagerV2 LJLILLLLZI;

    @Override // X.AbstractRunnableC47385Iij
    public final boolean LIZ() {
        this.LJLILLLLZI.LJIJJ().tryToClearAndGetCachesByUsedTime(this.LJLIL, true);
        return false;
    }

    public C47384Iii(VideoPreloadManagerV2 videoPreloadManagerV2, long j) {
        this.LJLILLLLZI = videoPreloadManagerV2;
        this.LJLIL = j;
    }
}
