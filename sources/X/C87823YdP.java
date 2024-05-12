package X;

import Y.AUListenerS103S0100000_16;
import android.animation.ValueAnimator;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.YdP, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87823YdP extends AbstractC87817YdJ {
    @Override // X.AbstractC87817YdJ
    public final void LJ(C31521CYr textInfo) {
        long j;
        int i;
        String str;
        o.LJIIIZ(textInfo, "textInfo");
        RankAnimationInfo rankAnimationInfo = textInfo.LJFF;
        if (rankAnimationInfo != null) {
            j = rankAnimationInfo.duration;
        } else {
            j = 5;
        }
        long j2 = j * 1000;
        this.LIZ.setRadius(0.0f);
        float height = this.LIZ.getHeight();
        float f = (-1.0f) * height;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
        ofFloat.addUpdateListener(new AUListenerS103S0100000_16(this, 3));
        ofFloat.start();
        this.LJII.setVisibility(0);
        this.LJII.setTranslationY(height);
        CardView cardView = this.LJII;
        RankAnimationInfo rankAnimationInfo2 = textInfo.LJFF;
        if (rankAnimationInfo2 != null) {
            i = rankAnimationInfo2.getBackgroundColor();
        } else {
            i = this.LIZIZ.LJI;
        }
        cardView.setCardBackgroundColor(i);
        this.LJIIIZ.setVisibility(8);
        TextView textView = this.LJIIJ;
        RankAnimationInfo rankAnimationInfo3 = textInfo.LJFF;
        if (rankAnimationInfo3 != null) {
            str = rankAnimationInfo3.getContent();
        } else {
            str = null;
        }
        textView.setText(str);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(height, 0.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
        ofFloat2.addUpdateListener(new AUListenerS103S0100000_16(this, 4));
        ofFloat2.addListener(new C87830YdW(this, textInfo, j2));
        ofFloat2.start();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, height);
        ofFloat3.setDuration(300L);
        ofFloat3.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
        ofFloat3.addUpdateListener(new AUListenerS103S0100000_16(this, 5));
        long j3 = j2 + 300;
        ofFloat3.setStartDelay(j3);
        ofFloat3.start();
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f, 0.0f);
        ofFloat4.setDuration(300L);
        ofFloat4.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
        ofFloat4.addUpdateListener(new AUListenerS103S0100000_16(this, 6));
        ofFloat4.addListener(new C87824YdQ(this, textInfo));
        ofFloat4.setStartDelay(j3);
        ofFloat4.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87823YdP(CardView contentView, C87818YdK dataHolder) {
        super(contentView, dataHolder);
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(dataHolder, "dataHolder");
    }
}
