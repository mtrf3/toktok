package X;

import Y.ALAdapterS4S0100000_5;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;

/* loaded from: classes6.dex */
public final class C3A implements UOY {
    public final C47061t0 LIZ;

    @Override // X.UOY
    public final void LIZIZ() {
    }

    @Override // X.UOY
    public final void LLLLZLL() {
    }

    @Override // X.UOY
    public final View LIZJ() {
        C47061t0 c47061t0 = this.LIZ;
        c47061t0.setLayoutParams(new ViewGroup.LayoutParams(C15380j0.LIZ(70.0f), C15380j0.LIZ(70.0f)));
        return c47061t0;
    }

    public C3A(Context context) {
        C47061t0 c47061t0 = new C47061t0(context);
        this.LIZ = c47061t0;
        C15490jB.LJFF(c47061t0, "tiktok_live_watch_resource_demand_1", "ttlive_custom_poll_short_touch_big_icon.png", ImageView.ScaleType.CENTER_CROP, new C48841JEv());
    }

    @Override // X.UOY
    public final UOV LIZ(ViewGroup viewGroup) {
        Animator Es0 = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).Es0(viewGroup);
        if (Es0 != null) {
            Es0.addListener(new ALAdapterS4S0100000_5(viewGroup, 16));
        } else {
            Es0 = null;
        }
        return new C3B(Es0);
    }
}
