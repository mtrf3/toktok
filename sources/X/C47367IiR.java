package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;

/* renamed from: X.IiR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47367IiR extends AbstractRunnableC47386Iik {
    public final /* synthetic */ VideoPreloadManager LJLIL;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLIL.LJIJJLI().clearCache();
        return false;
    }

    public C47367IiR(VideoPreloadManager videoPreloadManager) {
        this.LJLIL = videoPreloadManager;
    }
}
