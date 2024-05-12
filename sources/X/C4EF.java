package X;

import Y.ACListenerS21S0100000_1;
import Y.ALAdapterS0S0200000_1;
import Y.ARunnableS10S0100100_1;
import Y.AUListenerS6S0102000_1;
import Y.AUListenerS90S0100000_1;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4EF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EF extends FrameLayout {
    public InterfaceC65784Pro<C76800UCe> LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C110614Vt LJLLL;
    public final C62822Ol8 LJLLLL;
    public final ArgbEvaluator LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public Long LJZ;
    public final C62822Ol8 LJZI;
    public C4E5 LJZL;
    public C4E3 LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public C99033ud LLFFF;

    private final ValueAnimator getContainerColorAnimator() {
        return (ValueAnimator) this.LJLLJ.getValue();
    }

    private final ValueAnimator getContainerHeightAnimator() {
        return (ValueAnimator) this.LJLLILLLL.getValue();
    }

    private final C4EH getContentView() {
        return (C4EH) this.LJZI.getValue();
    }

    private final TuxTextView getHoldToTalk() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-holdToTalk>(...)");
        return (TuxTextView) value;
    }

    private final ValueAnimator getInitiateViewAlphaAnimator() {
        return (ValueAnimator) this.LJLZ.getValue();
    }

    private final C77869UhF getTalkingHighVolumeView() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-talkingHighVolumeView>(...)");
        return (C77869UhF) value;
    }

    private final C77869UhF getTalkingLowVolumeView() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-talkingLowVolumeView>(...)");
        return (C77869UhF) value;
    }

    private final C77869UhF getTalkingStartView() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-talkingStartView>(...)");
        return (C77869UhF) value;
    }

    private final ValueAnimator getTalkingViewAlphaAnimator() {
        return (ValueAnimator) this.LJLLLL.getValue();
    }

    public final void LIZLLL() {
        if (!this.LLF) {
            this.LLF = true;
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.s3f);
            c26045AKb.LJIIJ();
            C99033ud c99033ud = this.LLFFF;
            if (c99033ud == null) {
                return;
            }
            C4D6.LIZJ(c99033ud, "disconnected");
        }
    }

    public final View getHttContainer() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-httContainer>(...)");
        return (View) value;
    }

    public final View getInitiateView() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-initiateView>(...)");
        return (View) value;
    }

    public final View getTalkingView() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-talkingView>(...)");
        return (View) value;
    }

    public final void LIZJ() {
        if (getTalkingStartView().isAnimating()) {
            getTalkingStartView().cancelAnimation();
            getTalkingStartView().setVisibility(8);
        }
        if (getTalkingLowVolumeView().isAnimating()) {
            getTalkingLowVolumeView().cancelAnimation();
        }
        if (getTalkingHighVolumeView().isAnimating()) {
            getTalkingHighVolumeView().cancelAnimation();
        }
        getTalkingStartView().setVisibility(8);
        getTalkingLowVolumeView().setVisibility(8);
        getTalkingHighVolumeView().setVisibility(8);
    }

    public final void LJFF() {
        getInitiateViewAlphaAnimator().cancel();
        getInitiateViewAlphaAnimator().setFloatValues(getInitiateView().getAlpha(), 0.0f);
        getInitiateViewAlphaAnimator().start();
        getContainerHeightAnimator().cancel();
        getContainerHeightAnimator().setIntValues(getHttContainer().getHeight(), C7MY.LIZIZ(58));
        getContainerHeightAnimator().start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZJ();
    }

    public final InterfaceC65784Pro<C76800UCe> getKeyboardEntranceClickCallback() {
        return this.LJLIL;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnCancelCallback() {
        return this.LJLJI;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnSendCallback() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnStartSpeechCallback() {
        return this.LJLJJI;
    }

    public final C99033ud getSessionInfo() {
        return this.LLFFF;
    }

    public final C4E5 getState() {
        return this.LJZL;
    }

    public final C4E3 getTalkState() {
        return this.LL;
    }

    public final void LIZ(boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Window window;
        ViewGroup viewGroup3;
        View view = null;
        if (z) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            C4EH contentView = getContentView();
            contentView.getClass();
            contentView.LJLJI = System.currentTimeMillis();
            contentView.LJLJJI = new OSZ<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            ((TextView) contentView.LIZ(R.id.bst)).setText("");
            contentView.setTipState(C4EG.DEFAULT);
            if (contentView.getParent() != null) {
                ViewParent parent = contentView.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent) != null) {
                    C16880lQ.LJLLL(contentView, viewGroup3);
                }
            }
            contentView.getLocationOnScreen(iArr);
            Context context = contentView.getContext();
            o.LJIIIIZZ(context, "context");
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null && (window = LJIJJ.getWindow()) != null) {
                view = window.getDecorView();
            }
            if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
                viewGroup2.addView(contentView, new FrameLayout.LayoutParams(-1, -2));
                return;
            }
            return;
        }
        this.LLF = false;
        C4EH contentView2 = getContentView();
        long j = contentView2.LJLJI;
        C4EG c4eg = contentView2.LJLJJL;
        if (c4eg == C4EG.MSG_TOO_SHORT_TIP || c4eg == C4EG.UN_RECOGNIZE_TIP) {
            contentView2.postDelayed(new ARunnableS10S0100100_1(j, contentView2, 1), 2000L);
            return;
        }
        if (contentView2.getParent() != null) {
            ViewParent parent2 = contentView2.getParent();
            if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                C16880lQ.LJLLL(contentView2, viewGroup);
            }
        }
        ((TextView) contentView2.LIZ(R.id.bst)).setText("");
        contentView2.setTipState(C4EG.DEFAULT);
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            getHoldToTalk().setTextColorRes(R.attr.go);
        } else {
            getHoldToTalk().setTextColorRes(R.attr.gx);
        }
    }

    public final void LJ(C4E5 c4e5) {
        if (C4E5.INITIATE == c4e5) {
            getInitiateView().setVisibility(0);
            getTalkingView().setVisibility(8);
            LIZJ();
        } else {
            getInitiateView().setVisibility(8);
            getTalkingView().setVisibility(0);
        }
    }

    public final void LJI(C4EG state) {
        o.LJIIIZ(state, "state");
        getContentView().setTipState(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x024c, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L116;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4EF.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setKeyboardEntranceClickCallback(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }

    public final void setOnCancelCallback(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJI = interfaceC65784Pro;
    }

    public final void setOnSendCallback(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLILLLLZI = interfaceC65784Pro;
    }

    public final void setOnStartSpeechCallback(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJJI = interfaceC65784Pro;
    }

    public final void setSessionInfo(C99033ud c99033ud) {
        this.LLFFF = c99033ud;
    }

    public final void setState(C4E5 value) {
        o.LJIIIZ(value, "value");
        if (this.LJZL == value) {
            return;
        }
        LJ(value);
        int i = C4E4.LIZ[value.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    getContentView().setTipState(C4EG.CANCEL_TIP);
                    getContainerColorAnimator().cancel();
                    C16880lQ.LJLJL(getContainerColorAnimator());
                    this.LJLLL.LIZJ = C61328O5c.LIZJ(29);
                    if (this.LJZL == C4E5.INITIATE) {
                        LJFF();
                        getContainerColorAnimator().addUpdateListener(new AUListenerS6S0102000_1(R.attr.cr, R.attr.e7, this, 0));
                    } else {
                        getContainerColorAnimator().addUpdateListener(new AUListenerS6S0102000_1(R.attr.bu, R.attr.e7, this, 0));
                    }
                    getContainerColorAnimator().start();
                }
            } else {
                getContainerColorAnimator().cancel();
                C16880lQ.LJLJL(getContainerColorAnimator());
                this.LJLLL.LIZJ = C61328O5c.LIZJ(29);
                if (this.LJZL == C4E5.INITIATE) {
                    LJFF();
                    getContainerColorAnimator().addUpdateListener(new AUListenerS6S0102000_1(R.attr.cr, R.attr.bu, this, 0));
                } else {
                    getContainerColorAnimator().addUpdateListener(new AUListenerS6S0102000_1(R.attr.e7, R.attr.bu, this, 0));
                }
                getContainerColorAnimator().start();
            }
        } else {
            getContainerColorAnimator().cancel();
            C16880lQ.LJLJL(getContainerColorAnimator());
            getInitiateViewAlphaAnimator().cancel();
            getContainerHeightAnimator().cancel();
            this.LJLLL.LIZJ = C61328O5c.LIZJ(25);
            if (this.LJZL == C4E5.TALKING) {
                getContainerColorAnimator().addUpdateListener(new AUListenerS6S0102000_1(R.attr.bu, R.attr.cr, this, 0));
            } else {
                getContainerColorAnimator().addUpdateListener(new AUListenerS6S0102000_1(R.attr.e7, R.attr.cr, this, 0));
            }
            getContainerHeightAnimator().setIntValues(getHttContainer().getHeight(), C7MY.LIZIZ(50));
            getInitiateViewAlphaAnimator().setFloatValues(getInitiateView().getAlpha(), 1.0f);
            getContainerColorAnimator().start();
            getContainerHeightAnimator().start();
            getInitiateViewAlphaAnimator().start();
        }
        this.LJZL = value;
    }

    public final void setTalkInterrupted(boolean z) {
        this.LLD = z;
    }

    public final void setTalkState(C4E3 value) {
        o.LJIIIZ(value, "value");
        if (this.LL == value) {
            return;
        }
        this.LL = value;
        int i = C4E4.LIZIZ[value.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    LIZJ();
                    ValueAnimator talkingViewAlphaAnimator = getTalkingViewAlphaAnimator();
                    if (talkingViewAlphaAnimator.isRunning()) {
                        talkingViewAlphaAnimator.cancel();
                    }
                    talkingViewAlphaAnimator.setFloatValues(1.0f, 0.0f);
                    talkingViewAlphaAnimator.addUpdateListener(new AUListenerS90S0100000_1(this, 60));
                    talkingViewAlphaAnimator.setDuration(50L);
                    talkingViewAlphaAnimator.start();
                    return;
                }
                LIZJ();
                getTalkingHighVolumeView().setVisibility(0);
                getTalkingHighVolumeView().playAnimation();
                return;
            }
            LIZJ();
            getTalkingLowVolumeView().setVisibility(0);
            getTalkingLowVolumeView().playAnimation();
            return;
        }
        LIZJ();
        ValueAnimator talkingViewAlphaAnimator2 = getTalkingViewAlphaAnimator();
        if (talkingViewAlphaAnimator2.isRunning()) {
            talkingViewAlphaAnimator2.cancel();
        }
        talkingViewAlphaAnimator2.setFloatValues(0.0f, 1.0f);
        talkingViewAlphaAnimator2.setDuration(100L);
        talkingViewAlphaAnimator2.start();
        getTalkingStartView().setVisibility(0);
        getTalkingStartView().playAnimation();
        C77869UhF talkingStartView = getTalkingStartView();
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(this, 872);
        o.LJIIIZ(talkingStartView, "<this>");
        talkingStartView.addAnimatorListener(new ALAdapterS0S0200000_1(talkingStartView, aqS151S0100000_1, 6));
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4EF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 868));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 870));
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 869));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 876));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 875));
        this.LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 874));
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 873));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 866));
        this.LJLLJ = C221108m2.LIZIZ(C4EK.LJLIL);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = C79045V0n.LJI(R.attr.cr, context);
        c110614Vt.LIZJ = C61328O5c.LIZJ(25);
        this.LJLLL = c110614Vt;
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 877));
        this.LJLLLLLL = new ArgbEvaluator();
        this.LJLZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 871));
        this.LJZI = C221108m2.LIZIZ(new AqS151S0100000_1(context, 867));
        C4E5 c4e5 = C4E5.INITIATE;
        this.LJZL = c4e5;
        this.LL = C4E3.STOP;
        C16880lQ.LLLZIIL(R.layout.b7b, C16880lQ.LLZIL(context), this);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.fe1);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS21S0100000_1(this, 172));
        }
        getHttContainer().setBackground(c110614Vt.LIZ(context));
        LJ(c4e5);
        getTalkingStartView().setAnimation("im_htt_start_talk.json");
        getTalkingLowVolumeView().setAnimation("im_htt_talking_low_volume.json");
        getTalkingLowVolumeView().setRepeatCount(-1);
        getTalkingHighVolumeView().setAnimation("im_htt_talking_high_volume.json");
        getTalkingHighVolumeView().setRepeatCount(-1);
    }
}
