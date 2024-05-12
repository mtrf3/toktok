package Y;

import X.C26045AKb;
import X.C32151Nz;
import X.C50352JpU;
import X.C50440Jqu;
import X.C55096Ljo;
import X.C55230Lly;
import X.C76800UCe;
import X.InterfaceC88473Ynt;
import X.JE0;
import X.JEG;
import X.JET;
import X.KL4;
import X.KL5;
import X.KL7;
import X.O6R;
import X.X1D;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.usefulness.core.ui.SearchSatisfactionSurveyAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ALAdapterS6S0200000_8 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationEnd$0(this, animator);
                return;
            case 2:
                onAnimationEnd$1(this, animator);
                return;
            case 3:
                onAnimationEnd$2(this, animator);
                return;
            case 4:
                onAnimationEnd$3(this, animator);
                return;
            case 5:
                onAnimationEnd$4(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        switch (this.$t) {
            case 0:
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
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS6S0200000_8 aLAdapterS6S0200000_8, Animator animator) {
        super.onAnimationEnd(animator);
        ((KL5) aLAdapterS6S0200000_8.l1).getClass();
    }

    public static final void onAnimationEnd$1(ALAdapterS6S0200000_8 aLAdapterS6S0200000_8, Animator animator) {
        super.onAnimationEnd(animator);
        ((KL7) aLAdapterS6S0200000_8.l1).getClass();
    }

    public static final void onAnimationEnd$2(ALAdapterS6S0200000_8 aLAdapterS6S0200000_8, Animator animator) {
        super.onAnimationEnd(animator);
        ((KL4) aLAdapterS6S0200000_8.l1).getClass();
    }

    public static final void onAnimationEnd$3(ALAdapterS6S0200000_8 aLAdapterS6S0200000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C50440Jqu.LJ = true;
        C50352JpU c50352JpU = ((SearchSatisfactionSurveyAssem) aLAdapterS6S0200000_8.l0).LLIIII;
        if (c50352JpU != null) {
            ((SearchServiceCenter$AdapterControlAbility) C55096Ljo.LIZIZ(C55230Lly.LJ((View) aLAdapterS6S0200000_8.l1), SearchServiceCenter$AdapterControlAbility.class)).c10(c50352JpU);
        }
        C26045AKb c26045AKb = new C26045AKb((View) aLAdapterS6S0200000_8.l1);
        c26045AKb.LJIIIIZZ(R.string.psq);
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LIZLLL(2000L);
        c26045AKb.LJIIJ();
    }

    public static final void onAnimationEnd$4(ALAdapterS6S0200000_8 aLAdapterS6S0200000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        PipFeedWindowVM pipFeedWindowVM = (PipFeedWindowVM) aLAdapterS6S0200000_8.l0;
        JE0 je0 = (JE0) aLAdapterS6S0200000_8.l1;
        pipFeedWindowVM.LJLJJL = je0;
        Iterator<InterfaceC88473Ynt<Float, JE0, JE0, C76800UCe>> it = pipFeedWindowVM.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().invoke(Float.valueOf(1.0f), je0, je0);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS6S0200000_8 aLAdapterS6S0200000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((JEG) aLAdapterS6S0200000_8.l0).LJIILL.add((Animator) aLAdapterS6S0200000_8.l1);
    }

    public ALAdapterS6S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onAnimationEnd$0(ALAdapterS6S0200000_8 aLAdapterS6S0200000_8, Animator animation, boolean z) {
        WindowManager.LayoutParams layoutParams;
        o.LJIIIZ(animation, "animation");
        ((JEG) aLAdapterS6S0200000_8.l0).LJIILL.remove((Animator) aLAdapterS6S0200000_8.l1);
        JEG jeg = (JEG) aLAdapterS6S0200000_8.l0;
        jeg.getClass();
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(1));
        JET jet = jeg.LJFF;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (jet != null) {
            layoutParams2 = jet.getLayoutParams();
        }
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || (layoutParams = (WindowManager.LayoutParams) layoutParams2) == null) {
            return;
        }
        int i = layoutParams.x;
        int i2 = layoutParams.width;
        int i3 = (i2 / 2) + i;
        int i4 = jeg.LJIIJ;
        if (i3 <= i4 / 2) {
            return;
        }
        int i5 = ((i + i2) + JEG.LJIJ) - i4;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ensureAdhereToEdge with dev ");
        LIZ.append(i5);
        String log = X1D.LIZIZ(LIZ);
        o.LJIIIZ(log, "log");
        if (Math.abs(i5) <= LJJIIZ) {
            return;
        }
        jeg.LJIIIIZZ(layoutParams.width, layoutParams.height);
        jeg.LJI(new Point(jeg.LIZLLL.right, layoutParams.y));
    }

    public ALAdapterS6S0200000_8(KL4 kl4, View view, MotionEvent motionEvent, int i) {
        this.$t = i;
        this.l1 = kl4;
        this.l0 = view;
    }

    public ALAdapterS6S0200000_8(KL5 kl5, View view, MotionEvent motionEvent, int i) {
        this.$t = i;
        this.l1 = kl5;
        this.l0 = view;
    }

    public ALAdapterS6S0200000_8(KL7 kl7, View view, MotionEvent motionEvent, int i) {
        this.$t = i;
        this.l1 = kl7;
        this.l0 = view;
    }
}
