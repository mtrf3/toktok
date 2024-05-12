package X;

import Y.ALAdapterS10S0100000_13;
import Y.ALAdapterS3S0100000_4;
import Y.ARunnableS49S0100000_13;
import Y.AUListenerS100S0100000_13;
import Y.AUListenerS90S0100000_1;
import Y.AUListenerS91S0100000_2;
import Y.AUListenerS94S0100000_5;
import Y.IDCListenerS251S0100000_1;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.Tis, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C75422Tis {
    public final ViewGroup LIZ;
    public final ViewGroup LIZIZ;
    public final ViewGroup LIZJ;
    public final View LIZLLL;
    public final ViewGroup LJ;
    public final ViewGroup LJFF;
    public final InterfaceC65784Pro<Integer> LJI;
    public AnimatorSet LJII;
    public boolean LJIIIIZZ;
    public WeakReference<View> LJIIJ;
    public boolean LJIIJJI;
    public Animator LJIIL;
    public AnimatorSet LJIILJJIL;
    public AnimatorSet LJIILL;
    public AnimatorSet LJIILLIIL;
    public AnimatorSet LJIIZILJ;
    public AnimatorSet LJIJ;
    public AnimatorSet LJIJI;
    public boolean LJIIIZ = true;
    public final IDCListenerS251S0100000_1 LJIILIIL = new IDCListenerS251S0100000_1(this, 1);

    public final ValueAnimator LIZLLL() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            viewGroup.setAlpha(0.0f);
        }
        ViewGroup viewGroup2 = this.LIZ;
        if (viewGroup2 != null) {
            C87277YNd.LJJIJ(viewGroup2);
        }
        return LJFF(0.0f, 1.0f, this.LIZ);
    }

    public ValueAnimator LJ() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f);
        }
        ValueAnimator LJFF = LJFF(1.0f, 0.0f, this.LIZ);
        LJFF.addUpdateListener(new AUListenerS100S0100000_13(this, 84));
        return LJFF;
    }

    public void LJII() {
        View view = this.LIZLLL;
        if (view != null) {
            view.post(new ARunnableS49S0100000_13(this, 137));
        }
    }

    public ValueAnimator LJIIIIZZ() {
        ViewGroup viewGroup;
        if (!C28952BXw.LIZ()) {
            return null;
        }
        if (this.LJIIIIZZ) {
            viewGroup = this.LIZJ;
        } else {
            viewGroup = this.LIZIZ;
        }
        C29306Beo.LJJLJLI(viewGroup);
        AnimatorSet animatorSet = this.LJIILJJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LJIILL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator LIZIZ = LIZIZ(viewGroup);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(LIZIZ);
        this.LJIILJJIL = animatorSet3;
        animatorSet3.start();
        return LIZIZ;
    }

    public ValueAnimator LJIIIZ() {
        ViewGroup viewGroup;
        if (!C28952BXw.LIZ()) {
            return null;
        }
        AnimatorSet animatorSet = this.LJIILJJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LJIILL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        if (this.LJIIIIZZ) {
            viewGroup = this.LIZJ;
        } else {
            viewGroup = this.LIZIZ;
        }
        C29306Beo.LJJLJLI(viewGroup);
        ValueAnimator LIZJ = LIZJ(viewGroup);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(LIZJ);
        this.LJIILL = animatorSet3;
        animatorSet3.start();
        return LIZJ;
    }

    public static ValueAnimator LIZIZ(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setAlpha(0.0f);
            if (viewGroup != null) {
                C110564Vo c110564Vo = new C110564Vo(OJ4.LJJJJLL(ORZ.LJLIIIL(C78842Uww.LJJ(0, viewGroup.getChildCount())), new AqS167S0100000_1(viewGroup, 251)));
                while (true) {
                    if (!c110564Vo.hasNext()) {
                        break;
                    }
                    if (((View) c110564Vo.next()).getVisibility() == 0) {
                        C87277YNd.LJJIJ(viewGroup);
                        break;
                    }
                }
            }
        }
        return LJFF(0.0f, 1.0f, viewGroup);
    }

    public ValueAnimator LIZJ(ViewGroup viewGroup) {
        float f;
        if (viewGroup != null) {
            f = viewGroup.getAlpha();
        } else {
            f = 0.0f;
        }
        ValueAnimator LJFF = LJFF(f, 0.0f, viewGroup);
        LJFF.addUpdateListener(new AUListenerS100S0100000_13(viewGroup, 83));
        return LJFF;
    }

    public AnimatorSet LJI(ConstraintLayout constraintLayout) {
        if (C29306Beo.LJIILLIIL(Boolean.TRUE) || constraintLayout == null) {
            return null;
        }
        AnimatorSet animatorSet = this.LJII;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(constraintLayout.getAlpha(), 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new AUListenerS94S0100000_5(constraintLayout, 32));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat);
        this.LJII = animatorSet2;
        animatorSet2.start();
        return this.LJII;
    }

    public final void LJIILL(View view) {
        if (!C28952BXw.LIZ()) {
            return;
        }
        this.LJIIJ = new WeakReference<>(view);
        this.LJIIIIZZ = true;
        if (view != null) {
            view.setAlpha(0.1f);
        }
        C29306Beo.LJJLJLI(view);
        ValueAnimator LJFF = LJFF(0.1f, 1.0f, view);
        ValueAnimator LIZIZ = LIZIZ(this.LIZJ);
        ValueAnimator LJFF2 = LJFF(1.0f, 0.0f, this.LJ);
        ValueAnimator LIZJ = LIZJ(this.LIZIZ);
        ValueAnimator LIZ = LIZ(view, C15380j0.LIZ(50.0f), true);
        ValueAnimator LIZ2 = LIZ(this.LJ, C15380j0.LIZ(50.0f), true);
        LIZ2.addListener(new ALAdapterS10S0100000_13(this, 43));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(LJFF, LIZJ, LJFF2, LIZ, LIZIZ, LIZ2);
        animatorSet.start();
    }

    public ValueAnimator LJIILLIIL(ConstraintLayout constraintLayout) {
        if (C29306Beo.LJIILLIIL(Boolean.TRUE) || constraintLayout == null) {
            return null;
        }
        C87277YNd.LJJIJ(constraintLayout);
        constraintLayout.setAlpha(0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(constraintLayout.getAlpha(), 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(600L);
        ofFloat.addUpdateListener(new AUListenerS90S0100000_1(constraintLayout, 37));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        this.LJII = animatorSet;
        animatorSet.start();
        return ofFloat;
    }

    public AnimatorSet LJIIJ(boolean z, boolean z2) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.LJIILLIIL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.LJIIZILJ;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        if (z && z2) {
            ValueAnimator LJ = LJ();
            ValueAnimator LIZIZ = LIZIZ(this.LIZIZ);
            animatorSet = new AnimatorSet();
            animatorSet.playSequentially(LJ, LIZIZ);
        } else if (C29306Beo.LJIILLIIL(Boolean.valueOf(z)) && z2) {
            ValueAnimator LIZIZ2 = LIZIZ(this.LIZIZ);
            animatorSet = new AnimatorSet();
            animatorSet.playSequentially(LIZIZ2);
        } else if (z && C29306Beo.LJIILLIIL(Boolean.valueOf(z2))) {
            ValueAnimator LJ2 = LJ();
            animatorSet = new AnimatorSet();
            animatorSet.playSequentially(LJ2);
        } else {
            if (C29306Beo.LJIILLIIL(Boolean.valueOf(z))) {
                C29306Beo.LJIILLIIL(Boolean.valueOf(z2));
            }
            return this.LJIIZILJ;
        }
        this.LJIIZILJ = animatorSet;
        animatorSet.start();
        return this.LJIIZILJ;
    }

    public final void LJIIJJI(View view, InterfaceC65784Pro onAnimEnd) {
        ViewGroup viewGroup;
        View childAt;
        View childAt2;
        o.LJIIIZ(onAnimEnd, "onAnimEnd");
        if (!C28952BXw.LIZ()) {
            return;
        }
        this.LJIIJ = new WeakReference<>(view);
        this.LJIIIZ = false;
        this.LJIIIIZZ = false;
        ValueAnimator LJFF = LJFF(1.0f, 0.0f, view);
        ValueAnimator LIZJ = LIZJ(this.LIZJ);
        ValueAnimator LIZ = LIZ(view, C15380j0.LIZ(50.0f), false);
        ValueAnimator LIZ2 = LIZ(this.LJ, C15380j0.LIZ(50.0f), false);
        ValueAnimator LJFF2 = LJFF(0.0f, 1.0f, this.LJ);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(LJFF, LIZJ, LIZ, LIZ2, LJFF2);
        ViewGroup viewGroup2 = this.LIZIZ;
        if ((viewGroup2 != null && (childAt2 = viewGroup2.getChildAt(0)) != null && C29306Beo.LJJIIJ(childAt2)) || ((viewGroup = this.LIZIZ) != null && (childAt = viewGroup.getChildAt(1)) != null && C29306Beo.LJJIIJ(childAt))) {
            if (this.LJIIJJI) {
                animatorSet.play(LIZIZ(this.LIZIZ));
            } else {
                animatorSet.play(LIZJ(this.LIZIZ));
            }
        }
        animatorSet.addListener(new ALAdapterS3S0100000_4(onAnimEnd, 12));
        animatorSet.start();
    }

    public AnimatorSet LJIIL(boolean z, boolean z2) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.LJIILLIIL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.LJIIZILJ;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        if (z2 && z) {
            ValueAnimator LIZJ = LIZJ(this.LIZIZ);
            ValueAnimator LIZLLL = LIZLLL();
            animatorSet = new AnimatorSet();
            animatorSet.playSequentially(LIZJ, LIZLLL);
        } else if (C29306Beo.LJIILLIIL(Boolean.valueOf(z2)) && z) {
            ValueAnimator LIZLLL2 = LIZLLL();
            animatorSet = new AnimatorSet();
            animatorSet.playSequentially(LIZLLL2);
        } else if (z2 && C29306Beo.LJIILLIIL(Boolean.valueOf(z))) {
            ValueAnimator LIZJ2 = LIZJ(this.LIZIZ);
            animatorSet = new AnimatorSet();
            animatorSet.playSequentially(LIZJ2);
        } else {
            if (C29306Beo.LJIILLIIL(Boolean.valueOf(z2))) {
                C29306Beo.LJIILLIIL(Boolean.valueOf(z));
            }
            return this.LJIILLIIL;
        }
        this.LJIILLIIL = animatorSet;
        animatorSet.start();
        return this.LJIILLIIL;
    }

    public final void LJIILIIL(boolean z, boolean z2) {
        ValueAnimator LIZIZ;
        this.LJIIJJI = true;
        View view = null;
        if (!this.LJIIIZ) {
            WeakReference<View> weakReference = this.LJIIJ;
            if (weakReference != null) {
                view = weakReference.get();
            }
            LJIILL(view);
        }
        AnimatorSet animatorSet = this.LJIJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LJIJI;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        if (z) {
            LIZIZ = LIZLLL();
        } else if (!z2) {
            return;
        } else {
            LIZIZ = LIZIZ(this.LIZIZ);
        }
        if (LIZIZ != null) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(LIZIZ);
            this.LJIJ = animatorSet3;
            animatorSet3.start();
        }
    }

    public final void LJIILJJIL(boolean z, boolean z2) {
        ValueAnimator LIZJ;
        this.LJIIJJI = false;
        View view = null;
        if (this.LJIIIIZZ) {
            WeakReference<View> weakReference = this.LJIIJ;
            if (weakReference != null) {
                view = weakReference.get();
            }
            LJIIJJI(view, C75423Tit.LJLIL);
            return;
        }
        if (!z && !z2) {
            return;
        }
        AnimatorSet animatorSet = this.LJIJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LJIJ;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        if (z) {
            LIZJ = LJ();
        } else if (!z2) {
            return;
        } else {
            LIZJ = LIZJ(this.LIZIZ);
        }
        if (LIZJ != null) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(LIZJ);
            this.LJIJI = animatorSet3;
            animatorSet3.start();
        }
    }

    public static ValueAnimator LIZ(View view, int i, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        int i2;
        int i3;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (i2 = layoutParams.height) <= 0) {
            if (view != null) {
                i2 = view.getMeasuredHeight();
            } else {
                i2 = 0;
            }
        }
        if (i2 <= 0) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
            o.LJIIIIZZ(ofFloat, "ofFloat(0F, 0F)");
            return ofFloat;
        }
        if (z) {
            i3 = i + i2;
        } else {
            i3 = i2 - i;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(i2, i3);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(LiveChatShowDelayForHotLiveSetting.DEFAULT);
        ofFloat2.addUpdateListener(new AUListenerS90S0100000_1(view, 35));
        return ofFloat2;
    }

    public static ValueAnimator LJFF(float f, float f2, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(view, 33));
        return ofFloat;
    }

    public C75422Tis(ConstraintLayout constraintLayout, ViewGroup viewGroup, ViewGroup viewGroup2, View view, ViewGroup viewGroup3, ViewGroup viewGroup4, InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZ = constraintLayout;
        this.LIZIZ = viewGroup;
        this.LIZJ = viewGroup2;
        this.LIZLLL = view;
        this.LJ = viewGroup3;
        this.LJFF = viewGroup4;
        this.LJI = interfaceC65784Pro;
    }
}
