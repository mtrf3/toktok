package X;

import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ I55 LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ C56K LJLJI;
    public final /* synthetic */ C56K LJLJJI;
    public final /* synthetic */ C76732zl LJLJJL;
    public final /* synthetic */ C76732zl LJLJJLL;

    public I51(I55 i55, C76732zl c76732zl, C56K c56k, C56K c56k2, C76732zl c76732zl2, C76732zl c76732zl3) {
        this.LJLIL = i55;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = c56k;
        this.LJLJJI = c56k2;
        this.LJLJJL = c76732zl2;
        this.LJLJJLL = c76732zl3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        I55 i55 = this.LJLIL;
        VECutVideoPresenter vECutVideoPresenter = i55.LJLIL;
        if (vECutVideoPresenter != null) {
            CutVideoListViewModel cutVideoListViewModel = i55.LJLL;
            if (cutVideoListViewModel != null) {
                float f = (this.LJLJJI.element * animatedFraction) + this.LJLJI.element;
                VECutVideoPresenter.LJI(vECutVideoPresenter, cutVideoListViewModel.LJLJL, (90 * animatedFraction) + this.LJLILLLLZI.element, f, f, this.LJLJJL.element, this.LJLJJLL.element, 4);
                return;
            }
            o.LJIJI("cutVideoListViewModel");
            throw null;
        }
        o.LJIJI("presenter");
        throw null;
    }
}
