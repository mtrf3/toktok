package X;

import Y.ACListenerS28S0100000_8;
import Y.AObserverS72S0200000_8;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS44S0100000_8;
import Y.AUListenerS96S0100000_8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.pipfeed.PipFeedManager;
import com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class JE2 extends JEA implements JE7 {
    public static final int LJLLLLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(156));
    public static final int LJLZ = C7MY.LIZIZ(UserLevelGeckoUpdateSetting.DEFAULT);
    public final JEV LJLJJLL;
    public final JEV LJLJL;
    public TuxIconView LJLJLJ;
    public TuxIconView LJLJLLL;
    public TuxIconView LJLL;
    public TuxIconView LJLLI;
    public TuxIconView LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public final ARunnableS44S0100000_8 LJLLLL;

    @Override // X.JE7
    public final void LIZLLL() {
        PipFeedManager.Companion.getClass();
        JD9.LIZ.reenterMainApp$pipfeed_release();
    }

    @Override // X.JE7
    public final void LJ() {
        boolean z;
        View view = this.LJLILLLLZI;
        if (view != null) {
            if (view.getVisibility() == 4) {
                z = true;
            } else {
                z = false;
            }
            LJIILL(z);
        }
    }

    @Override // X.JEA
    public final void LJIIL() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.postDelayed(this.LJLLLL, 2000L);
        }
    }

    public final ControlOverlayViewModel LJIIZILJ() {
        return (ControlOverlayViewModel) this.LJLJJLL.getValue();
    }

    @Override // X.JE7
    public final void close() {
        PipFeedManager.Companion.getClass();
        JD9.LIZ.closeWindowOnly$pipfeed_release("click_exit_app");
    }

    public JE2() {
        super(R.id.hqd);
        this.LJLJJLL = new JEV(C221108m2.LIZIZ(new AqS156S0100000_6((JEA) this, 173)), C65352Pkq.LIZ(ControlOverlayViewModel.class));
        this.LJLJL = new JEV(C221108m2.LIZIZ(new AqS156S0100000_6((JEA) this, 173)), C65352Pkq.LIZ(PipFeedWindowVM.class));
        this.LJLLLL = new ARunnableS44S0100000_8(this, 149);
    }

    @Override // X.JEA
    public final void LJIILJJIL(View view) {
        ControlOverlayViewModel LJIIZILJ = LJIIZILJ();
        LJIIZILJ.getClass();
        LJIIZILJ.LJLILLLLZI = this;
        this.LJLJLJ = (TuxIconView) view.findViewById(R.id.e_0);
        this.LJLJLLL = (TuxIconView) view.findViewById(R.id.e9v);
        this.LJLL = (TuxIconView) view.findViewById(R.id.e_2);
        this.LJLLI = (TuxIconView) view.findViewById(R.id.e95);
        this.LJLLILLLL = (TuxIconView) view.findViewById(R.id.e8z);
        this.LJLLJ = view.findViewById(R.id.jsa);
        this.LJLLL = view.findViewById(R.id.js_);
        TuxIconView tuxIconView = this.LJLLI;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS28S0100000_8(this, 75));
        }
        TuxIconView tuxIconView2 = this.LJLLILLLL;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS28S0100000_8(this, 76));
        }
        LJIIZILJ().LJLJJI.observe(LJIIIIZZ(), new AObserverS76S0100000_8(this, 92));
        TuxIconView tuxIconView3 = this.LJLJLLL;
        if (tuxIconView3 != null) {
            AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 607);
            C16880lQ.LJIIJ(null, tuxIconView3);
            tuxIconView3.setOnTouchListener(new JE3(this, aqS158S0100000_8));
        }
        LJIIZILJ().LJLJI.observe(LJIIIIZZ(), new AObserverS76S0100000_8(this, 93));
        TuxIconView tuxIconView4 = this.LJLL;
        if (tuxIconView4 != null) {
            AqS158S0100000_8 aqS158S0100000_82 = new AqS158S0100000_8(this, 608);
            C16880lQ.LJIIJ(null, tuxIconView4);
            tuxIconView4.setOnTouchListener(new JE3(this, aqS158S0100000_82));
        }
        LJIIZILJ().LJLJL.observe(LJIIIIZZ(), new AObserverS76S0100000_8(this, 94));
        LJIIZILJ().LJLJJL.observe(LJIIIIZZ(), new AObserverS76S0100000_8(this, 95));
        TuxIconView tuxIconView5 = this.LJLJLJ;
        if (tuxIconView5 != null) {
            AqS158S0100000_8 aqS158S0100000_83 = new AqS158S0100000_8(this, 609);
            C16880lQ.LJIIJ(null, tuxIconView5);
            tuxIconView5.setOnTouchListener(new JE3(this, aqS158S0100000_83));
        }
        C78541Us5.LIZIZ(C78541Us5.LIZIZ(((PipFeedWindowVM) this.LJLJL.getValue()).LJLILLLLZI, ((PipFeedWindowVM) this.LJLJL.getValue()).LJLJJI, JE5.LJLIL), ((PipFeedWindowVM) this.LJLJL.getValue()).LJLIL, JE1.LJLIL).observe(LJIIIIZZ(), new AObserverS72S0200000_8(view, this, 7));
    }

    public final void LJIILL(boolean z) {
        ValueAnimator ofFloat;
        View view;
        View view2 = this.LJLILLLLZI;
        if (view2 != null && view2.getVisibility() == 0) {
            if (z) {
                return;
            }
        } else if (!z) {
            return;
        }
        float[] fArr = {1.0f, 0.0f};
        if (z) {
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            ofFloat = ValueAnimator.ofFloat(fArr);
        } else {
            ofFloat = ValueAnimator.ofFloat(fArr);
        }
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new AUListenerS96S0100000_8(this, 6));
        ofFloat.addListener(new JE4(z, this));
        ofFloat.start();
        if (!z || (view = this.LJLILLLLZI) == null) {
            return;
        }
        view.setVisibility(0);
    }

    public static void LJIILLIIL(E4Y e4y, TuxIconView tuxIconView) {
        if (tuxIconView == null) {
            return;
        }
        int i = C48817JDx.LIZIZ[e4y.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                tuxIconView.setVisibility(0);
                tuxIconView.setAlpha(0.5f);
                tuxIconView.setClickable(false);
                return;
            }
            tuxIconView.setVisibility(4);
            return;
        }
        tuxIconView.setVisibility(0);
        tuxIconView.setAlpha(1.0f);
        tuxIconView.setClickable(true);
    }

    @Override // X.JEA
    public final View LJI(Context context, JEE jee) {
        return C16880lQ.LLLZIIL(R.layout.bzg, C16880lQ.LLZIL(context), null);
    }

    public final void LJIJ(ViewGroup viewGroup, JE0 je0, boolean z) {
        Integer LIZIZ;
        int i = C48817JDx.LIZ[je0.ordinal()];
        Integer num = null;
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                TuxIconView tuxIconView = this.LJLLILLLL;
                if (tuxIconView != null) {
                    C78927UyJ.LJFF(tuxIconView, AnonymousClass391.LIZJ(16), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))));
                    C26338AVi.LJI(tuxIconView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), C1FJ.LIZIZ(8), null, null, false, 28);
                }
                TuxIconView tuxIconView2 = this.LJLLI;
                if (tuxIconView2 != null) {
                    C78927UyJ.LJFF(tuxIconView2, AnonymousClass391.LIZJ(16), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))));
                    num = null;
                    C26338AVi.LJI(tuxIconView2, null, C1FJ.LIZIZ(8), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, false, 25);
                }
                View view = this.LJLLJ;
                if (view != null) {
                    C78927UyJ.LJFF(view, num, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32))));
                }
                C26338AVi.LJI(viewGroup, num, num, num, AnonymousClass391.LIZJ(12), false, 23);
                TuxIconView tuxIconView3 = this.LJLL;
                if (tuxIconView3 != null) {
                    C78927UyJ.LJFF(tuxIconView3, C1FJ.LIZIZ(32), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32))));
                    tuxIconView3.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    tuxIconView3.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    Integer num2 = num;
                    num = num;
                    C26338AVi.LJI(tuxIconView3, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), num2, C1FJ.LIZIZ(0), num, false, 26);
                }
                TuxIconView tuxIconView4 = this.LJLJLJ;
                if (tuxIconView4 != null) {
                    C78927UyJ.LJFF(tuxIconView4, C1FJ.LIZIZ(40), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40))));
                    tuxIconView4.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    tuxIconView4.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    Integer num3 = num;
                    num = num;
                    C26338AVi.LJI(tuxIconView4, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), num3, C1FJ.LIZIZ(0), num, false, 26);
                }
                TuxIconView tuxIconView5 = this.LJLJLLL;
                if (tuxIconView5 != null) {
                    C78927UyJ.LJFF(tuxIconView5, C1FJ.LIZIZ(32), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32))));
                    tuxIconView5.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    tuxIconView5.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    C26338AVi.LJI(tuxIconView5, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), num, C1FJ.LIZIZ(0), num, false, 26);
                }
                View view2 = this.LJLLL;
                if (view2 != null) {
                    C78927UyJ.LJFF(view2, num, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(54))));
                }
            }
        } else {
            TuxIconView tuxIconView6 = this.LJLLILLLL;
            if (tuxIconView6 != null) {
                C78927UyJ.LJFF(tuxIconView6, AnonymousClass391.LIZJ(20), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20))));
                C26338AVi.LJI(tuxIconView6, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), AnonymousClass391.LIZJ(10), null, null, false, 28);
            }
            TuxIconView tuxIconView7 = this.LJLLI;
            if (tuxIconView7 != null) {
                C78927UyJ.LJFF(tuxIconView7, AnonymousClass391.LIZJ(20), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20))));
                num = null;
                C26338AVi.LJI(tuxIconView7, null, AnonymousClass391.LIZJ(10), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), null, false, 25);
            }
            View view3 = this.LJLLJ;
            if (view3 != null) {
                C78927UyJ.LJFF(view3, num, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40))));
            }
            C26338AVi.LJI(viewGroup, num, num, num, AnonymousClass391.LIZJ(14), false, 23);
            TuxIconView tuxIconView8 = this.LJLL;
            if (tuxIconView8 != null) {
                C78927UyJ.LJFF(tuxIconView8, AnonymousClass391.LIZJ(44), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(44))));
                tuxIconView8.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
                tuxIconView8.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
            }
            TuxIconView tuxIconView9 = this.LJLJLJ;
            if (tuxIconView9 != null) {
                C78927UyJ.LJFF(tuxIconView9, AnonymousClass391.LIZJ(52), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(52))));
                tuxIconView9.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
                tuxIconView9.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
                if (z) {
                    LIZIZ = 0;
                } else {
                    i2 = C1FJ.LIZIZ(8);
                    LIZIZ = C1FJ.LIZIZ(8);
                }
                C26338AVi.LJI(tuxIconView9, i2, num, LIZIZ, num, false, 26);
            }
            TuxIconView tuxIconView10 = this.LJLJLLL;
            if (tuxIconView10 != null) {
                C78927UyJ.LJFF(tuxIconView10, AnonymousClass391.LIZJ(44), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(44))));
                tuxIconView10.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
                tuxIconView10.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
            }
            View view4 = this.LJLLL;
            if (view4 != null) {
                C78927UyJ.LJFF(view4, num, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(66))));
            }
        }
        View view5 = this.LJLILLLLZI;
        if (view5 != null) {
            view5.invalidate();
        }
    }
}
