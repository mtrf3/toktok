package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerV2;

/* renamed from: X.IiI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47358IiI extends AbstractRunnableC47385Iij {
    public final /* synthetic */ java.util.Map LJLIL;
    public final /* synthetic */ VideoPreloadManagerV2 LJLILLLLZI;

    @Override // X.AbstractRunnableC47385Iij
    public final boolean LIZ() {
        this.LJLILLLLZI.LJIJJ().updateDnsBackupIpMap(this.LJLIL);
        return false;
    }

    public C47358IiI(VideoPreloadManagerV2 videoPreloadManagerV2, java.util.Map map) {
        this.LJLILLLLZI = videoPreloadManagerV2;
        this.LJLIL = map;
    }
}
