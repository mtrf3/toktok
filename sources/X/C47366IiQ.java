package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;

/* renamed from: X.IiQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47366IiQ extends AbstractRunnableC47386Iik {
    public final /* synthetic */ VideoPreloadManager LJLIL;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLIL.LJIJJLI().cancelAll();
        return false;
    }

    public C47366IiQ(VideoPreloadManager videoPreloadManager) {
        this.LJLIL = videoPreloadManager;
    }
}
