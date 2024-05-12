package X;

import Y.AUListenerS103S0100000_16;
import android.animation.ValueAnimator;
import android.text.Layout;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import androidx.cardview.widget.CardView;
import kotlin.jvm.internal.o;

/* renamed from: X.Yd8, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87806Yd8 extends AbstractC87817YdJ {
    public boolean LJIILJJIL;

    @Override // X.AbstractC87817YdJ
    public final void LJ(C31521CYr textInfo) {
        int i;
        boolean z;
        C80955Vpv c80955Vpv;
        int width;
        o.LJIIIZ(textInfo, "textInfo");
        if (this.LJIILJJIL) {
            int width2 = this.LJI.getWidth();
            Layout layout = this.LJI.getLayout();
            if (layout != null) {
                i = (int) layout.getLineWidth(0);
            } else {
                i = 0;
            }
            if (width2 < i) {
                z = true;
            } else {
                z = false;
            }
            int width3 = this.LIZJ.getWidth();
            AbstractC87817YdJ.LJIIIIZZ(this.LIZ, width3);
            this.LIZ.setCardBackgroundColor(this.LIZIZ.LJFF);
            this.LIZJ.setCardBackgroundColor(this.LIZIZ.LJ);
            this.LIZJ.setTranslationY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.LIZIZ.LJIIJ * (-1.0f));
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(250L);
            ofFloat.addUpdateListener(new AUListenerS103S0100000_16(this, 18));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setDuration(200L);
            ofFloat2.addUpdateListener(new AUListenerS103S0100000_16(this, 19));
            ofFloat2.start();
            this.LJII.setVisibility(0);
            this.LJII.setTranslationY(this.LIZIZ.LJIIJ);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.LIZIZ.LJIIJ, 0.0f);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setDuration(250L);
            ofFloat3.addUpdateListener(new AUListenerS103S0100000_16(this, 20));
            ofFloat3.start();
            this.LJIIJ.setText(textInfo.LIZIZ);
            this.LJIIIIZZ.setAlpha(0.0f);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat4.setInterpolator(new LinearInterpolator());
            ofFloat4.setDuration(250L);
            ofFloat4.addUpdateListener(new AUListenerS103S0100000_16(this, 21));
            ofFloat4.start();
            AbstractC87817YdJ.LJFF(this.LJII);
            int measuredWidth = this.LJII.getMeasuredWidth();
            if (z && width3 <= measuredWidth) {
                measuredWidth = width3;
            }
            if (this.LIZ.getParent() instanceof C80955Vpv) {
                ViewParent parent = this.LIZ.getParent();
                if ((parent instanceof C80955Vpv) && (c80955Vpv = (C80955Vpv) parent) != null && c80955Vpv.getEnableFixedSize() && measuredWidth > (width = c80955Vpv.getWidth())) {
                    measuredWidth = width;
                }
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(width3, measuredWidth);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.setDuration(250L);
            ofInt.addUpdateListener(new AUListenerS103S0100000_16(this, 22));
            ofInt.addListener(new C87815YdH(this, textInfo));
            ofInt.start();
            return;
        }
        int width4 = this.LIZJ.getWidth();
        AbstractC87817YdJ.LJIIIIZZ(this.LIZ, width4);
        this.LIZJ.setCardBackgroundColor(this.LIZIZ.LJFF);
        this.LIZJ.setCardBackgroundColor(this.LIZIZ.LJ);
        this.LIZ.setCardBackgroundColor(this.LIZIZ.LJFF);
        this.LJII.setVisibility(0);
        this.LJIIIIZZ.setAlpha(0.0f);
        this.LJIIJ.setText(textInfo.LIZIZ);
        AbstractC87817YdJ.LJFF(this.LJII);
        int measuredWidth2 = this.LJII.getMeasuredWidth();
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat5.setInterpolator(new LinearInterpolator());
        ofFloat5.setDuration(250L);
        ofFloat5.addUpdateListener(new AUListenerS103S0100000_16(this, 15));
        ofFloat5.start();
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat6.setInterpolator(new LinearInterpolator());
        ofFloat6.setDuration(250L);
        ofFloat6.setStartDelay(150L);
        ofFloat6.addUpdateListener(new AUListenerS103S0100000_16(this, 16));
        ofFloat6.addListener(new C87816YdI(this, textInfo));
        ofFloat6.start();
        ValueAnimator ofInt2 = ValueAnimator.ofInt(width4, measuredWidth2);
        ofInt2.setInterpolator(new LinearInterpolator());
        ofInt2.setDuration(250L);
        ofInt2.addUpdateListener(new AUListenerS103S0100000_16(this, 17));
        ofInt2.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87806Yd8(CardView contentView, C87818YdK dataHolder) {
        super(contentView, dataHolder);
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(dataHolder, "dataHolder");
    }
}
