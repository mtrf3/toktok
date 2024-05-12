package X;

import Y.ALAdapterS4S0100000_5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BRQ implements UOY {
    public final /* synthetic */ GoodyBagWidget LIZ;

    @Override // X.UOY
    public final void LIZIZ() {
    }

    @Override // X.UOY
    public final void LLLLZLL() {
    }

    @Override // X.UOY
    public final View LIZJ() {
        BRR brr = this.LIZ.LJLIL;
        o.LJI(brr);
        brr.setLayoutParams(new ViewGroup.LayoutParams(C15380j0.LIZ(70.0f), C15380j0.LIZ(70.0f)));
        return brr;
    }

    public BRQ(GoodyBagWidget goodyBagWidget) {
        this.LIZ = goodyBagWidget;
    }

    @Override // X.UOY
    public final UOV LIZ(ViewGroup viewGroup) {
        Animator Es0 = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).Es0(viewGroup);
        if (Es0 != null) {
            Es0.addListener(new ALAdapterS4S0100000_5(viewGroup, 44));
        } else {
            Es0 = null;
        }
        return new BSP(Es0);
    }
}
