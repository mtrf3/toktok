package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;

/* renamed from: X.IiZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47375IiZ extends AbstractRunnableC47386Iik {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ VideoPreloadManager LJLILLLLZI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLILLLLZI.LJIJJLI().updateAppState(this.LJLIL);
        return false;
    }

    public C47375IiZ(VideoPreloadManager videoPreloadManager, boolean z) {
        this.LJLILLLLZI = videoPreloadManager;
        this.LJLIL = z;
    }
}
