package X;

import Y.AObserverS76S0100000_8;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KNA extends ConstraintLayout implements InterfaceC54857Lfx {
    public EffectRecommendationCardViewModel LJLIL;

    @Override // X.InterfaceC54857Lfx
    public final void LJJJJ() {
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = this.LJLIL;
        if (effectRecommendationCardViewModel != null) {
            effectRecommendationCardViewModel.gv0(KNS.LIZ);
        }
    }

    private final int getScreenHeightDp() {
        return (int) C63081OpJ.LLILZ(getContext(), getResources().getDisplayMetrics().heightPixels);
    }

    public final boolean LJJLJLI() {
        if (getScreenHeightDp() >= 800) {
            return true;
        }
        return false;
    }

    public final boolean LJJLL() {
        if (getScreenHeightDp() <= 640) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54857Lfx
    public final void LJJIJL(ActivityC45651qj activityC45651qj) {
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = this.LJLIL;
        if (effectRecommendationCardViewModel != null) {
            effectRecommendationCardViewModel.gv0(new KNJ(activityC45651qj));
        }
    }

    @Override // X.InterfaceC54857Lfx
    public final void LJJLIIIJILLIZJL(ActivityC45651qj activityC45651qj) {
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = this.LJLIL;
        if (effectRecommendationCardViewModel != null) {
            effectRecommendationCardViewModel.gv0(new KNH(activityC45651qj));
        }
    }

    @Override // X.InterfaceC54857Lfx
    public final void LJJJI(ActivityC45651qj activityC45651qj, Aweme aweme) {
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = this.LJLIL;
        if (effectRecommendationCardViewModel != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            effectRecommendationCardViewModel.gv0(new KN7(context, activityC45651qj, aweme));
        }
    }

    @Override // X.InterfaceC54857Lfx
    public final void LJJLIIIJJI(Fragment fragment, Aweme aweme) {
        MutableLiveData mutableLiveData;
        o.LJIIIZ(fragment, "fragment");
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = (EffectRecommendationCardViewModel) ViewModelProviders.of(fragment).get(EffectRecommendationCardViewModel.class);
        effectRecommendationCardViewModel.gv0(new KNI(aweme));
        this.LJLIL = effectRecommendationCardViewModel;
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        EffectRecommendationCardViewModel effectRecommendationCardViewModel2 = this.LJLIL;
        if (effectRecommendationCardViewModel2 != null && (mutableLiveData = effectRecommendationCardViewModel2.LJLJLJ) != null) {
            mutableLiveData.observe(viewLifecycleOwner, new AObserverS76S0100000_8(this, 137));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KNA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.c_x, C16880lQ.LLZIL(context), this);
    }
}
