package X;

import android.animation.Animator;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.google.gson.internal.b;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CY9 implements Animator.AnimatorListener {
    public final /* synthetic */ OnlineAudienceRankWidget LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(animation, "animation");
        CY1 LLFII = this.LJLIL.LLFII();
        if (LLFII != null && (layoutParams = LLFII.getLayoutParams()) != null) {
            layoutParams.width = -2;
        }
        this.LJLIL.LLIIIJ(this.LJLILLLLZI);
        CY1 LLFII2 = this.LJLIL.LLFII();
        String LJIILIIL = b.LJIILIIL(this.LJLILLLLZI);
        o.LJIIIIZZ(LJIILIIL, "getDisplayCountFloor(num.toLong())");
        Locale ENGLISH = Locale.ENGLISH;
        o.LJIIIIZZ(ENGLISH, "ENGLISH");
        String upperCase = LJIILIIL.toUpperCase(ENGLISH);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
        LLFII2.setText(upperCase);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LLIIIJ(this.LJLILLLLZI);
        CY1 LLFII = this.LJLIL.LLFII();
        String LJIILIIL = b.LJIILIIL(this.LJLILLLLZI);
        o.LJIIIIZZ(LJIILIIL, "getDisplayCountFloor(num.toLong())");
        Locale ENGLISH = Locale.ENGLISH;
        o.LJIIIIZZ(ENGLISH, "ENGLISH");
        String upperCase = LJIILIIL.toUpperCase(ENGLISH);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
        LLFII.setText(upperCase);
    }

    public CY9(OnlineAudienceRankWidget onlineAudienceRankWidget, int i) {
        this.LJLIL = onlineAudienceRankWidget;
        this.LJLILLLLZI = i;
    }
}
