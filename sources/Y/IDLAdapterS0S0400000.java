package Y;

import X.C03070Ad;
import X.C14500ha;
import X.C14520hc;
import X.C14540he;
import X.C14I;
import X.C15610jN;
import X.C16880lQ;
import X.C40171ht;
import X.C44521ou;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.linkmic.LiveLinkMicGiftAnimationChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDLAdapterS0S0400000 extends AnimatorListenerAdapter {
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
            case 2:
            case 3:
            case 4:
            default:
                super.onAnimationCancel(animator);
                return;
            case 5:
                onAnimationCancel$1(this, animator);
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
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                onAnimationEnd$7(this, animator);
                return;
            case 8:
                onAnimationEnd$8(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
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
                onAnimationStart$2(this, animator);
                return;
            case 3:
                onAnimationStart$3(this, animator);
                return;
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                onAnimationStart$4(this, animator);
                return;
            case 6:
                onAnimationStart$5(this, animator);
                return;
            case 7:
                onAnimationStart$6(this, animator);
                return;
            case 8:
                onAnimationStart$7(this, animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        ((View) iDLAdapterS0S0400000.l1).setAlpha(1.0f);
    }

    public static final void onAnimationCancel$1(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((View) iDLAdapterS0S0400000.l2).setAlpha(1.0f);
    }

    public static final void onAnimationEnd$0(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        ((ViewPropertyAnimator) iDLAdapterS0S0400000.l1).setListener(null);
        ((View) iDLAdapterS0S0400000.l2).setAlpha(1.0f);
        ((C40171ht) iDLAdapterS0S0400000.l3).LJII((RecyclerView.ViewHolder) iDLAdapterS0S0400000.l0);
        ((C40171ht) iDLAdapterS0S0400000.l3).LJIILLIIL.remove((RecyclerView.ViewHolder) iDLAdapterS0S0400000.l0);
        ((C40171ht) iDLAdapterS0S0400000.l3).LJJIFFI();
    }

    public static final void onAnimationEnd$1(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        ((ViewPropertyAnimator) iDLAdapterS0S0400000.l2).setListener(null);
        ((C40171ht) iDLAdapterS0S0400000.l3).LJIL((RecyclerView.ViewHolder) iDLAdapterS0S0400000.l0);
        ((C40171ht) iDLAdapterS0S0400000.l3).LJIILJJIL.remove((RecyclerView.ViewHolder) iDLAdapterS0S0400000.l0);
        ((C40171ht) iDLAdapterS0S0400000.l3).LJJIFFI();
    }

    public static final void onAnimationEnd$2(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        ((ViewPropertyAnimator) iDLAdapterS0S0400000.l1).setListener(null);
        ((View) iDLAdapterS0S0400000.l2).setAlpha(1.0f);
        ((View) iDLAdapterS0S0400000.l2).setTranslationX(0.0f);
        ((View) iDLAdapterS0S0400000.l2).setTranslationY(0.0f);
        ((C40171ht) iDLAdapterS0S0400000.l3).LJII(((C03070Ad) iDLAdapterS0S0400000.l0).LIZ);
        ((C40171ht) iDLAdapterS0S0400000.l3).LJIIZILJ.remove(((C03070Ad) iDLAdapterS0S0400000.l0).LIZ);
        ((C40171ht) iDLAdapterS0S0400000.l3).LJJIFFI();
    }

    public static final void onAnimationEnd$3(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        ((ViewPropertyAnimator) iDLAdapterS0S0400000.l1).setListener(null);
        ((View) iDLAdapterS0S0400000.l2).setAlpha(1.0f);
        ((View) iDLAdapterS0S0400000.l2).setTranslationX(0.0f);
        ((View) iDLAdapterS0S0400000.l2).setTranslationY(0.0f);
        ((C40171ht) iDLAdapterS0S0400000.l3).LJII(((C03070Ad) iDLAdapterS0S0400000.l0).LIZIZ);
        ((C40171ht) iDLAdapterS0S0400000.l3).LJIIZILJ.remove(((C03070Ad) iDLAdapterS0S0400000.l0).LIZIZ);
        ((C40171ht) iDLAdapterS0S0400000.l3).LJJIFFI();
    }

    public static final void onAnimationEnd$4(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C16880lQ.LJLJLLL((AnimatorSet) iDLAdapterS0S0400000.l0, iDLAdapterS0S0400000);
        C14500ha c14500ha = new C14500ha(((C14540he) iDLAdapterS0S0400000.l1).LIZ.LIZJ);
        c14500ha.LIZ.LJIIIZ = true;
        DataChannelGlobal.LJLJJI.tv0(LiveLinkMicGiftAnimationChannel.class, c14500ha);
        C15610jN.LIZ().post(new IDRunnableS85S0100000((ImageView) iDLAdapterS0S0400000.l3, 86));
        ((ArrayList) ((C14520hc) iDLAdapterS0S0400000.l2).LIZLLL).remove((AnimatorSet) iDLAdapterS0S0400000.l0);
    }

    public static final void onAnimationEnd$5(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) iDLAdapterS0S0400000.l3).setListener(null);
        ((C44521ou) iDLAdapterS0S0400000.l0).LJIL((RecyclerView.ViewHolder) iDLAdapterS0S0400000.l1);
        ((C44521ou) iDLAdapterS0S0400000.l0).LJIILJJIL.remove((RecyclerView.ViewHolder) iDLAdapterS0S0400000.l1);
        ((C44521ou) iDLAdapterS0S0400000.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$6(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) iDLAdapterS0S0400000.l2).setListener(null);
        ((View) iDLAdapterS0S0400000.l3).setAlpha(1.0f);
        ((View) iDLAdapterS0S0400000.l3).setTranslationX(0.0f);
        ((View) iDLAdapterS0S0400000.l3).setTranslationY(0.0f);
        ((C44521ou) iDLAdapterS0S0400000.l0).LJII(((C14I) iDLAdapterS0S0400000.l1).LIZ);
        ((C44521ou) iDLAdapterS0S0400000.l0).LJIIZILJ.remove(((C14I) iDLAdapterS0S0400000.l1).LIZ);
        ((C44521ou) iDLAdapterS0S0400000.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$7(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) iDLAdapterS0S0400000.l2).setListener(null);
        ((View) iDLAdapterS0S0400000.l3).setAlpha(1.0f);
        ((View) iDLAdapterS0S0400000.l3).setTranslationX(0.0f);
        ((View) iDLAdapterS0S0400000.l3).setTranslationY(0.0f);
        ((C44521ou) iDLAdapterS0S0400000.l0).LJII(((C14I) iDLAdapterS0S0400000.l1).LIZIZ);
        ((C44521ou) iDLAdapterS0S0400000.l0).LJIIZILJ.remove(((C14I) iDLAdapterS0S0400000.l1).LIZIZ);
        ((C44521ou) iDLAdapterS0S0400000.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$8(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) iDLAdapterS0S0400000.l2).setListener(null);
        ((View) iDLAdapterS0S0400000.l3).setAlpha(1.0f);
        ((C44521ou) iDLAdapterS0S0400000.l0).LJII((RecyclerView.ViewHolder) iDLAdapterS0S0400000.l1);
        ((C44521ou) iDLAdapterS0S0400000.l0).LJIILLIIL.remove((RecyclerView.ViewHolder) iDLAdapterS0S0400000.l1);
        ((C44521ou) iDLAdapterS0S0400000.l0).LJJIFFI();
    }

    public static final void onAnimationStart$0(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        ((C40171ht) iDLAdapterS0S0400000.l3).getClass();
    }

    public static final void onAnimationStart$1(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        ((C40171ht) iDLAdapterS0S0400000.l3).getClass();
    }

    public static final void onAnimationStart$2(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        ((C40171ht) iDLAdapterS0S0400000.l3).getClass();
    }

    public static final void onAnimationStart$3(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        ((C40171ht) iDLAdapterS0S0400000.l3).getClass();
    }

    public static final void onAnimationStart$4(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C44521ou) iDLAdapterS0S0400000.l0).getClass();
    }

    public static final void onAnimationStart$5(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C44521ou) iDLAdapterS0S0400000.l0).getClass();
    }

    public static final void onAnimationStart$6(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C44521ou) iDLAdapterS0S0400000.l0).getClass();
    }

    public static final void onAnimationStart$7(IDLAdapterS0S0400000 iDLAdapterS0S0400000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C44521ou) iDLAdapterS0S0400000.l0).getClass();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDLAdapterS0S0400000(android.view.View r2, android.view.ViewPropertyAnimator r3, X.C40171ht r4, androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l3 = r4
            r0.l0 = r5
            r0.l1 = r2
            r0.l2 = r3
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l3 = r4
            r0.l0 = r5
            r0.l1 = r3
            r0.l2 = r2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDLAdapterS0S0400000.<init>(android.view.View, android.view.ViewPropertyAnimator, X.1ht, androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDLAdapterS0S0400000(android.view.View r2, android.view.ViewPropertyAnimator r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, X.C44521ou r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 5: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r3
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDLAdapterS0S0400000.<init>(android.view.View, android.view.ViewPropertyAnimator, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.1ou, int):void");
    }

    public IDLAdapterS0S0400000(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
