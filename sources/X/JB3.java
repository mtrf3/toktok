package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JB3 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup LJLIL;
    public final /* synthetic */ FrameLayout LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ MidAdCellComponent LJLJJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        C16880lQ.LJLLL(this.LJLILLLLZI, this.LJLIL);
        if (this.LJLJI) {
            this.LJLJJI.q4();
        }
    }

    public JB3(ViewGroup viewGroup, FrameLayout frameLayout, boolean z, MidAdCellComponent midAdCellComponent) {
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = frameLayout;
        this.LJLJI = z;
        this.LJLJJI = midAdCellComponent;
    }
}
