package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vfc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80316Vfc {
    public final Context LIZ;
    public final C80315Vfb LIZIZ;
    public LinearLayout LIZJ;
    public int LIZLLL;
    public FrameLayout LJ;
    public Animator LJFF;
    public final float LJI;
    public int LJII;
    public int LJIIIIZZ;
    public CharSequence LJIIIZ;
    public boolean LJIIJ;
    public AppCompatTextView LJIIJJI;
    public CharSequence LJIIL;
    public int LJIILIIL;
    public ColorStateList LJIILJJIL;
    public CharSequence LJIILL;
    public boolean LJIILLIIL;
    public AppCompatTextView LJIIZILJ;
    public int LJIJ;
    public ColorStateList LJIJI;
    public Typeface LJIJJ;

    public final void LJII() {
        this.LJIIIZ = null;
        LIZJ();
        if (this.LJII == 1) {
            if (this.LJIILLIIL && !TextUtils.isEmpty(this.LJIILL)) {
                this.LJIIIIZZ = 2;
            } else {
                this.LJIIIIZZ = 0;
            }
        }
        LJIIJ(this.LJII, this.LJIIIIZZ, LJIIIZ(this.LJIIJJI, null));
    }

    public final void LIZIZ() {
        if (this.LIZJ != null && this.LIZIZ.getEditText() != null) {
            EditText editText = this.LIZIZ.getEditText();
            boolean LJ = C80285Vf7.LJ(this.LIZ);
            LinearLayout linearLayout = this.LIZJ;
            int LJFF = C16310kV.LJFF(editText);
            if (LJ) {
                LJFF = this.LIZ.getResources().getDimensionPixelSize(R.dimen.z1);
            }
            int dimensionPixelSize = this.LIZ.getResources().getDimensionPixelSize(R.dimen.z0);
            if (LJ) {
                dimensionPixelSize = this.LIZ.getResources().getDimensionPixelSize(R.dimen.z2);
            }
            int LJ2 = C16310kV.LJ(editText);
            if (LJ) {
                LJ2 = this.LIZ.getResources().getDimensionPixelSize(R.dimen.z1);
            }
            C16310kV.LJIIJ(linearLayout, LJFF, dimensionPixelSize, LJ2, 0);
        }
    }

    public final void LIZJ() {
        Animator animator = this.LJFF;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final boolean LJ() {
        if (this.LJIIIIZZ == 1 && this.LJIIJJI != null && !TextUtils.isEmpty(this.LJIIIZ)) {
            return true;
        }
        return false;
    }

    public final int LJI() {
        AppCompatTextView appCompatTextView = this.LJIIJJI;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public C80316Vfc(C80315Vfb c80315Vfb) {
        this.LIZ = c80315Vfb.getContext();
        this.LIZIZ = c80315Vfb;
        this.LJI = r0.getResources().getDimensionPixelSize(R.dimen.n0);
    }

    public final TextView LJFF(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.LJIIZILJ;
        }
        return this.LJIIJJI;
    }

    public final void LIZ(TextView textView, int i) {
        if (this.LIZJ == null && this.LJ == null) {
            LinearLayout linearLayout = new LinearLayout(this.LIZ);
            this.LIZJ = linearLayout;
            linearLayout.setOrientation(0);
            this.LIZIZ.addView(this.LIZJ, -1, -2);
            this.LJ = new FrameLayout(this.LIZ);
            this.LIZJ.addView(this.LJ, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.LIZIZ.getEditText() != null) {
                LIZIZ();
            }
        }
        if (i == 0 || i == 1) {
            this.LJ.setVisibility(0);
            this.LJ.addView(textView);
        } else {
            this.LIZJ.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.LIZJ.setVisibility(0);
        this.LIZLLL++;
    }

    public final void LJIIIIZZ(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.LIZJ;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.LJ) != null) {
            C16880lQ.LJLLLL(textView, frameLayout);
        } else {
            C16880lQ.LJZI(linearLayout, textView);
        }
        int i2 = this.LIZLLL - 1;
        this.LIZLLL = i2;
        LinearLayout linearLayout2 = this.LIZJ;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean LJIIIZ(TextView textView, CharSequence charSequence) {
        if (C16330kX.LIZJ(this.LIZIZ) && this.LIZIZ.isEnabled() && (this.LJIIIIZZ != this.LJII || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void LJIIJ(int i, int i2, boolean z) {
        TextView LJFF;
        TextView LJFF2;
        if (i == i2) {
            return;
        }
        C80316Vfc c80316Vfc = this;
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            c80316Vfc.LJFF = animatorSet;
            ArrayList arrayList = new ArrayList();
            c80316Vfc.LIZLLL(arrayList, c80316Vfc.LJIILLIIL, c80316Vfc.LJIIZILJ, 2, i, i2);
            c80316Vfc.LIZLLL(arrayList, c80316Vfc.LJIIJ, c80316Vfc.LJIIJJI, 1, i, i2);
            C78939UyV.LJJJJI(animatorSet, arrayList);
            TextView LJFF3 = c80316Vfc.LJFF(i);
            TextView LJFF4 = c80316Vfc.LJFF(i2);
            c80316Vfc = c80316Vfc;
            animatorSet.addListener(new C80318Vfe(c80316Vfc, i2, LJFF3, i, LJFF4));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (LJFF2 = c80316Vfc.LJFF(i2)) != null) {
                LJFF2.setVisibility(0);
                LJFF2.setAlpha(1.0f);
            }
            if (i != 0 && (LJFF = c80316Vfc.LJFF(i)) != null) {
                LJFF.setVisibility(4);
                if (i == 1) {
                    LJFF.setText((CharSequence) null);
                }
            }
            c80316Vfc.LJII = i2;
        }
        c80316Vfc.LIZIZ.LJIILLIIL();
        c80316Vfc.LIZIZ.LJIJ(z, false);
        c80316Vfc.LIZIZ.LJJIFFI();
    }

    public final void LIZLLL(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        float f;
        if (textView == null || !z) {
            return;
        }
        if (i != i3 && i != i2) {
            return;
        }
        if (i3 == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C80237VeL.LIZ);
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(ofFloat);
        if (i3 != i) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.LJI, 0.0f);
        ofFloat2.setDuration(217L);
        ofFloat2.setInterpolator(C80237VeL.LIZLLL);
        arrayList.add(ofFloat2);
    }
}
