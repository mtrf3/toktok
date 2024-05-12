package X;

import Y.AObjectS54S0101000_9;
import Y.IDAListenerS4S0110000_9;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LSP extends MEG {
    public final ActivityC45651qj LJIIIIZZ;
    public final InterfaceC65784Pro<Aweme> LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;

    @Override // X.MEG
    public final String LIZJ() {
        return "DetailImmersiveTopBottomManager";
    }

    @Override // X.MEG
    public final int LIZ() {
        return ((Number) this.LJIIJ.getValue()).intValue();
    }

    @Override // X.MEG
    public final Aweme LIZIZ() {
        InterfaceC65784Pro<Aweme> interfaceC65784Pro = this.LJIIIZ;
        if (interfaceC65784Pro != null) {
            return interfaceC65784Pro.invoke();
        }
        return null;
    }

    @Override // X.MEG
    public final void LJ(boolean z) {
        float f;
        C2U8.LIZ(new LM2(z, this.LJII));
        ActivityC45651qj activityC45651qj = this.LJIIIIZZ;
        ((IMixFeedService) this.LJIIJJI.getValue()).LJIJJLI();
        View findViewById = activityC45651qj.findViewById(R.id.gkc);
        if (findViewById != null) {
            float f2 = 1.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
                f2 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "alpha", f, f2);
            ofFloat.setDuration(this.LJII);
            ofFloat.addListener(new IDAListenerS4S0110000_9(findViewById, z, 0));
            ofFloat.start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LSP(ActivityC45651qj activity, View originalBottomView, ViewGroup viewGroup, AObjectS54S0101000_9 aObjectS54S0101000_9) {
        super(activity, originalBottomView, viewGroup);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(originalBottomView, "originalBottomView");
        this.LJIIIIZZ = activity;
        this.LJIIIZ = aObjectS54S0101000_9;
        this.LJIIJ = C221108m2.LIZIZ(C3D3.LJLIL);
        this.LJIIJJI = C221108m2.LIZIZ(C55349Lnt.LJLIL);
    }
}
