package X;

import android.animation.Animator;
import android.graphics.Color;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import kotlin.jvm.internal.o;

/* renamed from: X.YdN, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87821YdN extends C87797Ycz {
    public final /* synthetic */ C31521CYr LJLIL;
    public final /* synthetic */ C87822YdO LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLILLLLZI.LJIIIZ.setVisibility(0);
        C87822YdO c87822YdO = this.LJLILLLLZI;
        c87822YdO.LJII.setCardBackgroundColor(c87822YdO.LIZIZ.LJ);
        this.LJLILLLLZI.LJII.setTranslationY(0.0f);
        this.LJLILLLLZI.LJII.setVisibility(8);
        C87822YdO c87822YdO2 = this.LJLILLLLZI;
        c87822YdO2.LIZ.setRadius(c87822YdO2.LIZIZ.LJIIIIZZ);
        this.LJLILLLLZI.LJII(false);
    }

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (o.LJ(this.LJLIL.LIZ.LIZIZ, RankTypeV2.LIZ)) {
            C87818YdK c87818YdK = this.LJLILLLLZI.LIZIZ;
            int i = this.LJLJI;
            c87818YdK.LJFF = Color.argb((int) (255 * 0.5f), (i >> 16) & 255, (i >> 8) & 255, i & 255);
            C87822YdO c87822YdO = this.LJLILLLLZI;
            c87822YdO.LIZJ.setCardBackgroundColor(c87822YdO.LIZIZ.LJFF);
        }
    }

    public C87821YdN(C31521CYr c31521CYr, C87822YdO c87822YdO, int i) {
        this.LJLIL = c31521CYr;
        this.LJLILLLLZI = c87822YdO;
        this.LJLJI = i;
    }
}
