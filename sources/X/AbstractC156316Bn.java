package X;

import Y.ALAdapterS1S0200000_2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6Bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC156316Bn<T> extends FrameLayout {
    public static final /* synthetic */ int LJLLL = 0;
    public final String LJLIL;
    public TuxTextView LJLILLLLZI;
    public FrameLayout LJLJI;
    public AbstractC156406Bw<T> LJLJJI;
    public C156306Bm LJLJJL;
    public C156306Bm LJLJJLL;
    public Animator LJLJL;
    public InterfaceC156326Bo<T> LJLJLJ;
    public PointF LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC156316Bn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public abstract AbstractC156406Bw<T> LIZIZ();

    public abstract Animator LIZJ();

    public final void LIZLLL() {
        float f;
        this.LJLLILLLL = 0;
        if (!this.LJLLI) {
            this.LJLLI = true;
            AbstractC156406Bw<T> abstractC156406Bw = this.LJLJJI;
            if (abstractC156406Bw != null) {
                String content = abstractC156406Bw.getContent();
                if (content == null || content.length() == 0) {
                    LIZ(this, abstractC156406Bw);
                    this.LJLL = false;
                    this.LJLLI = false;
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                } else {
                    Animator animator = this.LJLJL;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ALAdapterS1S0200000_2 aLAdapterS1S0200000_2 = new ALAdapterS1S0200000_2(abstractC156406Bw, this, 0);
                    Animator LIZJ = LIZJ();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(abstractC156406Bw, "scaleX", this.LJLJJLL.LJLIL, this.LJLJJL.LJLIL);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(abstractC156406Bw, "scaleY", this.LJLJJLL.LJLILLLLZI, this.LJLJJL.LJLILLLLZI);
                    float[] fArr = new float[2];
                    float f2 = this.LJLJJL.LJLJI;
                    if (f2 > 180.0f) {
                        f = 360.0f;
                    } else {
                        f = this.LJLJJLL.LJLJI;
                    }
                    fArr[0] = f;
                    fArr[1] = f2;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(abstractC156406Bw, "rotation", fArr);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(abstractC156406Bw, "x", this.LJLJJLL.LJLJJI, this.LJLJJL.LJLJJI);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(abstractC156406Bw, "y", this.LJLJJLL.LJLJJL, this.LJLJJL.LJLJJL);
                    AnimatorSet LIZ = C1DD.LIZ(300L);
                    if (LIZJ != null) {
                        LIZJ.setDuration(50L);
                        LIZ.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).after(LIZJ);
                    } else {
                        LIZ.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
                    }
                    LIZ.addListener(aLAdapterS1S0200000_2);
                    LIZ.start();
                    return;
                }
            }
            this.LJLL = false;
            this.LJLLI = false;
        }
    }

    public abstract void LJI(ViewGroup viewGroup);

    public abstract void LJII(String str);

    public abstract void setSearchListMarginBottom(int i);

    public abstract void setSearchListViewVisibility(int i);

    public void LJ() {
        Editable editable;
        C6C5 mEditTextView;
        AbstractC156406Bw<T> abstractC156406Bw = this.LJLJJI;
        if (abstractC156406Bw != null && (mEditTextView = abstractC156406Bw.getMEditTextView()) != null) {
            editable = mEditTextView.getText();
        } else {
            editable = null;
        }
        LJII(String.valueOf(editable));
    }

    public final TuxTextView getMCompleteView() {
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("mCompleteView");
        throw null;
    }

    public final FrameLayout getMInputTextContainer() {
        FrameLayout frameLayout = this.LJLJI;
        if (frameLayout != null) {
            return frameLayout;
        }
        o.LJIJI("mInputTextContainer");
        throw null;
    }

    public final void LJFF() {
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(getContext(), "input_method");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Activity LIZ = C105574Cj.LIZ(context);
        if (LIZ != null && inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(LIZ.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    public Typeface getCustomTypeface() {
        return C68M.LJIIJ().LJIILIIL(this.LJLIL);
    }

    public final C156306Bm getClickSrcAnimatorInfo() {
        return this.LJLJJL;
    }

    public final PointF getDeltaPointF() {
        return this.LJLJLLL;
    }

    public final C156306Bm getEditDstAnimatorInfo() {
        return this.LJLJJLL;
    }

    public final int getMEditState() {
        return this.LJLLILLLL;
    }

    public final InterfaceC156326Bo<T> getMEditingListener() {
        return this.LJLJLJ;
    }

    public final AbstractC156406Bw<T> getMInputView() {
        return this.LJLJJI;
    }

    public final boolean getMIsDismissing() {
        return this.LJLLI;
    }

    public final boolean getMIsEditing() {
        return this.LJLL;
    }

    public final int getMKeyboardHeight() {
        return this.LJLLJ;
    }

    public final Animator getModifyAnimator() {
        return this.LJLJL;
    }

    public final void setClickSrcAnimatorInfo(C156306Bm c156306Bm) {
        o.LJIIIZ(c156306Bm, "<set-?>");
        this.LJLJJL = c156306Bm;
    }

    public final void setDeltaPointF(PointF pointF) {
        o.LJIIIZ(pointF, "<set-?>");
        this.LJLJLLL = pointF;
    }

    public final void setEditDstAnimatorInfo(C156306Bm c156306Bm) {
        o.LJIIIZ(c156306Bm, "<set-?>");
        this.LJLJJLL = c156306Bm;
    }

    public final void setMCompleteView(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLILLLLZI = tuxTextView;
    }

    public final void setMEditState(int i) {
        this.LJLLILLLL = i;
    }

    public final void setMEditingListener(InterfaceC156326Bo<T> interfaceC156326Bo) {
        this.LJLJLJ = interfaceC156326Bo;
    }

    public final void setMInputTextContainer(FrameLayout frameLayout) {
        o.LJIIIZ(frameLayout, "<set-?>");
        this.LJLJI = frameLayout;
    }

    public final void setMInputView(AbstractC156406Bw<T> abstractC156406Bw) {
        this.LJLJJI = abstractC156406Bw;
    }

    public final void setMIsDismissing(boolean z) {
        this.LJLLI = z;
    }

    public final void setMIsEditing(boolean z) {
        this.LJLL = z;
    }

    public final void setMKeyboardHeight(int i) {
        this.LJLLJ = i;
    }

    public final void setModifyAnimator(Animator animator) {
        this.LJLJL = animator;
    }

    public static void LIZ(AbstractC156316Bn abstractC156316Bn, AbstractC156406Bw inputView) {
        abstractC156316Bn.getClass();
        o.LJIIIZ(inputView, "inputView");
        abstractC156316Bn.setSearchListViewVisibility(8);
        C16880lQ.LJLLLL(inputView, abstractC156316Bn.getMInputTextContainer());
        C6C5 mEditTextView = inputView.getMEditTextView();
        mEditTextView.setMode(true);
        C1DH.LJJIJL(mEditTextView, false);
        AbstractC156406Bw<T> abstractC156406Bw = abstractC156316Bn.LJLJJI;
        if (abstractC156406Bw != null) {
            abstractC156406Bw.setScaleX(1.0f);
            abstractC156406Bw.setScaleY(1.0f);
            abstractC156406Bw.setRotation(0.0f);
            abstractC156406Bw.setTranslationX(0.0f);
            abstractC156406Bw.setTranslationY(0.0f);
            abstractC156316Bn.LJLJJL = new C156306Bm(0);
        }
        InterfaceC156326Bo<T> interfaceC156326Bo = abstractC156316Bn.LJLJLJ;
        if (interfaceC156326Bo != null) {
            interfaceC156326Bo.LIZ(inputView, false);
        }
        abstractC156316Bn.LJLJJI = null;
        abstractC156316Bn.setVisibility(4);
        abstractC156316Bn.LJFF();
    }

    public final void LJIIIIZZ(AbstractC156406Bw<T> abstractC156406Bw, C156306Bm animatorInfo) {
        o.LJIIIZ(animatorInfo, "animatorInfo");
        int i = 0;
        setVisibility(0);
        setSearchListViewVisibility(4);
        if (abstractC156406Bw != null) {
            abstractC156406Bw.setInEditMode(true);
            this.LJLLILLLL = 2;
            this.LJLJJL = animatorInfo;
            float f = animatorInfo.LJLJI % 360.0f;
            if (f < 0.0f) {
                f += 360.0f;
            }
            animatorInfo.LJLJI = f;
            ViewParent parent = abstractC156406Bw.getParent();
            if (parent != null) {
                C16880lQ.LJLLL(abstractC156406Bw, (ViewGroup) parent);
            }
            this.LJLJJI = abstractC156406Bw;
            abstractC156406Bw.setVisibility(4);
            getMInputTextContainer().addView(abstractC156406Bw, new FrameLayout.LayoutParams(-2, -2, 1));
            C6C5 mEditTextView = abstractC156406Bw.getMEditTextView();
            mEditTextView.setMode(false);
            C1DH.LJJIJL(mEditTextView, true);
            C1DH.LJJIJIL(mEditTextView);
            Editable text = mEditTextView.getText();
            if (text != null) {
                i = text.length();
            }
            mEditTextView.setSelection(i);
            Object LLILL = C16880lQ.LLILL(mEditTextView.getContext(), "input_method");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) LLILL).showSoftInput(mEditTextView, 2);
            return;
        }
        this.LJLLILLLL = 1;
        AbstractC156406Bw<T> LIZIZ = LIZIZ();
        LIZIZ.setInEditMode(true);
        LIZIZ.setVisibility(4);
        getMInputTextContainer().addView(LIZIZ, new FrameLayout.LayoutParams(-2, -2, 1));
        this.LJLJJI = LIZIZ;
        C6C5 mEditTextView2 = LIZIZ.getMEditTextView();
        if (mEditTextView2 == null) {
            return;
        }
        mEditTextView2.setMode(false);
        C1DH.LJJIJIL(mEditTextView2);
        Object LLILL2 = C16880lQ.LLILL(mEditTextView2.getContext(), "input_method");
        o.LJII(LLILL2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) LLILL2).showSoftInput(mEditTextView2, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC156316Bn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = "Neon";
        this.LJLJJL = new C156306Bm(0);
        this.LJLJJLL = new C156306Bm(0);
        this.LJLJLLL = new PointF(0.0f, 0.0f);
        this.LJLLILLLL = 0;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ee, context2));
        C16880lQ.LLLZIIL(R.layout.bmu, C16880lQ.LLZIL(getContext()), this);
        View findViewById = findViewById(R.id.m_o);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_lay…_social_sticker_complete)");
        setMCompleteView((TuxTextView) findViewById);
        View findViewById2 = findViewById(R.id.dgu);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.fl_soc…_sticker_input_container)");
        setMInputTextContainer((FrameLayout) findViewById2);
        LJI(getMInputTextContainer());
        setOnClickListener(new ViewOnClickListenerC13880ga(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 0)));
        C16880lQ.LJJJJI(getMCompleteView(), new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 1));
        setVisibility(4);
    }
}
