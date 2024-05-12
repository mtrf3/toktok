package X;

import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.desc.LandscapeVideoDescVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.84t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2055184t {
    public final LandscapeVideoDescVM LIZ;
    public final TuxTextView LIZIZ;
    public final Context LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final T5S LJIIIZ;
    public C2055584x LJIIJ;
    public TuxTextLayoutView LJIIJJI;
    public Layout LJIIL;
    public Layout LJIILIIL;

    public final void LIZIZ() {
        Layout layout;
        boolean z = !this.LIZ.LJLLJ;
        Layout layout2 = this.LJIIL;
        if (layout2 == null || (layout = this.LJIILIIL) == null) {
            return;
        }
        int height = layout2.getHeight();
        int i = this.LJIIIIZZ;
        if (height > i) {
            height = i;
        }
        C85Z c85z = new C85Z(height, layout.getHeight(), z);
        LandscapeVideoDescVM landscapeVideoDescVM = this.LIZ;
        landscapeVideoDescVM.getClass();
        landscapeVideoDescVM.setState(new AqS169S0100000_3(c85z, 945));
    }

    public final void LIZJ() {
        int i;
        int i2;
        int i3;
        TuxTextLayoutView tuxTextLayoutView = this.LJIIJJI;
        if (tuxTextLayoutView != null) {
            tuxTextLayoutView.setTextAlignment(5);
            TuxTextLayoutView tuxTextLayoutView2 = this.LJIIJJI;
            if (tuxTextLayoutView2 != null) {
                tuxTextLayoutView2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS23S0100000_3(this, 324)));
                if (!this.LIZ.LJLLLLLL) {
                    return;
                }
                if (!C8D3.LIZIZ()) {
                    int LIZIZ = C7MY.LIZIZ(462);
                    TuxTextLayoutView tuxTextLayoutView3 = this.LJIIJJI;
                    if (tuxTextLayoutView3 != null) {
                        tuxTextLayoutView3.getLayoutParams().width = LIZIZ;
                        TuxTextLayoutView tuxTextLayoutView4 = this.LJIIJJI;
                        if (tuxTextLayoutView4 != null) {
                            tuxTextLayoutView4.requestLayout();
                            return;
                        } else {
                            o.LJIJI("descView");
                            throw null;
                        }
                    }
                    o.LJIJI("descView");
                    throw null;
                }
                Context LIZIZ2 = EF7.LIZIZ();
                int LJIIIIZZ = C60996Nwm.LJIIIIZZ(LIZIZ2);
                int LJ = C60996Nwm.LJ(LIZIZ2);
                if (LJIIIIZZ <= LJ) {
                    LJIIIIZZ = LJ;
                }
                if (C208088Eq.LIZIZ()) {
                    i3 = 36;
                    i2 = 18;
                    i = 24;
                } else {
                    i = 32;
                    i2 = 12;
                    if (C208088Eq.LIZJ()) {
                        i3 = 96;
                    } else {
                        i3 = 48;
                    }
                }
                int LJJIIZ = LJIIIIZZ - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(((i + 48) + i3) + i2)));
                TuxTextLayoutView tuxTextLayoutView5 = this.LJIIJJI;
                if (tuxTextLayoutView5 != null) {
                    tuxTextLayoutView5.getLayoutParams().width = LJJIIZ;
                    TuxTextLayoutView tuxTextLayoutView6 = this.LJIIJJI;
                    if (tuxTextLayoutView6 != null) {
                        tuxTextLayoutView6.requestLayout();
                        return;
                    } else {
                        o.LJIJI("descView");
                        throw null;
                    }
                }
                o.LJIJI("descView");
                throw null;
            }
            o.LJIJI("descView");
            throw null;
        }
        o.LJIJI("descView");
        throw null;
    }

    public final void LIZ(View containerView) {
        o.LJIIIZ(containerView, "containerView");
        ViewGroup viewGroup = (ViewGroup) containerView.findViewById(R.id.c81);
        TuxTextLayoutView tuxTextLayoutView = (TuxTextLayoutView) viewGroup.findViewById(R.id.desc);
        if (tuxTextLayoutView != null) {
            this.LJIIJJI = tuxTextLayoutView;
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LJI, -2);
        layoutParams.gravity = 16;
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        TuxTextLayoutView tuxTextLayoutView2 = new TuxTextLayoutView(context, null, 6);
        tuxTextLayoutView2.setId(R.id.desc);
        tuxTextLayoutView2.setFadingEdgeLength(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        tuxTextLayoutView2.setVerticalFadingEdgeEnabled(true);
        viewGroup.addView(tuxTextLayoutView2, layoutParams);
        this.LJIIJJI = tuxTextLayoutView2;
    }

    public final void LIZLLL(boolean z) {
        Layout layout;
        int i;
        if (z) {
            layout = this.LJIIL;
        } else {
            layout = this.LJIILIIL;
            if (layout == null) {
                return;
            }
        }
        TuxTextLayoutView tuxTextLayoutView = this.LJIIJJI;
        if (tuxTextLayoutView != null) {
            tuxTextLayoutView.setTextLayout(layout);
            TuxTextLayoutView tuxTextLayoutView2 = this.LJIIJJI;
            if (tuxTextLayoutView2 != null) {
                if (z) {
                    i = this.LJIIIIZZ;
                } else {
                    i = Integer.MAX_VALUE;
                }
                tuxTextLayoutView2.setMaxHeight(i);
                return;
            }
            o.LJIJI("descView");
            throw null;
        }
        o.LJIJI("descView");
        throw null;
    }

    public C2055184t(LandscapeVideoDescVM videoDescVM, TuxTextView tuxTextView, Context context) {
        int i;
        int i2;
        int i3;
        Integer LJI;
        Integer LJI2;
        o.LJIIIZ(videoDescVM, "videoDescVM");
        this.LIZ = videoDescVM;
        this.LIZIZ = tuxTextView;
        this.LIZJ = context;
        int i4 = 0;
        if (context != null && (LJI2 = C79045V0n.LJI(R.attr.dj, context)) != null) {
            i = LJI2.intValue();
        } else {
            i = 0;
        }
        this.LIZLLL = i;
        if (context != null && (LJI = C79045V0n.LJI(R.attr.dj, context)) != null) {
            i4 = LJI.intValue();
        }
        this.LJ = i4;
        if (((Boolean) videoDescVM.LJLL.getValue()).booleanValue()) {
            i2 = 14;
        } else {
            i2 = 15;
        }
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf((i2 * 1.3d) + 3)));
        this.LJFF = LJJIIZ;
        this.LJI = C7MY.LIZIZ(372);
        if (((Boolean) videoDescVM.LJLL.getValue()).booleanValue()) {
            if (videoDescVM.LJLLLLLL) {
                i3 = 42;
            } else {
                i3 = 52;
            }
        } else {
            i3 = 32;
        }
        this.LJII = i3;
        this.LJIIIIZZ = videoDescVM.LJZ * LJJIIZ;
        T5S t5s = new T5S();
        t5s.LIZ(i3);
        this.LJIIIZ = t5s;
    }
}
