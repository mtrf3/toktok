package X;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.Xgx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85495Xgx implements InterfaceC47667InH {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C85493Xgv LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        if (this.LJLIL) {
            VideoViewComponent videoViewComponent = this.LJLILLLLZI.LIZJ;
            if (videoViewComponent != null) {
                TextureView textureView = (TextureView) videoViewComponent.LJLJI.getView();
                float f = this.LJLJI;
                float f2 = i2 / i;
                int i3 = i / 2;
                float f3 = 1.0f;
                float f4 = f / f2;
                if (f2 > f) {
                    f3 = f4;
                    f4 = 1.0f;
                }
                if (textureView != null) {
                    Matrix matrix = new Matrix();
                    matrix.setScale(f3, f4, i3, 0.0f);
                    textureView.setTransform(matrix);
                    return;
                }
                return;
            }
            o.LJIJI("mVideoView");
            throw null;
        }
    }

    public C85495Xgx(boolean z, C85493Xgv c85493Xgv, float f) {
        this.LJLIL = z;
        this.LJLILLLLZI = c85493Xgv;
        this.LJLJI = f;
    }
}
