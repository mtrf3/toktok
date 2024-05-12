package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerV2;

/* renamed from: X.Iid, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47379Iid extends AbstractRunnableC47385Iij {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ VideoPreloadManagerV2 LJLILLLLZI;

    @Override // X.AbstractRunnableC47385Iij
    public final boolean LIZ() {
        this.LJLILLLLZI.LJIJJ().smartPreloadBusinessEvent(this.LJLIL);
        return false;
    }

    public C47379Iid(VideoPreloadManagerV2 videoPreloadManagerV2, String str) {
        this.LJLILLLLZI = videoPreloadManagerV2;
        this.LJLIL = str;
    }
}
