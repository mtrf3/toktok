package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;

/* loaded from: classes9.dex */
public final class JG3 implements InterfaceC47667InH {
    public final /* synthetic */ EffectRecommendationCarouselViewModel LJLIL;

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
        this.LJLIL.getClass();
    }

    public JG3(EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel) {
        this.LJLIL = effectRecommendationCarouselViewModel;
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        Surface surface;
        this.LJLIL.getClass();
        IWH hv0 = this.LJLIL.hv0();
        InterfaceC47247IgV interfaceC47247IgV = this.LJLIL.LJLJLLL;
        if (interfaceC47247IgV != null) {
            surface = interfaceC47247IgV.getSurface();
        } else {
            surface = null;
        }
        hv0.setSurface(surface);
        this.LJLIL.k3();
    }
}
