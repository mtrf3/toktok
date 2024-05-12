package X;

import Y.AUListenerS103S0100000_16;
import android.animation.ValueAnimator;
import android.text.Layout;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import androidx.cardview.widget.CardView;
import kotlin.jvm.internal.o;

/* renamed from: X.Yd7, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87805Yd7 extends AbstractC87817YdJ {
    @Override // X.AbstractC87817YdJ
    public final void LJ(C31521CYr textInfo) {
        int i;
        boolean z;
        C80955Vpv c80955Vpv;
        int width;
        o.LJIIIZ(textInfo, "textInfo");
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.LIZIZ.LJIIJ);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new AUListenerS103S0100000_16(this, 30));
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new AUListenerS103S0100000_16(this, 31));
        ofFloat2.start();
        this.LJII.setVisibility(0);
        this.LJII.setTranslationY(this.LIZIZ.LJIIJ * (-1.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.LIZIZ.LJIIJ * (-1.0f), 0.0f);
        ofFloat3.setInterpolator(new LinearInterpolator());
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new AUListenerS103S0100000_16(this, 32));
        ofFloat3.start();
        this.LJIIJ.setText(textInfo.LIZIZ);
        this.LJIIIIZZ.setAlpha(0.0f);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new AUListenerS103S0100000_16(this, 33));
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
        ofInt.addUpdateListener(new AUListenerS103S0100000_16(this, 34));
        ofInt.addListener(new C87814YdG(this, textInfo));
        ofInt.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87805Yd7(CardView contentView, C87818YdK dataHolder) {
        super(contentView, dataHolder);
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(dataHolder, "dataHolder");
    }
}
