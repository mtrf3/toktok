package X;

import Y.AUListenerS103S0100000_16;
import Y.AUListenerS105S0200000_16;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.YdC, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87810YdC extends AbstractC87817YdJ {
    @Override // X.AbstractC87817YdJ
    public final void LJ(C31521CYr textInfo) {
        int i;
        o.LJIIIZ(textInfo, "textInfo");
        this.LIZLLL.setVisibility(0);
        AbstractC87817YdJ.LJFF(this.LIZJ);
        this.LIZJ.setCardBackgroundColor(this.LIZIZ.LJ);
        int measuredWidth = this.LIZJ.getMeasuredWidth();
        AbstractC87817YdJ.LJIIIIZZ(this.LIZLLL, measuredWidth);
        this.LIZLLL.setBackgroundColor(this.LIZIZ.LJFF);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new AUListenerS105S0200000_16(this, textInfo, 0));
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setDuration(450L);
        ofFloat2.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
        ofFloat2.addUpdateListener(new AUListenerS103S0100000_16(this, 7));
        ofFloat2.setStartDelay(550L);
        ofFloat2.start();
        this.LJII.setVisibility(0);
        ViewGroup viewGroup = this.LJIIJJI;
        RankAnimationInfo rankAnimationInfo = textInfo.LJFF;
        if (rankAnimationInfo != null) {
            i = rankAnimationInfo.getBackgroundColor();
        } else {
            i = this.LIZIZ.LJI;
        }
        viewGroup.setBackgroundColor(i);
        this.LJIIL.setVisibility(0);
        this.LJIIIIZZ.setVisibility(0);
        this.LJIIJ.setText(textInfo.LIZIZ);
        this.LJIIJ.setTextSize(this.LIZIZ.LJIIIZ * 1.15f);
        AbstractC87817YdJ.LJFF(this.LJII);
        int measuredWidth2 = this.LJII.getMeasuredWidth();
        CardView cardView = this.LJII;
        int measuredWidth3 = this.LJ.getMeasuredWidth();
        if (measuredWidth3 > measuredWidth2) {
            measuredWidth3 = measuredWidth2;
        }
        AbstractC87817YdJ.LJIIIIZZ(cardView, measuredWidth3);
        AbstractC87817YdJ.LJIIIIZZ(this.LJIIJJI, 0);
        AbstractC87817YdJ.LJFF(this.LJIIL);
        int measuredWidth4 = this.LJIIL.getMeasuredWidth();
        this.LJIIL.setTranslationX(0.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, measuredWidth4 + measuredWidth2);
        ofInt.setDuration(1150L);
        ofInt.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
        ofInt.addUpdateListener(new C87803Yd5(measuredWidth2, measuredWidth, this));
        ofInt.addListener(new C87804Yd6(this));
        ofInt.setStartDelay(550L);
        ofInt.start();
        float f = this.LIZIZ.LJIIIZ;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.15f * f, f);
        ofFloat3.setDuration(200L);
        ofFloat3.setInterpolator(new LinearInterpolator());
        ofFloat3.addUpdateListener(new AUListenerS103S0100000_16(this, 8));
        ofFloat3.addListener(new C87813YdF(this, textInfo));
        ofFloat3.setStartDelay(1800L);
        ofFloat3.start();
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat4.setDuration(300L);
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new AUListenerS105S0200000_16(this, textInfo, 1));
        ofFloat4.addListener(new C87812YdE(this));
        ofFloat4.setStartDelay(5000L);
        ofFloat4.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87810YdC(CardView contentView, C87818YdK dataHolder) {
        super(contentView, dataHolder);
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(dataHolder, "dataHolder");
    }
}
