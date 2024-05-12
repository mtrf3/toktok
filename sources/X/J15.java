package X;

import Y.ACListenerS43S0200000_8;
import android.graphics.SurfaceTexture;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;

/* loaded from: classes9.dex */
public final class J15 implements InterfaceC47667InH {
    public final /* synthetic */ J14 LJLIL;
    public final /* synthetic */ PaidVideoItem LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    @Override // X.InterfaceC47667InH
    public final void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
        this.LJLIL.getClass();
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        J14 j14 = this.LJLIL;
        j14.getClass();
        PaidVideoItem paidVideoItem = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        Aweme aweme = j14.LJLJI;
        Video video = null;
        if (aweme != null && aweme.getVideo() != null) {
            VideoViewComponent videoViewComponent = j14.getVideoViewComponent();
            Aweme aweme2 = j14.LJLJI;
            if (aweme2 != null) {
                video = aweme2.getVideo();
            }
            videoViewComponent.LJIIL(video);
            j14.LJLJJLL = z;
            j14.LIZJ();
            J17 j17 = j14.LJLILLLLZI;
            if (j17 != null) {
                j17.o3(8);
            }
            j14.LJLJJL = false;
            C16880lQ.LJIILJJIL(j14.getVideoPlayer(), new ACListenerS43S0200000_8(j14, paidVideoItem, 7));
        }
    }

    public J15(J14 j14, PaidVideoItem paidVideoItem, boolean z) {
        this.LJLIL = j14;
        this.LJLILLLLZI = paidVideoItem;
        this.LJLJI = z;
    }
}
