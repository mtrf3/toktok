package X;

import android.animation.Animator;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.YdD, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87811YdD extends C87797Ycz {
    public final /* synthetic */ C87807Yd9 LJLIL;
    public final /* synthetic */ C31521CYr LJLILLLLZI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC87817YdJ.LJIIIIZZ(this.LJLIL.LIZ, -2);
        C87807Yd9 c87807Yd9 = this.LJLIL;
        c87807Yd9.LJII.setCardBackgroundColor(c87807Yd9.LIZIZ.LJ);
        this.LJLIL.LJII.setVisibility(8);
        this.LJLIL.LIZJ.setTranslationY(0.0f);
        C87807Yd9 c87807Yd92 = this.LJLIL;
        c87807Yd92.LIZJ.setCardBackgroundColor(c87807Yd92.LIZIZ.LJFF);
        this.LJLIL.LJ.setAlpha(1.0f);
        this.LJLIL.LJII(false);
    }

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        int i;
        o.LJIIIZ(animation, "animation");
        C87807Yd9 c87807Yd9 = this.LJLIL;
        c87807Yd9.LIZ.setCardBackgroundColor(c87807Yd9.LIZIZ.LJ);
        C87807Yd9 c87807Yd92 = this.LJLIL;
        CardView cardView = c87807Yd92.LJII;
        RankAnimationInfo rankAnimationInfo = this.LJLILLLLZI.LJFF;
        if (rankAnimationInfo != null) {
            i = rankAnimationInfo.getBackgroundColor();
        } else {
            i = c87807Yd92.LIZIZ.LJI;
        }
        cardView.setCardBackgroundColor(i);
    }

    public C87811YdD(C87807Yd9 c87807Yd9, C31521CYr c31521CYr) {
        this.LJLIL = c87807Yd9;
        this.LJLILLLLZI = c31521CYr;
    }
}
