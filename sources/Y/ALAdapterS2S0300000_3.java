package Y;

import X.C118824lS;
import X.C2059186h;
import X.C43I;
import X.C74I;
import X.InterfaceC65784Pro;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.List;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ALAdapterS2S0300000_3 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 3:
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
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 3:
                onAnimationStart$0(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS2S0300000_3 aLAdapterS2S0300000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        AqS150S0200000_3 aqS150S0200000_3 = ((PoiCollectStatusBaseAssem) aLAdapterS2S0300000_3.l0).LJLLJ;
        if (aqS150S0200000_3 != null) {
            aqS150S0200000_3.invoke();
        }
        ((PoiCollectStatusBaseAssem) aLAdapterS2S0300000_3.l0).LJLLJ = null;
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0300000_3 aLAdapterS2S0300000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((FeedAvatarDefaultAssem) aLAdapterS2S0300000_3.l0).Z3().mv0();
        ((FeedAvatarDefaultAssem) aLAdapterS2S0300000_3.l0).n4((Aweme) aLAdapterS2S0300000_3.l1, (FollowStatus) aLAdapterS2S0300000_3.l2);
        ((FeedAvatarDefaultAssem) aLAdapterS2S0300000_3.l0).Z3().nv0(new C43I<>(1));
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0300000_3 aLAdapterS2S0300000_3, Animator animator) {
        C2059186h.LIZ(((C74I) aLAdapterS2S0300000_3.l2).LIZ, (CharSequence) aLAdapterS2S0300000_3.l0);
        C118824lS.LIZJ(((C74I) aLAdapterS2S0300000_3.l2).LIZ, null);
        ((C74I) aLAdapterS2S0300000_3.l2).LIZ.LJJJJ((List) aLAdapterS2S0300000_3.l1);
    }

    public static final void onAnimationEnd$2(ALAdapterS2S0300000_3 aLAdapterS2S0300000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((FeedAvatarDefaultAssem) aLAdapterS2S0300000_3.l0).Z3().mv0();
        ((FeedAvatarDefaultAssem) aLAdapterS2S0300000_3.l0).n4((Aweme) aLAdapterS2S0300000_3.l1, (FollowStatus) aLAdapterS2S0300000_3.l2);
        ((FeedAvatarDefaultAssem) aLAdapterS2S0300000_3.l0).Z3().nv0(new C43I<>(1));
    }

    public static final void onAnimationEnd$3(ALAdapterS2S0300000_3 aLAdapterS2S0300000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((PoiCollectStatusBaseAssem) aLAdapterS2S0300000_3.l0).LJLLL = false;
        ((AnimatorSet) aLAdapterS2S0300000_3.l1).start();
        ((InterfaceC65784Pro) aLAdapterS2S0300000_3.l2).invoke();
        AqS150S0200000_3 aqS150S0200000_3 = ((PoiCollectStatusBaseAssem) aLAdapterS2S0300000_3.l0).LJLLJ;
        if (aqS150S0200000_3 != null) {
            aqS150S0200000_3.invoke();
        }
        ((PoiCollectStatusBaseAssem) aLAdapterS2S0300000_3.l0).LJLLJ = null;
    }

    public static final void onAnimationStart$0(ALAdapterS2S0300000_3 aLAdapterS2S0300000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((PoiCollectStatusBaseAssem) aLAdapterS2S0300000_3.l0).LJLLL = true;
    }

    public ALAdapterS2S0300000_3(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
