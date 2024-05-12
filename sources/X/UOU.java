package X;

import Y.IDAListenerS42S0200000_12;
import android.animation.Animator;
import com.bytedance.android.livesdk.shorttouch.ui.PortraitShortTouchPreviewWidget;

/* loaded from: classes14.dex */
public final class UOU implements T3L {
    public final /* synthetic */ PortraitShortTouchPreviewWidget LIZ;

    @Override // X.T3L
    public final void LIZ() {
        UOV uov = this.LIZ.LJLILLLLZI;
        if (uov != null) {
            uov.LIZIZ();
        }
    }

    public UOU(PortraitShortTouchPreviewWidget portraitShortTouchPreviewWidget) {
        this.LIZ = portraitShortTouchPreviewWidget;
    }

    @Override // X.T3L
    public final void LIZIZ(IDAListenerS42S0200000_12 iDAListenerS42S0200000_12) {
        InterfaceC88472Yns<Animator.AnimatorListener, C76800UCe> LIZ;
        UOV uov = this.LIZ.LJLILLLLZI;
        if (uov != null && (LIZ = uov.LIZ()) != null) {
            LIZ.invoke(iDAListenerS42S0200000_12);
        }
    }
}
