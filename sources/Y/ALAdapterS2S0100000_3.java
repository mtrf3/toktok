package Y;

import X.AnonymousClass711;
import X.C17N;
import X.C208278Fj;
import X.InterfaceC65784Pro;
import X.Z9N;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.speed.LandscapeCellSpeedAssem;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageTopNavigationAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ALAdapterS2S0100000_3 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            case 6:
            default:
                super.onAnimationEnd(animator);
                return;
            case 7:
                onAnimationEnd$6(this, animator);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        switch (this.$t) {
            case 6:
                onAnimationEnd$0(this, animator, z);
                return;
            default:
                super.onAnimationEnd(animator, z);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                onAnimationStart$1(this, animator);
                return;
            case 6:
                onAnimationStart$2(this, animator);
                return;
        }
    }

    public ALAdapterS2S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0100000_3 aLAdapterS2S0100000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((AnonymousClass711) aLAdapterS2S0100000_3.l0).LIZIZ();
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0100000_3 aLAdapterS2S0100000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((VideoExposeSharerInformationAssem) aLAdapterS2S0100000_3.l0).Y3().findViewById(R.id.gvf).setAlpha(1.0f);
    }

    public static final void onAnimationEnd$2(ALAdapterS2S0100000_3 aLAdapterS2S0100000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) aLAdapterS2S0100000_3.l0).invoke();
    }

    public static final void onAnimationEnd$3(ALAdapterS2S0100000_3 aLAdapterS2S0100000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) aLAdapterS2S0100000_3.l0).invoke();
    }

    public static final void onAnimationEnd$4(ALAdapterS2S0100000_3 aLAdapterS2S0100000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        View view = ((LandscapeCellSpeedAssem) aLAdapterS2S0100000_3.l0).LJZL;
        if (view != null) {
            view.setVisibility(4);
        } else {
            o.LJIJI("rootView");
            throw null;
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS2S0100000_3 aLAdapterS2S0100000_3, Animator animation) {
        CharSequence originalText;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C208278Fj c208278Fj = (C208278Fj) aLAdapterS2S0100000_3.l0;
        if (c208278Fj.getCollapsed()) {
            originalText = ((C208278Fj) aLAdapterS2S0100000_3.l0).LLFFF;
        } else {
            originalText = ((C208278Fj) aLAdapterS2S0100000_3.l0).getOriginalText();
        }
        c208278Fj.setText(originalText);
        C208278Fj c208278Fj2 = (C208278Fj) aLAdapterS2S0100000_3.l0;
        ViewGroup.LayoutParams layoutParams = c208278Fj2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            c208278Fj2.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationEnd$6(ALAdapterS2S0100000_3 aLAdapterS2S0100000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C17N.LJJIIJZLJL((View) aLAdapterS2S0100000_3.l0);
    }

    public static final void onAnimationStart$1(ALAdapterS2S0100000_3 aLAdapterS2S0100000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((C208278Fj) aLAdapterS2S0100000_3.l0).LJZI = !r1.getCollapsed();
        C208278Fj c208278Fj = (C208278Fj) aLAdapterS2S0100000_3.l0;
        c208278Fj.setText(c208278Fj.getOriginalText());
    }

    public static final void onAnimationStart$2(ALAdapterS2S0100000_3 aLAdapterS2S0100000_3, Animator animation) {
        ImageView imageView;
        o.LJIIIZ(animation, "animation");
        View _$_findCachedViewById = ((FullPageTopNavigationAssem) aLAdapterS2S0100000_3.l0)._$_findCachedViewById(R.id.kf_);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(0);
        }
        View view = ((FullPageTopNavigationAssem) aLAdapterS2S0100000_3.l0).LJLJJL;
        if (view != null) {
            view.setVisibility(0);
        }
        if (!Z9N.LIZIZ.LLILZIL() || (imageView = (ImageView) ((FullPageTopNavigationAssem) aLAdapterS2S0100000_3.l0)._$_findCachedViewById(R.id.f_e)) == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0100000_3 aLAdapterS2S0100000_3, Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        View _$_findCachedViewById = ((FullPageTopNavigationAssem) aLAdapterS2S0100000_3.l0)._$_findCachedViewById(R.id.l_p);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.setVisibility(0);
    }
}
