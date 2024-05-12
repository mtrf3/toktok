package X;

import android.animation.Animator;
import android.view.ViewGroup;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class BSO implements UOV {
    public final Animator LIZ;

    @Override // X.UOV
    public final InterfaceC88472Yns<Animator.AnimatorListener, C76800UCe> LIZ() {
        return new AqS171S0100000_5(this, 893);
    }

    @Override // X.UOV
    public final void LIZIZ() {
        Animator animator = this.LIZ;
        if (animator != null) {
            animator.start();
        }
    }

    @Override // X.UOV
    public final void LIZJ() {
        Animator animator = this.LIZ;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // X.UOV
    public final boolean isRunning() {
        Animator animator = this.LIZ;
        if (animator != null) {
            return animator.isRunning();
        }
        return false;
    }

    public BSO(ViewGroup viewGroup) {
        this.LIZ = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).Es0(viewGroup);
    }
}
