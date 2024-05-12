package Y;

import X.C85373Wr;
import X.InterfaceC85393Wt;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.sdk.search.ui.widget.IMSearchBarEntranceWidget;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ALAdapterS0S0201000_1 extends AnimatorListenerAdapter {
    public final int $t;
    public int i2;
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
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0201000_1 aLAdapterS0S0201000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((IMSearchBarEntranceWidget) aLAdapterS0S0201000_1.l0).LJIJ().LJFF("animation end");
        View view = (View) aLAdapterS0S0201000_1.l1;
        int i = aLAdapterS0S0201000_1.i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = i;
            view.setLayoutParams(marginLayoutParams);
            ((IMSearchBarEntranceWidget) aLAdapterS0S0201000_1.l0).LJLL = true;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0201000_1 aLAdapterS0S0201000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS0S0201000_1.i2 > 0) {
            ((View) aLAdapterS0S0201000_1.l1).getLayoutParams().height = aLAdapterS0S0201000_1.i2;
        }
        ((View) aLAdapterS0S0201000_1.l1).setAlpha(1.0f);
        ((View) aLAdapterS0S0201000_1.l1).setVisibility(8);
        Iterator<InterfaceC85393Wt> it = ((C85373Wr) aLAdapterS0S0201000_1.l0).LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LJIILL();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS0S0201000_1 aLAdapterS0S0201000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        Iterator<InterfaceC85393Wt> it = ((C85373Wr) aLAdapterS0S0201000_1.l0).LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LJIILJJIL();
        }
    }

    public ALAdapterS0S0201000_1(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
