package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;

/* renamed from: X.IiT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47369IiT extends AbstractRunnableC47386Iik {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ VideoPreloadManager LJLILLLLZI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLILLLLZI.LJIJJLI().smartPreloadWeakNetBusinessEvent(this.LJLIL);
        return false;
    }

    public C47369IiT(VideoPreloadManager videoPreloadManager, String str) {
        this.LJLILLLLZI = videoPreloadManager;
        this.LJLIL = str;
    }
}
