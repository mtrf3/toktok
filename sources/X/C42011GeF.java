package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import kotlin.jvm.internal.AqS38S0210000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GeF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42011GeF extends AnimatorListenerAdapter {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ExpandedTitleModule LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        int i = this.LJLIL;
        if (i > this.LJLILLLLZI) {
            this.LJLJI.LJLLI.setMinHeight(i);
        }
        this.LJLJJI.invoke();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (this.LJLJJL >= 0) {
            ViewGroup.LayoutParams layoutParams = this.LJLJI.LJLJLLL.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, this.LJLJJL, 0, (int) KL2.LIZJ(this.LJLJI.LJLJJI, 8.0f));
            this.LJLJI.LJLJLLL.setLayoutParams(marginLayoutParams);
            TextView titleCharacterLimit = this.LJLJI.LJLL;
            o.LJIIIIZZ(titleCharacterLimit, "titleCharacterLimit");
            C26338AVi.LJI(titleCharacterLimit, null, Integer.valueOf(this.LJLJJL), null, null, false, 29);
        }
        int i = this.LJLIL;
        if (i >= 0 && i < this.LJLILLLLZI) {
            this.LJLJI.LJLLI.setMinHeight(i);
        }
    }

    public C42011GeF(int i, int i2, ExpandedTitleModule expandedTitleModule, AqS38S0210000_7 aqS38S0210000_7, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = expandedTitleModule;
        this.LJLJJI = aqS38S0210000_7;
        this.LJLJJL = i3;
    }
}
