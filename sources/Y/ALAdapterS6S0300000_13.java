package Y;

import X.C16880lQ;
import X.C77111UOd;
import X.UOW;
import X.UOX;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.shorttouch.ui.PortraitShortTouchPreviewWidget;
import com.bytedance.android.livesdk.shorttouch.ui.ShortTouchViewWidget;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ALAdapterS6S0300000_13 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
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

    public static final void onAnimationCancel$0(ALAdapterS6S0300000_13 aLAdapterS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((PortraitShortTouchPreviewWidget) aLAdapterS6S0300000_13.l0).hide();
        ViewGroup viewGroup = ((PortraitShortTouchPreviewWidget) aLAdapterS6S0300000_13.l0).LJLIL;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ((UOX) aLAdapterS6S0300000_13.l1).LIZIZ.LLLLZLL();
        C77111UOd.LIZ.LIZLLL();
    }

    public static final void onAnimationEnd$0(ALAdapterS6S0300000_13 aLAdapterS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((PortraitShortTouchPreviewWidget) aLAdapterS6S0300000_13.l0).hide();
        ViewGroup viewGroup = ((PortraitShortTouchPreviewWidget) aLAdapterS6S0300000_13.l0).LJLIL;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ((UOX) aLAdapterS6S0300000_13.l1).LIZIZ.LLLLZLL();
        ((PortraitShortTouchPreviewWidget) aLAdapterS6S0300000_13.l0).LJLZ((UOW) aLAdapterS6S0300000_13.l2);
    }

    public static final void onAnimationEnd$1(ALAdapterS6S0300000_13 aLAdapterS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((ShortTouchViewWidget) aLAdapterS6S0300000_13.l0).LJLJJI.remove((AnimatorSet) aLAdapterS6S0300000_13.l1);
        ViewGroup viewGroup = ((ShortTouchViewWidget) aLAdapterS6S0300000_13.l0).LJLIL;
        if (viewGroup != null) {
            C16880lQ.LJLLL(((UOX) aLAdapterS6S0300000_13.l2).LIZ.LIZJ(), viewGroup);
        }
        List<UOX> list = ((ShortTouchViewWidget) aLAdapterS6S0300000_13.l0).LJLILLLLZI;
        if (list != null) {
            list.remove((UOX) aLAdapterS6S0300000_13.l2);
        }
        ((UOX) aLAdapterS6S0300000_13.l2).LIZ.F1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r3.contains(java.lang.Long.valueOf(((X.C75883TqJ) r10.l1).LIZ)) == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationEnd$2(Y.ALAdapterS6S0300000_13 r10, android.animation.Animator r11) {
        /*
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            super.onAnimationEnd(r11)
            X.Twi r0 = X.C76265TwT.LIZ
            long r7 = r0.LJJJJJ
            java.lang.Object r0 = r10.l0
            X.Tzp r0 = (X.AbstractC76473Tzp) r0
            WIDGET extends com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget r1 = r0.LJLIL
            r9 = 0
            r4 = 1
            r2 = 0
            if (r1 == 0) goto L91
            java.lang.Class<X.Tw8> r0 = X.C76244Tw8.class
            X.TrE r0 = r1.LJZI(r0)
            X.Tw8 r0 = (X.C76244Tw8) r0
            java.util.List<com.bytedance.android.livesdk.model.message.TeamUsersInfo> r0 = r0.LJIILL
            if (r0 == 0) goto L91
            java.util.Iterator r3 = r0.iterator()
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.bytedance.android.livesdk.model.message.TeamUsersInfo r0 = (com.bytedance.android.livesdk.model.message.TeamUsersInfo) r0
            long r5 = r0.teamId
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L27
            r9 = r1
        L3b:
            com.bytedance.android.livesdk.model.message.TeamUsersInfo r9 = (com.bytedance.android.livesdk.model.message.TeamUsersInfo) r9
            if (r9 == 0) goto L91
            java.util.List<java.lang.Long> r3 = r9.userIds
            if (r3 == 0) goto L91
            java.lang.Object r0 = r10.l1
            X.TqJ r0 = (X.C75883TqJ) r0
            long r0 = r0.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r3.contains(r0)
            if (r0 != r4) goto L91
        L53:
            java.lang.Object r0 = r10.l0
            X.Tzp r0 = (X.AbstractC76473Tzp) r0
            boolean r0 = r0.LJJJJLI()
            if (r0 != 0) goto L63
            java.lang.Object r0 = r10.l2
            X.Tvh r0 = (X.C76217Tvh) r0
            r0.LJLJI = r2
        L63:
            java.lang.Object r0 = r10.l2
            X.Tvh r0 = (X.C76217Tvh) r0
            X.C29306Beo.LJJLJLI(r0)
            java.lang.Object r3 = r10.l2
            X.Tvh r3 = (X.C76217Tvh) r3
            X.1t0 r0 = r3.LJLIL
            X.C29306Beo.LJI(r0)
            X.1Eo r0 = r3.LJLILLLLZI
            X.C29306Beo.LJJLJLI(r0)
            X.1Eo r0 = r3.LJLILLLLZI
            if (r0 != 0) goto L8d
        L7c:
            if (r4 == 0) goto L8a
            java.lang.String r2 = "ttlive_best_teammate_lottie_red.zip"
        L80:
            Y.ARunnableS14S1100000_13 r1 = new Y.ARunnableS14S1100000_13
            r0 = 6
            r1.<init>(r3, r2, r0)
            r3.post(r1)
            return
        L8a:
            java.lang.String r2 = "ttlive_best_teammate_lottie_blue.zip"
            goto L80
        L8d:
            r0.setFrame(r2)
            goto L7c
        L91:
            r4 = 0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS6S0300000_13.onAnimationEnd$2(Y.ALAdapterS6S0300000_13, android.animation.Animator):void");
    }

    public static final void onAnimationStart$0(ALAdapterS6S0300000_13 aLAdapterS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((PortraitShortTouchPreviewWidget) aLAdapterS6S0300000_13.l0).show();
    }

    public ALAdapterS6S0300000_13(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
