package X;

import Y.AObserverS76S0100000_8;
import Y.IDTListenerS117S0100000_8;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KN9 extends C45601qe implements InterfaceC54857Lfx {
    public EffectRecommendationCarouselViewModel LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public C45601qe LLJJJ;

    @Override // X.InterfaceC54857Lfx
    public final void LJJJJ() {
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = this.LLJJ;
        if (effectRecommendationCarouselViewModel != null) {
            effectRecommendationCarouselViewModel.gv0(KN0.LIZ);
        }
    }

    private final int getScreenHeightDp() {
        return (int) C63081OpJ.LLILZ(getContext(), getResources().getDisplayMetrics().heightPixels);
    }

    public final boolean LJLJL() {
        if (getScreenHeightDp() >= 800) {
            return true;
        }
        return false;
    }

    public final boolean LJLJLJ() {
        if (getScreenHeightDp() <= 640) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54857Lfx
    public final void LJJIJL(ActivityC45651qj activityC45651qj) {
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = this.LLJJ;
        if (effectRecommendationCarouselViewModel != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            effectRecommendationCarouselViewModel.gv0(new C51593KMr(context, activityC45651qj));
        }
    }

    @Override // X.InterfaceC54857Lfx
    public final void LJJLIIIJILLIZJL(ActivityC45651qj activityC45651qj) {
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = this.LLJJ;
        if (effectRecommendationCarouselViewModel != null) {
            effectRecommendationCarouselViewModel.gv0(new C51594KMs(activityC45651qj));
        }
    }

    public static boolean LJLJJLL(MotionEvent motionEvent, CardView cardView) {
        Rect rect = new Rect();
        cardView.getGlobalVisibleRect(rect);
        return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    @Override // X.InterfaceC54857Lfx
    public final void LJJJI(ActivityC45651qj activityC45651qj, Aweme aweme) {
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = this.LLJJ;
        if (effectRecommendationCarouselViewModel != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            effectRecommendationCarouselViewModel.gv0(new C51592KMq(context, activityC45651qj));
        }
    }

    @Override // X.InterfaceC54857Lfx
    public final void LJJLIIIJJI(Fragment fragment, Aweme aweme) {
        C29901Fi c29901Fi;
        MutableLiveData mutableLiveData;
        o.LJIIIZ(fragment, "fragment");
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = (EffectRecommendationCarouselViewModel) ViewModelProviders.of(fragment).get(EffectRecommendationCarouselViewModel.class);
        effectRecommendationCarouselViewModel.gv0(new C51595KMt(aweme));
        this.LLJJ = effectRecommendationCarouselViewModel;
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel2 = this.LLJJ;
        if (effectRecommendationCarouselViewModel2 != null && (mutableLiveData = effectRecommendationCarouselViewModel2.LJLJJLL) != null) {
            mutableLiveData.observe(viewLifecycleOwner, new AObserverS76S0100000_8(this, 138));
        }
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel3 = this.LLJJ;
        if (effectRecommendationCarouselViewModel3 != null && (c29901Fi = effectRecommendationCarouselViewModel3.LJLJLJ) != null) {
            c29901Fi.LIZLLL(viewLifecycleOwner, new KNF(this));
        }
        C45601qe c45601qe = (C45601qe) findViewById(R.id.bsc);
        c45601qe.setInteractionEnabled(false);
        this.LLJJJ = c45601qe;
        findViewById(R.id.b6_).setOnTouchListener(new IDTListenerS117S0100000_8(this, 16));
        C45601qe c45601qe2 = this.LLJJJ;
        if (c45601qe2 != null) {
            c45601qe2.setTransitionListener(new KNE(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KN9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.c_z, C16880lQ.LLZIL(context), this);
    }
}
