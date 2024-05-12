package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.JCi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48776JCi implements InterfaceC47667InH {
    public final /* synthetic */ C48774JCg LJLIL;
    public final /* synthetic */ C47246IgU LJLILLLLZI;

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceDestroyed, surface ref: ");
        LIZ.append(this.LJLILLLLZI.getSurface());
        C36922EeM.LIZLLL(6, "PipPlayerVC", X1D.LIZIZ(LIZ));
    }

    public C48776JCi(C48774JCg c48774JCg, C47246IgU c47246IgU) {
        this.LJLIL = c48774JCg;
        this.LJLILLLLZI = c47246IgU;
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        Surface surface;
        C47041IdB c47041IdB = this.LJLIL.LJLJJLL;
        if (c47041IdB != null && (surface = this.LJLILLLLZI.getSurface()) != null) {
            c47041IdB.LIZIZ.setSurface(surface);
        }
        C48774JCg c48774JCg = this.LJLIL;
        if (c48774JCg.LJLJLJ) {
            c48774JCg.LJLJLJ = false;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSurfaceAvailable, surface ref: ");
            LIZ.append(this.LJLILLLLZI.getSurface());
            C36922EeM.LIZLLL(6, "PipPlayerVC", X1D.LIZIZ(LIZ));
            Aweme value = this.LJLIL.LJIJJLI().LJLIL.getValue();
            if (value != null) {
                this.LJLIL.LJJIIJ(value);
            }
        }
        this.LJLILLLLZI.V3(true);
    }
}
