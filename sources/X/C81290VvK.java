package X;

import Y.ALAdapterS11S0100000_14;
import Y.AUListenerS103S0200000_14;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VvK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81290VvK extends C19F {
    public final int LJLJJI;
    public C81292VvM LJLJJL;
    public int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;

    public final void LIZIZ() {
        int i = this.LJLJLJ;
        float f = this.LJLJJI;
        int i2 = this.LJLJL;
        C81292VvM c81292VvM = this.LJLJJL;
        C81291VvL c81291VvL = new C81291VvL(this, c81292VvM);
        c81291VvL.LJFF = i;
        c81291VvL.LJI = f;
        c81291VvL.LIZIZ = i;
        c81291VvL.LIZJ = i2;
        c81291VvL.LIZ = 300;
        int i3 = this.LJLJJLL;
        c81291VvL.LIZLLL = i3;
        c81291VvL.LJ = i3;
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        GradientDrawable gradientDrawable = c81292VvM.LIZJ;
        ofInt.addUpdateListener(new AUListenerS103S0200000_14(gradientDrawable, c81291VvL, 3));
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(gradientDrawable, "color", c81291VvL.LIZLLL, c81291VvL.LJ);
        ofInt2.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(c81292VvM, "strokeColor", 0, 0);
        ofInt3.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gradientDrawable, "cornerRadius", c81291VvL.LJFF, c81291VvL.LJI);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(c81291VvL.LIZ);
        animatorSet.playTogether(ofInt, ofInt2, ofInt3, ofFloat);
        animatorSet.addListener(new ALAdapterS11S0100000_14(c81291VvL, 30));
        animatorSet.start();
    }

    public final C81292VvM LIZ(int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) C78127UlP.LIZJ(i, i, 0, this.LJLJJI);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(this.LJLJJI);
        C81292VvM c81292VvM = new C81292VvM(gradientDrawable);
        c81292VvM.LIZIZ = i;
        gradientDrawable.setStroke(c81292VvM.LIZ, i);
        c81292VvM.LIZ = 0;
        gradientDrawable.setStroke(0, c81292VvM.LIZIZ);
        return c81292VvM;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.LJLJJLL = i;
        C81292VvM LIZ = LIZ(i);
        this.LJLJJL = LIZ;
        setBackgroundCompat(LIZ.LIZJ);
    }

    public void setBackgroundCompat(Drawable drawable) {
        setBackground(drawable);
    }

    public C81290VvK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJLL = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
        this.LJLJJI = (int) KL2.LIZJ(context, 22.0f);
        this.LJLJL = (int) KL2.LIZJ(context, 230.0f);
        this.LJLJLJ = (int) KL2.LIZJ(context, 44.0f);
        if (this.LJLJJL == null) {
            this.LJLJJL = LIZ(this.LJLJJLL);
        }
        setBackgroundCompat(this.LJLJJL.LIZJ);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.LJLJL, this.LJLJLJ);
    }
}
