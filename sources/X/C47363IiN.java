package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;

/* renamed from: X.IiN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47363IiN extends AbstractRunnableC47386Iik {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ VideoPreloadManager LJLJI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLJI.LJIJJLI().createScene(this.LJLIL, this.LJLILLLLZI);
        return true;
    }

    public C47363IiN(VideoPreloadManager videoPreloadManager, String str, String str2) {
        this.LJLJI = videoPreloadManager;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
