package X;

import Y.ACListenerS22S0100000_2;
import Y.IDLListenerS190S0100000_2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.69z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1559169z extends FrameLayout {
    public View LJLIL;
    public final C6A2 LJLILLLLZI;
    public final C6A2 LJLJI;
    public EnumC1558969x LJLJJI;
    public float LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final IDLListenerS190S0100000_2 LJLJLLL;
    public InterfaceC65784Pro<C76800UCe> LJLL;

    public void LJFF() {
    }

    public void LJI() {
    }

    public void LJII() {
    }

    public int getLayoutResId() {
        return R.layout.ua;
    }

    public void LJ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.LJLL = null;
    }

    public float getBottomTabHeight() {
        return V18.LJLIL;
    }

    public final EnumC1558969x getEnterMethod() {
        return this.LJLJJI;
    }

    public final C6A2 getOriginalAnimator() {
        return this.LJLJI;
    }

    public final int getStickerOldHeight() {
        return this.LJLJL;
    }

    public final int getStickerOldWidth() {
        return this.LJLJLJ;
    }

    public final View getStickerView() {
        return this.LJLIL;
    }

    public void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LJLJJI = EnumC1558969x.AddNew;
        this.LJLIL = stickerView;
        stickerView.setVisibility(4);
        addView(this.LJLIL);
        getViewTreeObserver().addOnGlobalLayoutListener(this.LJLJLLL);
        LJII();
    }

    public void LIZJ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LJLJJI = EnumC1558969x.Edit;
        this.LJLIL = stickerView;
        addView(stickerView);
        stickerView.setVisibility(4);
        this.LJLJLJ = stickerView.getMeasuredWidth();
        this.LJLJL = stickerView.getMeasuredHeight();
        C6A2 c6a2 = this.LJLJI;
        c6a2.LJLJJI = stickerView.getX();
        c6a2.LJLJJL = stickerView.getY();
        c6a2.LJLJI = stickerView.getRotation();
        c6a2.LJLIL = stickerView.getScaleX();
        c6a2.LJLILLLLZI = stickerView.getScaleY();
        getViewTreeObserver().addOnGlobalLayoutListener(this.LJLJLLL);
        LJII();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJJLL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJJLL) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setEnterMethod(EnumC1558969x enumC1558969x) {
        o.LJIIIZ(enumC1558969x, "<set-?>");
        this.LJLJJI = enumC1558969x;
    }

    public final void setFrameworkAfterExitListener(InterfaceC65784Pro<C76800UCe> afterExitListener) {
        o.LJIIIZ(afterExitListener, "afterExitListener");
        this.LJLL = afterExitListener;
    }

    public final void setStickerOldHeight(int i) {
        this.LJLJL = i;
    }

    public final void setStickerOldWidth(int i) {
        this.LJLJLJ = i;
    }

    public final void setStickerView(View view) {
        this.LJLIL = view;
    }

    public final void LIZIZ(C6A2 startAnimator, C6A2 c6a2) {
        o.LJIIIZ(startAnimator, "startAnimator");
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        requestLayout();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", startAnimator.LJLIL, c6a2.LJLIL);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", startAnimator.LJLILLLLZI, c6a2.LJLILLLLZI);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", startAnimator.LJLJI, c6a2.LJLJI);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "x", startAnimator.LJLJJI, c6a2.LJLJJI);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "y", startAnimator.LJLJJL, c6a2.LJLJJL);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.6A1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                if (C1559169z.this.getEnterMethod() == EnumC1558969x.Edit) {
                    C1559169z.this.LJI();
                }
                C1559169z.this.LJLJJLL = false;
                super.onAnimationEnd(animation);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animation, boolean z) {
                o.LJIIIZ(animation, "animation");
                C1559169z.this.getEnterMethod();
                C1559169z.this.LJLJJLL = true;
                super.onAnimationStart(animation, z);
            }
        });
        animatorSet.setDuration(300L);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
        animatorSet.start();
    }

    public void LIZLLL(C6A2 startAnimator, C6A2 endAnimator) {
        o.LJIIIZ(startAnimator, "startAnimator");
        o.LJIIIZ(endAnimator, "endAnimator");
        final View view = this.LJLIL;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", startAnimator.LJLIL, endAnimator.LJLIL);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", startAnimator.LJLILLLLZI, endAnimator.LJLILLLLZI);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", startAnimator.LJLJI, endAnimator.LJLJI);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "x", startAnimator.LJLJJI, endAnimator.LJLJJI);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "y", startAnimator.LJLJJL, endAnimator.LJLJJL);
            AnimatorSet LIZ = C1DD.LIZ(300L);
            LIZ.addListener(new AnimatorListenerAdapter() { // from class: X.6A0
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    C1559169z.this.LJLJJLL = false;
                    super.onAnimationEnd(animation);
                    C1559169z c1559169z = C1559169z.this;
                    View view2 = view;
                    if (C78996UzQ.LJJIIJZLJL(view2)) {
                        C78996UzQ.LJI();
                    }
                    c1559169z.removeView(view2);
                    C1559169z.this.LJ();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animation, boolean z) {
                    o.LJIIIZ(animation, "animation");
                    C1559169z.this.LJLJJLL = true;
                    super.onAnimationStart(animation, z);
                    C1559169z.this.LJFF();
                }
            });
            LIZ.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
            LIZ.start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559169z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        int LIZJ = C173216qz.LIZJ(73.0d, context);
        this.LJLILLLLZI = new C6A2(0.0f, 0.0f, 0.0f, 0.0f, 63);
        new C6A2(0.0f, 0.0f, 0.0f, 0.0f, 63);
        this.LJLJI = new C6A2(0.0f, 0.0f, 0.0f, 0.0f, 63);
        this.LJLJJI = EnumC1558969x.Edit;
        C1558769v c1558769v = (C1558769v) this;
        this.LJLJLLL = new IDLListenerS190S0100000_2(c1558769v, 7);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), getLayoutResId(), this, true);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ee, context2));
        o.LJIIIIZZ(findViewById(R.id.ahe), "findViewById(R.id.base_sticker_edit_complete_tv)");
        int max = Math.max(C81184Vtc.LIZIZ(getContext()) / 4, LIZJ);
        V18.LJLIL = max;
        this.LJLJJL = max;
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(c1558769v, 135)));
    }
}
