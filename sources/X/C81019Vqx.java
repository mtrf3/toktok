package X;

import Y.ACListenerS29S0100000_9;
import Y.ALAdapterS11S0100000_14;
import Y.IDCListenerS260S0100000_14;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Vqx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81019Vqx extends FrameLayout {
    public C81243VuZ LJLIL;
    public final boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public AnimatorSet LJLJJI;
    public AnimatorSet LJLJJL;

    private final Rect getAnchorGlobalRect() {
        Rect rect = new Rect();
        View view = this.LJLIL.LIZ;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        return rect;
    }

    private final LinearLayout getSpeedPanelView() {
        return (LinearLayout) this.LJLJI.getValue();
    }

    public final void LJ() {
        Integer num;
        Integer num2;
        View view = this.LJLIL.LIZ;
        if (view != null) {
            num = Integer.valueOf(view.getWidth());
        } else {
            num = null;
        }
        View view2 = this.LJLIL.LIZ;
        if (view2 != null) {
            num2 = Integer.valueOf(view2.getHeight());
        } else {
            num2 = null;
        }
        if (num != null) {
            num.intValue();
            if (num2 != null) {
                num2.intValue();
                if (this.LJLILLLLZI) {
                    getSpeedPanelView().setPivotX(-((float) ((num.intValue() * 0.5d) + SFS.LJI(6.0d))));
                } else {
                    getSpeedPanelView().setPivotX((float) ((num.intValue() * 0.5d) + SFS.LJI(58.0d) + SFS.LJI(6.0d)));
                }
                getSpeedPanelView().setPivotY((float) (num2.intValue() * 0.5d));
                C39661h4 LIZIZ = LIZIZ(C17T.LJIILJJIL, 1.0f, 0.6f);
                C39661h4 LIZIZ2 = LIZIZ(C17T.LJIILL, 1.0f, 0.6f);
                AnimatorSet animatorSet = this.LJLJJL;
                if (animatorSet != null) {
                    animatorSet.start();
                    LIZIZ.LJIIIZ();
                    LIZIZ2.LJIIIZ();
                    return;
                }
                o.LJIJI("hideAnimSet");
                throw null;
            }
        }
    }

    public final void LJI() {
        if (this.LJLILLLLZI) {
            getSpeedPanelView().setPivotX(-((float) (SFS.LJI(58.0d) * 0.5d)));
        } else {
            getSpeedPanelView().setPivotX((float) (SFS.LJI(58.0d) * 1.5d));
        }
        getSpeedPanelView().setPivotY((float) (SFS.LJI(210.0d) * 0.2d));
        getSpeedPanelView().setTranslationX(0.0f);
        C39661h4 LIZIZ = LIZIZ(C17T.LJIILJJIL, 0.6f, 1.0f);
        C39661h4 LIZIZ2 = LIZIZ(C17T.LJIILL, 0.6f, 1.0f);
        AnimatorSet animatorSet = this.LJLJJI;
        if (animatorSet != null) {
            animatorSet.start();
            LIZIZ.LJIIIZ();
            LIZIZ2.LJIIIZ();
            return;
        }
        o.LJIJI("showAnimSet");
        throw null;
    }

    public final void LJFF(C81243VuZ params) {
        float f;
        o.LJIIIZ(params, "params");
        this.LJLIL = params;
        setClickable(true);
        addView(getSpeedPanelView());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getSpeedPanelView(), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(50L);
        ofFloat.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        this.LJLJJI = animatorSet;
        LinearLayout speedPanelView = getSpeedPanelView();
        float[] fArr = new float[1];
        if (this.LJLILLLLZI) {
            f = -8.0f;
        } else {
            f = 8.0f;
        }
        fArr[0] = f;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(speedPanelView, "translationX", fArr);
        ofFloat2.setDuration(100L);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(getSpeedPanelView(), "alpha", 1.0f, 0.0f);
        ofFloat3.setDuration(50L);
        ofFloat3.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(100L);
        animatorSet2.playTogether(ofFloat2, ofFloat3);
        animatorSet2.addListener(new ALAdapterS11S0100000_14(this, 25));
        this.LJLJJL = animatorSet2;
        View view = this.LJLIL.LIZ;
        if (view != null) {
            view.addOnLayoutChangeListener(new IDCListenerS260S0100000_14(this, 1));
        }
    }

    public final void LJII(int i) {
        LinearLayout speedPanelView = getSpeedPanelView();
        int childCount = speedPanelView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = speedPanelView.getChildAt(i2);
            o.LJII(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (i2 == 0) {
                viewGroup.setBackgroundResource(R.drawable.v9);
            } else if (i2 == speedPanelView.getChildCount() - 1) {
                viewGroup.setBackgroundResource(R.drawable.v4);
            } else {
                viewGroup.setBackgroundColor(0);
            }
            View childAt2 = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            o.LJII(childAt2, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            ((TextView) childAt2).setTextColor(C04330Ez.LIZIZ(speedPanelView.getContext(), R.color.acm));
        }
        View childAt3 = speedPanelView.getChildAt(i);
        o.LJII(childAt3, "null cannot be cast to non-null type android.widget.FrameLayout");
        ViewGroup viewGroup2 = (ViewGroup) childAt3;
        if (i == 0) {
            viewGroup2.setBackgroundResource(R.drawable.v7);
        } else if (i == speedPanelView.getChildCount() - 1) {
            viewGroup2.setBackgroundResource(R.drawable.v3);
        } else {
            viewGroup2.setBackgroundColor(-1);
        }
        View childAt4 = viewGroup2.getChildAt(viewGroup2.getChildCount() - 1);
        o.LJII(childAt4, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        Context context = speedPanelView.getContext();
        o.LJIIIIZZ(context, "context");
        ((TextView) childAt4).setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || getAnchorGlobalRect().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 1 && !getAnchorGlobalRect().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.LJLIL.LJ.invoke();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81019Vqx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new C81243VuZ(null, C81021Vqz.LJLIL, C81022Vr0.LJLIL, 7);
        this.LJLILLLLZI = C173636rf.LIZIZ(context);
        this.LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
    }

    public final C39661h4 LIZIZ(AbstractC45091pp abstractC45091pp, float f, float f2) {
        C39661h4 c39661h4 = new C39661h4(getSpeedPanelView(), abstractC45091pp, f2);
        c39661h4.LJIL.LIZIZ(453.0f);
        c39661h4.LJIL.LIZ(0.83f);
        c39661h4.LJI(f);
        c39661h4.LIZ = 0.0f;
        return c39661h4;
    }

    public final void LIZJ(int i, int i2, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        int width;
        if (this.LJLILLLLZI) {
            width = (i - SFS.LJI(6.0d)) - getSpeedPanelView().getWidth();
        } else {
            width = getSpeedPanelView().getWidth() + SFS.LJI(6.0d) + i;
        }
        LinearLayout speedPanelView = getSpeedPanelView();
        int childCount = speedPanelView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            Rect rect = new Rect();
            View childAt = speedPanelView.getChildAt(i3);
            o.LJII(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            rect.left = childAt.getLeft();
            rect.right = childAt.getRight();
            rect.bottom = childAt.getBottom();
            rect.top = childAt.getTop();
            if (rect.contains(width, i2)) {
                interfaceC88472Yns.invoke(Integer.valueOf(i3));
                return;
            }
        }
    }

    public final void LIZLLL(int i, int i2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int width;
        if (this.LJLILLLLZI) {
            width = (i - SFS.LJI(6.0d)) - getSpeedPanelView().getWidth();
        } else {
            width = getSpeedPanelView().getWidth() + SFS.LJI(6.0d) + i;
        }
        Rect rect = new Rect();
        getSpeedPanelView().getLocalVisibleRect(rect);
        if (!rect.contains(width, i2)) {
            interfaceC65784Pro.invoke();
        }
    }

    public final void LIZ(int i, int i2, String str, InterfaceC65784Pro interfaceC65784Pro) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setClickable(true);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, SFS.LJI(42.0d)));
        frameLayout.setBackgroundResource(i);
        Context context = frameLayout.getContext();
        o.LJIIIIZZ(context, "context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(str);
        tuxTextView.setAlpha(0.9f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, SFS.LJI(18.0d));
        layoutParams.topMargin = SFS.LJI(12.0d);
        layoutParams.bottomMargin = SFS.LJI(12.0d);
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setTextAlignment(4);
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColor(C04330Ez.LIZIZ(tuxTextView.getContext(), i2));
        frameLayout.addView(tuxTextView);
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(interfaceC65784Pro, 81), frameLayout);
        getSpeedPanelView().addView(frameLayout);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LJLILLLLZI) {
            Rect anchorGlobalRect = getAnchorGlobalRect();
            getSpeedPanelView().setLeft(SFS.LJI(6.0d) + anchorGlobalRect.width() + anchorGlobalRect.left);
            getSpeedPanelView().setTop(anchorGlobalRect.top);
            getSpeedPanelView().setRight(SFS.LJI(58.0d) + getSpeedPanelView().getLeft());
            getSpeedPanelView().setBottom(SFS.LJI(210.0d) + getSpeedPanelView().getTop());
            return;
        }
        Rect anchorGlobalRect2 = getAnchorGlobalRect();
        getSpeedPanelView().setLeft((anchorGlobalRect2.left - SFS.LJI(58.0d)) - SFS.LJI(6.0d));
        getSpeedPanelView().setTop(anchorGlobalRect2.top);
        getSpeedPanelView().setRight(SFS.LJI(58.0d) + getSpeedPanelView().getLeft());
        getSpeedPanelView().setBottom(SFS.LJI(210.0d) + getSpeedPanelView().getTop());
    }
}
