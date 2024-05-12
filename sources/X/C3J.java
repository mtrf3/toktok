package X;

import Y.ALAdapterS4S0100000_5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;

/* loaded from: classes6.dex */
public final class C3J implements UOY {
    public final /* synthetic */ C29701Eo LIZ;

    @Override // X.UOY
    public final void LIZIZ() {
    }

    @Override // X.UOY
    public final void LLLLZLL() {
    }

    @Override // X.UOY
    public final View LIZJ() {
        return this.LIZ;
    }

    public C3J(C29701Eo c29701Eo) {
        this.LIZ = c29701Eo;
    }

    @Override // X.UOY
    public final UOV LIZ(ViewGroup viewGroup) {
        Animator Es0 = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).Es0(viewGroup);
        if (Es0 != null) {
            Es0.addListener(new ALAdapterS4S0100000_5(this.LIZ, 59));
            Es0.setDuration(1500L);
        } else {
            Es0 = null;
        }
        return new C3K(Es0, this.LIZ);
    }
}
