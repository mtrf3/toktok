package X;

import Y.ACListenerS34S0100000_14;
import Y.ARunnableS18S0101000_14;
import Y.ARunnableS50S0100000_14;
import Y.IDLListenerS10S0300000_14;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownState;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WOB extends WM7 implements InterfaceC151715xP {
    public static final /* synthetic */ int LL = 0;
    public View LJLIL;
    public WGP LJLILLLLZI;
    public WOX LJLJI;
    public InterfaceC82206WOc LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public TextView LJLJLJ;
    public SafeHandler LJLJLLL;
    public final CountdownViewModel LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public ViewGroup LJLLJ;
    public TextView LJLLL;
    public LinearLayout LJLLLL;
    public TextView LJLLLLLL;
    public TextView LJLZ;
    public View LJZ;
    public C60003Ngl LJZI;
    public WOA LJZL;

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        WOX wox = this.LJLJI;
        if (wox != null) {
            wox.LIZ();
        }
        InterfaceC82206WOc interfaceC82206WOc = this.LJLJJI;
        if (interfaceC82206WOc != null) {
            interfaceC82206WOc.onDismiss();
        }
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        ViewGroup viewGroup = this.LJLLJ;
        if (viewGroup != null) {
            viewGroup.post(new ARunnableS50S0100000_14(this, 85));
        } else {
            o.LJIJI("countDownTitleView");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        C60003Ngl c60003Ngl = this.LJZI;
        if (c60003Ngl != null) {
            c60003Ngl.LIZ();
        }
    }

    public WOB(CountdownState countdownState) {
        this.LJLL = new CountdownViewModel(countdownState);
    }

    public final void LLJILJIL(TextView textView) {
        RadioGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (!(layoutParams2 instanceof RadioGroup.LayoutParams) || (layoutParams = (RadioGroup.LayoutParams) layoutParams2) == null) {
            return;
        }
        layoutParams.width = (int) KL2.LIZJ(this.mActivity, 32.0f);
        textView.setLayoutParams(layoutParams);
    }

    public final float LLJILJILJ(float f) {
        if (this.LJLILLLLZI != null) {
            float measuredWidth = r0.getMeasuredWidth() - f;
            if (this.LJLJJLL != null) {
                return Math.min(1.0f, (measuredWidth - r0.getMeasuredWidth()) / 100.0f);
            }
            o.LJIJI("endTextView");
            throw null;
        }
        o.LJIJI("volumeTapsView");
        throw null;
    }

    public final void LLJJ(int i) {
        boolean z;
        TextView textView = this.LJLLLLLL;
        if (textView != null) {
            boolean z2 = true;
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            textView.setSelected(z);
            TextView textView2 = this.LJLZ;
            if (textView2 != null) {
                if (i != 10) {
                    z2 = false;
                }
                textView2.setSelected(z2);
                return;
            }
            o.LJIJI("countDownLongView");
            throw null;
        }
        o.LJIJI("countDownShortView");
        throw null;
    }

    public final void LLJJI(int i) {
        String str;
        Vibrator vibrator;
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        this.LJLLI = i;
        Object obj = null;
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class)).LJLIL;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("content_type", "video");
        if (this.LJLLI == 3) {
            str = "3s";
        } else {
            str = "10s";
        }
        c145995oB.LJI("to_status", str);
        FMX.LJIIL("select_countdown_type", c145995oB.LIZ);
        if (!C52306Kfu.LIZ()) {
            SafeHandler safeHandler = this.LJLJLLL;
            if (safeHandler != null) {
                safeHandler.post(new ARunnableS18S0101000_14(i, this, 7));
            } else {
                o.LJIJI("safeHandler");
                throw null;
            }
        } else {
            Activity activity2 = this.mActivity;
            if (activity2 != null) {
                obj = C16880lQ.LLILIL(activity2, "vibrator");
            }
            if ((obj instanceof Vibrator) && (vibrator = (Vibrator) obj) != null) {
                vibrator.vibrate(50L);
            }
        }
        ((IVideoRecordPreferences) new C44350Has(0).LIZ(activity, IVideoRecordPreferences.class)).setCountDownMode(i);
        WOA woa = this.LJZL;
        if (woa != null) {
            woa.onSwitch(i);
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        this.LJLJLLL = new SafeHandler(this);
        this.LJLL.ov0(WON.LJLIL);
        if (C52306Kfu.LIZ()) {
            i = R.layout.ax_;
        } else {
            i = R.layout.ax9;
        }
        int i2 = 0;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, container, false);
        LLLLIILL.setMinimumWidth(ImagePreloadExperiment.PRIORITY_DEFAULT);
        View findViewById = LLLLIILL.findViewById(R.id.ne7);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.volume_taps_view)");
        this.LJLILLLLZI = (WGP) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.ne8);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById…id.volume_taps_view_mask)");
        this.LJLIL = findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.l59);
        o.LJIIIIZZ(findViewById3, "contentView.findViewById(R.id.text_start)");
        this.LJLJJL = (TextView) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.l46);
        o.LJIIIIZZ(findViewById4, "contentView.findViewById(R.id.text_end)");
        this.LJLJJLL = (TextView) findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.l4x);
        o.LJIIIIZZ(findViewById5, "contentView.findViewById(R.id.text_progress)");
        this.LJLJL = (TextView) findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.kdb);
        o.LJIIIIZZ(findViewById6, "contentView.findViewById(R.id.start_record)");
        this.LJLJLJ = (TextView) findViewById6;
        View findViewById7 = LLLLIILL.findViewById(R.id.l_l);
        o.LJIIIIZZ(findViewById7, "contentView.findViewById(R.id.title_countDown)");
        this.LJLLJ = (ViewGroup) findViewById7;
        View findViewById8 = LLLLIILL.findViewById(R.id.l3u);
        o.LJIIIIZZ(findViewById8, "contentView.findViewById(R.id.text_countdown)");
        this.LJLLL = (TextView) findViewById8;
        View findViewById9 = LLLLIILL.findViewById(R.id.bw0);
        o.LJIIIIZZ(findViewById9, "contentView.findViewById(R.id.count_down_panel)");
        this.LJZ = findViewById9;
        View findViewById10 = LLLLIILL.findViewById(R.id.j1o);
        o.LJIIIIZZ(findViewById10, "contentView.findViewById(R.id.rg_countdown_switch)");
        this.LJLLLL = (LinearLayout) findViewById10;
        View findViewById11 = LLLLIILL.findViewById(R.id.ioe);
        o.LJIIIIZZ(findViewById11, "contentView.findViewById(R.id.rb_countdown_3)");
        this.LJLLLLLL = (TextView) findViewById11;
        View findViewById12 = LLLLIILL.findViewById(R.id.iod);
        o.LJIIIIZZ(findViewById12, "contentView.findViewById(R.id.rb_countdown_10)");
        this.LJLZ = (TextView) findViewById12;
        if (!C52306Kfu.LIZ()) {
            T5S t5s = new T5S();
            t5s.LIZ(82);
            TextView textView = this.LJLLLLLL;
            if (textView != null) {
                textView.getPaint().setTypeface(t5s.getTypeface());
                TextView textView2 = this.LJLZ;
                if (textView2 != null) {
                    textView2.getPaint().setTypeface(t5s.getTypeface());
                } else {
                    o.LJIJI("countDownLongView");
                    throw null;
                }
            } else {
                o.LJIJI("countDownShortView");
                throw null;
            }
        }
        if (C173636rf.LIZIZ(this.mActivity) && !C52306Kfu.LIZ()) {
            TextView textView3 = this.LJLLLLLL;
            if (textView3 != null) {
                textView3.setBackgroundResource(R.drawable.sx);
                TextView textView4 = this.LJLZ;
                if (textView4 != null) {
                    textView4.setBackgroundResource(R.drawable.sr);
                } else {
                    o.LJIJI("countDownLongView");
                    throw null;
                }
            } else {
                o.LJIJI("countDownShortView");
                throw null;
            }
        }
        TextView textView5 = this.LJLLLLLL;
        if (textView5 != null) {
            C16880lQ.LJIJI(textView5, new ACListenerS34S0100000_14(this, 23));
            TextView textView6 = this.LJLZ;
            if (textView6 != null) {
                C16880lQ.LJIJI(textView6, new ACListenerS34S0100000_14(this, 24));
                C44350Has c44350Has = new C44350Has(i2);
                Activity requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                int countDownMode = ((IVideoRecordPreferences) c44350Has.LIZ(requireActivity, IVideoRecordPreferences.class)).getCountDownMode(3);
                this.LJLLI = countDownMode;
                LLJJ(countDownMode);
                if (C58B.LIZ()) {
                    TextView textView7 = this.LJLJLJ;
                    if (textView7 != null) {
                        C110614Vt c110614Vt = new C110614Vt();
                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
                        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
                        TextView textView8 = this.LJLJLJ;
                        if (textView8 != null) {
                            Context context = textView8.getContext();
                            o.LJIIIIZZ(context, "record.context");
                            textView7.setBackground(c110614Vt.LIZ(context));
                        } else {
                            o.LJIJI("record");
                            throw null;
                        }
                    } else {
                        o.LJIJI("record");
                        throw null;
                    }
                }
                TextView textView9 = this.LJLJLJ;
                if (textView9 != null) {
                    C16880lQ.LJIJI(textView9, new ACListenerS34S0100000_14(this, 25));
                    View findViewById13 = LLLLIILL.findViewById(R.id.bw2);
                    if (C52529KjV.LIZ()) {
                        findViewById13.setVisibility(8);
                    } else {
                        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 26), findViewById13);
                    }
                    View view = this.LJZ;
                    if (view != null) {
                        C73156SnQ.LJIIL(this, this.LJLL, new AqS196S0100000_14(this, 17));
                        C73156SnQ.LJIIIIZZ(this, this.LJLL, new TBT() { // from class: X.WOT
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((CountdownState) obj).getTaps();
                            }
                        }, new AqS196S0100000_14(this, 18));
                        WGP wgp = this.LJLILLLLZI;
                        if (wgp != null) {
                            wgp.setOnProgressChangeListener(new WOI(this));
                            TextView textView10 = this.LJLJJL;
                            if (textView10 != null) {
                                textView10.setText("0s");
                                C73156SnQ.LJIIIIZZ(this, this.LJLL, new TBT() { // from class: X.WOQ
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return Long.valueOf(((CountdownState) obj).getMaxDuration());
                                    }
                                }, new AqS196S0100000_14(this, 19));
                                LLLLIILL.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS10S0300000_14(this, view, LLLLIILL, 1));
                                return LLLLIILL;
                            }
                            o.LJIJI("startTextView");
                            throw null;
                        }
                        o.LJIJI("volumeTapsView");
                        throw null;
                    }
                    o.LJIJI("countdownPanel");
                    throw null;
                }
                o.LJIJI("record");
                throw null;
            }
            o.LJIJI("countDownLongView");
            throw null;
        }
        o.LJIJI("countDownShortView");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public final void LLJJIII(long j, long j2, long j3, boolean z) {
        SafeHandler safeHandler = this.LJLJLLL;
        if (safeHandler != null) {
            safeHandler.post(new RunnableC81682W3y(this, j, j2, j3, z));
        } else {
            o.LJIJI("safeHandler");
            throw null;
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
