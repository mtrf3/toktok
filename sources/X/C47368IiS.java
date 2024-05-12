package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;

/* renamed from: X.IiS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47368IiS extends AbstractRunnableC47386Iik {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ VideoPreloadManager LJLILLLLZI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLILLLLZI.LJIJJLI().setSmartPreloadAlgorithmJson(this.LJLIL);
        return false;
    }

    public C47368IiS(VideoPreloadManager videoPreloadManager, String str) {
        this.LJLILLLLZI = videoPreloadManager;
        this.LJLIL = str;
    }
}
