package Y;

import X.AnonymousClass843;
import X.C16880lQ;
import X.C177326xc;
import X.C184487Lw;
import X.C2054084i;
import X.C2058285y;
import X.C85C;
import X.InterfaceC65784Pro;
import X.Z9N;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.nows.feed.ui.NowRelationAreaAssem;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ALAdapterS2S0200000_3 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                super.onAnimationEnd(animator);
                return;
            case 4:
                onAnimationEnd$3(this, animator);
                return;
            case 5:
                onAnimationEnd$4(this, animator);
                return;
            case 6:
                onAnimationEnd$5(this, animator);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        switch (this.$t) {
            case 3:
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
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            case 2:
            default:
                super.onAnimationStart(animator);
                return;
            case 3:
                onAnimationStart$2(this, animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0200000_3 aLAdapterS2S0200000_3, Animator animation) {
        C85C c85c;
        o.LJIIIZ(animation, "animation");
        Layout layout = (Layout) aLAdapterS2S0200000_3.l1;
        if (layout == null) {
            ((C2054084i) aLAdapterS2S0200000_3.l0).LJLJL.setVisibility(8);
        } else {
            ((C2054084i) aLAdapterS2S0200000_3.l0).LJIIIZ(layout, false);
            ((C2054084i) aLAdapterS2S0200000_3.l0).LJLJL.setVisibility(0);
        }
        ((C2054084i) aLAdapterS2S0200000_3.l0).LJLJLLL.setVisibility(8);
        TuxTextLayoutView tuxTextLayoutView = ((C2054084i) aLAdapterS2S0200000_3.l0).LJLLL;
        if (tuxTextLayoutView != null) {
            tuxTextLayoutView.scrollTo(0, 0);
            if (AnonymousClass843.LIZLLL() && (c85c = ((C2054084i) aLAdapterS2S0200000_3.l0).LJLIL.LLILII) != null) {
                c85c.LJJJJL();
                return;
            }
            return;
        }
        o.LJIJI("descView");
        throw null;
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0200000_3 aLAdapterS2S0200000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!((C2054084i) aLAdapterS2S0200000_3.l0).LJIILJJIL()) {
            if (!((Boolean) C2058285y.LIZ.getValue()).booleanValue()) {
                ((C2054084i) aLAdapterS2S0200000_3.l0).LJLJLLL.setVisibility(0);
            }
            ((C2054084i) aLAdapterS2S0200000_3.l0).LJLJL.setVisibility(0);
        } else {
            ((C2054084i) aLAdapterS2S0200000_3.l0).LJLJLLL.setVisibility(8);
        }
        ((C2054084i) aLAdapterS2S0200000_3.l0).LJLJLJ.invalidate();
    }

    public static final void onAnimationEnd$2(ALAdapterS2S0200000_3 aLAdapterS2S0200000_3, Animator animation) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        TextView textView = ((C177326xc) aLAdapterS2S0200000_3.l0).LJI;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View view = ((C177326xc) aLAdapterS2S0200000_3.l0).LJII;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = ((C177326xc) aLAdapterS2S0200000_3.l0).LJIIIIZZ;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        SmartImageView smartImageView = ((C177326xc) aLAdapterS2S0200000_3.l0).LJIIIZ;
        if (smartImageView != null) {
            smartImageView.setVisibility(8);
        }
        ViewGroup viewGroup = ((C177326xc) aLAdapterS2S0200000_3.l0).LJIIJ;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                Integer num = (Integer) aLAdapterS2S0200000_3.l1;
                if (num == null) {
                    num = 0;
                }
                layoutParams.height = num.intValue();
            }
        } else {
            layoutParams = null;
        }
        ViewGroup viewGroup2 = ((C177326xc) aLAdapterS2S0200000_3.l0).LJIIJ;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
        }
        ViewGroup viewGroup3 = ((C177326xc) aLAdapterS2S0200000_3.l0).LJIIJ;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f);
        }
        SmartImageView smartImageView2 = ((C177326xc) aLAdapterS2S0200000_3.l0).LJIIIZ;
        if (smartImageView2 == null) {
            return;
        }
        smartImageView2.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$3(ALAdapterS2S0200000_3 aLAdapterS2S0200000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((TuxTextView) aLAdapterS2S0200000_3.l0).setVisibility(8);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aLAdapterS2S0200000_3.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS2S0200000_3 aLAdapterS2S0200000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((TuxTextView) aLAdapterS2S0200000_3.l0).setVisibility(8);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aLAdapterS2S0200000_3.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS2S0200000_3 aLAdapterS2S0200000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        NowRelationAreaAssem nowRelationAreaAssem = (NowRelationAreaAssem) aLAdapterS2S0200000_3.l0;
        if (!nowRelationAreaAssem.LJLLL) {
            return;
        }
        nowRelationAreaAssem.getContainerView().setVisibility(8);
        NowPostCellViewModel Z3 = ((NowRelationAreaAssem) aLAdapterS2S0200000_3.l0).Z3();
        Z3.getClass();
        Z3.setState(new AqS8S0010000_3(false, 5));
        C16880lQ.LJLL((ObjectAnimator) aLAdapterS2S0200000_3.l1, aLAdapterS2S0200000_3);
    }

    public static final void onAnimationStart$0(ALAdapterS2S0200000_3 aLAdapterS2S0200000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C2054084i) aLAdapterS2S0200000_3.l0).LJIILIIL(false);
        ((C2054084i) aLAdapterS2S0200000_3.l0).LJLJL.setVisibility(4);
    }

    public static final void onAnimationStart$1(ALAdapterS2S0200000_3 aLAdapterS2S0200000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C2054084i) aLAdapterS2S0200000_3.l0).LJIIIZ((Layout) aLAdapterS2S0200000_3.l1, true);
        ((C2054084i) aLAdapterS2S0200000_3.l0).LJIILIIL(true);
        ((C2054084i) aLAdapterS2S0200000_3.l0).LJLJL.setVisibility(4);
    }

    public static final void onAnimationStart$2(ALAdapterS2S0200000_3 aLAdapterS2S0200000_3, Animator animation) {
        ImageView imageView;
        o.LJIIIZ(animation, "animation");
        View findViewById = ((View) aLAdapterS2S0200000_3.l0).findViewById(R.id.kf_);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View view = ((C184487Lw) aLAdapterS2S0200000_3.l1).LIZJ;
        if (view != null) {
            view.setVisibility(0);
        }
        if (!Z9N.LIZIZ.LLILZIL() || (imageView = (ImageView) ((View) aLAdapterS2S0200000_3.l0).findViewById(R.id.f_e)) == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    public ALAdapterS2S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0200000_3 aLAdapterS2S0200000_3, Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        View findViewById = ((View) aLAdapterS2S0200000_3.l0).findViewById(R.id.l_p);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(0);
    }
}
