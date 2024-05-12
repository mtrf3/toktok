package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;

/* renamed from: X.IiC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47352IiC extends AbstractRunnableC47386Iik {
    public final /* synthetic */ java.util.Map LJLIL;
    public final /* synthetic */ VideoPreloadManager LJLILLLLZI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        VideoPreloadManager videoPreloadManager = this.LJLILLLLZI;
        if (videoPreloadManager.LIZ == null) {
            videoPreloadManager.LIZJ = this.LJLIL;
            return false;
        }
        videoPreloadManager.LJIJJLI().updateDnsBackupIpMap(this.LJLIL);
        return false;
    }

    public C47352IiC(VideoPreloadManager videoPreloadManager, java.util.Map map) {
        this.LJLILLLLZI = videoPreloadManager;
        this.LJLIL = map;
    }
}
