package Y;

import X.C15540jG;
import X.C16880lQ;
import X.C29306Beo;
import X.C2A4;
import X.C34K;
import X.C47061t0;
import X.C65777Prh;
import X.C74893TaL;
import X.C75143TeN;
import X.C75150TeU;
import X.C75156Tea;
import X.C87277YNd;
import X.CFX;
import X.UE4;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.ImageView;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ALAdapterS1S0400000_13 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

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
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS1S0400000_13 aLAdapterS1S0400000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((C34K) aLAdapterS1S0400000_13.l0).element = true;
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0400000_13 aLAdapterS1S0400000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C87277YNd.LJJIJ((C2A4) aLAdapterS1S0400000_13.l0);
        C87277YNd.LJJIJ((C47061t0) aLAdapterS1S0400000_13.l1);
        ((C75150TeU) aLAdapterS1S0400000_13.l2).LIZ(false);
        C75150TeU c75150TeU = (C75150TeU) aLAdapterS1S0400000_13.l2;
        C2A4 draweeView = (C2A4) aLAdapterS1S0400000_13.l0;
        C75156Tea webpListener = (C75156Tea) aLAdapterS1S0400000_13.l3;
        c75150TeU.getClass();
        C15540jG c15540jG = new C15540jG();
        o.LJIIIZ(draweeView, "draweeView");
        c15540jG.LIZ = draweeView;
        c15540jG.LIZIZ = CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1");
        c15540jG.LIZJ = "interact_request_enhanced.webp";
        c15540jG.LJFF = true;
        c15540jG.LJI = 2;
        c15540jG.LJIIJ = true;
        o.LJIIIZ(webpListener, "webpListener");
        c15540jG.LJ = webpListener;
        c15540jG.LIZIZ();
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0400000_13 aLAdapterS1S0400000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C16880lQ.LJLJLLL((AnimatorSet) aLAdapterS1S0400000_13.l1, aLAdapterS1S0400000_13);
        if (!((C34K) aLAdapterS1S0400000_13.l0).element) {
            try {
                ImageView imageView = (ImageView) aLAdapterS1S0400000_13.l2;
                if (imageView != null && imageView.getParent() != null) {
                    C29306Beo.LJJIJIIJIL((ImageView) aLAdapterS1S0400000_13.l2);
                }
            } catch (Throwable unused) {
            }
            Map<ImageView, AnimatorSet> map = ((UE4) aLAdapterS1S0400000_13.l3).LJLIL;
            C65777Prh.LIZJ(map).remove((ImageView) aLAdapterS1S0400000_13.l2);
            ((C34K) aLAdapterS1S0400000_13.l0).element = false;
        }
        ((UE4) aLAdapterS1S0400000_13.l3).LJI("onAnimationEnd");
    }

    public static final void onAnimationEnd$2(ALAdapterS1S0400000_13 aLAdapterS1S0400000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C87277YNd.LJJIJ((C2A4) aLAdapterS1S0400000_13.l0);
        C87277YNd.LJJIJ((C47061t0) aLAdapterS1S0400000_13.l1);
        ((C74893TaL) aLAdapterS1S0400000_13.l2).LIZ(false);
        C74893TaL c74893TaL = (C74893TaL) aLAdapterS1S0400000_13.l2;
        C2A4 draweeView = (C2A4) aLAdapterS1S0400000_13.l0;
        C75143TeN webpListener = (C75143TeN) aLAdapterS1S0400000_13.l3;
        c74893TaL.getClass();
        C15540jG c15540jG = new C15540jG();
        o.LJIIIZ(draweeView, "draweeView");
        c15540jG.LIZ = draweeView;
        c15540jG.LIZIZ = CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1");
        c15540jG.LIZJ = "interact_request_enhanced.webp";
        c15540jG.LJFF = true;
        c15540jG.LJI = 2;
        c15540jG.LJIIJ = true;
        o.LJIIIZ(webpListener, "webpListener");
        c15540jG.LJ = webpListener;
        c15540jG.LIZIZ();
    }

    public ALAdapterS1S0400000_13(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
