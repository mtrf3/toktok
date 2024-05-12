package X;

import Y.ACListenerS29S0100000_9;
import Y.AUListenerS97S0100000_9;
import Y.AUListenerS99S0200000_9;
import Y.IDAListenerS77S0100000_9;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LDQ extends PopupWindow {
    public final Context LIZ;
    public final InterfaceC88472Yns<Context, ImageView> LIZIZ;
    public final InterfaceC88472Yns<TuxIconView, Animator> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public final boolean LJFF;
    public final View LJI;
    public final TuxTextLayoutView LJII;
    public final String LJIIIIZZ;
    public final FrameLayout LJIIIZ;
    public final LDR LJIIJ;
    public View LJIIJJI;
    public int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public AnimatorSet LJIILLIIL;
    public Long LJIIZILJ;
    public long LJIJ;

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        View view;
        super.dismiss();
        AnimatorSet animatorSet = this.LJIILLIIL;
        if (animatorSet != null && animatorSet.isRunning() && (view = this.LJIIJJI) != null) {
            view.clearAnimation();
        }
        View view2 = this.LJIIJJI;
        if (view2 != null) {
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
        }
        this.LJIIJJI = null;
    }

    public final ValueAnimator LIZIZ(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(300L);
        ofInt.setInterpolator(C55953Lxd.LIZLLL());
        ofInt.addUpdateListener(new AUListenerS99S0200000_9(this, view, 2));
        return ofInt;
    }

    public final void LJ(int i, View view, boolean z) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        if (z) {
            if (C90193gN.LIZ()) {
                if (this.LJIIJ == LDR.RIGHT) {
                    C26338AVi.LJIIIZ(this.LJI, Integer.valueOf(this.LJIILIIL), 0, Integer.valueOf(this.LJIILJJIL), 0, 16);
                } else {
                    C26338AVi.LJIIIZ(this.LJI, Integer.valueOf(this.LJIILJJIL), 0, Integer.valueOf(this.LJIILIIL), 0, 16);
                }
            } else if (this.LJIIJ == LDR.RIGHT) {
                C26338AVi.LJIIIZ(this.LJI, Integer.valueOf(this.LJIILJJIL), 0, Integer.valueOf(this.LJIILIIL), 0, 16);
            } else {
                C26338AVi.LJIIIZ(this.LJI, Integer.valueOf(this.LJIILIIL), 0, Integer.valueOf(this.LJIILJJIL), 0, 16);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public static ValueAnimator LIZ(View view, float f, float f2, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new AUListenerS97S0100000_9(view, 15));
        return ofFloat;
    }

    public final void LIZLLL(View view, ImageView imageView, int i, int i2) {
        AnimatorSet.Builder builder;
        AnimatorSet.Builder play;
        AnimatorSet.Builder play2;
        AnimatorSet.Builder play3;
        InterfaceC88472Yns<TuxIconView, Animator> interfaceC88472Yns;
        Animator invoke;
        this.LJI.setVisibility(0);
        View view2 = this.LJI;
        ValueAnimator LIZIZ = LIZIZ(view2, i, i2);
        ValueAnimator LIZ = LIZ(view2, 0.0f, 1.0f, 150L);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder play4 = animatorSet.play(LIZIZ);
        if (play4 != null) {
            play4.with(LIZ);
        }
        ValueAnimator LIZIZ2 = LIZIZ(this.LJI, i2, i + this.LJIILJJIL);
        if (view != null) {
            ValueAnimator LIZJ = LIZJ(view, 1.0f, 0.7f, 100L, new LinearInterpolator());
            ValueAnimator LIZ2 = LIZ(this.LJI, 1.0f, 0.0f, 100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            AnimatorSet.Builder play5 = animatorSet2.play(LIZJ);
            if (play5 != null) {
                builder = play5.with(LIZ2);
            } else {
                builder = null;
            }
            if ((imageView instanceof TuxIconView) && (interfaceC88472Yns = this.LIZJ) != null && (invoke = interfaceC88472Yns.invoke(imageView)) != null && builder != null) {
                builder.with(invoke);
            }
            ValueAnimator LIZJ2 = LIZJ(view, 0.7f, 1.0f, 300L, C55953Lxd.LJII());
            LIZIZ2.setStartDelay(2000L);
            animatorSet2.setStartDelay(2100L);
            LIZJ2.setStartDelay(2300L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.LJIILLIIL = animatorSet3;
            animatorSet3.play(animatorSet);
            AnimatorSet animatorSet4 = this.LJIILLIIL;
            if (animatorSet4 != null && (play3 = animatorSet4.play(LIZIZ2)) != null) {
                play3.after(animatorSet);
            }
            AnimatorSet animatorSet5 = this.LJIILLIIL;
            if (animatorSet5 != null && (play2 = animatorSet5.play(animatorSet2)) != null) {
                play2.after(animatorSet);
            }
            AnimatorSet animatorSet6 = this.LJIILLIIL;
            if (animatorSet6 != null && (play = animatorSet6.play(LIZJ2)) != null) {
                play.after(animatorSet);
            }
            AnimatorSet animatorSet7 = this.LJIILLIIL;
            if (animatorSet7 != null) {
                animatorSet7.addListener(new IDAListenerS77S0100000_9(this, 6));
            }
            AnimatorSet animatorSet8 = this.LJIILLIIL;
            if (animatorSet8 != null) {
                animatorSet8.addPauseListener(new C53859LBv(this));
            }
            AnimatorSet animatorSet9 = this.LJIILLIIL;
            if (animatorSet9 != null) {
                animatorSet9.addListener(new IDAListenerS77S0100000_9(this, 5));
            }
            AnimatorSet animatorSet10 = this.LJIILLIIL;
            if (animatorSet10 != null) {
                animatorSet10.start();
            }
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View parent, int i, int i2, int i3) {
        int i4;
        int i5;
        o.LJIIIZ(parent, "parent");
        this.LJIIJJI = parent;
        this.LJI.setVisibility(4);
        ImageView c119624mk = new C119624mk(this.LIZ);
        InterfaceC88472Yns<Context, ImageView> interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns != null) {
            ImageView invoke = interfaceC88472Yns.invoke(this.LIZ);
            if (invoke != null) {
                c119624mk = invoke;
            }
        } else {
            c119624mk.setImageDrawable(((ImageView) parent).getDrawable());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)));
        layoutParams.gravity = 17;
        this.LJIIIZ.addView(c119624mk, layoutParams);
        C74247TBz c74247TBz = new C74247TBz();
        c74247TBz.LIZLLL(this.LJIIIIZZ);
        c74247TBz.LIZLLL = false;
        c74247TBz.LJ = false;
        c74247TBz.LIZJ(42);
        Layout LIZ = c74247TBz.LIZ();
        this.LJII.setTextLayout(LIZ);
        int i6 = this.LJIILIIL + this.LJIILJJIL;
        int width = LIZ.getWidth();
        ViewGroup.LayoutParams layoutParams2 = this.LJII.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            i4 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams2);
        } else {
            i4 = 0;
        }
        int i7 = width + i4;
        ViewGroup.LayoutParams layoutParams3 = this.LJII.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            i5 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams3);
        } else {
            i5 = 0;
        }
        int paddingEnd = i6 + this.LJII.getPaddingEnd() + this.LJII.getPaddingStart() + i7 + i5 + C7MY.LIZIZ(28);
        float f = (LER.LIZJ - this.LJIILL) - i2;
        if (f < paddingEnd) {
            paddingEnd = O6R.LJJIIZ(f);
        }
        setWidth(paddingEnd);
        int measuredWidth = (this.LJIILIIL * 2) + parent.getMeasuredWidth();
        this.LJIIL = measuredWidth;
        LJ(measuredWidth, this.LJI, false);
        if (this.LJFF) {
            LIZLLL(parent, c119624mk, this.LJIIL, getWidth());
        } else {
            LIZLLL(parent, c119624mk, this.LJIIL, getWidth());
        }
        super.showAtLocation(parent, i, i2, i3);
    }

    public final ValueAnimator LIZJ(View view, float f, float f2, long j, Interpolator interpolator) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(interpolator);
        ofFloat.addUpdateListener(new AUListenerS99S0200000_9(this, view, 1));
        return ofFloat;
    }

    public LDQ(Context context, String str, int i, int i2, AqS175S0100000_9 aqS175S0100000_9, LDR ldr, AqS175S0100000_9 aqS175S0100000_92, AqS159S0100000_9 aqS159S0100000_9, AqS159S0100000_9 aqS159S0100000_92, boolean z) {
        View LLLZIIL;
        View LLLZIIL2;
        this.LIZ = context;
        this.LIZIZ = aqS175S0100000_9;
        this.LIZJ = aqS175S0100000_92;
        this.LIZLLL = aqS159S0100000_9;
        this.LJ = aqS159S0100000_92;
        this.LJFF = z;
        LDR ldr2 = LDR.RIGHT;
        this.LJIIJ = ldr2;
        this.LJIILL = C7MY.LIZIZ(8);
        this.LJIIIIZZ = str;
        setFocusable(false);
        setOutsideTouchable(false);
        this.LJIIJ = ldr;
        setWidth(-2);
        setHeight(-2);
        if (C90193gN.LIZ()) {
            if (ldr == LDR.LEFT) {
                LLLZIIL2 = C16880lQ.LLLZIIL(R.layout.azm, C16880lQ.LLZIL(context), null);
            } else {
                LLLZIIL2 = C16880lQ.LLLZIIL(R.layout.azn, C16880lQ.LLZIL(context), null);
            }
            setContentView(LLLZIIL2);
        } else {
            if (ldr == ldr2) {
                LLLZIIL = C16880lQ.LLLZIIL(R.layout.azn, C16880lQ.LLZIL(context), null);
            } else {
                LLLZIIL = C16880lQ.LLLZIIL(R.layout.azm, C16880lQ.LLZIL(context), null);
            }
            setContentView(LLLZIIL);
        }
        View findViewById = getContentView().findViewById(R.id.hxs);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.pop_view)");
        this.LJI = findViewById;
        if (ldr == ldr2) {
            this.LJIILIIL = i2;
            this.LJIILJJIL = i;
            findViewById.setPadding(i2, 0, i2, 0);
        } else {
            this.LJIILIIL = i;
            this.LJIILJJIL = i2;
            findViewById.setPadding(i, 0, i, 0);
        }
        View findViewById2 = getContentView().findViewById(R.id.hww);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById(R.id.pop_desc_tv)");
        this.LJII = (TuxTextLayoutView) findViewById2;
        View findViewById3 = getContentView().findViewById(R.id.abu);
        o.LJIIIIZZ(findViewById3, "contentView.findViewById(R.id.avatar_container_fl)");
        this.LJIIIZ = (FrameLayout) findViewById3;
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 78), findViewById);
    }
}
