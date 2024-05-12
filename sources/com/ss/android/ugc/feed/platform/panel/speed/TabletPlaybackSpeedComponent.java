package com.ss.android.ugc.feed.platform.panel.speed;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C46302IFe;
import X.C46349IGz;
import X.C47390Iio;
import X.C48711J9v;
import X.C48712J9w;
import X.C48713J9x;
import X.C48740JAy;
import X.C51781KTx;
import X.C5H3;
import X.C62822Ol8;
import X.C98273tP;
import X.EnumC221088m0;
import X.HG3;
import X.IFH;
import X.IFO;
import X.IFP;
import X.InterfaceC55102Lju;
import X.JAK;
import X.KR8;
import X.KU4;
import X.LFH;
import X.RBX;
import X.X1D;
import Y.ACListenerS28S0100000_8;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.AqS64S0110000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TabletPlaybackSpeedComponent extends BasePanelUIComponent implements InterfaceC55102Lju {
    public final C5H3 LJLJJI;
    public final C221138m5 LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public LinearLayout LJLJLJ;
    public LinearLayout LJLJLLL;
    public C47390Iio LJLL;
    public C48740JAy LJLLI;
    public final C221138m5 LJLLILLLL;
    public boolean LJLLJ;
    public Aweme LJLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        str.getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabletPlaybackSpeedComponent() {
        C62822Ol8 c62822Ol8;
        new LinkedHashMap();
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 415), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 15));
        }
        this.LJLJJI = c62822Ol8;
        this.LJLJJL = KR8.LJIIJJI(new AqS158S0100000_8(this, 417));
        this.LJLLILLLL = KR8.LJIIJJI(C46302IFe.LJLIL);
    }

    public final Aweme getAweme() {
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLJJL.getValue();
        if (iViewPagerComponentAbility != null) {
            return iViewPagerComponentAbility.getCurrentPlayAweme();
        }
        return null;
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
        if (this.LJLLJ) {
            this.LJLLJ = false;
            C3(getAweme());
        }
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        this.LJLLJ = true;
    }

    public final void A3(Aweme aweme) {
        boolean z;
        C48740JAy c48740JAy;
        TuxTextView tuxTextView;
        float LIZIZ = IFH.LIZIZ(aweme);
        if (LIZIZ == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView2 = this.LJLJJLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(8);
            }
        } else if (LIZIZ == 2.0f) {
            TuxTextView tuxTextView3 = this.LJLJJLL;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(0);
            }
            TuxTextView tuxTextView4 = this.LJLJJLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setText("2x");
            }
        } else {
            TuxTextView tuxTextView5 = this.LJLJJLL;
            if (tuxTextView5 != null) {
                tuxTextView5.setVisibility(0);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZIZ);
            LIZ.append('x');
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            TuxTextView tuxTextView6 = this.LJLJJLL;
            if (tuxTextView6 != null) {
                tuxTextView6.setText(LIZIZ2);
            }
        }
        TuxTextView tuxTextView7 = this.LJLJL;
        if (tuxTextView7 != null && tuxTextView7.getVisibility() == 0 && (tuxTextView = this.LJLJL) != null) {
            tuxTextView.setVisibility(8);
        }
        LinearLayout linearLayout = this.LJLJLLL;
        if (linearLayout != null && linearLayout.getVisibility() == 0 && (c48740JAy = this.LJLLI) != null) {
            c48740JAy.LIZJ(c48740JAy.LJ, new AqS158S0100000_8(c48740JAy, 601));
        }
    }

    public final void C3(Aweme aweme) {
        if (v3(aweme)) {
            C48740JAy c48740JAy = this.LJLLI;
            if (c48740JAy != null && c48740JAy.LJII) {
                return;
            }
            if (getContainerView().getVisibility() == 0) {
                A3(aweme);
                return;
            }
            C48740JAy c48740JAy2 = this.LJLLI;
            if (c48740JAy2 == null) {
                return;
            }
            AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 416);
            View view = c48740JAy2.LIZJ;
            if (view != null && view.getVisibility() == 0) {
                aqS158S0100000_8.invoke();
                return;
            }
            o.LJIIIIZZ(c48740JAy2.LJIIIIZZ.getValue(), "<get-keva>(...)");
            if (!((Keva) r0).getBoolean("first_show_playback_speed", false)) {
                c48740JAy2.LJII = true;
                Object value = c48740JAy2.LJIIIIZZ.getValue();
                o.LJIIIIZZ(value, "<get-keva>(...)");
                ((Keva) value).storeBoolean("first_show_playback_speed", true);
                TuxTextView tuxTextView = c48740JAy2.LIZIZ;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                }
                TuxTextView tuxTextView2 = c48740JAy2.LIZ;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(8);
                }
                CountDownTimer countDownTimer = new CountDownTimer(3000L, 1000L, new C48712J9w(c48740JAy2, aqS158S0100000_8));
                c48740JAy2.LJI = countDownTimer;
                countDownTimer.start();
            } else {
                aqS158S0100000_8.invoke();
            }
            c48740JAy2.LIZ(true);
            return;
        }
        C48740JAy c48740JAy3 = this.LJLLI;
        if (c48740JAy3 != null) {
            View view2 = c48740JAy3.LIZJ;
            if (view2 == null || view2.getVisibility() != 8) {
                c48740JAy3.LIZLLL();
                c48740JAy3.LIZ(false);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        IFH.LIZLLL = new C48713J9x(this);
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLJJL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.De0(new IFO(this));
        }
        LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZLLL().LJJJ(new AqS174S0100000_8(this, 230));
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            Hox.LJLLI.LIZ(LIZ).gv0(new C48711J9v(this));
        }
        ((RBX) HG3.LJIILL()).addUserChangeListener(new C46349IGz(this));
        this.LJLJJLL = (TuxTextView) view.findViewById(R.id.hsg);
        this.LJLJL = (TuxTextView) view.findViewById(R.id.hsh);
        this.LJLJLJ = (LinearLayout) view.findViewById(R.id.hsc);
        this.LJLJLLL = (LinearLayout) view.findViewById(R.id.hsf);
        this.LJLLI = new C48740JAy(this.LJLJJLL, this.LJLJL, getContainerView(), this.LJLJLJ, this.LJLJLLL, new AqS158S0100000_8(this, 600));
        LinearLayout linearLayout = this.LJLJLJ;
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS28S0100000_8(this, 74));
        }
        this.LJLL = new C47390Iio(view, new AqS190S0100000_8(this, 65));
    }

    public final boolean v3(Aweme aweme) {
        IFP ifp;
        if (!IFH.LIZ(aweme) || (ifp = (IFP) this.LJLLILLLL.getValue()) == null || !ifp.LJIILJJIL(IFH.LIZIZ(aweme), aweme)) {
            return false;
        }
        if (getContainerView().getVisibility() != 0) {
            x3(aweme);
        }
        return true;
    }

    public final void x3(Aweme aweme) {
        String str;
        Aweme aweme2 = this.LJLLL;
        String str2 = null;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        if (o.LJ(str, str2)) {
            return;
        }
        this.LJLLL = aweme;
        C98273tP.LIZLLL("homepage_hot", aweme, "on_screen_button");
    }
}
