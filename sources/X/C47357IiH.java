package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerV2;

/* renamed from: X.IiH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47357IiH extends AbstractRunnableC47385Iij {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ VideoPreloadManagerV2 LJLILLLLZI;

    @Override // X.AbstractRunnableC47385Iij
    public final boolean LIZ() {
        this.LJLILLLLZI.checkInit();
        this.LJLILLLLZI.LJIJJ().makeCurrentScene(this.LJLIL);
        return true;
    }

    public C47357IiH(VideoPreloadManagerV2 videoPreloadManagerV2, String str) {
        this.LJLILLLLZI = videoPreloadManagerV2;
        this.LJLIL = str;
    }
}