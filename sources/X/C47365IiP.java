package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;

/* renamed from: X.IiP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47365IiP extends AbstractRunnableC47386Iik {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ VideoPreloadManager LJLILLLLZI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLILLLLZI.LJIJJLI().makeCurrentScene(this.LJLIL);
        return true;
    }

    public C47365IiP(VideoPreloadManager videoPreloadManager, String str) {
        this.LJLILLLLZI = videoPreloadManager;
        this.LJLIL = str;
    }
}
