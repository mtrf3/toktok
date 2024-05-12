package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerV2;

/* renamed from: X.Iic, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47378Iic extends AbstractRunnableC47385Iij {
    public final /* synthetic */ VideoPreloadManagerV2 LJLIL;

    @Override // X.AbstractRunnableC47385Iij
    public final boolean LIZ() {
        this.LJLIL.LJIJJ().clearCache();
        return false;
    }

    public C47378Iic(VideoPreloadManagerV2 videoPreloadManagerV2) {
        this.LJLIL = videoPreloadManagerV2;
    }
}
