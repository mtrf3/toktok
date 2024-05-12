package X;

import android.graphics.SurfaceTexture;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.play.PlayViewComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.JJn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48963JJn implements InterfaceC47667InH {
    public final /* synthetic */ PlayViewComponent LJLIL;

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
    }

    @Override // X.InterfaceC47667InH
    public final void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C48963JJn(PlayViewComponent playViewComponent) {
        this.LJLIL = playViewComponent;
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        ActivityC86117Xqz activityC86117Xqz = this.LJLIL.LJLJI;
        if (activityC86117Xqz != null) {
            if (activityC86117Xqz.isActive()) {
                this.LJLIL.h30(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                this.LJLIL.play();
            } else {
                this.LJLIL.ka(false);
                this.LJLIL.LIZ().pause();
            }
            this.LJLIL.LIZIZ();
            return;
        }
        o.LJIJI("activity");
        throw null;
    }
}
