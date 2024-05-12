package X;

import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LO6 {
    public final Context LIZ;
    public final LOS LIZIZ;
    public final FrameLayout LIZJ;
    public final LOF LIZLLL;
    public final boolean LJ;
    public final ITabStrip LJFF;
    public TuxIconView LJI;
    public final int LJII;

    public final void LIZ() {
        TuxIconView tuxIconView = this.LJI;
        if (tuxIconView != null && tuxIconView.getVisibility() == 0) {
            TuxIconView tuxIconView2 = this.LJI;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
            }
            InterfaceC88472Yns<Boolean, C76800UCe> tabVisibilityListener = this.LIZIZ.getTabVisibilityListener();
            if (tabVisibilityListener != null) {
                tabVisibilityListener.invoke(Boolean.FALSE);
            }
        }
    }

    public final void LIZIZ() {
        int i;
        TuxIconView tuxIconView;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("makeBackIconViewVisible ");
        TuxIconView tuxIconView2 = this.LJI;
        Integer num = null;
        if (tuxIconView2 != null) {
            num = Integer.valueOf(tuxIconView2.getVisibility());
        }
        LIZ.append(num);
        String str = X1D.LIZIZ(LIZ);
        o.LJIIIZ(str, "str");
        FrameLayout frameLayout = this.LIZJ;
        if (frameLayout != null) {
            i = frameLayout.getChildCount();
        } else {
            i = 0;
        }
        if (i > 0 && ((tuxIconView = this.LJI) == null || tuxIconView.getParent() == null)) {
            TuxIconView tuxIconView3 = new TuxIconView(this.LIZ, null, 0, 6, null);
            tuxIconView3.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
            tuxIconView3.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
            if (!C90193gN.LIZ()) {
                tuxIconView3.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0, 0, 0);
            } else {
                tuxIconView3.setPadding(0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0);
            }
            tuxIconView3.setIconRes(R.raw.icon_chevron_right_circle_ltr);
            tuxIconView3.setClickable(true);
            tuxIconView3.setFocusable(true);
            tuxIconView3.setVisibility(8);
            tuxIconView3.setTintColorRes(R.attr.cl);
            tuxIconView3.setId(R.id.e6d);
            tuxIconView3.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388629;
            tuxIconView3.setLayoutParams(layoutParams);
            C16880lQ.LJJJ(tuxIconView3, new ACListenerS29S0100000_9(this, 202));
            this.LJI = tuxIconView3;
            FrameLayout frameLayout2 = this.LIZJ;
            if (frameLayout2 != null) {
                frameLayout2.addView(tuxIconView3);
            }
        }
        TuxIconView tuxIconView4 = this.LJI;
        if (tuxIconView4 != null && tuxIconView4.getVisibility() == 0) {
            return;
        }
        TuxIconView tuxIconView5 = this.LJI;
        if (tuxIconView5 != null) {
            tuxIconView5.setVisibility(0);
        }
        FMX.onEventV3("show_return_hot_icon");
        InterfaceC88472Yns<Boolean, C76800UCe> tabVisibilityListener = this.LIZIZ.getTabVisibilityListener();
        if (tabVisibilityListener == null) {
            return;
        }
        tabVisibilityListener.invoke(Boolean.TRUE);
    }

    public LO6(ActivityC45651qj activityC45651qj, LOS host, FrameLayout frameLayout, LOF lof, boolean z, ITabStrip mainTabStrip) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(mainTabStrip, "mainTabStrip");
        this.LIZ = activityC45651qj;
        this.LIZIZ = host;
        this.LIZJ = frameLayout;
        this.LIZLLL = lof;
        this.LJ = z;
        this.LJFF = mainTabStrip;
        this.LJII = C7MY.LIZIZ(-16);
    }
}
