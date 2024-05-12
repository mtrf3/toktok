package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.acW, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94160acW implements InterfaceC93645aUD {
    public InterfaceC88472Yns<? super View, C76800UCe> LIZ;
    public View LIZIZ;

    @Override // X.InterfaceC93645aUD
    public final void hide() {
        C94034aaU.LIZ("SmallStatusView", "hide");
        View view = this.LIZIZ;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // X.InterfaceC93645aUD
    public final void LIZIZ(InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // X.InterfaceC93645aUD
    public final void LIZJ(EnumC93644aUC status) {
        View view;
        o.LJIIIZ(status, "status");
        if (status == EnumC93644aUC.NoNetwork) {
            C94034aaU.LIZ("SmallStatusView", "show");
            View view2 = this.LIZIZ;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            if (this.LIZ != null && (view = this.LIZIZ) != null) {
                C93750aVu.LIZ(view, 800L, new IDqS419S0100000_42(this, 42));
            }
        }
    }

    @Override // X.InterfaceC93645aUD
    public final View LIZ(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        C94034aaU.LIZ("SmallStatusView", "inflate");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dv_, viewGroup, false);
        this.LIZIZ = LLLLIILL;
        viewGroup.addView(LLLLIILL);
        View view = this.LIZIZ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LIZIZ;
        o.LJI(view2);
        return view2;
    }
}
