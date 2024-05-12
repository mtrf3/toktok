package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;

/* renamed from: X.IiY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47374IiY extends AbstractRunnableC47386Iik {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ VideoPreloadManager LJLILLLLZI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLILLLLZI.LJIJJLI().smartTimelinessPreloadBusinessEvent(this.LJLIL);
        return false;
    }

    public C47374IiY(VideoPreloadManager videoPreloadManager, String str) {
        this.LJLILLLLZI = videoPreloadManager;
        this.LJLIL = str;
    }
}
