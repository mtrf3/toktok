package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerV2;

/* renamed from: X.IiF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47355IiF extends AbstractRunnableC47385Iij {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ VideoPreloadManagerV2 LJLJI;

    @Override // X.AbstractRunnableC47385Iij
    public final boolean LIZ() {
        this.LJLJI.checkInit();
        this.LJLJI.LJIJJ().createScene(this.LJLIL, this.LJLILLLLZI);
        return true;
    }

    public C47355IiF(VideoPreloadManagerV2 videoPreloadManagerV2, String str, String str2) {
        this.LJLJI = videoPreloadManagerV2;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
