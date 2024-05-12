package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerV2;

/* renamed from: X.Ii9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47349Ii9 extends AbstractRunnableC47385Iij {
    public final /* synthetic */ VideoPreloadManagerV2 LJLIL;

    @Override // X.AbstractRunnableC47385Iij
    public final boolean LIZ() {
        VideoPreloadManagerV2 videoPreloadManagerV2 = this.LJLIL;
        if (videoPreloadManagerV2.LIZJ != null) {
            videoPreloadManagerV2.LJIJJ().updateDnsBackupIpMap(this.LJLIL.LIZJ);
        }
        this.LJLIL.getClass();
        if (!TextUtils.isEmpty(this.LJLIL.LJII)) {
            this.LJLIL.LJIJJ().setSmartPreloadAlgorithmJson(this.LJLIL.LJII);
        }
        if (!TextUtils.isEmpty(this.LJLIL.LJIIIIZZ)) {
            this.LJLIL.LJIJJ().smartPreloadBusinessEvent(this.LJLIL.LJIIIIZZ);
        }
        if (!TextUtils.isEmpty(this.LJLIL.LJIIIZ)) {
            this.LJLIL.LJIJJ().setSmartPreloadPlayTaskAlgorithmJson(this.LJLIL.LJIIIZ);
        }
        if (!TextUtils.isEmpty(this.LJLIL.LJIIJ)) {
            this.LJLIL.LJIJJ().smartPreloadPlayTaskBusinessEvent(this.LJLIL.LJIIJ);
        }
        if (!TextUtils.isEmpty(this.LJLIL.LJIIJJI)) {
            this.LJLIL.LJIJJ().setTimelinessAlgorithmJson(this.LJLIL.LJIIJJI);
        }
        if (!TextUtils.isEmpty(this.LJLIL.LJIIL)) {
            this.LJLIL.LJIJJ().smartTimelinessPreloadBusinessEvent(this.LJLIL.LJIIL);
        }
        this.LJLIL.LJIJJ().updateAppState(this.LJLIL.LJI);
        return false;
    }

    public C47349Ii9(VideoPreloadManagerV2 videoPreloadManagerV2) {
        this.LJLIL = videoPreloadManagerV2;
    }
}
