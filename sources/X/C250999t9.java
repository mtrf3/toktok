package X;

import Y.ACListenerS24S0100000_4;
import Y.ALAdapterS1S0000000_4;
import Y.ALAdapterS3S0100000_4;
import Y.ALAdapterS3S0200000_4;
import Y.ARunnableS10S0110000_4;
import Y.AUListenerS93S0100000_4;
import Y.IDAListenerS73S0000000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.Bubble;
import com.bytedance.touchpoint.core.model.TimerPendant;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9t9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250999t9 extends ViewOnTouchListenerC251379tl {
    public int LJLLL;
    public GradientDrawable LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public C9OT LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public InterfaceC251479tv LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public int LLIIJI;
    public View LLIIJLIL;
    public TextView LLIIL;
    public View LLIILII;
    public TextView LLIILZL;
    public View LLIIZ;
    public C251389tm LLIL;
    public C251409to LLILII;

    private final TuxIconView getArrowView() {
        return (TuxIconView) this.LLIIIL.getValue();
    }

    private final View getPendantLayout() {
        return (View) this.LLFZ.getValue();
    }

    private final View getProgressLayout() {
        return (View) this.LLI.getValue();
    }

    private final C72832SiC getRewardLottieView() {
        return (C72832SiC) this.LLF.getValue();
    }

    private final C72832SiC getShrinkLottieView() {
        return (C72832SiC) this.LLD.getValue();
    }

    private final ImageView getTimerCloseView() {
        return (ImageView) this.LLIFFJFJJ.getValue();
    }

    private final C2312195p getTopRewardsView() {
        return (C2312195p) this.LLIIIJ.getValue();
    }

    public final TextView getBonusTextView() {
        return (TextView) this.LLFII.getValue();
    }

    public final C72832SiC getBreathLottieView() {
        return (C72832SiC) this.LL.getValue();
    }

    public final TextView getCoinTextView() {
        return (TextView) this.LLIIIILZ.getValue();
    }

    public final View getLongBubbleLayout() {
        return (View) this.LLII.getValue();
    }

    public final C72832SiC getLottieView() {
        return (C72832SiC) this.LJZL.getValue();
    }

    public final C173726ro getProgressBarTimerView() {
        return (C173726ro) this.LJZI.getValue();
    }

    public final AAY getShapeBubbleView() {
        return (AAY) this.LLIIIZ.getValue();
    }

    public final FrameLayout getShrinkBG() {
        return (FrameLayout) this.LLFFF.getValue();
    }

    public final FrameLayout getShrinkView() {
        return (FrameLayout) this.LLFF.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getLottieView().isAnimating()) {
            getLottieView().cancelAnimation();
        }
    }

    public final boolean getHasBreathLottie() {
        return this.LJLLLLLL;
    }

    public final C9OT getPendant() {
        return this.LJZ;
    }

    public final InterfaceC251479tv getSubViewListener() {
        return this.LLIIII;
    }

    public C250999t9(Context context) {
        super(context, null, 0);
        this.LJLZ = true;
        this.LJZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1036));
        this.LJZL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1034));
        this.LL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1027));
        this.LLD = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1028));
        this.LLF = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1038));
        this.LLFF = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1029));
        this.LLFFF = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1026));
        this.LLFII = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1025));
        this.LLFZ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1035));
        this.LLI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1037));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1031));
        this.LLII = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1033));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1030));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1032));
        this.LLIIIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1024));
        this.LLIIIZ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1021));
        if (C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cte, this, true) != null) {
            if (this.LJLLLL == null) {
                int LIZ = C247489nU.LIZ(R.attr.gv, context);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setGradientType(2);
                gradientDrawable.setShape(1);
                gradientDrawable.setColors(new int[]{LIZ, LIZ});
                this.LJLLLL = gradientDrawable;
                this.LJLLILLLL = true;
            }
            if (C251659uD.LIZ()) {
                getArrowView().setRotation(180.0f);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    public final void LIZLLL(boolean z) {
        Boolean bool;
        float width;
        int i;
        TimerPendant timerPendant;
        setCanDrag(true);
        C9OT c9ot = this.LJZ;
        if (c9ot != null && (timerPendant = c9ot.LJLILLLLZI) != null) {
            bool = timerPendant.bottomTexShow;
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            String charSequence = getCoinTextView().getText().toString();
            TextView coinTextView = getCoinTextView();
            if (o.LJ(CardStruct.IStatusCode.DEFAULT, charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            coinTextView.setVisibility(i);
        }
        getPendantLayout().setVisibility(0);
        getShrinkView().setVisibility(8);
        getRewardLottieView().setVisibility(8);
        if (getParent() == null) {
            return;
        }
        Object parent = getParent();
        if (parent != null) {
            View view = (View) parent;
            if (!z) {
                width = KL2.LIZJ(getContext(), 0.0f);
            } else {
                width = view.getWidth() - KL2.LIZJ(getContext(), 64.0f);
            }
            animate().setListener(new IDAListenerS73S0000000_4(2)).x(width).y(getY()).setInterpolator(new DecelerateInterpolator()).setDuration(200L).start();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    public final void LJ(boolean z) {
        float[] fArr;
        float width;
        getCoinTextView().setVisibility(8);
        getPendantLayout().setVisibility(8);
        getShrinkView().setVisibility(0);
        FrameLayout shrinkBG = getShrinkBG();
        GradientDrawable LIZIZ = T28.LIZIZ(0);
        if (C251659uD.LIZ()) {
            fArr = new float[]{KL2.LIZJ(getContext(), 34.0f), KL2.LIZJ(getContext(), 34.0f), 0.0f, 0.0f, 0.0f, 0.0f, KL2.LIZJ(getContext(), 34.0f), KL2.LIZJ(getContext(), 34.0f)};
        } else {
            fArr = new float[]{0.0f, 0.0f, KL2.LIZJ(getContext(), 34.0f), KL2.LIZJ(getContext(), 34.0f), KL2.LIZJ(getContext(), 34.0f), KL2.LIZJ(getContext(), 34.0f), 0.0f, 0.0f};
        }
        LIZIZ.setCornerRadii(fArr);
        LIZIZ.setColor(C247489nU.LIZIZ(C247489nU.LIZ, "#59000000"));
        shrinkBG.setBackground(LIZIZ);
        if (getParent() == null) {
            return;
        }
        Object parent = getParent();
        if (parent != null) {
            View view = (View) parent;
            if (!z) {
                width = KL2.LIZJ(getContext(), -8.0f);
            } else {
                width = view.getWidth() - KL2.LIZJ(getContext(), 34.0f);
            }
            animate().setListener(new IDAListenerS73S0000000_4(3)).x(width).y(getY()).setInterpolator(new DecelerateInterpolator()).setDuration(200L).start();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    public final void LJFF(int i) {
        Boolean bool;
        TimerPendant timerPendant;
        this.LJLLL = 0;
        C173726ro progressBarTimerView = getProgressBarTimerView();
        progressBarTimerView.LJLJLLL = progressBarTimerView.LJLJJL * 0.0f;
        progressBarTimerView.invalidate();
        if (i != 2) {
            getCoinTextView().setText(CardStruct.IStatusCode.DEFAULT);
        }
        C9OT c9ot = this.LJZ;
        if (c9ot != null && (timerPendant = c9ot.LJLILLLLZI) != null) {
            bool = timerPendant.canBeClosed;
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            getTimerCloseView().setVisibility(0);
            C16880lQ.LJIILLIIL(getTimerCloseView(), new ACListenerS24S0100000_4(this, 215));
        } else {
            getTimerCloseView().setVisibility(8);
        }
    }

    public final void LJIIIIZZ(String content) {
        o.LJIIIZ(content, "content");
        C2312195p.LIZIZ(getTopRewardsView(), content);
    }

    public final void LJIIJ(boolean z) {
        float width;
        Boolean bool;
        int i;
        TimerPendant timerPendant;
        Object parent = getParent();
        if (parent != null) {
            View view = (View) parent;
            if (!z) {
                width = KL2.LIZJ(getContext(), 0.0f);
            } else {
                width = view.getWidth() - KL2.LIZJ(getContext(), 56.0f);
            }
            setX(width);
            setCanDrag(true);
            C9OT c9ot = this.LJZ;
            if (c9ot != null && (timerPendant = c9ot.LJLILLLLZI) != null) {
                bool = timerPendant.bottomTexShow;
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                String charSequence = getCoinTextView().getText().toString();
                TextView coinTextView = getCoinTextView();
                if (o.LJ(CardStruct.IStatusCode.DEFAULT, charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                coinTextView.setVisibility(i);
            }
            getPendantLayout().setVisibility(0);
            getShrinkView().setVisibility(8);
            getRewardLottieView().setVisibility(8);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final void setHasBreathLottie(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setPendant(C9OT c9ot) {
        this.LJZ = c9ot;
    }

    public final void setProgressBackgroundColor(List<String> colorList) {
        o.LJIIIZ(colorList, "colorList");
        try {
            int parseColor = Color.parseColor((String) ListProtector.get(colorList, 0));
            int parseColor2 = Color.parseColor((String) ListProtector.get(colorList, 1));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setGradientType(2);
            gradientDrawable.setShape(1);
            gradientDrawable.setColors(new int[]{parseColor, parseColor2});
            this.LJLLLL = gradientDrawable;
            getProgressLayout().setBackground(this.LJLLLL);
        } catch (Throwable unused) {
        }
    }

    public final void setProgressForegroundColor(List<String> colorList) {
        o.LJIIIZ(colorList, "colorList");
        getProgressBarTimerView().setProgressForegroundColor(colorList);
    }

    public final void setSubViewListener(InterfaceC251479tv interfaceC251479tv) {
        this.LLIIII = interfaceC251479tv;
    }

    public final void LIZJ(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return;
        }
        C72832SiC rewardLottieView = getRewardLottieView();
        rewardLottieView.setRepeatCount(0);
        rewardLottieView.setMinAndMaxFrame(num.intValue(), num2.intValue());
        rewardLottieView.playAnimation();
    }

    public final void LJI(boolean z, boolean z2) {
        Boolean bool;
        String str;
        TimerPendant timerPendant;
        TimerPendant timerPendant2;
        C9OT c9ot = this.LJZ;
        if (c9ot != null && (timerPendant2 = c9ot.LJLILLLLZI) != null) {
            bool = timerPendant2.bottomTexShow;
        } else {
            bool = null;
        }
        if (!o.LJ(bool, Boolean.TRUE)) {
            return;
        }
        int i = 0;
        if (!z2) {
            C9OT c9ot2 = C2MW.LIZ().LJ;
            if (c9ot2 == null || (timerPendant = c9ot2.LJLILLLLZI) == null || (str = timerPendant.bottomText) == null) {
                str = "";
            }
            TextView coinTextView = getCoinTextView();
            if (!z || str.length() <= 0) {
                i = 8;
            }
            coinTextView.setVisibility(i);
            if (getCoinTextView().getVisibility() == 0) {
                getCoinTextView().setText(str);
                return;
            }
            return;
        }
        if (z) {
            if (getCoinTextView().getVisibility() != 8 && getCoinTextView().getAlpha() == 1.0f) {
                return;
            }
            C247679nn.LIZ().getClass();
            if (C249479qh.LJJIIJZLJL()) {
                return;
            }
            getCoinTextView().setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getCoinTextView(), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(350L);
            ofFloat.start();
            return;
        }
        if (getCoinTextView().getVisibility() != 0) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(getCoinTextView(), "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(350L);
        ofFloat2.start();
        ofFloat2.addListener(new ALAdapterS3S0100000_4(this, 8));
    }

    public final void LJIIIZ(String str, List list, C250179rp c250179rp) {
        Boolean bool;
        TimerPendant timerPendant;
        C9OT c9ot = this.LJZ;
        if (c9ot != null && (timerPendant = c9ot.LJLILLLLZI) != null) {
            bool = timerPendant.bottomTexShow;
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            getCoinTextView().setVisibility(0);
            TextView coinTextView = getCoinTextView();
            GradientDrawable LIZIZ = T28.LIZIZ(0);
            LIZIZ.setCornerRadius(KL2.LIZJ(getContext(), 8.0f));
            LIZIZ.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(C247489nU.LIZIZ(C247489nU.LIZ, (String) it.next())));
            }
            LIZIZ.setColors(ORZ.LLJ(arrayList));
            coinTextView.setBackground(LIZIZ);
            getCoinTextView().setText(str);
        }
        getPendantLayout().setVisibility(8);
        getShrinkView().setVisibility(8);
        getRewardLottieView().setVisibility(0);
        C72832SiC rewardLottieView = getRewardLottieView();
        rewardLottieView.setRepeatCount(0);
        rewardLottieView.setRepeatMode(1);
        rewardLottieView.addAnimatorListener(new ALAdapterS3S0100000_4(c250179rp, 9));
        rewardLottieView.playAnimation();
    }

    public final void LJII(Bubble bubble, String templateValue, String str, boolean z) {
        String str2;
        o.LJIIIZ(bubble, "bubble");
        o.LJIIIZ(templateValue, "templateValue");
        int i = 0;
        LJI(false, true);
        if ((str != null && str.length() != 0) || ((str2 = bubble.longContent) != null && (str = ujb.o.LJJJJZ(str2, "{cashNumber}", templateValue, false)) != null)) {
            this.LJLZ = false;
            AAY shapeBubbleView = getShapeBubbleView();
            AnimatorSet animatorSet = shapeBubbleView.LJLJJL;
            if (animatorSet != null && animatorSet.isRunning()) {
                AnimatorSet animatorSet2 = shapeBubbleView.LJLJJL;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                shapeBubbleView.setVisibility(8);
            }
            getShapeBubbleView().setBubbleText(str);
            if (getShapeBubbleView().getVisibility() != 0) {
                getShapeBubbleView().LIZ();
            }
            AAY shapeBubbleView2 = getShapeBubbleView();
            ARunnableS10S0110000_4 aRunnableS10S0110000_4 = new ARunnableS10S0110000_4((Object) this, z, 4);
            Integer num = bubble.showDuration;
            if (num != null) {
                i = num.intValue();
            }
            shapeBubbleView2.postDelayed(aRunnableS10S0110000_4, i * 1000);
        }
    }

    public final void LIZ(boolean z, int i, InterfaceC88472Yns interfaceC88472Yns, int i2, boolean z2, boolean z3) {
        Boolean bool;
        boolean z4;
        TimerPendant timerPendant;
        TimerPendant timerPendant2;
        String str;
        TimerPendant timerPendant3;
        this.LJLLL = 0;
        getProgressBarTimerView().setVisibility(4);
        int i3 = 8;
        if (z) {
            getLottieView().setVisibility(0);
            getBreathLottieView().setVisibility(8);
            C72832SiC lottieView = getLottieView();
            lottieView.setRepeatCount(0);
            lottieView.setRepeatMode(1);
            lottieView.addAnimatorListener(new ALAdapterS3S0200000_4(this, interfaceC88472Yns, 2));
            lottieView.playAnimation();
        }
        if (i2 == 1) {
            C72832SiC shrinkLottieView = getShrinkLottieView();
            shrinkLottieView.setRepeatCount(0);
            shrinkLottieView.setRepeatMode(1);
            shrinkLottieView.addAnimatorListener(new ALAdapterS1S0000000_4(1));
            shrinkLottieView.playAnimation();
        }
        C9OT c9ot = this.LJZ;
        String str2 = null;
        if (c9ot != null && (timerPendant3 = c9ot.LJLILLLLZI) != null) {
            bool = timerPendant3.bottomTexShow;
        } else {
            bool = null;
        }
        if (!o.LJ(bool, Boolean.TRUE)) {
            return;
        }
        TextView coinTextView = getCoinTextView();
        if ((i > 0 || z3) && (i2 == 0 || i2 == 2)) {
            i3 = 0;
        }
        coinTextView.setVisibility(i3);
        C9OT c9ot2 = C2MW.LIZ().LJ;
        if (c9ot2 == null || (timerPendant2 = c9ot2.LJLILLLLZI) == null || (str = timerPendant2.rewardLottieName) == null || str.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z5 = !z4;
        if (i2 == 0) {
            if (z3) {
                TextView coinTextView2 = getCoinTextView();
                C9OT c9ot3 = C2MW.LIZ().LJ;
                if (c9ot3 != null && (timerPendant = c9ot3.LJLILLLLZI) != null) {
                    str2 = timerPendant.bottomText;
                }
                coinTextView2.setText(str2);
                return;
            }
            if (!z5 || !z2) {
                ValueAnimator animator = ValueAnimator.ofInt(this.LLIIJI, i);
                o.LJIIIIZZ(animator, "animator");
                animator.setDuration(1000L);
                animator.addUpdateListener(new AUListenerS93S0100000_4(this, 20));
                this.LLIIJI = i;
                animator.setStartDelay(600L);
                animator.start();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getCoinTextView(), "scaleX", 1.0f, 1.15f, 1.0f);
                ofFloat.setDuration(600L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(getCoinTextView(), "scaleY", 1.0f, 1.15f, 1.0f);
                AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat2, 600L);
                LIZLLL.play(ofFloat).with(ofFloat2).after(600L);
                LIZLLL.start();
                return;
            }
            getCoinTextView().setText(String.valueOf(i));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(getCoinTextView(), "scaleX", 1.0f, 1.15f, 1.0f);
            ofFloat3.setDuration(600L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(getCoinTextView(), "scaleY", 1.0f, 1.15f, 1.0f);
            AnimatorSet LIZLLL2 = JBR.LIZLLL(ofFloat4, 600L);
            LIZLLL2.play(ofFloat3).with(ofFloat4);
            LIZLLL2.start();
            return;
        }
        if (i2 != 1) {
            return;
        }
        getCoinTextView().setText(String.valueOf(i));
    }

    public final void LIZIZ(final InputStream inputStream, String str, final C250099rh c250099rh, final InputStream inputStream2, final InputStream inputStream3, String str2, String str3, String str4, String str5, final InputStream inputStream4) {
        try {
            final C72832SiC lottieView = getLottieView();
            C0GU<C0GY> LJI = C04650Gf.LJI(inputStream, str2);
            LJI.LIZIZ(new InterfaceC04760Gq() { // from class: X.9tJ
                @Override // X.InterfaceC04760Gq
                public final void onResult(Object obj) {
                    C0GY it = (C0GY) obj;
                    C72832SiC c72832SiC = C72832SiC.this;
                    o.LJIIIIZZ(it, "it");
                    c72832SiC.setComposition(it);
                    InterfaceC251569u4 interfaceC251569u4 = c250099rh;
                    if (interfaceC251569u4 != null) {
                        interfaceC251569u4.LIZ();
                    }
                }
            });
            LJI.LIZ(new InterfaceC04760Gq() { // from class: X.9ta
                @Override // X.InterfaceC04760Gq
                public final /* bridge */ /* synthetic */ void onResult(Object obj) {
                }
            });
            if (inputStream3 != null) {
                final C72832SiC shrinkLottieView = getShrinkLottieView();
                C0GU<C0GY> LJI2 = C04650Gf.LJI(inputStream3, str4);
                LJI2.LIZIZ(new InterfaceC04760Gq() { // from class: X.9tK
                    @Override // X.InterfaceC04760Gq
                    public final void onResult(Object obj) {
                        C0GY it = (C0GY) obj;
                        C72832SiC c72832SiC = C72832SiC.this;
                        o.LJIIIIZZ(it, "it");
                        c72832SiC.setComposition(it);
                        InterfaceC251569u4 interfaceC251569u4 = c250099rh;
                        if (interfaceC251569u4 != null) {
                            interfaceC251569u4.LIZ();
                        }
                    }
                });
                LJI2.LIZ(new InterfaceC04760Gq() { // from class: X.9tb
                    @Override // X.InterfaceC04760Gq
                    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
                    }
                });
            }
            if (inputStream2 != null) {
                final C72832SiC rewardLottieView = getRewardLottieView();
                C0GU<C0GY> LJI3 = C04650Gf.LJI(inputStream2, str3);
                LJI3.LIZIZ(new InterfaceC04760Gq() { // from class: X.9tL
                    @Override // X.InterfaceC04760Gq
                    public final void onResult(Object obj) {
                        C0GY it = (C0GY) obj;
                        C72832SiC c72832SiC = C72832SiC.this;
                        o.LJIIIIZZ(it, "it");
                        c72832SiC.setComposition(it);
                        InterfaceC251569u4 interfaceC251569u4 = c250099rh;
                        if (interfaceC251569u4 != null) {
                            interfaceC251569u4.LIZ();
                        }
                    }
                });
                LJI3.LIZ(new InterfaceC04760Gq() { // from class: X.9tc
                    @Override // X.InterfaceC04760Gq
                    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
                    }
                });
            }
            if (inputStream4 != null) {
                final C72832SiC breathLottieView = getBreathLottieView();
                C0GU<C0GY> LJI4 = C04650Gf.LJI(inputStream4, str5);
                LJI4.LIZIZ(new InterfaceC04760Gq() { // from class: X.9tM
                    @Override // X.InterfaceC04760Gq
                    public final void onResult(Object obj) {
                        C0GY it = (C0GY) obj;
                        C72832SiC c72832SiC = C72832SiC.this;
                        o.LJIIIIZZ(it, "it");
                        c72832SiC.setComposition(it);
                        InterfaceC251569u4 interfaceC251569u4 = c250099rh;
                        if (interfaceC251569u4 != null) {
                            interfaceC251569u4.LIZ();
                        }
                    }
                });
                LJI4.LIZ(new InterfaceC04760Gq() { // from class: X.9td
                    @Override // X.InterfaceC04760Gq
                    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
                    }
                });
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
