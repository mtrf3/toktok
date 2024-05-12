package X;

import Y.ACListenerS34S0100000_14;
import Y.ARunnableS18S0101000_14;
import Y.ARunnableS50S0100000_14;
import Y.IDLListenerS10S0300000_14;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.ftc.countdown.FTCCountdownState;
import com.ss.android.ugc.aweme.ftc.countdown.FTCCountdownViewModel;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WOC extends WM7 implements InterfaceC151715xP {
    public static final /* synthetic */ int LJZI = 0;
    public GestureDetectorOnGestureListenerC81986WFq LJLIL;
    public WOW LJLILLLLZI;
    public InterfaceC82205WOb LJLJI;
    public TextView LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public SafeHandler LJLJLJ;
    public final FTCCountdownViewModel LJLJLLL;
    public int LJLL;
    public ViewGroup LJLLI;
    public TextView LJLLILLLL;
    public RadioGroup LJLLJ;
    public C63045Ooj LJLLL;
    public C63045Ooj LJLLLL;
    public View LJLLLLLL;
    public C60003Ngl LJLZ;
    public WOY LJZ;

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
        WOW wow = this.LJLILLLLZI;
        if (wow != null) {
            wow.LIZ();
        }
        InterfaceC82205WOb interfaceC82205WOb = this.LJLJI;
        if (interfaceC82205WOb != null) {
            interfaceC82205WOb.onDismiss();
        }
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        ViewGroup viewGroup = this.LJLLI;
        if (viewGroup != null) {
            viewGroup.post(new ARunnableS50S0100000_14(this, 63));
        } else {
            o.LJIJI("countDownTitleView");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        C60003Ngl c60003Ngl = this.LJLZ;
        if (c60003Ngl != null) {
            c60003Ngl.LIZ();
        }
    }

    public WOC(FTCCountdownState fTCCountdownState) {
        this.LJLJLLL = new FTCCountdownViewModel(fTCCountdownState);
    }

    public final void LLJILJIL(C63045Ooj c63045Ooj) {
        RadioGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = c63045Ooj.getLayoutParams();
        if (!(layoutParams2 instanceof RadioGroup.LayoutParams) || (layoutParams = (RadioGroup.LayoutParams) layoutParams2) == null) {
            return;
        }
        layoutParams.width = (int) KL2.LIZJ(this.mActivity, 32.0f);
        c63045Ooj.setLayoutParams(layoutParams);
    }

    public final float LLJILJILJ(float f) {
        if (this.LJLIL != null) {
            float measuredWidth = r0.getMeasuredWidth() - f;
            if (this.LJLJJL != null) {
                return Math.min(1.0f, (measuredWidth - r0.getMeasuredWidth()) / 100.0f);
            }
            o.LJIJI("endTextView");
            throw null;
        }
        o.LJIJI("volumeTapsView");
        throw null;
    }

    public final void LLJJ(int i) {
        String str;
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        this.LJLL = i;
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) ViewModelProviders.of((ActivityC45651qj) activity).get(ShortVideoContextViewModel.class)).LJLIL;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("content_type", "video");
        if (this.LJLL == 3) {
            str = "3s";
        } else {
            str = "10s";
        }
        c145995oB.LJI("to_status", str);
        FMX.LJIIL("select_countdown_type", c145995oB.LIZ);
        SafeHandler safeHandler = this.LJLJLJ;
        if (safeHandler != null) {
            safeHandler.post(new ARunnableS18S0101000_14(i, this, 5));
            ((IVideoRecordPreferences) new C44350Has(0).LIZ(activity, IVideoRecordPreferences.class)).setCountDownMode(i);
            WOY woy = this.LJZ;
            if (woy != null) {
                woy.onSwitch(i);
                return;
            }
            return;
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public final void LLJJI(long j, long j2, long j3) {
        SafeHandler safeHandler = this.LJLJLJ;
        if (safeHandler != null) {
            safeHandler.post(new W2V(this, j, j2, j3));
        } else {
            o.LJIJI("safeHandler");
            throw null;
        }
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        this.LJLJLJ = new SafeHandler(this);
        this.LJLJLLL.ov0(WOM.LJLIL);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.az0, container, false);
        LLLLIILL.setMinimumWidth(ImagePreloadExperiment.PRIORITY_DEFAULT);
        View findViewById = LLLLIILL.findViewById(R.id.ne7);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.volume_taps_view)");
        this.LJLIL = (GestureDetectorOnGestureListenerC81986WFq) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.l59);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById(R.id.text_start)");
        this.LJLJJI = (TextView) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.l46);
        o.LJIIIIZZ(findViewById3, "contentView.findViewById(R.id.text_end)");
        this.LJLJJL = (TextView) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.l4x);
        o.LJIIIIZZ(findViewById4, "contentView.findViewById(R.id.text_progress)");
        this.LJLJJLL = (TextView) findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.kdb);
        o.LJIIIIZZ(findViewById5, "contentView.findViewById(R.id.start_record)");
        this.LJLJL = (TextView) findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.l_l);
        o.LJIIIIZZ(findViewById6, "contentView.findViewById(R.id.title_countDown)");
        this.LJLLI = (ViewGroup) findViewById6;
        View findViewById7 = LLLLIILL.findViewById(R.id.l3u);
        o.LJIIIIZZ(findViewById7, "contentView.findViewById(R.id.text_countdown)");
        this.LJLLILLLL = (TextView) findViewById7;
        View findViewById8 = LLLLIILL.findViewById(R.id.bw0);
        o.LJIIIIZZ(findViewById8, "contentView.findViewById(R.id.count_down_panel)");
        this.LJLLLLLL = findViewById8;
        View findViewById9 = LLLLIILL.findViewById(R.id.j1o);
        o.LJIIIIZZ(findViewById9, "contentView.findViewById(R.id.rg_countdown_switch)");
        this.LJLLJ = (RadioGroup) findViewById9;
        View findViewById10 = LLLLIILL.findViewById(R.id.ioe);
        o.LJIIIIZZ(findViewById10, "contentView.findViewById(R.id.rb_countdown_3)");
        this.LJLLL = (C63045Ooj) findViewById10;
        View findViewById11 = LLLLIILL.findViewById(R.id.iod);
        o.LJIIIIZZ(findViewById11, "contentView.findViewById(R.id.rb_countdown_10)");
        this.LJLLLL = (C63045Ooj) findViewById11;
        T5S t5s = new T5S();
        t5s.LIZ(82);
        C63045Ooj c63045Ooj = this.LJLLL;
        if (c63045Ooj != null) {
            c63045Ooj.getPaint().setTypeface(t5s.getTypeface());
            C63045Ooj c63045Ooj2 = this.LJLLLL;
            if (c63045Ooj2 != null) {
                c63045Ooj2.getPaint().setTypeface(t5s.getTypeface());
                Activity activity = this.mActivity;
                if (activity != null && C173636rf.LIZIZ(activity)) {
                    C63045Ooj c63045Ooj3 = this.LJLLL;
                    if (c63045Ooj3 != null) {
                        c63045Ooj3.setBackgroundResource(R.drawable.sx);
                        C63045Ooj c63045Ooj4 = this.LJLLLL;
                        if (c63045Ooj4 != null) {
                            c63045Ooj4.setBackgroundResource(R.drawable.sr);
                        } else {
                            o.LJIJI("countDownLongView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("countDownShortView");
                        throw null;
                    }
                }
                RadioGroup radioGroup = this.LJLLJ;
                if (radioGroup != null) {
                    radioGroup.setOnCheckedChangeListener(new WOK(this));
                    C44350Has c44350Has = new C44350Has(0);
                    Activity requireActivity = requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    int countDownMode = ((IVideoRecordPreferences) c44350Has.LIZ(requireActivity, IVideoRecordPreferences.class)).getCountDownMode(3);
                    this.LJLL = countDownMode;
                    if (countDownMode == 3) {
                        C63045Ooj c63045Ooj5 = this.LJLLL;
                        if (c63045Ooj5 != null) {
                            c63045Ooj5.setChecked(true);
                        } else {
                            o.LJIJI("countDownShortView");
                            throw null;
                        }
                    } else {
                        C63045Ooj c63045Ooj6 = this.LJLLLL;
                        if (c63045Ooj6 != null) {
                            c63045Ooj6.setChecked(true);
                        } else {
                            o.LJIJI("countDownLongView");
                            throw null;
                        }
                    }
                    TextView textView = this.LJLJL;
                    if (textView != null) {
                        C16880lQ.LJIJI(textView, new ACListenerS34S0100000_14(this, 13));
                        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 14), LLLLIILL.findViewById(R.id.bw2));
                        View view = this.LJLLLLLL;
                        if (view != null) {
                            C73156SnQ.LJIIL(this, this.LJLJLLL, new AqS196S0100000_14(this, 9));
                            C73156SnQ.LJIIIIZZ(this, this.LJLJLLL, new TBT() { // from class: X.WOS
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((FTCCountdownState) obj).getTaps();
                                }
                            }, new AqS196S0100000_14(this, 10));
                            GestureDetectorOnGestureListenerC81986WFq gestureDetectorOnGestureListenerC81986WFq = this.LJLIL;
                            if (gestureDetectorOnGestureListenerC81986WFq != null) {
                                gestureDetectorOnGestureListenerC81986WFq.setOnProgressChangeListener(new WOJ(this));
                                TextView textView2 = this.LJLJJI;
                                if (textView2 != null) {
                                    textView2.setText("0s");
                                    C73156SnQ.LJIIIIZZ(this, this.LJLJLLL, new TBT() { // from class: X.WOP
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return Long.valueOf(((FTCCountdownState) obj).getMaxDuration());
                                        }
                                    }, new AqS196S0100000_14(this, 11));
                                    LLLLIILL.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS10S0300000_14(this, view, LLLLIILL, 0));
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
                o.LJIJI("countDownSwitchView");
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
