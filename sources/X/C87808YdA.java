package X;

import Y.AUListenerS103S0100000_16;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import androidx.cardview.widget.CardView;
import kotlin.jvm.internal.o;

/* renamed from: X.YdA, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87808YdA extends AbstractC87817YdJ {
    @Override // X.AbstractC87817YdJ
    public final void LJ(C31521CYr textInfo) {
        o.LJIIIZ(textInfo, "textInfo");
        int width = this.LIZJ.getWidth();
        AbstractC87817YdJ.LJIIIIZZ(this.LIZ, width);
        this.LIZJ.setCardBackgroundColor(this.LIZIZ.LJFF);
        this.LIZJ.setCardBackgroundColor(this.LIZIZ.LJ);
        this.LIZ.setCardBackgroundColor(this.LIZIZ.LJFF);
        this.LJII.setVisibility(0);
        this.LJIIIIZZ.setAlpha(0.0f);
        this.LJIIJ.setText(textInfo.LIZIZ);
        AbstractC87817YdJ.LJFF(this.LJII);
        int measuredWidth = this.LJII.getMeasuredWidth();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new AUListenerS103S0100000_16(this, 0));
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(250L);
        ofFloat2.setStartDelay(150L);
        ofFloat2.addUpdateListener(new AUListenerS103S0100000_16(this, 1));
        ofFloat2.addListener(new C87809YdB(this));
        ofFloat2.start();
        ValueAnimator ofInt = ValueAnimator.ofInt(width, measuredWidth);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new AUListenerS103S0100000_16(this, 2));
        ofInt.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87808YdA(CardView contentView, C87818YdK dataHolder) {
        super(contentView, dataHolder);
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(dataHolder, "dataHolder");
    }
}
