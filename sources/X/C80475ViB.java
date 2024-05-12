package X;

import Y.IDDListenerS395S0100000_14;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.ViB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80475ViB {
    public static final C30891Jd LJIL = C80237VeL.LIZJ;
    public static final int[] LJJ = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] LJJI = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] LJJIFFI = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] LJJII = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] LJJIII = {R.attr.state_enabled};
    public static final int[] LJJIIJ = new int[0];
    public C80416VhE LIZ;
    public boolean LIZIZ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public C80246VeU LJI;
    public C80246VeU LJII;
    public Animator LJIIIIZZ;
    public C80246VeU LJIIIZ;
    public C80246VeU LJIIJ;
    public float LJIIJJI;
    public int LJIILIIL;
    public ArrayList<Animator.AnimatorListener> LJIILJJIL;
    public ArrayList<Animator.AnimatorListener> LJIILL;
    public ArrayList<InterfaceC80490ViQ> LJIILLIIL;
    public final C80474ViA LJIIZILJ;
    public final InterfaceC80495ViV LJIJ;
    public final Matrix LJIJJ;
    public IDDListenerS395S0100000_14 LJIJJLI;
    public boolean LIZJ = true;
    public float LJIIL = 1.0f;
    public final Rect LJIJI = new Rect();

    public float LIZJ() {
        throw null;
    }

    public void LJ() {
        throw null;
    }

    public void LJFF() {
        throw null;
    }

    public void LJI(int[] iArr) {
        throw null;
    }

    public void LJII(float f, float f2, float f3) {
        throw null;
    }

    public void LJIIIZ() {
        throw null;
    }

    public void LJIIJ() {
        throw null;
    }

    public final void LJIIIIZZ() {
        ArrayList<InterfaceC80490ViQ> arrayList = this.LJIILLIIL;
        if (arrayList != null) {
            Iterator<InterfaceC80490ViQ> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ();
            }
        }
    }

    public final void LJIIJJI() {
        LIZLLL(this.LJIJI);
        TMC.LJIIIZ(null, "Didn't initialize content background");
        throw null;
    }

    public static ValueAnimator LIZIZ(AbstractC80483ViJ abstractC80483ViJ) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(LJIL);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC80483ViJ);
        valueAnimator.addUpdateListener(abstractC80483ViJ);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public void LIZLLL(Rect rect) {
        float f;
        int i = 0;
        if (this.LIZIZ) {
            i = (0 - this.LJIIZILJ.getSizeDimension()) / 2;
        }
        if (this.LIZJ) {
            f = LIZJ() + this.LJFF;
        } else {
            f = 0.0f;
        }
        int max = Math.max(i, (int) Math.ceil(f));
        int max2 = Math.max(i, (int) Math.ceil(f * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public C80475ViB(C80474ViA c80474ViA, C80489ViP c80489ViP) {
        new RectF();
        new RectF();
        this.LJIJJ = new Matrix();
        this.LJIIZILJ = c80474ViA;
        this.LJIJ = c80489ViP;
        C80492ViS c80492ViS = new C80492ViS();
        C80476ViC c80476ViC = (C80476ViC) this;
        c80492ViS.LIZ(LJJ, LIZIZ(new C80484ViK(c80476ViC)));
        c80492ViS.LIZ(LJJI, LIZIZ(new C80482ViI(c80476ViC)));
        c80492ViS.LIZ(LJJIFFI, LIZIZ(new C80482ViI(c80476ViC)));
        c80492ViS.LIZ(LJJII, LIZIZ(new C80482ViI(c80476ViC)));
        c80492ViS.LIZ(LJJIII, LIZIZ(new C80485ViL(c80476ViC)));
        c80492ViS.LIZ(LJJIIJ, LIZIZ(new C80486ViM(c80476ViC)));
        this.LJIIJJI = c80474ViA.getRotation();
    }

    public final AnimatorSet LIZ(C80246VeU c80246VeU, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C80474ViA, Float>) View.ALPHA, f);
        c80246VeU.LIZJ("opacity").LIZ(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C80474ViA, Float>) View.SCALE_X, f2);
        c80246VeU.LIZJ("scale").LIZ(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new MKK());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C80474ViA, Float>) View.SCALE_Y, f2);
        c80246VeU.LIZJ("scale").LIZ(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new MKK());
        }
        arrayList.add(ofFloat3);
        this.LJIJJ.reset();
        this.LJIIZILJ.getDrawable();
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.LJIIZILJ, new C80496ViW(), new C80479ViF(this), new Matrix(this.LJIJJ));
        c80246VeU.LIZJ("iconScale").LIZ(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C78939UyV.LJJJJI(animatorSet, arrayList);
        return animatorSet;
    }
}
