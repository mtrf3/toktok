package X;

import Y.AUListenerS103S0100000_16;
import Y.AUListenerS105S0200000_16;
import android.animation.ValueAnimator;
import android.text.Layout;
import android.view.animation.LinearInterpolator;
import androidx.cardview.widget.CardView;
import kotlin.jvm.internal.o;

/* renamed from: X.Yd9, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87807Yd9 extends AbstractC87817YdJ {
    @Override // X.AbstractC87817YdJ
    public final void LJ(C31521CYr textInfo) {
        int i;
        boolean z;
        o.LJIIIZ(textInfo, "textInfo");
        int width = this.LJI.getWidth();
        Layout layout = this.LJI.getLayout();
        if (layout != null) {
            i = (int) layout.getLineWidth(0);
        } else {
            i = 0;
        }
        if (width < i) {
            z = true;
        } else {
            z = false;
        }
        int width2 = this.LIZJ.getWidth();
        AbstractC87817YdJ.LJIIIIZZ(this.LIZ, width2);
        this.LIZJ.setCardBackgroundColor(this.LIZIZ.LJ);
        this.LIZ.setCardBackgroundColor(this.LIZIZ.LJFF);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new AUListenerS105S0200000_16(this, textInfo, 2));
        ofFloat.start();
        this.LIZJ.setTranslationY(0.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, this.LIZIZ.LJIIJ * (-1.0f));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(250L);
        ofFloat2.setStartDelay(800L);
        ofFloat2.addUpdateListener(new AUListenerS103S0100000_16(this, 25));
        ofFloat2.start();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(new LinearInterpolator());
        ofFloat3.setDuration(200L);
        ofFloat3.setStartDelay(800L);
        ofFloat3.addUpdateListener(new AUListenerS103S0100000_16(this, 26));
        ofFloat3.start();
        this.LJII.setVisibility(0);
        this.LJII.setTranslationY(this.LIZIZ.LJIIJ);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.LIZIZ.LJIIJ, 0.0f);
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.setDuration(250L);
        ofFloat4.setStartDelay(800L);
        ofFloat4.addUpdateListener(new AUListenerS103S0100000_16(this, 27));
        ofFloat4.start();
        this.LJIIJ.setText(textInfo.LIZIZ);
        this.LJIIIIZZ.setAlpha(0.0f);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat5.setInterpolator(new LinearInterpolator());
        ofFloat5.setDuration(250L);
        ofFloat5.setStartDelay(800L);
        ofFloat5.addUpdateListener(new AUListenerS103S0100000_16(this, 28));
        ofFloat5.start();
        AbstractC87817YdJ.LJFF(this.LJII);
        int measuredWidth = this.LJII.getMeasuredWidth();
        if (z && width2 <= measuredWidth) {
            measuredWidth = width2;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(width2, measuredWidth);
        ofInt.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 0.1f));
        ofInt.setDuration(250L);
        ofInt.setStartDelay(800L);
        ofInt.addUpdateListener(new AUListenerS103S0100000_16(this, 29));
        ofInt.addListener(new C87832YdY(this, textInfo));
        ofInt.start();
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat6.setInterpolator(C18950ol.LIZIZ(0.7f, 0.01f, 1.0f, 1.01f));
        ofFloat6.setDuration(300L);
        ofFloat6.setStartDelay(4100L);
        ofFloat6.addUpdateListener(new AUListenerS105S0200000_16(this, textInfo, 3));
        ofFloat6.addListener(new C87811YdD(this, textInfo));
        ofFloat6.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87807Yd9(CardView contentView, C87818YdK dataHolder) {
        super(contentView, dataHolder);
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(dataHolder, "dataHolder");
    }
}
