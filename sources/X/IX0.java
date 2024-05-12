package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;

/* loaded from: classes9.dex */
public final class IX0 implements InterfaceC47667InH {
    public final /* synthetic */ VideoViewComponent LJLIL;

    @Override // X.InterfaceC47667InH
    public final void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
        if (this.LJLIL.LJLJI.P7() == 1) {
            this.LJLIL.LJLILLLLZI.LJLLJ(null);
        }
    }

    public IX0(VideoViewComponent videoViewComponent) {
        this.LJLIL = videoViewComponent;
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        if (this.LJLIL.LJLJI.P7() == 1 && this.LJLIL.LJLJI.S7()) {
            this.LJLIL.LJLJI.T7();
        }
        VideoViewComponent videoViewComponent = this.LJLIL;
        if (videoViewComponent.LJLJLJ) {
            videoViewComponent.LJLJLJ = false;
            videoViewComponent.LJII(videoViewComponent.LJLJJL, videoViewComponent.LJLJLLL);
        }
    }
}
